package net.tslat.aoa3.client.model.entity.mob.gardencia;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.MobEntity;
import net.minecraft.util.math.MathHelper;

public class ArchvineModel extends EntityModel<MobEntity> {
	private final ModelRenderer head;
	private final ModelRenderer body5;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer leg4;
	private final ModelRenderer body;
	private final ModelRenderer body2;
	private final ModelRenderer body3;
	private final ModelRenderer body4;
	private final ModelRenderer head2;
	private final ModelRenderer head3;
	private final ModelRenderer head4;
	private final ModelRenderer head5;
	private final ModelRenderer head6;
	private final ModelRenderer head7;
	private final ModelRenderer head8;
	private final ModelRenderer head9;
	private final ModelRenderer head10;
	private final ModelRenderer head11;
	private final ModelRenderer head12;
	private final ModelRenderer head13;
	private final ModelRenderer head14;
	private final ModelRenderer head15;
	private final ModelRenderer head16;
	private final ModelRenderer head17;
	private final ModelRenderer head18;
	private final ModelRenderer head19;
	private final ModelRenderer head20;
	private final ModelRenderer head21;
	private final ModelRenderer head22;
	private final ModelRenderer head23;
	private final ModelRenderer head24;
	private final ModelRenderer head25;
	private final ModelRenderer head26;
	private final ModelRenderer head27;
	private final ModelRenderer head28;
	private final ModelRenderer head29;

