package com.natamus.customcredits.neoforge.events;

import com.natamus.customcredits.cmds.CommandCredits;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.neoforge.client.event.RegisterClientCommandsEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;

@EventBusSubscriber(value = Dist.CLIENT)
public class NeoForgeCommandEvents {
	@SubscribeEvent
	public static void registerCommands(RegisterClientCommandsEvent e) {
		CommandCredits.register(e.getDispatcher());
	}
}
