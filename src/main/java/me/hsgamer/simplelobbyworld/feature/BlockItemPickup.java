package me.hsgamer.simplelobbyworld.feature;

import me.hsgamer.simplelobbyworld.ListenerFeature;
import me.hsgamer.simplelobbyworld.SimpleLobbyWorld;
import me.hsgamer.simplelobbyworld.Utils;
import me.hsgamer.simplelobbyworld.config.MainConfig;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityPickupItemEvent;

public class BlockItemPickup extends ListenerFeature {
    @Override
    public boolean canSetup(SimpleLobbyWorld instance) {
        return MainConfig.BLOCK_ITEM_PICKUP.getValue();
    }

    @EventHandler
    public void onPickup(EntityPickupItemEvent event) {
        if (Utils.checkWorld(event.getEntity().getWorld())) {
            if (event.getEntity() instanceof HumanEntity && Utils.hasBypassPermission((HumanEntity) event.getEntity())) {
                return;
            }
            event.setCancelled(true);
        }
    }
}
