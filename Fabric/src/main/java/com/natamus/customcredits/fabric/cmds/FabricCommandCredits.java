package com.natamus.customcredits.fabric.cmds;

import com.mojang.brigadier.CommandDispatcher;
import com.natamus.customcredits.cmds.CommandCredits;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandManager;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;

public class FabricCommandCredits {
	public static void register(CommandDispatcher<FabricClientCommandSource> dispatcher) {
		dispatcher.register(ClientCommandManager.literal("credits")
			.then(ClientCommandManager.literal("show")
			.executes((command) -> {
                return CommandCredits.show();
			}))
		);
	}
}
