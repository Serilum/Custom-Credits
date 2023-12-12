package com.natamus.customcredits;

import com.natamus.customcredits.fabric.cmds.FabricCommandCredits;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.command.v1.ClientCommandManager;


public class ModFabricClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() { 
		registerEvents();
	}
	
	private void registerEvents() {
		FabricCommandCredits.register(ClientCommandManager.DISPATCHER);
	}
}
