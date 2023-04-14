package com.osariusz.chaosskeleton.mobs;

import net.minecraft.client.model.SkeletonModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.AbstractSkeleton;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ChaosSkeletonRenderer extends HumanoidMobRenderer<AbstractSkeleton, SkeletonModel<AbstractSkeleton>> {
    private static final ResourceLocation SKELETON_LOCATION = new ResourceLocation("chaosskeleton", "textures/entity/skeleton/chaosskeleton.png");

    public ChaosSkeletonRenderer(EntityRendererProvider.Context context) {
        this(context, ModelLayers.SKELETON, ModelLayers.SKELETON_INNER_ARMOR, ModelLayers.SKELETON_OUTER_ARMOR);
    }

    public ChaosSkeletonRenderer(EntityRendererProvider.Context context, ModelLayerLocation modelLayerLocation, ModelLayerLocation modelLayerLocation2, ModelLayerLocation modelLayerLocation3) {
        super(context, new SkeletonModel<>(context.bakeLayer(modelLayerLocation)), 0.5F);
        this.addLayer(new HumanoidArmorLayer<>(this, new SkeletonModel(context.bakeLayer(modelLayerLocation2)), new SkeletonModel(context.bakeLayer(modelLayerLocation3))));
    }

    public ResourceLocation getTextureLocation(AbstractSkeleton abstractSkeleton) {
        return SKELETON_LOCATION;
    }

    protected boolean isShaking(AbstractSkeleton abstractSkeleton) {
        return abstractSkeleton.isShaking();
    }
}