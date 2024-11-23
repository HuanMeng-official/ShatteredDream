package me.huanmeng;

import me.huanmeng.datagen.ChineseProvider;
import me.huanmeng.datagen.EnglishProvider;
import me.huanmeng.datagen.ModelsProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class ShatteredDreamDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(ModelsProvider::new);
		pack.addProvider(ChineseProvider::new);
		pack.addProvider(EnglishProvider::new);
	}
}
