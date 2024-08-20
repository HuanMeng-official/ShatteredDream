package me.huanmeng.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.List;

public class DreamShard extends Item {
    public DreamShard(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("tooltip.shdr.dream_shard_1"));
        tooltip.add(Text.translatable("tooltip.shdr.dream_shard_2"));
        tooltip.add(Text.translatable("tooltip.shdr.dream_shard_3"));
        super.appendTooltip(stack, context, tooltip, type);
    }
}
