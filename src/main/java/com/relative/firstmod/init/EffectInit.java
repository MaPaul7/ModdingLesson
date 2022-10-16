package com.relative.firstmod.init;

import com.google.common.base.Supplier;
import com.relative.firstmod.FirstMod;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class EffectInit {
	
	 public static final DeferredRegister<MobEffect> MOB_EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, FirstMod.MOD_ID);

	 public static final RegistryObject<MobEffect> FREEZE = MOB_EFFECTS.register("freeze",
     () -> new FreezeEffect(MobEffectCategory.HARMFUL, 3124687));
	 
	 public static final RegistryObject<MobEffect> SLIPPERY = MOB_EFFECTS.register("slip",
			 () -> new SlipEffect(MobEffectCategory.HARMFUL, 3124687));
	  
	 
	 public static void register(IEventBus eventBus) {
			MOB_EFFECTS.register(eventBus);
	}

}
