
package net.mcreator.redonmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SlimeModel;

import net.mcreator.redonmod.entity.RedonEntity;

public class RedonRenderer extends MobRenderer<RedonEntity, SlimeModel<RedonEntity>> {
	public RedonRenderer(EntityRendererProvider.Context context) {
		super(context, new SlimeModel(context.bakeLayer(ModelLayers.SLIME)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RedonEntity entity) {
		return new ResourceLocation("redon_mod:textures/entities/screenshot_31.png");
	}
}
