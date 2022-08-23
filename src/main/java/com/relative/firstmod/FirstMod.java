package com.relative.firstmod;

import com.relative.firstmod.init.BlockInit;
import com.relative.firstmod.init.ItemInit;
import com.relative.firstmod.init.SoundInit;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraft.client.renderer.RenderType;

@Mod("firstmod")
public class FirstMod {
	
	
	public static final String MOD_ID = "firstmod";
	
	
	public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab(MOD_ID) {
		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			return new ItemStack(ItemInit.PRISMATIC_SHARD.get());
		}
	};
	public static final CreativeModeTab POKEMON = new CreativeModeTab("pokemon") {
		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			return new ItemStack(ItemInit.BULBASAUR.get());
		}
	};
	public static final CreativeModeTab SHINY_POKEMON = new CreativeModeTab("shiny_pokemon") {
		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			return new ItemStack(ItemInit.SHINY_BULBASAUR.get());
		}
	};
	
	public static final CreativeModeTab TUTORIAL_TAB2 = new CreativeModeTab("new_blocks") {
		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			return new ItemStack(BlockInit.EXAMPLE_BLOCK.get());
		}
	};
	public FirstMod() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		SoundInit.SOUND_EVENTS.register(bus);
		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);
		
		MinecraftForge.EVENT_BUS.register(this);
				
	}
	private void clientSetup(final FMLClientSetupEvent event) {
        
        ItemBlockRenderTypes.setRenderLayer(BlockInit.ANCIENTFRUITPLANT.get(), RenderType.cutout());

    }
}