package com.natamus.customcredits.forge.events;

import com.natamus.customcredits.cmds.CommandCredits;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterClientCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(value = Dist.CLIENT)
public class ForgeCommandEvents {
    @SubscribeEvent
    public void registerCommands(RegisterClientCommandsEvent e) {
    	CommandCredits.register(e.getDispatcher());
    }
}
