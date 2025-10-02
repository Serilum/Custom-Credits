package com.natamus.customcredits.forge.events;

import com.natamus.customcredits.cmds.CommandCredits;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterClientCommandsEvent;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;

import java.lang.invoke.MethodHandles;

public class ForgeCommandEvents {
	public static void registerEventsInBus() {
		// BusGroup.DEFAULT.register(MethodHandles.lookup(), ForgeCommandEvents.class);

		RegisterClientCommandsEvent.BUS.addListener(ForgeCommandEvents::registerCommands);
	}

    @SubscribeEvent
    public static void registerCommands(RegisterClientCommandsEvent e) {
    	CommandCredits.register(e.getDispatcher());
    }
}
