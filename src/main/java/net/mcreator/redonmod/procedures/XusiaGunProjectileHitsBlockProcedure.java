package net.mcreator.redonmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.BonemealEvent;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class XusiaGunProjectileHitsBlockProcedure {
	@SubscribeEvent
	public static void onBonemeal(BonemealEvent event) {
		execute(event);
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
	}
}
