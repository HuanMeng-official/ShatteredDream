package me.huanmeng.item;

import me.huanmeng.ShatteredDream;
import me.huanmeng.item.custom.DreamShard;
import me.huanmeng.item.custom.NightmareShard;
import me.huanmeng.item.custom.SoulShard;
import me.huanmeng.item.custom.TaintedSoulShard;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class SDItems {

    public static final Item DREAM_SHARD;
    public static final Item SOUL_SHARD;
    public static final Item TAINTED_SOUL_SHARD;
    public static final Item NIGHTMARE_SHARD;
    static {
        DREAM_SHARD = registerItem("dream_shard", new DreamShard(new Item.Settings()));
        SOUL_SHARD = registerItem("soul_shard", new SoulShard(new Item.Settings()));
        TAINTED_SOUL_SHARD = registerItem("tainted_soul_shard", new TaintedSoulShard(new Item.Settings()));
        NIGHTMARE_SHARD = registerItem("nightmare_shard", new NightmareShard(new Item.Settings()));
    }

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ShatteredDream.MODID, name), item);
    }

    public static void registryItems() {
        ShatteredDream.LOGGER.info("Registering items for ShatteredDream");
    }
}
