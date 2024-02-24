package net.zinobleidd.creamycraft.item.custom;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.world.World;
import net.zinobleidd.creamycraft.item.ModItems;

public class ModGlassJarItem extends Item {
    public ModGlassJarItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        super.finishUsing(stack, world, user);

        if (this.isFood()) {
            if (user instanceof ServerPlayerEntity serverPlayerEntity) {
                Criteria.CONSUME_ITEM.trigger(serverPlayerEntity, stack);
                serverPlayerEntity.incrementStat(Stats.USED.getOrCreateStat(this));
            }

            if (stack.isEmpty()) {
                return new ItemStack(ModItems.GLASS_JAR);
            }

            if (user instanceof PlayerEntity playerEntity) {
                if (!playerEntity.getAbilities().creativeMode) {
                    ItemStack itemStack = new ItemStack(ModItems.GLASS_JAR);
                    if (!playerEntity.getInventory().insertStack(itemStack)) {
                        playerEntity.dropItem(itemStack, false);
                    }
                }
            }
        }

        return stack;
    }
}
