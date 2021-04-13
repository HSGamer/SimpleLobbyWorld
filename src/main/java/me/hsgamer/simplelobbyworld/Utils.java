package me.hsgamer.simplelobbyworld;

import me.hsgamer.simplelobbyworld.config.MainConfig;
import org.bukkit.World;
import org.bukkit.entity.HumanEntity;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionDefault;

public class Utils {
    private static final Permission BYPASS_PERMISSION = new Permission("simplelobbyworld.bypass", PermissionDefault.OP);

    private Utils() {
        // EMPTY
    }

    public static boolean checkWorld(World world) {
        return MainConfig.LOBBY_WORLDS.getValue().contains(world.getName());
    }

    public static boolean hasBypassPermission(HumanEntity entity) {
        return entity.hasPermission(BYPASS_PERMISSION);
    }
}
