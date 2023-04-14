package com.osariusz.init;

import com.osariusz.chaosskeleton.ChaosSkeletonMod;
import com.osariusz.chaosskeleton.mobs.ChaosSkeleton;
import com.osariusz.chaosskeleton.mobs.ChaosSkeletonRenderer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.SkeletonRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.common.Tags;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityInit {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ChaosSkeletonMod.MODID);

    public static final RegistryObject<EntityType<ChaosSkeleton>> CHAOS_SKELETON = ENTITIES.register("chaosskeleton",
            () -> EntityType.Builder.of(ChaosSkeleton::new, MobCategory.MONSTER).sized(0.6F, 1.99F).clientTrackingRange(8).build(new ResourceLocation(ChaosSkeletonMod.MODID, "chaosskeleton").toString()));

    public static void register(IEventBus eventBus){
        ENTITIES.register(eventBus);
    }

    public static void clientRegister(){
        EntityRenderers.register(CHAOS_SKELETON.get(), ChaosSkeletonRenderer::new);
    }

}
