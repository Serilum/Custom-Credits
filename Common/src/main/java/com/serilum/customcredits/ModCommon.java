package com.serilum.customcredits;

import com.natamus.collective.config.DuskConfigCustomFile;
import com.natamus.collective.globalcallbacks.MainMenuLoadedCallback;
import com.serilum.customcredits.config.ConfigHandler;
import com.serilum.customcredits.data.Constants;
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
			} catch (IOException ignored) {
				Constants.logger.warn("[" + Reference.NAME + "] Something went wrong while trying to generate the default files.");
			}
		});

		DuskConfigCustomFile.addText(Reference.MOD_ID, "credits.json", "Credits", "The credits shown after the end poem, in Minecraft's credits.json format.", () -> Util.getFileText(Util.creditsFile), text -> Util.setFileText(Util.creditsFile, text));
		DuskConfigCustomFile.addText(Reference.MOD_ID, "poem.txt", "End Poem", "The end poem shown before the credits.", () -> Util.getFileText(Util.poemFile), text -> Util.setFileText(Util.poemFile, text));
		DuskConfigCustomFile.addText(Reference.MOD_ID, "postcredits.txt", "Post Credits", "The text shown after the credits.", () -> Util.getFileText(Util.postCreditsFile), text -> Util.setFileText(Util.postCreditsFile, text));
	}
}