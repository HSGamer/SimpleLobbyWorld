package me.hsgamer.simplelobbyworld;

import me.hsgamer.hscore.bukkit.baseplugin.BasePlugin;
import me.hsgamer.simplelobbyworld.config.MainConfig;
import me.hsgamer.simplelobbyworld.feature.*;
import me.hsgamer.simplelobbyworld.manager.FeatureManager;

public final class SimpleLobbyWorld extends BasePlugin {
    private final MainConfig mainConfig = new MainConfig(this);
    private final FeatureManager featureManager = new FeatureManager(this);

    @Override
    public void load() {
        mainConfig.setup();
        addFeatures();
    }

    @Override
    public void postEnable() {
        featureManager.checkAndSetup();
    }

    private void addFeatures() {
        featureManager.addFeature(new BlockDamage());
        featureManager.addFeature(new BlockHunger());
        featureManager.addFeature(new BlockHealth());
        featureManager.addFeature(new BlockBreak());
        featureManager.addFeature(new BlockPlace());
        featureManager.addFeature(new BlockItemDrop());
        featureManager.addFeature(new BlockItemPickup());
        featureManager.addFeature(new VoidReturn());
    }

    public MainConfig getMainConfig() {
        return mainConfig;
    }
}
