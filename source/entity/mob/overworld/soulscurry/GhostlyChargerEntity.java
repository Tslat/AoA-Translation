package net.tslat.aoa3.entity.mob.overworld.soulscurry;

import net.minecraft.entity.*;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.AoASounds;
import net.tslat.aoa3.entity.base.AoAMeleeMob;
import net.tslat.aoa3.event.dimension.OverworldEvents;
import net.tslat.aoa3.util.constant.Resources;
import net.tslat.aoa3.util.player.PlayerUtil;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class GhostlyChargerEntity extends AoAMeleeMob {
	public GhostlyChargerEntity(EntityType<? extends MonsterEntity> entityType, World world) {
		super(entityType, world);

		isSlipperyMovement = true;

		setAIMoveSpeed(1.5f);
	}

	@Override
	protected float getStandingEyeHeight(Pose poseIn, EntitySize sizeIn) {
		return sizeIn.height * 0.85f;
	}

	@Override
	protected double getBaseKnockbackResistance() {
		return 1d;
	}

	@Override
	protected double getBaseMaxHealth() {
		return 30;
	}

	@Override
	protected double getBaseMeleeDamage() {
		return 4;
	}

	@Override
	protected double getBaseMovementSpeed() {
		return 0.329;
	}

	@Nullable
	@Override
	protected SoundEvent getAmbientSound() {
		return AoASounds.ENTITY_CHARGER_AMBIENT.get();
	}

	@Override
	protected SoundEvent getDeathSound() {
		return AoASounds.ENTITY_CHARGER_DEATH.get();
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return AoASounds.ENTITY_CHARGER_HURT.get();
	}

	@Override
	protected boolean isOverworldMob() {
		return true;
	}

	@Override
	protected void onAttack(Entity target) {
		if (target instanceof ServerPlayerEntity)
			PlayerUtil.consumeResource((ServerPlayerEntity)target, Resources.SOUL, 10f, true);
	}

	@Nonnull
	@Override
	protected OverworldEvents.Event getEventRequirement() {
		return OverworldEvents.Event.SOUL_SCURRY;
	}

	@Override
	public CreatureAttribute getCreatureAttribute() {
		return CreatureAttribute.UNDEAD;
	}
}
