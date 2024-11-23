package me.huanmeng;

import me.huanmeng.group.ItemGroup;
import me.huanmeng.item.SDItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShatteredDream implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("ShatteredDream");
	public static final String MODID = "shdr";

	@Override
	public void onInitialize() {
		SDItems.registryItems();
		ItemGroup.registryGroup();
	}
}