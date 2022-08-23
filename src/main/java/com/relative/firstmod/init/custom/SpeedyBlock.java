package com.relative.firstmod.init.custom;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class SpeedyBlock extends Block {
	
	public String me;
	
	public SpeedyBlock(Properties properties, String me) {
		super(properties);
		this.me = me;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {
		if(!pLevel.isClientSide()){
			if(pEntity instanceof LivingEntity) {
				LivingEntity le = ((LivingEntity) pEntity);
				if(me.equals("SPEED")) {
					MobEffectInstance MobE = new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40);
					le.addEffect(MobE);
				}
				if(me.equals("WITHER")) {
					MobEffectInstance MobE = new MobEffectInstance(MobEffects.WITHER, 40);
					le.addEffect(MobE);
				}
				if(me.equals("JUMP")) {
					MobEffectInstance MobE = new MobEffectInstance(MobEffects.JUMP, 40);
					le.addEffect(MobE);
				}
				if(me.equals("HARM")) {
					MobEffectInstance MobE = new MobEffectInstance(MobEffects.HARM, 40);
					le.addEffect(MobE);
				}
				
			}
		}
		super.stepOn(pLevel, pPos, pState, pEntity);
	}
	
}
