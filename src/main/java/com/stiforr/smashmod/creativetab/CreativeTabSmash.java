package com.stiforr.smashmod.creativetab;

import com.stiforr.smashmod.init.ModItems;
import com.stiforr.smashmod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Sean Norwood on 6/25/2015.
 */
public class CreativeTabSmash {
    public static CreativeTabs Smash_Tab = new CreativeTabs(Reference.MOD_ID.toLowerCase()){

        @Override
        public Item getTabIconItem() {
            return ModItems.tntAxe;
        }
    };

}
