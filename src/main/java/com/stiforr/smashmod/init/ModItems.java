package com.stiforr.smashmod.init;

import com.stiforr.smashmod.SmashMod;
import com.stiforr.smashmod.armor.TntArmor;
import com.stiforr.smashmod.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final ItemArmor.ArmorMaterial tntArmorMaterial = EnumHelper.addArmorMaterial("tntArmorMaterial", 100, new int[]{20, 20, 20, 20}, 20);
	
	public static Item tntHelmet = new TntArmor(tntArmorMaterial, SmashMod.proxy.addArmor("tntArmor"), 0).setUnlocalizedName("tntHelmet").setCreativeTab(CreativeTabs.tabCombat).setTextureName(Reference.MOD_ID + ":tntHelmet");
	public static Item tntArmorChest = new TntArmor(tntArmorMaterial, SmashMod.proxy.addArmor("tntArmor"), 1).setUnlocalizedName("tntArmorChest").setCreativeTab(CreativeTabs.tabCombat).setTextureName(Reference.MOD_ID + ":tntArmorChest");
	public static Item tntLegs = new TntArmor(tntArmorMaterial, SmashMod.proxy.addArmor("tntArmor"), 2).setUnlocalizedName("tntLegs").setCreativeTab(CreativeTabs.tabCombat).setTextureName(Reference.MOD_ID + ":tntLegs");
	public static Item tntBoots = new TntArmor(tntArmorMaterial, SmashMod.proxy.addArmor("tntArmor"), 3).setUnlocalizedName("tntBoots").setCreativeTab(CreativeTabs.tabCombat).setTextureName(Reference.MOD_ID + ":tntBoots");
	
	public static void init()
	{
		GameRegistry.registerItem(tntHelmet, "tntHelmet");
		GameRegistry.registerItem(tntArmorChest, "tntArmorChest");
		GameRegistry.registerItem(tntLegs, "tntLegs");
		GameRegistry.registerItem(tntBoots, "tntBoots");
	}
}
