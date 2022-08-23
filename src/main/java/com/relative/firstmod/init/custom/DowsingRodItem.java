package com.relative.firstmod.init.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.Nullable;

import com.relative.firstmod.init.SoundInit;

import java.util.List;

public class DowsingRodItem extends Item {
	public String area;
	
    public DowsingRodItem(Properties pProperties, String a) {
        super(pProperties);
        this.area = a;
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if(pContext.getLevel().isClientSide()) {
            BlockPos positionClicked = pContext.getClickedPos();
            Player player = pContext.getPlayer();
            boolean foundBlock = false;

            for(int i = 0; i <= positionClicked.getY() + 64; i++) {
                Block blockBelow = pContext.getLevel().getBlockState(positionClicked.below(i)).getBlock();

                if(isValuableBlock(blockBelow)) {
                    outputValuableCoordinates(positionClicked.below(i), player, blockBelow);
                    foundBlock = true;
                    
                    pContext.getLevel().playSound(player, positionClicked, SoundInit.DOWSING_ROD_FOUND_ORE.get(),
                            SoundSource.BLOCKS, 1f, 1f);
                    
                    break;
                }
            }

            if(!foundBlock) {
                player.sendMessage(new TranslatableComponent("item.tutorialmod.dowsing_rod.no_valuables"),
                        player.getUUID());
            }
        }

        pContext.getItemInHand().hurtAndBreak(1, pContext.getPlayer(),
                (player) -> player.broadcastBreakEvent(player.getUsedItemHand()));

        return super.useOn(pContext);
    }
    
    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if(Screen.hasShiftDown()) {
            pTooltipComponents.add(new TranslatableComponent("tooltip.tutorialmod.dowsing_rod.tooltip.shift"));
        } else {
            pTooltipComponents.add(new TranslatableComponent("tooltip.tutorialmod.dowsing_rod.tooltip"));
        }
    }
    
    private void outputValuableCoordinates(BlockPos blockPos, Player player, Block blockBelow) {
    	
    	String s = blockBelow.asItem().getRegistryName().toString();
    	
    	if(s.equals("minecraft:coal_ore") || s.equals("minecraft:deepslate_coal_ore")) {
    		s = "Coal";
    	}
    	if(s.equals("minecraft:iron_ore") || s.equals("minecraft:deepslate_iron_ore")) {
    		s = "Iron";
    	}
    	if(s.equals("minecraft:copper_ore") || s.equals("minecraft:deepslate_copper_ore")) {
    		s = "Copper";
    	}
    	if(s.equals("minecraft:gold_ore") || s.equals("minecraft:deepslate_gold_ore")) {
    		s = "Gold";
    	}
    	if(s.equals("minecraft:diamond_ore") || s.equals("minecraft:deepslate_diamond_ore")) {
    		s = "Diamonds";
    	}
    	if(s.equals("minecraft:lapis_ore") || s.equals("minecraft:deepslate_lapis_ore")) {
    		s = "Lapis Lazuli";
    	}
    	if(s.equals("minecraft:redstone_ore") || s.equals("minecraft:deepslate_redstone_ore")) {
    		s = "Redstone";
    	}
    	if(s.equals("minecraft:nether_gold_ore")) {
    		s = "Nether Gold";
    	}
    	if(s.equals("minecraft:nether_quartz_ore")) {
    		s = "Nether Quartz Ore";
    	}
    	if(s.equals("minecraft:ancient_debris")) {
    		s = "Ancient Debris";
    	}
    	
    	
    	TextComponent t = new TextComponent("Found " + s + " at " + "(" + blockPos.getX() + ", " + blockPos.getY() + "," + blockPos.getZ() + ")");
        
    	player.sendMessage(t, player.getUUID());
    }

    private boolean isValuableBlock(Block block) {
    	if(area.equals("Nether")){
    		return block == Blocks.NETHER_GOLD_ORE || block == Blocks.NETHER_QUARTZ_ORE
    				|| block == Blocks.ANCIENT_DEBRIS;
    	}
    	else if(area.equals("Overworld")){
    		 return block == Blocks.COAL_ORE || block == Blocks.DEEPSLATE_COAL_ORE ||
    	        		block == Blocks.COPPER_ORE || block == Blocks.DEEPSLATE_COPPER_ORE
    	                || block == Blocks.DIAMOND_ORE || block == Blocks.IRON_ORE ||
    	                block == Blocks.DEEPSLATE_IRON_ORE || block == Blocks.DEEPSLATE_GOLD_ORE ||
    	                block == Blocks.GOLD_ORE || block == Blocks.DEEPSLATE_DIAMOND_ORE
    	                || block == Blocks.LAPIS_ORE || block == Blocks.DEEPSLATE_LAPIS_ORE ||
    	                block == Blocks.REDSTONE_ORE || block == Blocks.DEEPSLATE_REDSTONE_ORE;
    	}
    	else {
    		return false;
    	}
       
    }
}
