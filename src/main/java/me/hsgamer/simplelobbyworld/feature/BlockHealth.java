package me.hsgamer.simplelobbyworld.feature;

import me.hsgamer.simplelobbyworld.ListenerFeature;
import me.hsgamer.simplelobbyworld.SimpleLobbyWorld;
import me.hsgamer.simplelobbyworld.Utils;
import me.hsgamer.simplelobbyworld.config.MainConfig;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityRegainHealthEvent;

public class BlockHealth extends ListenerFeature {
    @Override
    public boolean canSetup(SimpleLobbyWorld instance) {
        return MainConfig.BLOCK_HEALTH.getValue();
    }

    @EventHandler
    public void onHealth(EntityRegainHealthEvent event) {
        if (Utils.checkWorld(event.getEntity().getWorld())) {
            event.setCancelled(true);
        }
    }
}
