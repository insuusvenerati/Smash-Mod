package com.stiforr.smashmod.rendering.entities;

import com.stiforr.smashmod.reference.Reference;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Sean Norwood on 6/25/2015.
 */
public class RenderSmash extends RenderBiped {
    public RenderSmash(ModelBiped model, float shadowSize) {
        super(model, shadowSize);
    }

    protected ResourceLocation getEntityTexture(Entity entity)
    {
        return new ResourceLocation(Reference.MOD_ID + ":textures/entity/smashEntity.png");
    }


    public void doRender(Entity entity, double x, double y, double z, float rotationYaw, float rotationPitch)
    {
        super.doRender((EntityLiving) entity, x, y, z, rotationYaw, rotationPitch);
    }
}
