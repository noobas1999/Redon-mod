
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.redonmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.redonmod.item.XusiaGunItem;
import net.mcreator.redonmod.RedonModMod;

public class RedonModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RedonModMod.MODID);
	public static final RegistryObject<Item> REDON_SPAWN_EGG = REGISTRY.register("redon_spawn_egg", () -> new ForgeSpawnEggItem(RedonModModEntities.REDON, -3355648, -6684775, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> XUSIA_GUN = REGISTRY.register("xusia_gun", () -> new XusiaGunItem());
}
