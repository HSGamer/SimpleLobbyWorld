package me.hsgamer.simplelobbyworld.config;

import me.hsgamer.hscore.bukkit.config.BukkitConfig;
import me.hsgamer.hscore.config.ConfigPath;
import me.hsgamer.hscore.config.PathableConfig;
import me.hsgamer.hscore.config.path.BooleanConfigPath;
import me.hsgamer.hscore.config.path.SimpleConfigPath;
import org.bukkit.plugin.Plugin;

import java.util.Collections;
import java.util.List;

public class MainConfig extends PathableConfig {
    public static final ConfigPath<List<String>> LOBBY_WORLDS = new SimpleConfigPath<>("lobby-worlds", Collections.singletonList("world"));

    public static final BooleanConfigPath BLOCK_DAMAGE = new BooleanConfigPath("feature.block-damage", true);
    public static final BooleanConfigPath BLOCK_HUNGER = new BooleanConfigPath("feature.block-hunger", true);
    public static final BooleanConfigPath BLOCK_HEALTH = new BooleanConfigPath("feature.block-health", true);
    public static final BooleanConfigPath BLOCK_BREAK = new BooleanConfigPath("feature.block-break", true);
    public static final BooleanConfigPath BLOCK_PLACE = new BooleanConfigPath("feature.block-place", true);
    public static final BooleanConfigPath BLOCK_ITEM_DROP = new BooleanConfigPath("feature.block-item-drop", true);
    public static final BooleanConfigPath BLOCK_ITEM_PICKUP = new BooleanConfigPath("feature.block-item-pickup", true);
    public static final BooleanConfigPath VOID_RETURN = new BooleanConfigPath("feature.void-return", true);

    public MainConfig(Plugin plugin) {
        super(new BukkitConfig(plugin, "config.yml"));
    }
}
