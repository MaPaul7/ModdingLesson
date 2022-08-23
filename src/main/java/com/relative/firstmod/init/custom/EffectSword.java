package com.relative.firstmod.init.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class EffectSword extends SwordItem {
	public EffectSword(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
    	int i = (int)(Math.random()*17);
    	
        switch(i) {
	        case(0) :{
	        	pAttacker.addEffect(new MobEffectInstance(MobEffects.WITHER, 60));
	        	break;
	        }
	        case(1) :{
	        	pAttacker.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60));
	        	break;
	        }
	        case(2) :{
	        	pAttacker.addEffect(new MobEffectInstance(MobEffects.POISON, 60));
	        	break;
	        }
	        case(3) :{
	        	pAttacker.addEffect(new MobEffectInstance(MobEffects.HARM, 60));
	        	break;
	        }
	        case(4) :{
	        	pAttacker.addEffect(new MobEffectInstance(MobEffects.HEAL, 60));
	        	break;
	        }
	        case(5) :{
	        	pAttacker.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60));
	        	break;
	        }
	        case(6) :{
	        	pAttacker.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60));
	        	break;
	        }
	        case(7) :{
	        	pAttacker.addEffect(new MobEffectInstance(MobEffects.GLOWING, 60));
	        	break;
	        }
	        case(8) :{
	        	pAttacker.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 60));
	        	break;
	        }
	        case(9) :{
	        	pAttacker.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60));
	        	break;
	        }
	        case(10) :{
	        	pAttacker.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60));
	        	break;
	        }
	        case(11) :{
	        	pAttacker.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60));
	        	break;
	        }
	        case(12) :{
	        	pAttacker.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 60));
	        	break;
	        }
	        case(13) :{
	        	pAttacker.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 60));
	        	break;
	        }
	        case(14) :{
	        	pAttacker.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60));
	        	break;
	        }
	        case(15) :{
	        	pAttacker.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 60));
	        	break;
	        }
	        case(16) :{
	        	pAttacker.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 60));
	        	break;
	        }
        }
        
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }

}
