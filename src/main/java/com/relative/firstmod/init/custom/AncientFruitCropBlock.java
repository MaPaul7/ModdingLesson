package com.relative.firstmod.init.custom;

import com.relative.firstmod.init.ItemInit;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;


public class AncientFruitCropBlock extends CropBlock{
	
	public static final IntegerProperty AGE = BlockStateProperties.AGE_5;
	
	public AncientFruitCropBlock(Properties properties) {
		super(properties);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int getMaxAge() {
		return 5;
	}
	
	@Override
	protected ItemLike getBaseSeedId() {
		return ItemInit.ANCIENT_FRUIT_SEEDS.get();
		
	}
}
