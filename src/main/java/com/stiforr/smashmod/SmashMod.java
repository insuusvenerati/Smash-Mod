package com.stiforr.smashmod;

import com.stiforr.smashmod.init.ModItems;
import com.stiforr.smashmod.init.Recipes;
import com.stiforr.smashmod.proxy.CommonProxy;
import com.stiforr.smashmod.reference.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)
public class SmashMod 
{
	@Mod.Instance(Reference.MOD_ID)
	public static SmashMod instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModItems.init();
		Recipes.init();

		proxy.registerEntities();
		proxy.registerRenderers();
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		
	}
	
	@Mod.EventHandler
	public void postinit(FMLPostInitializationEvent event)
	{
		
	}
}
