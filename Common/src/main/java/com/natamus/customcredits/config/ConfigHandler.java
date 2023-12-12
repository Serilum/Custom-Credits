package com.natamus.customcredits.config;

import com.natamus.collective.config.DuskConfig;
import com.natamus.customcredits.util.Reference;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ConfigHandler extends DuskConfig {
	public static HashMap<String, List<String>> configMetaData = new HashMap<String, List<String>>();

	@Entry public static boolean showMinecraftLogoInCredits = true;

	public static void initConfig() {
		configMetaData.put("showMinecraftLogoInCredits", Arrays.asList(
			"Whether the Minecraft logo should be shown at the top of the credits screen."
		));

		DuskConfig.init(Reference.NAME, Reference.MOD_ID, ConfigHandler.class);
	}
}