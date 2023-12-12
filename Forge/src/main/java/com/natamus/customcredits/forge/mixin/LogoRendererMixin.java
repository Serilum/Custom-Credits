package com.natamus.customcredits.forge.mixin;

import com.natamus.customcredits.config.ConfigHandler;
import com.natamus.customcredits.data.Constants;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.LogoRenderer;
import net.minecraft.client.gui.screens.WinScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = LogoRenderer.class, priority = 1001)
public class LogoRendererMixin {
	@Inject(method = "renderLogo(Lnet/minecraft/client/gui/GuiGraphics;IFI)V", at = @At(value = "HEAD"), cancellable = true)
	public void renderLogo(GuiGraphics guiGraphics, int i0, float f0, int i1, CallbackInfo ci) {
		if (ConfigHandler.showMinecraftLogoInCredits) {
			return;
		}

		if (Constants.mc.screen instanceof WinScreen) {
			ci.cancel();
		}
	}
}
