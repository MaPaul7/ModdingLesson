package com.relative.firstmod.event.loot;

import java.util.List;

import javax.annotation.Nonnull;

import com.google.gson.JsonObject;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;

public class DiamondFromCreeperAdditionModifier extends LootModifier{
	private final Item addition;

    protected DiamondFromCreeperAdditionModifier(LootItemCondition[] conditionsIn, Item addition) {
        super(conditionsIn);
        this.addition = addition;
    }

    @Nonnull
    @Override
    protected List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {
        double i = Math.random();
        if(i > 0.25 && i < 0.75) {
        	generatedLoot.add(new ItemStack(addition, 1));
        }
        if(i > 0.75) {
        	generatedLoot.add(new ItemStack(addition, 2));
        }
        return generatedLoot;
    }

    public static class Serializer extends GlobalLootModifierSerializer<DiamondFromCreeperAdditionModifier> {

        @Override
        public DiamondFromCreeperAdditionModifier read(ResourceLocation name, JsonObject object,
                                                      LootItemCondition[] conditionsIn) {
            Item addition = ForgeRegistries.ITEMS.getValue(
                    new ResourceLocation(GsonHelper.getAsString(object, "addition")));
            return new DiamondFromCreeperAdditionModifier(conditionsIn, addition);
        }

        @Override
        public JsonObject write(DiamondFromCreeperAdditionModifier instance) {
            JsonObject json = makeConditions(instance.conditions);
            json.addProperty("addition", ForgeRegistries.ITEMS.getKey(instance.addition).toString());
            return json;
        }
    }

}