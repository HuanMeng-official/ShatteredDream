package me.huanmeng.item;

import me.huanmeng.ShatteredDream;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class SDitems {

    public static final Item DREAM_SPLINTER;
    static {
        DREAM_SPLINTER = registerItem("dream_splinter", new Item(new Item.Settings()));
    }

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ShatteredDream.MODID, name), item);
    }

    public static void registryItems() {
        ShatteredDream.LOGGER.info("Registering items for ShatteredDream");
    }
}
