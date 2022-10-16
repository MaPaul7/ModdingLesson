package com.relative.firstmod.init;

import com.relative.firstmod.FirstMod;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class PotionInit {
	
	public static final DeferredRegister<Potion> POTIONS  = DeferredRegister.create(ForgeRegistries.POTIONS, FirstMod.MOD_ID);
	
	
	public static final RegistryObject<Potion> FREEZE_POTION = POTIONS.register("freeze_potion",
            () -> new Potion(new MobEffectInstance(EffectInit.FREEZE.get(), 500, 0)));
	
	public static final RegistryObject<Potion> SLIP_POTION= POTIONS.register("slip_potion",
            () -> new Potion(new MobEffectInstance(EffectInit.SLIPPERY.get(), 300, 0)));
	
	public static final RegistryObject<Potion> SLIP_POTION_2 = POTIONS.register("slip_potion_2",
            () -> new Potion(new MobEffectInstance(EffectInit.SLIPPERY.get(), 200, 1)));

	public static void register(IEventBus eventBus) {
		POTIONS.register(eventBus);
}

}
