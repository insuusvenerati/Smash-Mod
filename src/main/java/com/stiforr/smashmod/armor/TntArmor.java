package com.stiforr.smashmod.armor;

import com.stiforr.smashmod.init.ModItems;
import com.stiforr.smashmod.reference.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class TntArmor extends ItemArmor
{

	public TntArmor(ArmorMaterial material, int dmgReduc, int enchantability) {
		super(material, dmgReduc, enchantability);

	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if (stack.getItem() == ModItems.tntHelmet || stack.getItem() == ModItems.tntArmorChest || stack.getItem() == ModItems.tntBoots) {
			return Reference.MOD_ID + ":textures/armor/tntArmor1.png";
		} else if (stack.getItem() == ModItems.tntLegs) {
			return Reference.MOD_ID + ":textures/armor/tntArmor2.png";
		} else {
			return null;
		}
	}
	
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if(player.getCurrentArmor(3) != null && player.getCurrentArmor(2) != null && player.getCurrentArmor(1) != null){
			ItemStack helmet = player.getCurrentArmor(3);
			ItemStack plate = player.getCurrentArmor(2);
			ItemStack pants = player.getCurrentArmor(1);
			if(helmet.getItem() == ModItems.tntHelmet && plate.getItem() == ModItems.tntArmorChest && pants.getItem() == ModItems.tntLegs){
				player.addPotionEffect(new PotionEffect(Potion.resistance.getId(), 100, 1));
				player.addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 101, 1));
				player.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 102, 1));
				player.capabilities.allowFlying = true;
			}
		}
		
		if(player.getCurrentArmor(0) != null){
			ItemStack boots = player.getCurrentArmor(0);
			if(boots.getItem() == ModItems.tntBoots);
			}
		}

}
