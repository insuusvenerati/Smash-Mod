package com.stiforr.smashmod.init;

import com.stiforr.smashmod.SmashMod;
import com.stiforr.smashmod.armor.TntArmor;
import com.stiforr.smashmod.creativetab.CreativeTabSmash;
import com.stiforr.smashmod.items.BearSpawner;
import com.stiforr.smashmod.items.SmashSpawner;
import com.stiforr.smashmod.reference.Reference;
import com.stiforr.smashmod.tool.TntAxe;
import com.stiforr.smashmod.tool.TntSword;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	//Tool Material
	public static final Item.ToolMaterial tntToolMaterial = EnumHelper.addToolMaterial("tntToolMaterial", 3, 1000, 8.0F, 8.0F, 20);
	
	// Armor Mat
	public static final ItemArmor.ArmorMaterial tntArmorMaterial = EnumHelper.addArmorMaterial("tntArmorMaterial", 100, new int[]{20, 20, 20, 20}, 20);
	
	// Armor
	public static Item tntHelmet = new TntArmor(tntArmorMaterial, SmashMod.proxy.addArmor("tntArmor"), 0).setUnlocalizedName("tntHelmet").setCreativeTab(CreativeTabSmash.Smash_Tab).setTextureName(Reference.MOD_ID + ":tntHelmet");
	public static Item tntArmorChest = new TntArmor(tntArmorMaterial, SmashMod.proxy.addArmor("tntArmor"), 1).setUnlocalizedName("tntArmorChest").setCreativeTab(CreativeTabSmash.Smash_Tab).setTextureName(Reference.MOD_ID + ":tntArmorChest");
	public static Item tntLegs = new TntArmor(tntArmorMaterial, SmashMod.proxy.addArmor("tntArmor"), 2).setUnlocalizedName("tntLegs").setCreativeTab(CreativeTabSmash.Smash_Tab).setTextureName(Reference.MOD_ID + ":tntLegs");
	public static Item tntBoots = new TntArmor(tntArmorMaterial, SmashMod.proxy.addArmor("tntArmor"), 3).setUnlocalizedName("tntBoots").setCreativeTab(CreativeTabSmash.Smash_Tab).setTextureName(Reference.MOD_ID + ":tntBoots");
	
	//Tools
	public static final TntAxe tntAxe = new TntAxe(tntToolMaterial);
	public static final TntSword tntSword = new TntSword(tntToolMaterial);

	public static Item smashSpawner = new SmashSpawner().setTextureName(Reference.MOD_ID + ":smashSpawner");
	public static Item bearSpawner = new BearSpawner().setTextureName(Reference.MOD_ID + ":bearSpawner");
	
	public static void init()
	{
		GameRegistry.registerItem(tntHelmet, "tntHelmet");
		GameRegistry.registerItem(tntArmorChest, "tntArmorChest");
		GameRegistry.registerItem(tntLegs, "tntLegs");
		GameRegistry.registerItem(tntBoots, "tntBoots");
		GameRegistry.registerItem(tntAxe, "tntAxe");
		GameRegistry.registerItem(tntSword, "tntSword");
		GameRegistry.registerItem(smashSpawner, "smashSpawner");
		GameRegistry.registerItem(bearSpawner, "bearSpawner");
	}
}
