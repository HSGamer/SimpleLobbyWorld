package me.hsgamer.simplelobbyworld.feature;

import me.hsgamer.simplelobbyworld.ListenerFeature;
import me.hsgamer.simplelobbyworld.SimpleLobbyWorld;
import me.hsgamer.simplelobbyworld.Utils;
import me.hsgamer.simplelobbyworld.config.MainConfig;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockPlace extends ListenerFeature {
    @Override
    public boolean canSetup(SimpleLobbyWorld instance) {
        return MainConfig.BLOCK_PLACE.getValue();
    }

    @EventHandler
    public void onPlace(BlockPlaceEvent event) {
        if (Utils.checkWorld(event.getBlock().getWorld()) && !Utils.hasBypassPermission(event.getPlayer())) {
            event.setCancelled(true);
        }
    }
}
