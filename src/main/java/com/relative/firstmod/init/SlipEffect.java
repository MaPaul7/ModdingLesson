package com.relative.firstmod.init;

import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class SlipEffect extends MobEffect{

	protected SlipEffect(MobEffectCategory p_19451_, int p_19452_) {
		super(p_19451_, p_19452_);
		// TODO Auto-generated constructor stub
	}
	
	 public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier, Player player) {
	        if (!pLivingEntity.level.isClientSide()) {
	            Double x = pLivingEntity.getX();
	            Double y = pLivingEntity.getY();
	            Double z = pLivingEntity.getZ();

	            int r = (int)(Math.random() * 2); //0 - 1
	            int r2 =  (int)(Math.random() * 7) + 1; //1 - 7
	            
	            System.out.println(r2);
	            
	            if(r == 0) {
	            	int r3 = (int)(Math.random() * 2); //0 - 1
	            	if(r3 == 0)  {
	            		pLivingEntity.teleportTo(x+r2, y, z);
	            		TextComponent t = new TextComponent("Teleported player to " + x+r2 + ", " + y + ", " + z);
	            		player.sendMessage(t, player.getUUID());
	            	}
	            	if(r3 == 1)  {
	            		pLivingEntity.teleportTo(x, y, z+r2);
	            		TextComponent t = new TextComponent("Teleported player to " + x + ", " + y + ", " + z+r2);
	            		player.sendMessage(t, player.getUUID());
	            	}
	            }
	            if(r == 1) {
	            	pLivingEntity.teleportTo(x+r2, y, z+r2);
	            	TextComponent t = new TextComponent("Teleported player to " + x + ", " + y + ", " + z+r2);
	            	player.sendMessage(t, player.getUUID());
	            	
	            }
	          
	            //pLivingEntity.setDeltaMovement(0, 0, 0);
	        }
	        super.applyEffectTick(pLivingEntity, pAmplifier);
	    }

}
