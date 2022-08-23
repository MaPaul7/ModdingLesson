package com.relative.firstmod.init;

import java.util.function.Function;

import com.relative.firstmod.FirstMod;
import com.relative.firstmod.init.custom.AncientFruitCropBlock;
import com.relative.firstmod.init.custom.SpeedyBlock;
import com.google.common.base.Supplier;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			FirstMod.MOD_ID);
	
	public static final DeferredRegister<Item> ITEMS = ItemInit.ITEMS;

	public static final RegistryObject<Block> EXAMPLE_BLOCK = register("example_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE).strength(3.0f)
					.sound(SoundType.METAL).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(FirstMod.TUTORIAL_TAB2)));
	
	public static final RegistryObject<Block> BLOCK2 = register("block2",
			() -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_RED).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(FirstMod.TUTORIAL_TAB2)));
	
	public static final RegistryObject<Block> BALL_BLOCK = register("ballblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE).strength(2.0f)
					.sound(SoundType.METAL).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(FirstMod.TUTORIAL_TAB2)));
	
	public static final RegistryObject<Block> GREAT_BLOCK = register("greatblock",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(3.0f).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(FirstMod.TUTORIAL_TAB2)));
	
	public static final RegistryObject<Block> ULTRA_BLOCK = register("ultrablock",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(FirstMod.TUTORIAL_TAB2)));
	
	public static final RegistryObject<Block> SPEEDYBLOCK = register("speedyblock",
			() -> new SpeedyBlock(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).requiresCorrectToolForDrops(), 
					"SPEED"),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(FirstMod.TUTORIAL_TAB2)));
	
	public static final RegistryObject<Block> WITHERBLOCK = register("witherblock",
			() -> new SpeedyBlock(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).requiresCorrectToolForDrops(), 
					"WITHER"),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(FirstMod.TUTORIAL_TAB2)));
	
	public static final RegistryObject<Block> JUMPBLOCK = register("jumpblock",
			() -> new SpeedyBlock(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).requiresCorrectToolForDrops(), 
					"JUMP"),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(FirstMod.TUTORIAL_TAB2)));
	
	public static final RegistryObject<Block> HARMBLOCK = register("harmblock",
			() -> new SpeedyBlock(BlockBehaviour.Properties.of(Material.METAL).strength(4.0f).requiresCorrectToolForDrops(), 
					"HARM"),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(FirstMod.TUTORIAL_TAB2)));
	
	public static final RegistryObject<Block> ANCIENTFRUITPLANT = registerBlockWithoutBlockItem("ancient_fruit",
            () -> new AncientFruitCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));


    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

	private static <T extends Block> RegistryObject<T> registerBlock(final String name,
			final Supplier<? extends T> block) {
		return BLOCKS.register(name, block);
	}

	private static <T extends Block> RegistryObject<T> register(final String name, final Supplier<? extends T> block,
			Function<RegistryObject<T>, Supplier<? extends Item>> item) {
		RegistryObject<T> obj = registerBlock(name, block);
		ITEMS.register(name, item.apply(obj));
		return obj;
	}
}