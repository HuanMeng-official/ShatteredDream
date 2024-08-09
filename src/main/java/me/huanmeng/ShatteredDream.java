package me.huanmeng;

import me.huanmeng.group.ItemGroup;
import me.huanmeng.item.SDitems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShatteredDream implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("ShatteredDream");
	public static final String MODID = "shdr";

	@Override
	public void onInitialize() {
        LOGGER.info("You are running ShatteredDream on Minecraft 1.21");
		SDitems.registryItems();
		ItemGroup.registryGroup();
	}
}