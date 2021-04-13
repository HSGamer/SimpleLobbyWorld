package me.hsgamer.simplelobbyworld.feature;

import me.hsgamer.simplelobbyworld.ListenerFeature;
import me.hsgamer.simplelobbyworld.SimpleLobbyWorld;
import me.hsgamer.simplelobbyworld.Utils;
import me.hsgamer.simplelobbyworld.config.MainConfig;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;

public class BlockHunger extends ListenerFeature {
    @Override
    public boolean canSetup(SimpleLobbyWorld instance) {
        return MainConfig.BLOCK_HUNGER.getValue();
    }

    @EventHandler
    public void onConsume(PlayerItemConsumeEvent event) {
        if (Utils.checkWorld(event.getPlayer().getWorld())) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onFoolChange(FoodLevelChangeEvent event) {
        if (Utils.checkWorld(event.getEntity().getWorld())) {
            event.setCancelled(true);
        }
    }
}
