package com.relative.firstmod.init;

import com.google.common.base.Supplier;
import com.relative.firstmod.FirstMod;
import com.relative.firstmod.init.ItemInit;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SoundInit {
	public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS,
			FirstMod.MOD_ID);
	
	public static final RegistryObject<SoundEvent> DOWSING_ROD_FOUND_ORE = registerSoundEvent("dowsing_rod_found_ore");
	
	public static final RegistryObject<SoundEvent> SV_OPENING_THEME = registerSoundEvent("sv_opening_theme");
	
	public static final RegistryObject<SoundEvent> MINES_CLOTH = registerSoundEvent("mines_cloth");
	
	private static RegistryObject<SoundEvent> registerSoundEvent(final String name) {
		return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(FirstMod.MOD_ID, name)));
	}
	public static void register(IEventBus eventBus) {
		SOUND_EVENTS.register(eventBus);
	}
	
}
