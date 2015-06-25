package com.stiforr.smashmod.tool;

import com.stiforr.smashmod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class TntAxe extends ItemAxe
{

	public TntAxe(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("tntAxe");
		this.setTextureName(Reference.MOD_ID + ":tntAxe");
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
	
	


	public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int s, float sx, float sy, float sz)
	{
		if (s == 0)
		{
			--y;
		}

		if (s == 1)
		{
			++y;
		}

		if (s == 2)
		{
			--z;
		}

		if (s == 3)
		{
			++z;
		}

		if (s == 4)
		{
			--x;
		}

		if (s == 5)
		{
			++x;
		}

		if (!player.canPlayerEdit(x, y, z, s, itemStack))
		{
			return false;
		}
		else
		{
			if (world.isAirBlock(x, y, z))
			{
				world.playSoundEffect((double) x + 0.5D, (double) y + 0.5D, (double) z + 0.5D, "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
				world.setBlock(x, y, z, Blocks.tnt);
				world.setBlock(x, y+1, z, Blocks.fire);
			}

			itemStack.damageItem(1, player);
			return true;
		}
	}
	
}
