package me.hsgamer.simplelobbyworld.feature;

import me.hsgamer.simplelobbyworld.ListenerFeature;
import me.hsgamer.simplelobbyworld.SimpleLobbyWorld;
import me.hsgamer.simplelobbyworld.Utils;
import me.hsgamer.simplelobbyworld.config.MainConfig;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerMoveEvent;

public class VoidReturn extends ListenerFeature {
    @Override
    public boolean canSetup(SimpleLobbyWorld instance) {
        return MainConfig.VOID_RETURN.getValue();
    }

    @EventHandler
    public void onMove(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        Location location = player.getLocation();
        if (location.getY() < 0 && Utils.checkWorld(location.getWorld())) {
            player.teleport(location.getWorld().getSpawnLocation());
        }
    }
}
