package com.relative.firstmod.init;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class TierInit {
	
	public static final ForgeTier PRISMATIC = new ForgeTier(2, 1500, 1.5f, 2f, 22, BlockTags.NEEDS_IRON_TOOL,
			() -> Ingredient.of(ItemInit.PRISMATIC_SHARD.get()));
	
	public static final ForgeTier GULLIBLE = new ForgeTier(3, 3000, 5.0f, 4f, 25, BlockTags.NEEDS_DIAMOND_TOOL,
			() -> Ingredient.of(ItemInit.GULLIBILLIUM.get()));
}
