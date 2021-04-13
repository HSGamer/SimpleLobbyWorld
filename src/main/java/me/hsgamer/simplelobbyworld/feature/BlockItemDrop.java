package me.hsgamer.simplelobbyworld.feature;

import me.hsgamer.simplelobbyworld.ListenerFeature;
import me.hsgamer.simplelobbyworld.SimpleLobbyWorld;
import me.hsgamer.simplelobbyworld.Utils;
import me.hsgamer.simplelobbyworld.config.MainConfig;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerDropItemEvent;

public class BlockItemDrop extends ListenerFeature {
    @Override
    public boolean canSetup(SimpleLobbyWorld instance) {
        return MainConfig.BLOCK_ITEM_DROP.getValue();
    }

    @EventHandler
    public void onDrop(PlayerDropItemEvent event) {
        if (Utils.checkWorld(event.getPlayer().getWorld()) && !Utils.hasBypassPermission(event.getPlayer())) {
            event.setCancelled(true);
        }
    }
}
