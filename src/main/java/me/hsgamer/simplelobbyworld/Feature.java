package me.hsgamer.simplelobbyworld;

public interface Feature {
    boolean canSetup(SimpleLobbyWorld instance);

    void setup(SimpleLobbyWorld instance);
}
