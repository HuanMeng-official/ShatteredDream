package me.huanmeng.datagen;

import me.huanmeng.item.SDItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class EnglishProvider extends FabricLanguageProvider {
    public EnglishProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(output, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder t) {
        t.add(SDItems.DREAM_SHARD, "Dream Shard");
        t.add(SDItems.NIGHTMARE_SHARD, "Nightmare Shard");
        t.add(SDItems.SOUL_SHARD, "Soul Shard");
        t.add(SDItems.TAINTED_SOUL_SHARD, "Tainted Soul Shard");

        try {
            Path existingFilePath = dataOutput.getModContainer().findPath("assets/shdr/lang/en_us.existing.json").get();
            t.add(existingFilePath);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add existing language file!", e);
        }
    }
}
