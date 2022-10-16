package com.relative.firstmod.init;

import java.lang.reflect.InvocationTargetException;

import com.google.common.collect.ImmutableSet;
import com.relative.firstmod.FirstMod;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class VillagerInit {
	
	public static final DeferredRegister<PoiType> POI_TYPES = DeferredRegister.create(ForgeRegistries.POI_TYPES, FirstMod.MOD_ID);
	public static final DeferredRegister<VillagerProfession> PROFESSIONS = DeferredRegister.create(ForgeRegistries.PROFESSIONS, FirstMod.MOD_ID);
	
	public static final RegistryObject<PoiType> METAL_CONVERTER_POI = POI_TYPES.register("m_changer_poi", () -> new PoiType("m_changer_poi", PoiType.getBlockStates(Blocks.EMERALD_BLOCK), 1, 1));
	
	public static final RegistryObject<VillagerProfession> METAL_CONVERTER = PROFESSIONS.register("m_changer", 
			() -> new VillagerProfession("m_changer", METAL_CONVERTER_POI.get(), ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_TOOLSMITH));
	
	public static void registerPOIs() {
		try {
			ObfuscationReflectionHelper.findMethod(PoiType.class, "registerBlockStates", PoiType.class).invoke(null, METAL_CONVERTER_POI.get());
		}
		catch(InvocationTargetException | IllegalAccessException exception) {
			exception.printStackTrace();
		}
	}
	
	public static void register(IEventBus eventBus) {
		POI_TYPES.register(eventBus);
		PROFESSIONS.register(eventBus);
	}
}