	public ArchvineModel() {
		textureWidth = 128;
		textureHeight = 32;
		(head = new ModelRenderer(this, 33, 16)).addBox(-6.0f, -3.0f, -13.0f, 12, 3, 2);
		head.setRotationPoint(0.0f, 7.0f, -3.0f);
		head.setTextureSize(128, 32);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(body5 = new ModelRenderer(this, 86, 4)).addBox(-3.5f, -11.0f, 2.5f, 5, 7, 5);
		body5.setRotationPoint(1.0f, 11.0f, 12.0f);
		body5.setTextureSize(128, 32);
		body5.mirror = true;
		setRotation(body5, 1.570796f, 0.0f, 0.0f);
		(leg1 = new ModelRenderer(this, 0, 16)).addBox(-3.0f, 0.0f, -2.0f, 4, 8, 4);
		leg1.setRotationPoint(-3.0f, 16.0f, 17.0f);
		leg1.setTextureSize(128, 32);
		leg1.mirror = true;
		setRotation(leg1, 0.0f, 0.0f, 0.0f);
		(leg2 = new ModelRenderer(this, 0, 16)).addBox(-1.0f, 0.0f, -2.0f, 4, 8, 4);
		leg2.setRotationPoint(3.0f, 16.0f, 17.0f);
		leg2.setTextureSize(128, 32);
		leg2.mirror = true;
		setRotation(leg2, 0.0f, 0.0f, 0.0f);
		(leg3 = new ModelRenderer(this, 0, 16)).addBox(-3.0f, 0.0f, -3.0f, 4, 8, 4);
		leg3.setRotationPoint(-3.0f, 16.0f, 10.0f);
		leg3.setTextureSize(128, 32);
		leg3.mirror = true;
		setRotation(leg3, 0.0f, 0.0f, 0.0f);
		(leg4 = new ModelRenderer(this, 0, 16)).addBox(-1.0f, 0.0f, -3.0f, 4, 8, 4);
		leg4.setRotationPoint(3.0f, 16.0f, 10.0f);
		leg4.setTextureSize(128, 32);
		leg4.mirror = true;
		setRotation(leg4, 0.0f, 0.0f, 0.0f);
		(body = new ModelRenderer(this, 86, 17)).addBox(-6.0f, -3.0f, -7.0f, 10, 5, 10);
		body.setRotationPoint(1.0f, 16.0f, 15.0f);
		body.setTextureSize(128, 32);
		body.mirror = true;
		setRotation(body, 0.0f, 0.0f, 0.0f);
		(body2 = new ModelRenderer(this, 86, 4)).addBox(-5.0f, -4.0f, -6.0f, 8, 7, 8);
		body2.setRotationPoint(1.0f, 11.0f, 14.0f);
		body2.setTextureSize(128, 32);
		body2.mirror = true;
		setRotation(body2, 0.2974289f, 0.0f, 0.0f);
		(body3 = new ModelRenderer(this, 86, 4)).addBox(-3.0f, -14.0f, 6.5f, 4, 7, 4);
		body3.setRotationPoint(1.0f, 11.0f, 12.0f);
		body3.setTextureSize(128, 32);
		body3.mirror = true;
		setRotation(body3, 1.919862f, 0.0f, 0.0f);
		(body4 = new ModelRenderer(this, 86, 4)).addBox(-4.0f, -7.0f, -1.0f, 6, 7, 6);
		body4.setRotationPoint(1.0f, 11.0f, 12.0f);
		body4.setTextureSize(128, 32);
		body4.mirror = true;
		setRotation(body4, 1.047198f, 0.0f, 0.0f);
		(head2 = new ModelRenderer(this, 61, 0)).addBox(-4.0f, -4.0f, -3.0f, 8, 8, 3);
		head2.setRotationPoint(0.0f, 7.0f, -3.0f);
		head2.setTextureSize(128, 32);
		head2.mirror = true;
		setRotation(head2, 0.0f, 0.0f, 0.0f);
		(head3 = new ModelRenderer(this, 17, 16)).addBox(-3.0f, -12.0f, -2.0f, 6, 8, 1);
		head3.setRotationPoint(0.0f, 7.0f, -3.0f);
		head3.setTextureSize(128, 32);
		head3.mirror = true;
		setRotation(head3, 0.0f, 0.0f, 0.7853982f);
		(head4 = new ModelRenderer(this, 38, 26)).addBox(-2.0f, 0.0f, -13.0f, 1, 1, 1);
		head4.setRotationPoint(0.0f, 7.0f, -3.0f);
		head4.setTextureSize(128, 32);
		head4.mirror = true;
		setRotation(head4, 0.0f, 0.0f, 0.0f);
		(head5 = new ModelRenderer(this, 30, 0)).addBox(-6.0f, -6.0f, -9.0f, 12, 6, 3);
		head5.setRotationPoint(0.0f, 7.0f, -3.0f);
		head5.setTextureSize(128, 32);
		head5.mirror = true;
		setRotation(head5, 0.0f, 0.0f, 0.0f);
		(head6 = new ModelRenderer(this, 32, 9)).addBox(-6.0f, -5.0f, -11.0f, 12, 5, 2);
		head6.setRotationPoint(0.0f, 7.0f, -3.0f);
		head6.setTextureSize(128, 32);
		head6.mirror = true;
		setRotation(head6, 0.0f, 0.0f, 0.0f);
		(head7 = new ModelRenderer(this, 0, 0)).addBox(-6.0f, -6.0f, -6.0f, 12, 12, 3);
		head7.setRotationPoint(0.0f, 7.0f, -3.0f);
		head7.setTextureSize(128, 32);
		head7.mirror = true;
		setRotation(head7, 0.0f, 0.0f, 0.0f);
		(head8 = new ModelRenderer(this, 17, 16)).addBox(-3.0f, -12.0f, -2.0f, 6, 8, 1);
		head8.setRotationPoint(0.0f, 7.0f, -3.0f);
		head8.setTextureSize(128, 32);
		head8.mirror = true;
		setRotation(head8, 0.0f, 0.0f, -0.7853982f);
		(head9 = new ModelRenderer(this, 17, 16)).addBox(-3.0f, -12.0f, -3.0f, 6, 8, 1);
		head9.setRotationPoint(0.0f, 7.0f, -3.0f);
		head9.setTextureSize(128, 32);
		head9.mirror = true;
		setRotation(head9, 0.0f, 0.0f, 0.0f);
		(head10 = new ModelRenderer(this, 47, 22)).addBox(-6.0f, 3.0f, -13.0f, 12, 3, 7);
		head10.setRotationPoint(0.0f, 7.0f, -3.0f);
		head10.setTextureSize(128, 32);
		head10.mirror = true;
		setRotation(head10, 0.0f, 0.0f, 0.0f);
		(head11 = new ModelRenderer(this, 38, 26)).addBox(-6.0f, 0.0f, -9.0f, 1, 1, 1);
		head11.setRotationPoint(0.0f, 7.0f, -3.0f);
		head11.setTextureSize(128, 32);
		head11.mirror = true;
		setRotation(head11, 0.0f, 0.0f, 0.0f);
		(head12 = new ModelRenderer(this, 38, 26)).addBox(-4.0f, 0.0f, -13.0f, 1, 1, 1);
		head12.setRotationPoint(0.0f, 7.0f, -3.0f);
		head12.setTextureSize(128, 32);
		head12.mirror = true;
		setRotation(head12, 0.0f, 0.0f, 0.0f);
		(head13 = new ModelRenderer(this, 38, 26)).addBox(5.0f, 0.0f, -9.0f, 1, 1, 1);
		head13.setRotationPoint(0.0f, 7.0f, -3.0f);
		head13.setTextureSize(128, 32);
		head13.mirror = true;
		setRotation(head13, 0.0f, 0.0f, 0.0f);
		(head14 = new ModelRenderer(this, 38, 26)).addBox(3.0f, 0.0f, -13.0f, 1, 1, 1);
		head14.setRotationPoint(0.0f, 7.0f, -3.0f);
		head14.setTextureSize(128, 32);
		head14.mirror = true;
		setRotation(head14, 0.0f, 0.0f, 0.0f);
		(head15 = new ModelRenderer(this, 38, 26)).addBox(1.0f, 0.0f, -13.0f, 1, 1, 1);
		head15.setRotationPoint(0.0f, 7.0f, -3.0f);
		head15.setTextureSize(128, 32);
		head15.mirror = true;
		setRotation(head15, 0.0f, 0.0f, 0.0f);
		(head16 = new ModelRenderer(this, 38, 26)).addBox(5.0f, 0.0f, -13.0f, 1, 1, 1);
		head16.setRotationPoint(0.0f, 7.0f, -3.0f);
		head16.setTextureSize(128, 32);
		head16.mirror = true;
		setRotation(head16, 0.0f, 0.0f, 0.0f);
		(head17 = new ModelRenderer(this, 38, 26)).addBox(-6.0f, 0.0f, -13.0f, 1, 1, 1);
		head17.setRotationPoint(0.0f, 7.0f, -3.0f);
		head17.setTextureSize(128, 32);
		head17.mirror = true;
		setRotation(head17, 0.0f, 0.0f, 0.0f);
		(head18 = new ModelRenderer(this, 38, 26)).addBox(5.0f, 0.0f, -11.0f, 1, 1, 1);
		head18.setRotationPoint(0.0f, 7.0f, -3.0f);
		head18.setTextureSize(128, 32);
		head18.mirror = true;
		setRotation(head18, 0.0f, 0.0f, 0.0f);
		(head19 = new ModelRenderer(this, 38, 26)).addBox(-6.0f, 0.0f, -11.0f, 1, 1, 1);
		head19.setRotationPoint(0.0f, 7.0f, -3.0f);
		head19.setTextureSize(128, 32);
		head19.mirror = true;
		setRotation(head19, 0.0f, 0.0f, 0.0f);
		(head20 = new ModelRenderer(this, 38, 26)).addBox(5.0f, 2.0f, -9.0f, 1, 1, 1);
		head20.setRotationPoint(0.0f, 7.0f, -3.0f);
		head20.setTextureSize(128, 32);
		head20.mirror = true;
		setRotation(head20, 0.0f, 0.0f, 0.0f);
		(head21 = new ModelRenderer(this, 38, 26)).addBox(-6.0f, 2.0f, -9.0f, 1, 1, 1);
		head21.setRotationPoint(0.0f, 7.0f, -3.0f);
		head21.setTextureSize(128, 32);
		head21.mirror = true;
		setRotation(head21, 0.0f, 0.0f, 0.0f);
		(head22 = new ModelRenderer(this, 38, 26)).addBox(5.0f, 2.0f, -11.0f, 1, 1, 1);
		head22.setRotationPoint(0.0f, 7.0f, -3.0f);
		head22.setTextureSize(128, 32);
		head22.mirror = true;
		setRotation(head22, 0.0f, 0.0f, 0.0f);
		(head23 = new ModelRenderer(this, 38, 26)).addBox(-6.0f, 2.0f, -11.0f, 1, 1, 1);
		head23.setRotationPoint(0.0f, 7.0f, -3.0f);
		head23.setTextureSize(128, 32);
		head23.mirror = true;
		setRotation(head23, 0.0f, 0.0f, 0.0f);
		(head24 = new ModelRenderer(this, 38, 26)).addBox(-6.0f, 2.0f, -13.0f, 1, 1, 1);
		head24.setRotationPoint(0.0f, 7.0f, -3.0f);
		head24.setTextureSize(128, 32);
		head24.mirror = true;
		setRotation(head24, 0.0f, 0.0f, 0.0f);
		(head25 = new ModelRenderer(this, 38, 26)).addBox(-4.0f, 2.0f, -13.0f, 1, 1, 1);
		head25.setRotationPoint(0.0f, 7.0f, -3.0f);
		head25.setTextureSize(128, 32);
		head25.mirror = true;
		setRotation(head25, 0.0f, 0.0f, 0.0f);
		(head26 = new ModelRenderer(this, 38, 26)).addBox(-2.0f, 2.0f, -13.0f, 1, 1, 1);
		head26.setRotationPoint(0.0f, 7.0f, -3.0f);
		head26.setTextureSize(128, 32);
		head26.mirror = true;
		setRotation(head26, 0.0f, 0.0f, 0.0f);
		(head27 = new ModelRenderer(this, 38, 26)).addBox(1.0f, 2.0f, -13.0f, 1, 1, 1);
		head27.setRotationPoint(0.0f, 7.0f, -3.0f);
		head27.setTextureSize(128, 32);
		head27.mirror = true;
		setRotation(head27, 0.0f, 0.0f, 0.0f);
		(head28 = new ModelRenderer(this, 38, 26)).addBox(3.0f, 2.0f, -13.0f, 1, 1, 1);
		head28.setRotationPoint(0.0f, 7.0f, -3.0f);
		head28.setTextureSize(128, 32);
		head28.mirror = true;
		setRotation(head28, 0.0f, 0.0f, 0.0f);
		(head29 = new ModelRenderer(this, 38, 26)).addBox(5.0f, 2.0f, -13.0f, 1, 1, 1);
		head29.setRotationPoint(0.0f, 7.0f, -3.0f);
		head29.setTextureSize(128, 32);
		head29.mirror = true;
		setRotation(head29, 0.0f, 0.0f, 0.0f);
	}

	@Override
	public void render(MatrixStack matrix, IVertexBuilder buffer, int light, int overlay, float red, float green, float blue, float alpha) {
		head.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body5.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg1.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head5.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head6.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head7.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head8.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head9.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head10.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head11.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head12.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head13.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head14.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head15.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head16.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head17.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head18.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head19.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head20.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head21.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head22.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head23.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head24.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head25.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head26.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head27.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head28.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head29.render(matrix, buffer, light, overlay, red, green, blue, alpha);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(MobEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		leg1.rotateAngleY = 0.0f;
		leg3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		leg3.rotateAngleY = 0.0f;
		leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
		leg4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
	}
}
