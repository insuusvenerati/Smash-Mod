package com.stiforr.smashmod.tool;

import com.stiforr.smashmod.creativetab.CreativeTabSmash;
import com.stiforr.smashmod.reference.Reference;
import net.minecraft.item.ItemSword;

/**
 * Created by Sean Norwood on 6/28/2015.
 */
public class TntSword extends ItemSword{
    public TntSword(ToolMaterial material) {
        super(material);
        this.setUnlocalizedName("tntSword");
        this.setTextureName(Reference.MOD_ID + ":tntSword");
        this.setCreativeTab(CreativeTabSmash.Smash_Tab);
    }
}
