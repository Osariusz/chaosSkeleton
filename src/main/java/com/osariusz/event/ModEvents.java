package com.osariusz.event;

import com.osariusz.chaosskeleton.ChaosSkeletonMod;
import com.osariusz.chaosskeleton.mobs.ChaosSkeleton;
import com.osariusz.init.EntityInit;
import net.minecraft.tags.BiomeTags;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ChaosSkeletonMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event){
        event.put(EntityInit.CHAOS_SKELETON.get(),ChaosSkeleton.setAttributes());
    }
}
