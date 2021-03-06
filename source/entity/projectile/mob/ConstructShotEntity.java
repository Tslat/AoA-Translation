package net.tslat.aoa3.entity.projectile.mob;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.projectile.ThrowableEntity;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.AoAEntities;
import net.tslat.aoa3.entity.base.AoARangedMob;

public class ConstructShotEntity extends BaseMobProjectile {
	public ConstructShotEntity(EntityType<? extends ThrowableEntity> entityType, World world) {
		super(entityType, world);
	}
	
	public ConstructShotEntity(World world) {
		super(AoAEntities.Projectiles.CONSTRUCT_SHOT.get(), world);
	}

	public ConstructShotEntity(AoARangedMob shooter, Type projectileType) {
		super(AoAEntities.Projectiles.CONSTRUCT_SHOT.get(), shooter.world, shooter, projectileType);
	}

	@Override
	public float getGravityVelocity() {
		return 0.075f;
	}
}
