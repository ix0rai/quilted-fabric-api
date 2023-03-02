/*
 * Copyright 2016, 2017, 2018, 2019 FabricMC
 * Copyright 2022-2023 QuiltMC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.fabricmc.fabric.mixin.object.builder;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToIntFunction;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.entity.EntityType;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

@Mixin(AbstractBlock.Settings.class)
public interface AbstractBlockSettingsAccessor {
	/* GETTERS */
	@Deprecated
	@Accessor
	Material getMaterial();

	@Deprecated
	@Accessor
	float getHardness();

	@Deprecated
	@Accessor
	float getResistance();

	@Deprecated
	@Accessor
	boolean getCollidable();

	@Deprecated
	@Accessor
	boolean getRandomTicks();

	@Deprecated
	@Accessor("luminance")
	ToIntFunction<BlockState> getLuminance();

	@Deprecated
	@Accessor
	Function<BlockState, MapColor> getMapColorProvider();

	@Deprecated
	@Accessor
	BlockSoundGroup getSoundGroup();

	@Deprecated
	@Accessor
	float getSlipperiness();

	@Deprecated
	@Accessor
	float getVelocityMultiplier();

	@Deprecated
	@Accessor
	float getJumpVelocityMultiplier();

	@Accessor
	boolean getDynamicBounds();

	@Deprecated
	@Accessor
	boolean getOpaque();

	@Deprecated
	@Accessor
	boolean getIsAir();

	@Deprecated
	@Accessor
	boolean isToolRequired();

	@Deprecated
	@Accessor
	AbstractBlock.TypedContextPredicate<EntityType<?>> getAllowsSpawningPredicate();

	@Deprecated
	@Accessor
	AbstractBlock.ContextPredicate getSolidBlockPredicate();

	@Deprecated
	@Accessor
	AbstractBlock.ContextPredicate getSuffocationPredicate();

	@Deprecated
	@Accessor
	AbstractBlock.ContextPredicate getBlockVisionPredicate();

	@Deprecated
	@Accessor
	AbstractBlock.ContextPredicate getPostProcessPredicate();

	@Deprecated
	@Accessor
	AbstractBlock.ContextPredicate getEmissiveLightingPredicate();

	@Deprecated
	@Accessor
	Optional<AbstractBlock.Offsetter> getOffsetter();

	@Accessor
	Identifier getLootTableId();

	@Accessor
	boolean getBlockBreakParticles();

	@Accessor
	FeatureSet getRequiredFeatures();

	/* SETTERS */
	@Deprecated
	@Accessor
	void setMaterial(Material material);

	@Accessor
	void setCollidable(boolean collidable);

	@Deprecated
	@Accessor
	void setRandomTicks(boolean ticksRandomly);

	@Accessor
	void setMapColorProvider(Function<BlockState, MapColor> mapColorProvider);

	@Accessor
	void setDynamicBounds(boolean dynamicBounds);

	@Deprecated
	@Accessor
	void setOpaque(boolean opaque);

	@Deprecated
	@Accessor
	void setIsAir(boolean isAir);

	@Accessor
	void setLootTableId(Identifier lootTableId);

	@Deprecated
	@Accessor
	void setToolRequired(boolean toolRequired);

	@Accessor
	void setBlockBreakParticles(boolean blockBreakParticles);

	@Accessor
	void setRequiredFeatures(FeatureSet requiredFeatures);

	@Accessor
	void setOffsetter(Optional<AbstractBlock.Offsetter> offsetter);
}
