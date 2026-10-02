package com.serilum.customcredits.mixin;

import com.serilum.customcredits.config.ConfigHandler;
import com.serilum.customcredits.data.Constants;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.components.LogoRenderer;
import net.minecraft.client.gui.screens.WinScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = LogoRenderer.class, priority = 1001)
public class LogoRendererMixin {
	@Inject(method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IFI)V", at = @At(value = "HEAD"), cancellable = true)
	public void onExtractRenderState(GuiGraphicsExtractor graphics, int width, float alpha, int heightOffset, CallbackInfo ci) {
		if (ConfigHandler.showMinecraftLogoInCredits) {
			return;
		}
		if (Constants.mc.gui.screen() instanceof WinScreen) {
			ci.cancel();
		}
	}
}
