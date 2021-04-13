package me.hsgamer.simplelobbyworld;

import org.bukkit.event.Listener;

public abstract class ListenerFeature implements Feature, Listener {
    @Override
    public void setup(SimpleLobbyWorld instance) {
        instance.registerListener(this);
    }
}
