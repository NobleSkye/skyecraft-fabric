package dev.nobleskye.skyecraft.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.block.Block;

public class GuiditeMaterial implements ToolMaterial {
    @Override
    public int getDurability() {
        return 455;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 5.0F;
    }

    @Override
    public float getAttackDamage() {
        return 1.5F;
    }

//    @Override
//    public int getMiningLevel() {
//        return 2; // Adjust based on your desired mining level
//    }

    @Override
    public int getEnchantability() {
        return 22; // Adjust enchantability as needed
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.EMERALD); // Use your desired repair ingredient
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return BlockTags.INCORRECT_FOR_IRON_TOOL; // Ensure this is a valid tag
    }

    public static final GuiditeMaterial INSTANCE = new GuiditeMaterial();
}
