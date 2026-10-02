package com.serilum.customcredits.forge.events;

import com.serilum.customcredits.cmds.CommandCredits;
import net.minecraftforge.client.event.RegisterClientCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ForgeCommandEvents {
	@SubscribeEvent
	public static void registerCommands(RegisterClientCommandsEvent e) {
		CommandCredits.register(e.getDispatcher());
	}
}
