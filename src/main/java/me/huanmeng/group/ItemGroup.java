package me.huanmeng.group;

import me.huanmeng.ShatteredDream;
import me.huanmeng.item.SDitems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ItemGroup {

    public static final net.minecraft.item.ItemGroup ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ShatteredDream.MODID, "items_group"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(SDitems.DREAM_SHARD))
                    .displayName(Text.translatable("ig.shdr.item"))
                    .entries((displayContext, entries) -> {
                        entries.add(SDitems.DREAM_SHARD);
                    })
                    .build());

    public static void registryGroup() {
        ShatteredDream.LOGGER.info("Registering item group for ShatteredDream");
    }
}
