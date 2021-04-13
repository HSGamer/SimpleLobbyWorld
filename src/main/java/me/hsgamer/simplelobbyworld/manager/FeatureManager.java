package me.hsgamer.simplelobbyworld.manager;

import me.hsgamer.simplelobbyworld.Feature;
import me.hsgamer.simplelobbyworld.SimpleLobbyWorld;

import java.util.ArrayList;
import java.util.List;

public class FeatureManager {
    private final List<Feature> featureList;
    private final SimpleLobbyWorld instance;

    public FeatureManager(SimpleLobbyWorld instance) {
        this.featureList = new ArrayList<>();
        this.instance = instance;
    }

    public void addFeature(Feature feature) {
        featureList.add(feature);
    }

    public void checkAndSetup() {
        featureList.stream().filter(feature -> feature.canSetup(instance)).forEach(feature -> feature.setup(instance));
    }
}
