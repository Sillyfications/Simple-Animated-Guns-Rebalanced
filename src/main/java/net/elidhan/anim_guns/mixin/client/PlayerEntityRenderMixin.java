package net.elidhan.anim_guns.mixin.client;

import net.elidhan.anim_guns.item.gun.GunTemplateItem;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.entity.PlayerEntityRenderer;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntityRenderer.class)
public class PlayerEntityRenderMixin
{
    @Inject(method = "getArmPose", at = @At("TAIL"))
    private static BipedEntityModel.ArmPose gunPose(AbstractClientPlayerEntity player, Hand hand, CallbackInfoReturnable<BipedEntityModel.ArmPose> ci)
    {
        if(player.getStackInHand(hand).getItem() instanceof GunTemplateItem && GunTemplateItem.isLoaded(player.getStackInHand(hand)))
        {
            return (BipedEntityModel.ArmPose.BOW_AND_ARROW);
        }
        if(player.getActiveItem().getItem() instanceof GunTemplateItem && !GunTemplateItem.isLoaded(player.getStackInHand(hand)))
        {
            return (BipedEntityModel.ArmPose.CROSSBOW_CHARGE);
        }
        return BipedEntityModel.ArmPose.ITEM;
    }
}
