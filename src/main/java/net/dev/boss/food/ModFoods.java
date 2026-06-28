package net.dev.boss.food;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

public class ModFoods {
    public static final FoodProperties HERO_APPLE = new FoodProperties.Builder().nutrition(7).saturationModifier(3f).alwaysEdible().build();
    public static final FoodProperties CURSED_BREAD = new FoodProperties.Builder().nutrition(4).saturationModifier(2f).alwaysEdible().build();
    public static final FoodProperties VOID_BERRY = new FoodProperties.Builder().nutrition(5).saturationModifier(2f).alwaysEdible().build();

    public static final Consumable HERO_APPLE_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(0.7f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.REGENERATION, 4000), 100f))
            .consumeSeconds(0.7f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.ABSORPTION, 3000), 100f))
            .consumeSeconds(0.7f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 1000), 100f))

            .build();

    public static final Consumable CURSED_BREAD_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1.2f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.BLINDNESS, 500), 100f))
            .consumeSeconds(1.2f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.REGENERATION, 600), 100f))
            .consumeSeconds(1.2f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.ABSORPTION, 5000), 100f))

            .build();

    public static final Consumable VOID_BERRY_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1.2f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SPEED, 500), 100f))
            .consumeSeconds(1.2f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.STRENGTH, 1000), 100f))

            .build();


}
