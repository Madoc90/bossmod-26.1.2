package net.dev.boss.creativemodetab;

import net.dev.boss.BossMod;
import net.dev.boss.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BossMod.MOD_ID);

    public static final Supplier<CreativeModeTab> CURSED_ITEMS = CREATIVE_MODE_TABS.register("cursed_items",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CURSED_INGOT.get()))
                    .title(Component.translatable("creativetab.bossmod.cursed_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.CURSED_INGOT);



                    }).build());


    public static final Supplier<CreativeModeTab> CURSED_BLOCKS = CREATIVE_MODE_TABS.register("cursed_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CURSED_INGOT.get()))
                    .title(Component.translatable("creativetab.bossmod.cursed_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {




                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
