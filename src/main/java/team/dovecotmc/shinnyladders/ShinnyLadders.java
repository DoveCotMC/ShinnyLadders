package team.dovecotmc.shinnyladders;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import team.dovecotmc.shinnyladders.common.block.init.BlockInit;

@Mod(ShinnyLadders.MODID)
public class ShinnyLadders {
    public static final String MODID = "shinnyladders";

    public ShinnyLadders() {
        final IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BlockInit.BLOCKS.register(bus);
        BlockInit.ITEMS.register(bus);
    }
}
