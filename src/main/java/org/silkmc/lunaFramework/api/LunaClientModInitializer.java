package org.silkmc.lunaFramework.api;

@FunctionalInterface
public interface ClientModInitializer {
    /**
     * Runs the client script initializer (pre-script entry)
     */
    void onInitializeClient();
}
