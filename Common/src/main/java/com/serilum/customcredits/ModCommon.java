package com.serilum.customcredits;

import com.natamus.collective.globalcallbacks.MainMenuLoadedCallback;
import com.serilum.customcredits.config.ConfigHandler;
import com.serilum.customcredits.util.Reference;
import com.serilum.customcredits.util.Util;

import java.io.IOException;

public class ModCommon {

	public static void init() {
		ConfigHandler.initConfig();
		load();
	}

	private static void load() {
		MainMenuLoadedCallback.MAIN_MENU_LOADED.register(() -> {
			try {
				Util.createDefaultFiles();
			} catch (IOException ex) {
				System.out.println("[" + Reference.NAME + "] Something went wrong while trying to generate the default files.");
				ex.printStackTrace();
			}
		});
	}
}