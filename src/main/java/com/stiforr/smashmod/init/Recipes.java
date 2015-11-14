package com.stiforr.smashmod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by Sean Norwood on 6/25/2015.
 */
public class Recipes {
    public static void init(){
        // Tool Recipes
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.tntAxe),
                                        "tt ",
                                        "ts ",
                                        " s ",
                                        't', new ItemStack(Blocks.tnt),
                                        's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.tntBoots),
                                         "   ",
                                         "t t",
                                         "t t",
                                         't', new ItemStack(Blocks.tnt));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.tntHelmet),
                                         "   ",
                                         "ttt",
                                         "t t",
                                         't', new ItemStack(Blocks.tnt));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.tntArmorChest),
                                         "t t",
                                         "ttt",
                                         "ttt",
                                         't', new ItemStack(Blocks.tnt));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.tntLegs),
                                         "ttt",
                                         "t t",
                                         "t t",
                                         't', new ItemStack(Blocks.tnt));

    }
}
