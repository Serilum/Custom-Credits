package com.serilum.customcredits;

import com.serilum.customcredits.fabric.cmds.FabricCommandCredits;
import net.fabricmc.api.ClientModInitializer;
import com.serilum.customcredits.util.Reference;
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
