package net.dev.boss.item;

import net.dev.boss.BossMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BossMod.MOD_ID);

    public static final DeferredItem<Item> CURSED_INGOT = ITEMS.registerSimpleItem("cursed_ingot");


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
