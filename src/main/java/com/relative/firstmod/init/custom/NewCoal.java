package com.relative.firstmod.init.custom;

import org.jetbrains.annotations.Nullable;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;

public class NewCoal extends Item{

	public NewCoal(Properties p_41383_) {
		super(p_41383_);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int getBurnTime(ItemStack itemstack, @Nullable RecipeType<?> recipetype) {
		return 3200;
	}

}
