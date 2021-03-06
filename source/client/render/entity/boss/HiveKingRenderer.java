package net.tslat.aoa3.client.render.entity.boss;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.util.ResourceLocation;
import net.tslat.aoa3.client.model.entity.boss.HiveKingModel;
import net.tslat.aoa3.common.registration.AoAEntities;
import net.tslat.aoa3.entity.boss.HiveKingEntity;

public class HiveKingRenderer extends MobRenderer<HiveKingEntity, EntityModel<HiveKingEntity>> {
	private static final ResourceLocation TEXTURE = new ResourceLocation("aoa3", "textures/entities/boss/hiveking/hive_king.png");

	public HiveKingRenderer(EntityRendererManager renderManager) {
		super(renderManager, new HiveKingModel(), AoAEntities.Mobs.HIVE_KING.get().getWidth() / 3f);
	}

	@Override
	protected void preRenderCallback(HiveKingEntity hiveKing, MatrixStack matrix, float partialTicks) {
		if (hiveKing.ticksExisted < 1000) {
			float scaleFactor = hiveKing.getGrowthPercent() / 100f;

			matrix.scale(scaleFactor, scaleFactor, scaleFactor);
		}
	}

	@Override
	public ResourceLocation getEntityTexture(HiveKingEntity entity) {
		return TEXTURE;
	}
}