package org.quiltmc.fabric.resource.loader.v0.impl;

import net.fabricmc.fabric.impl.resource.loader.FabricResource;
import net.minecraft.resource.ResourcePackSource;

public interface QuiltedFabricResource extends FabricResource {
	void setFabricIndividualSource(ResourcePackSource source);
}
