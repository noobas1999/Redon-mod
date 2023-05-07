
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.redonmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.redonmod.RedonModMod;

public class RedonModModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, RedonModMod.MODID);
	public static final RegistryObject<SoundEvent> NAI = REGISTRY.register("nai", () -> new SoundEvent(new ResourceLocation("redon_mod", "nai")));
	public static final RegistryObject<SoundEvent> MAOU = REGISTRY.register("maou", () -> new SoundEvent(new ResourceLocation("redon_mod", "maou")));
}
