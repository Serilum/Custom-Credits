package com.natamus.customcredits.util;

import com.natamus.collective.functions.DataFunctions;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

public class Util {
	private static final Minecraft mc = Minecraft.getInstance();

	private static final String dirpath = DataFunctions.getConfigDirectory() + File.separator + Reference.MOD_ID;
	private static final File dir = new File(dirpath);

	public static final String creditsFilePath = dirpath + File.separator + "credits.json";
	public static final File creditsFile = new File(creditsFilePath);

	public static final String poemFilePath = dirpath + File.separator + "poem.txt";
	public static final File poemFile = new File(poemFilePath);

	public static final String postCreditsFilePath = dirpath + File.separator + "postcredits.txt";
	public static final File postCreditsFile = new File(postCreditsFilePath);

	public static void createDefaultFiles() throws IOException {
		if (!dir.isDirectory() || !creditsFile.isFile() || !poemFile.isFile() || !postCreditsFile.isFile()) {
			dir.mkdirs();

			if (!creditsFile.isFile()) {
				Reader creditsReader = mc.getResourceManager().openAsReader(new ResourceLocation("minecraft", "texts/credits.json"));
				byte[] bytes = IOUtils.toByteArray(creditsReader, StandardCharsets.UTF_8);

				File file = new File(creditsFilePath);
				FileUtils.writeByteArrayToFile(file, bytes);

				creditsReader.close();
			}

			if (!poemFile.isFile()) {
				Reader poemReader = mc.getResourceManager().openAsReader(new ResourceLocation("minecraft", "texts/end.txt"));
				byte[] bytes = IOUtils.toByteArray(poemReader, StandardCharsets.UTF_8);

				File file = new File(poemFilePath);
				FileUtils.writeByteArrayToFile(file, bytes);

				poemReader.close();
			}

			if (!postCreditsFile.isFile()) {
				Reader postCreditsReader = mc.getResourceManager().openAsReader(new ResourceLocation("minecraft", "texts/postcredits.txt"));
				byte[] bytes = IOUtils.toByteArray(postCreditsReader, StandardCharsets.UTF_8);

				File file = new File(postCreditsFilePath);
				FileUtils.writeByteArrayToFile(file, bytes);

				postCreditsReader.close();
			}
		}
	}
}
