package cn.xiaym.nomoreblur.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.GameRenderer;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GameRenderer.class)
public class GameRendererMixin {
    @Shadow
    @Final
    MinecraftClient client;

    @Inject(method = "renderBlur(F)V", at = @At("HEAD"), cancellable = true)
    public void onRenderBlur(CallbackInfo ci) {
        if (client.options.getMenuBackgroundBlurrinessValue() == 0d) {
            ci.cancel();
        }
    }
}
