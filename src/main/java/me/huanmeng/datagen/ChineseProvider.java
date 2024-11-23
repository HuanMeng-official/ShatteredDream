package me.huanmeng.datagen;

import me.huanmeng.item.SDItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class ChineseProvider extends FabricLanguageProvider {
    public ChineseProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(output, "zh_cn", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder t) {
        t.add(SDItems.DREAM_SHARD, "梦境碎片");
        t.add(SDItems.NIGHTMARE_SHARD, "梦魇碎片");
        t.add(SDItems.SOUL_SHARD, "灵魂碎片");
        t.add(SDItems.TAINTED_SOUL_SHARD, "被污染的灵魂碎片");

        try {
            Path existingFilePath = dataOutput.getModContainer().findPath("assets/shdr/lang/zh_cn.existing.json").get();
            t.add(existingFilePath);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add existing language file!", e);
        }
    }
}
