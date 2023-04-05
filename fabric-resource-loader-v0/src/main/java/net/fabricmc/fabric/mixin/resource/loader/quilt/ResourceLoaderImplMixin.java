package net.fabricmc.fabric.mixin.resource.loader.quilt;

import org.jetbrains.annotations.NotNull;
import org.quiltmc.qsl.resource.loader.api.reloader.IdentifiableResourceReloader;
import org.quiltmc.qsl.resource.loader.impl.ResourceLoaderImpl;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.util.Identifier;

@Mixin(ResourceLoaderImpl.class)
public abstract class ResourceLoaderImplMixin {
	@Shadow(remap = false)
	public abstract void addReloaderOrdering(@NotNull Identifier firstReloader, @NotNull Identifier secondReloader);

	@SuppressWarnings("removal")
	@Inject(method = "registerReloader", at = @At("TAIL"), remap = false)
	private void quilt$reimplementAccidentallyNukedCompatCode(@NotNull IdentifiableResourceReloader resourceReloader, CallbackInfo ci) {
		for (var dependency : resourceReloader.getQuiltDependencies()) {
			this.addReloaderOrdering(dependency, resourceReloader.getQuiltId());
		}
	}
}
