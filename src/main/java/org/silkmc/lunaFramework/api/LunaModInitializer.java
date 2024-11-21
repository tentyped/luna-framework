package org.silkmc.lunaFramework.api;

@FunctionalInterface
public interface ModInitializer {
    /**
     * Runs the script initializer (pre-script entry)
     */
    void onInitialize();
}
