package net.tslat.aoa3.client.render.entity.projectile.blasters;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.tslat.aoa3.client.render.entity.projectile.ParticleProjectileRenderer;
import net.tslat.aoa3.common.registration.AoAParticleTypes;
import net.tslat.aoa3.entity.projectile.blaster.AtomizerBounceEntity;
import net.tslat.aoa3.library.misc.CustomisableParticleType;
import net.tslat.aoa3.util.NumberUtil;

public class AtomizerBounceRenderer extends ParticleProjectileRenderer<AtomizerBounceEntity> {
	public AtomizerBounceRenderer(final EntityRendererManager manager) {
		super(manager);
	}

	@Override
	protected void addParticles(AtomizerBounceEntity entity, float partialTicks) {
		for (int i = 0; i < 3; i++) {
			entity.world.addParticle(new CustomisableParticleType.Data(AoAParticleTypes.SPARKLER.get(), 1, 3, NumberUtil.RGB(0, 0, 255)), entity.getPosX(), entity.getPosY(), entity.getPosZ(), 0, 0, 0);
		}
	}
}
