package com.natamus.customcredits.forge.events;

import com.natamus.customcredits.cmds.CommandCredits;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterClientCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ForgeCommandEvents {
    @SubscribeEvent
    public static void registerCommands(RegisterClientCommandsEvent e) {
    	CommandCredits.register(e.getDispatcher());
    }
}
