package com.natamus.customcredits;

import com.natamus.customcredits.fabric.cmds.FabricCommandCredits;
import net.fabricmc.api.ClientModInitializer;
import com.natamus.customcredits.util.Reference;
import com.natamus.collective.check.ShouldLoadCheck;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;


public class ModFabricClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() { 
		if (!ShouldLoadCheck.shouldLoad(Reference.MOD_ID)) {
			return;
		}

		registerEvents();
	}
	
	private void registerEvents() {
		ClientCommandRegistrationCallback.EVENT.register((dispatcher, registryAccess) -> {
			FabricCommandCredits.register(dispatcher);
		});
	}
}
