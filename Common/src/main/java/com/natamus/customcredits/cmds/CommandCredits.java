package com.natamus.customcredits.cmds;

import com.mojang.brigadier.CommandDispatcher;
import com.natamus.customcredits.data.Constants;
import net.minecraft.client.gui.screens.WinScreen;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;

public class CommandCredits {
	public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {
		dispatcher.register(Commands.literal("credits")
			.then(Commands.literal("show")
			.executes((command) -> {
				return show();
			}))
		);
	}

	public static int show() {
		Player player = Constants.mc.player;
		if (player == null) {
			return 0;
		}

		player.displayClientMessage(Component.literal("Showing credits"), true);

		Constants.mc.tell(() -> Constants.mc.setScreen(new WinScreen(false, () -> {
			Constants.mc.setScreen(null);
		})));
		return 1;
	}
}