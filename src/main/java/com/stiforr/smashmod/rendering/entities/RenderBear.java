package com.stiforr.smashmod.rendering.entities;

import com.stiforr.smashmod.reference.Reference;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Sean Norwood on 6/26/2015.
 */
public class RenderBear extends RenderBiped {

    public RenderBear(ModelBiped model, float shadowSize) {
        super(model, shadowSize);
    }

    protected ResourceLocation getEntityTexture(Entity entity)
    {
        return new ResourceLocation(Reference.MOD_ID + ":textures/entity/leeBear.png");
    }


    public void doRender(Entity entity, double x, double y, double z, float rotationYaw, float rotationPitch)
    {
        super.doRender((EntityLiving) entity, x, y, z, rotationYaw, rotationPitch);
    }
}
