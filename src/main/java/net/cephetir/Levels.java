package net.cephetir;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import org.apache.logging.log4j.LogManager;

public class Levels {
    public int lvl = 0;
    @SubscribeEvent
    public void onMobKill(LivingDeathEvent event) {
        if(new Status().singleplayerCheck()) {
            if(event.getSource().getEntity() instanceof PlayerEntity) {
                lvl++;
                LogManager.getLogger().info("Level up!");
            }
            if(lvl == 10) {
                PlayerEntity player = (PlayerEntity)event.getSource().getEntity();
                if(player != null) {
                    player.addEffect(new EffectInstance(Effects.REGENERATION, 1000000, 0));
                }
            }
            if(lvl == 20) {
                PlayerEntity player = (PlayerEntity)event.getSource().getEntity();
                if(player != null) {
                    player.addEffect(new EffectInstance(Effects.DAMAGE_BOOST, 1000000, 0));
                }
            }
            if(lvl == 35) {
                PlayerEntity player = (PlayerEntity)event.getSource().getEntity();
                if(player != null) {
                    player.addEffect(new EffectInstance(Effects.REGENERATION, 1000000, 1));
                }
            }
            if(lvl == 50) {
                PlayerEntity player = (PlayerEntity)event.getSource().getEntity();
                if(player != null) {
                    player.addEffect(new EffectInstance(Effects.MOVEMENT_SPEED, 1000000, 0));
                }
            }
            if(lvl == 70) {
                PlayerEntity player = (PlayerEntity)event.getSource().getEntity();
                if(player != null) {
                    player.addEffect(new EffectInstance(Effects.DAMAGE_BOOST, 1000000, 1));
                }
            }
            if(lvl == 100) {
                PlayerEntity player = (PlayerEntity)event.getSource().getEntity();
                if(player != null) {
                    player.addEffect(new EffectInstance(Effects.DAMAGE_RESISTANCE, 1000000, 1));
                }
            }
            if(lvl == 125) {
                PlayerEntity player = (PlayerEntity)event.getSource().getEntity();
                if(player != null) {
                    player.addEffect(new EffectInstance(Effects.JUMP, 1000000, 0));
                }
            }
            if(lvl == 150) {
                PlayerEntity player = (PlayerEntity)event.getSource().getEntity();
                if(player != null) {
                    player.addEffect(new EffectInstance(Effects.ABSORPTION, 1000000, 0));
                }
            }
            if(lvl == 200) {
                PlayerEntity player = (PlayerEntity)event.getSource().getEntity();
                if(player != null) {
                    player.addEffect(new EffectInstance(Effects.REGENERATION, 1000000, 2));
                    player.addEffect(new EffectInstance(Effects.DAMAGE_BOOST, 1000000, 2));
                    player.addEffect(new EffectInstance(Effects.DAMAGE_RESISTANCE, 1000000, 2));
                    player.addEffect(new EffectInstance(Effects.NIGHT_VISION, 1000000, 0));
                    player.addEffect(new EffectInstance(Effects.FIRE_RESISTANCE, 1000000, 0));
                    player.addEffect(new EffectInstance(Effects.WATER_BREATHING, 1000000, 0));
                    player.addEffect(new EffectInstance(Effects.ABSORPTION, 1000000, 1));
                    player.addEffect(new EffectInstance(Effects.JUMP, 1000000, 2));
                    player.addEffect(new EffectInstance(Effects.MOVEMENT_SPEED, 1000000, 2));
                }
            }
        }
    }
}
