package com.relative.firstmod.init;

import com.google.common.base.Supplier;
import com.relative.firstmod.FirstMod;
import com.relative.firstmod.init.custom.DowsingRodItem;
import com.relative.firstmod.init.custom.EffectSword;
import com.relative.firstmod.init.custom.NewCoal;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			FirstMod.MOD_ID);
	
	public static final RegistryObject<Item> EXAMPLE_ITEM = register("example_item",
			() -> new Item(new Item.Properties().tab(FirstMod.SHINY_POKEMON).stacksTo(16).fireResistant().rarity(Rarity.EPIC)));
	
	public static final RegistryObject<Item> TORCHIC = register("torchic",
			() -> new Item(new Item.Properties().tab(FirstMod.POKEMON).stacksTo(16).fireResistant()));
	
	public static final RegistryObject<Item> PRISMATIC_SHARD = register("prismatic_shard",
			() -> new Item(new Item.Properties().tab(FirstMod.TUTORIAL_TAB)));
	
	public static final RegistryObject<Item> GULLIBILLIUM = register("gullible_ore",
			() -> new Item(new Item.Properties().tab(FirstMod.TUTORIAL_TAB)));
	
	public static final RegistryObject<Item> new_Item = register("deadly_explosives", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	
	public static final RegistryObject<Item> BULBASAUR = register("bulbasaur",
			() -> new Item(new Item.Properties().tab(FirstMod.POKEMON).stacksTo(16)));
	
	public static final RegistryObject<Item> SHINY_BULBASAUR = register("shiny_bulbasaur",
			() -> new Item(new Item.Properties().tab(FirstMod.SHINY_POKEMON).stacksTo(16)));
	
	public static final RegistryObject<Item> POKEBALL = register("pokeball",
			() -> new Item(new Item.Properties().tab(FirstMod.TUTORIAL_TAB).stacksTo(16)));
	
	public static final RegistryObject<Item> GREATBALL = register("greatball",
			() -> new Item(new Item.Properties().tab(FirstMod.TUTORIAL_TAB).stacksTo(16)));
	
	public static final RegistryObject<Item> ULTRABALL = register("ultraball",
			() -> new Item(new Item.Properties().tab(FirstMod.TUTORIAL_TAB).stacksTo(16)));
	
	public static final RegistryObject<Item> SWORD = register("sword",
			() -> new EffectSword(Tiers.GOLD, 2, 3f,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	
	public static final RegistryObject<Item> DOWSING_ROD = register("dowsingrod",
			() -> new DowsingRodItem(new Item.Properties().tab(FirstMod.TUTORIAL_TAB).durability(32), "Overworld"));
	
	public static final RegistryObject<Item> NETHER_DOWSING_ROD = register("nether_dowsingrod",
			() -> new DowsingRodItem(new Item.Properties().tab(FirstMod.TUTORIAL_TAB).durability(32), "Nether"));
	
	public static final RegistryObject<Item> SV_THEME_DISC = register("sv_theme_disc",
			() -> new RecordItem(4, SoundInit.SV_OPENING_THEME, new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
	
	public static final RegistryObject<Item> MINES_CLOTH_DISC = register("mines_cloth_disc",
			() -> new RecordItem(4, SoundInit.MINES_CLOTH, new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
	
	public static final RegistryObject<Item> ANCIENT_FRUIT = register("ancient_fruit",
			() -> new Item(new Item.Properties().tab(FirstMod.TUTORIAL_TAB).food(FoodInit.ANCIENT_FRUIT)));
	
	public static final RegistryObject<Item> ANCIENT_FRUIT_SEEDS = register("ancient_fruit_seeds",
			() -> new ItemNameBlockItem(BlockInit.ANCIENTFRUITPLANT.get(), new Item.Properties().tab(FirstMod.TUTORIAL_TAB)));
	
	public static final RegistryObject<Item> PRISMATIC_HELMET = ITEMS.register("prismatic_helmet",
            () -> new ArmorItem(ArmorMaterialInit.PRISMATIC, EquipmentSlot.HEAD,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	
	public static final RegistryObject<Item> PRISMATIC_CHESTPLATE = ITEMS.register("prismatic_chestplate",
            () -> new ArmorItem(ArmorMaterialInit.PRISMATIC, EquipmentSlot.CHEST,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	
	public static final RegistryObject<Item> PRISMATIC_LEGGINGS = ITEMS.register("prismatic_leggings",
            () -> new ArmorItem(ArmorMaterialInit.PRISMATIC, EquipmentSlot.LEGS,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	
	public static final RegistryObject<Item> PRISMATIC_BOOTS = ITEMS.register("prismatic_boots",
            () -> new ArmorItem(ArmorMaterialInit.PRISMATIC, EquipmentSlot.FEET,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

   public static final RegistryObject<Item> NEWCOAL = ITEMS.register("new_coal",
		   () -> new NewCoal(new Item.Properties().tab(FirstMod.TUTORIAL_TAB)));
   
   public static final RegistryObject<Item> PRISMATIC_PICKAXE = ITEMS.register("p_pickaxe",
		   () -> new PickaxeItem(TierInit.PRISMATIC, 1, 1f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
   
   public static final RegistryObject<Item> GULLIBLE_PICKAXE = ITEMS.register("g_pickaxe",
		   () -> new PickaxeItem(TierInit.GULLIBLE, 2, 3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
   
   public static final RegistryObject<Item> GULLIBLE_AXE = ITEMS.register("g_axe",
		   () -> new AxeItem(TierInit.GULLIBLE, 2, 3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
	
   public static final RegistryObject<Item> GULLIBLE_HOE = ITEMS.register("g_hoe",
		   () -> new HoeItem(TierInit.GULLIBLE, 2, 3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
	
   public static final RegistryObject<Item> GULLIBLE_SHOVEL = ITEMS.register("g_shovel",
		   () -> new ShovelItem(TierInit.GULLIBLE, 2, 3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
	
   public static final RegistryObject<Item> GULLIBLE_SWORD = ITEMS.register("g_sword",
		   () -> new SwordItem(TierInit.GULLIBLE, 2, 3f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	
   
	private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
		return ITEMS.register(name, item);
	}
}