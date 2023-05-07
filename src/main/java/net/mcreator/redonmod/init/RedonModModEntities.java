
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.redonmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.redonmod.entity.XusiaGunEntity;
import net.mcreator.redonmod.entity.RedonEntity;
import net.mcreator.redonmod.RedonModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RedonModModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, RedonModMod.MODID);
	public static final RegistryObject<EntityType<RedonEntity>> REDON = register("redon",
			EntityType.Builder.<RedonEntity>of(RedonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RedonEntity::new)

					.sized(10f, 1f));
	public static final RegistryObject<EntityType<XusiaGunEntity>> XUSIA_GUN = register("projectile_xusia_gun",
			EntityType.Builder.<XusiaGunEntity>of(XusiaGunEntity::new, MobCategory.MISC).setCustomClientFactory(XusiaGunEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			RedonEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(REDON.get(), RedonEntity.createAttributes().build());
	}
}
