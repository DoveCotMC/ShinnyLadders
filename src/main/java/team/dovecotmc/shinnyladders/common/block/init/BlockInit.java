package team.dovecotmc.shinnyladders.common.block.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LadderBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import team.dovecotmc.shinnyladders.ShinnyLadders;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ShinnyLadders.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ShinnyLadders.MODID);
    public static final RegistryObject<Block> SHINNY_LADDER;

    static {
        SHINNY_LADDER = BLOCKS.register("shinny_ladder", () -> new LadderBlock(BlockBehaviour.Properties.of()
                .forceSolidOff().strength(0.4F).lightLevel($ -> 7).sound(SoundType.LADDER).noOcclusion().pushReaction(PushReaction.DESTROY)));
        ITEMS.register("shinny_ladder", () -> new BlockItem(SHINNY_LADDER.get(), new Item.Properties()));
    }
}
