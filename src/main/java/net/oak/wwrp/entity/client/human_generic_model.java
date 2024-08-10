// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package net.oak.wwrp.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.oak.wwrp.entity.custom.HumanEntity;

public class human_generic_model<T extends HumanEntity> extends SinglePartEntityModel<T> {
	private final ModelPart human;
	private final ModelPart head;
	public human_generic_model(ModelPart root) {
		this.human = root.getChild("human");
		this.head = human.getChild("player_base").getChild("head");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData human = modelPartData.addChild("human", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 6.0F, 0.0F));

		ModelPartData extras = human.addChild("extras", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -6.0F, 0.0F));

		ModelPartData eyes = extras.addChild("eyes", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -3.0F, -4.0F));

		ModelPartData l_pupil = eyes.addChild("l_pupil", ModelPartBuilder.create().uv(5, 5).cuboid(-1.0F, -1.0F, -0.1F, 1.0F, 2.0F, 0.1F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, 0.0F, 0.0F));

		ModelPartData l_lid = eyes.addChild("l_lid", ModelPartBuilder.create().uv(0, 3).cuboid(-1.0F, -2.0F, -0.11F, 2.0F, 2.0F, 0.15F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, -1.0F, 0.0F));

		ModelPartData r_pupil = eyes.addChild("r_pupil", ModelPartBuilder.create().uv(5, 5).cuboid(0.0F, -1.0F, -0.1F, 1.0F, 2.0F, 0.1F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, 0.0F, 0.0F));

		ModelPartData r_lid = eyes.addChild("r_lid", ModelPartBuilder.create().uv(0, 3).cuboid(-1.0F, -2.0F, -0.11F, 2.0F, 2.0F, 0.15F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, -1.0F, 0.0F));

		ModelPartData player_base = human.addChild("player_base", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -6.0F, 0.0F));

		ModelPartData head = player_base.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F))
		.uv(32, 0).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.5F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData body = player_base.addChild("body", ModelPartBuilder.create().uv(16, 16).cuboid(-4.0F, -12.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F))
		.uv(16, 32).cuboid(-4.0F, -12.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.25F)), ModelTransform.pivot(0.0F, 12.0F, 0.0F));

		ModelPartData right_arm = player_base.addChild("right_arm", ModelPartBuilder.create().uv(40, 16).cuboid(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F))
		.uv(40, 32).cuboid(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.25F)), ModelTransform.pivot(-4.0F, 2.0F, 0.0F));

		ModelPartData left_arm = player_base.addChild("left_arm", ModelPartBuilder.create().uv(32, 48).cuboid(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F))
		.uv(48, 48).cuboid(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.25F)), ModelTransform.pivot(4.0F, 2.0F, 0.0F));

		ModelPartData right_leg = player_base.addChild("right_leg", ModelPartBuilder.create().uv(0, 16).cuboid(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 32).cuboid(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.25F)), ModelTransform.pivot(-2.0F, 12.0F, 0.0F));

		ModelPartData left_leg = player_base.addChild("left_leg", ModelPartBuilder.create().uv(16, 48).cuboid(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 48).cuboid(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.25F)), ModelTransform.pivot(2.0F, 12.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		human.render(matrices, vertexConsumer, light, overlay);
	}

	@Override
	public ModelPart getPart() {
		return human;
	}

	@Override
	public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

	}
}