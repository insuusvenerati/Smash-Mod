package com.stiforr.smashmod.proxy;

import com.stiforr.smashmod.SmashMod;
import com.stiforr.smashmod.entity.EntitySmash;
import com.stiforr.smashmod.rendering.entities.RenderSmash;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.client.model.ModelBiped;

public class ClientProxy extends CommonProxy
{
	int ModEntityID;

	public int addArmor(String armor)
	{
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}

	public void registerRenderers(){
		RenderingRegistry.registerEntityRenderingHandler(EntitySmash.class, new RenderSmash(new ModelBiped(), 0));
	}

	public void registerEntities(){
		ModEntityID = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerModEntity(EntitySmash.class, "EntitySmash", ModEntityID++, SmashMod.instance, 80, 1, false);

	}
}
