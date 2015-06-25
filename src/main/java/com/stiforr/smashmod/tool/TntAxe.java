package com.stiforr.smashmod.tool;

import com.stiforr.smashmod.reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class TntAxe extends ItemAxe
{

	public TntAxe(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("tntAxe");
		this.setTextureName(Reference.MOD_ID + ":tritAxe");
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
	
	public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int x, int y, int z, int side, float sx, float sy, float sz)
    {
        return false;
    }
	
}
