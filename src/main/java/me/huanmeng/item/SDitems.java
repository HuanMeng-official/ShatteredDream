package me.huanmeng.item;

import me.huanmeng.ShatteredDream;
import me.huanmeng.item.custom.DreamShard;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class SDitems {

    public static final Item DREAM_SHARD;
    public static final Item SOUL_SHARD;
    static {
        DREAM_SHARD = registerItem("dream_shard", new DreamShard(new Item.Settings()));
        SOUL_SHARD = registerItem("soul_shard", new Item(new Item.Settings()));
    }

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ShatteredDream.MODID, name), item);
    }

    public static void registryItems() {
        ShatteredDream.LOGGER.info("Registering items for ShatteredDream");
    }
}
