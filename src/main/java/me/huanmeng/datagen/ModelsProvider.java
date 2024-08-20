package me.huanmeng.datagen;

import me.huanmeng.item.SDItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModelsProvider extends FabricModelProvider {
    public ModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(SDItems.DREAM_SHARD, Models.GENERATED);
        itemModelGenerator.register(SDItems.SOUL_SHARD, Models.GENERATED);
        itemModelGenerator.register(SDItems.TAINTED_SOUL_SHARD, Models.GENERATED);
    }
}
