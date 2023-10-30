package team.dovecotmc.shinnyladders;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTabs;
import team.dovecotmc.shinnyladders.common.block.init.BlockInit;

public class ShinnyLadders implements ModInitializer {
    public static final String MODID = "shinnyladders";

    @Override
    public void onInitialize() {
        BlockInit.init();
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(entries -> entries.accept(BlockInit.shinnyLadder));
    }
}
