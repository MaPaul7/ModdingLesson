package com.relative.firstmod.event;

import com.relative.firstmod.FirstMod;
import com.relative.firstmod.event.loot.DiamondFromCreeperAdditionModifier;
import com.relative.firstmod.event.loot.GreatBallFromBlueSheepAdditionModifier;
import com.relative.firstmod.event.loot.TorchicFromPyramidAdditionModifier;
import com.relative.firstmod.event.loot.UltraBallFromBlackSheepAdditionModifier;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = FirstMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
	
	 @SubscribeEvent
	    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>>
	                                                           event) {
	        event.getRegistry().registerAll(
	                new DiamondFromCreeperAdditionModifier.Serializer().setRegistryName
	                        (new ResourceLocation(FirstMod.MOD_ID,"diamond_from_creeper")),
	                new GreatBallFromBlueSheepAdditionModifier.Serializer().setRegistryName
	                        (new ResourceLocation(FirstMod.MOD_ID,"greatball_from_bluesheep")),
	                new UltraBallFromBlackSheepAdditionModifier.Serializer().setRegistryName
	                        (new ResourceLocation(FirstMod.MOD_ID,"ultraball_from_blacksheep")),
	                new TorchicFromPyramidAdditionModifier.Serializer().setRegistryName
	                        (new ResourceLocation(FirstMod.MOD_ID,"torchic_from_pyramid"))
	                        
	                
	        );
	    }

}
