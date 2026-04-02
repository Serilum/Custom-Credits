package com.natamus.customcredits.fabric.cmds;

import com.mojang.brigadier.CommandDispatcher;
import com.natamus.customcredits.cmds.CommandCredits;
import net.fabricmc.fabric.api.client.command.v2.ClientCommands;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;

public class FabricCommandCredits {
	public static void register(CommandDispatcher<FabricClientCommandSource> dispatcher) {
		dispatcher.register(ClientCommands.literal("credits")
			.then(ClientCommands.literal("show")
			.executes((command) -> {
                return CommandCredits.show();
			}))
		);
	}
}
