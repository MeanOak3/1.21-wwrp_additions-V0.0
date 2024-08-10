package net.oak.wwrp.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.world.World;
import org.lwjgl.system.Pointer;

public class HumanEntity extends VillagerEntity {
    public HumanEntity(EntityType<? extends VillagerEntity> entityType, World world) {
        super(entityType, world);
    }
}

@Override
protected void initGoals() {
    this.goalSelector.add(0, new swimGoal(this));
}

public static DefaultAttributeContainer.Builder createHumanAttributes() {
    return MobEntity.createMobAttributes()
            .add(EntityAttributes.GENERIC_MAX_HEALTH, 20)
            .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.2f)
            .add(EntityAttributes.GENERIC_ARMOR, 0.5f)
            .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 2);
}