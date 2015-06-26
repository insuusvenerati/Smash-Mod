package com.stiforr.smashmod.entity;

import com.stiforr.smashmod.init.ModItems;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.world.World;

/**
 * Created by Sean Norwood on 6/25/2015.
 */
public class EntitySmash extends EntityAnimal {
    public EntitySmash(World world) {
        super(world);
        setSize(1, 2);
        preventEntitySpawning = true;
        this.tasks.addTask(0, new EntityAIWander(this, 0.5D));
        this.tasks.addTask(1, new EntityAIPanic(this, 1.0D));
        this.tasks.addTask(2, new EntityAITempt(this, 0.7D, ModItems.tntAxe, false));
        this.tasks.addTask(3, new EntityAIFollowParent(this, 1.0D));
    }

    public EntitySmash(World world, double x, double y, double z){
        this(world);
        setPosition(x, y, z);
    }

    public boolean isAIEnabled(){
        return true;
    }

    @Override
    public EntityAgeable createChild(EntityAgeable entity) {
        return new EntitySmash(worldObj);
    }
}
