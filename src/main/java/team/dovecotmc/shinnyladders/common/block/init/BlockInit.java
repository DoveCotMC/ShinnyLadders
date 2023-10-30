package team.dovecotmc.shinnyladders.common.block.init;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.LadderBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.PushReaction;
import team.dovecotmc.shinnyladders.ShinnyLadders;

public class BlockInit {
    public static final LadderBlock shinnyLadder = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(ShinnyLadders.MODID, "shinny_ladder"),
            new LadderBlock(FabricBlockSettings.create()
                    .forceSolidOff().strength(0.4f).sound(SoundType.LADDER).lightLevel($ -> 7).noOcclusion().pushReaction(PushReaction.DESTROY)));

    public static void init() {
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ShinnyLadders.MODID, "shinny_ladder"), new BlockItem(shinnyLadder, new Item.Properties()));
    }
}
