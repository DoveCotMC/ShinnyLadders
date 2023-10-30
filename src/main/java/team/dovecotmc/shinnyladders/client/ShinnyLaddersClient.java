package team.dovecotmc.shinnyladders.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import team.dovecotmc.shinnyladders.common.block.init.BlockInit;

public class ShinnyLaddersClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.shinnyLadder, RenderType.cutout());
    }
}
