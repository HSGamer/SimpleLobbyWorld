package me.hsgamer.simplelobbyworld.feature;

import me.hsgamer.simplelobbyworld.ListenerFeature;
import me.hsgamer.simplelobbyworld.SimpleLobbyWorld;
import me.hsgamer.simplelobbyworld.Utils;
import me.hsgamer.simplelobbyworld.config.MainConfig;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDamageEvent;

public class BlockDamage extends ListenerFeature {
    @Override
    public boolean canSetup(SimpleLobbyWorld instance) {
        return MainConfig.BLOCK_DAMAGE.getValue();
    }

    @EventHandler
    public void onDamage(EntityDamageEvent event) {
        if (Utils.checkWorld(event.getEntity().getWorld())) {
            event.setCancelled(true);
        }
    }
}
