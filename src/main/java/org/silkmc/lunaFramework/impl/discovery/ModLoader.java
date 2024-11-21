package org.silkmc.lunaFramework.impl.discovery;

import org.reflections.Reflections;
import org.silkmc.lunaFramework.api.LunaModInitializer;

import java.util.Set;

public class ModInitializerDiscovery {
    public static void loadAndInitializeMods(String packageToScan) {
        // Create a Reflections object to scan the package
        Reflections reflections = new Reflections(packageToScan);

        // Find all subtypes of LunaModInitializer
        Set<Class<? extends LunaModInitializer>> modClasses = reflections.getSubTypesOf(LunaModInitializer.class);

        for (Class<? extends LunaModInitializer> modClass : modClasses) {
            try {
                // Instantiate the mod class
                LunaModInitializer modInstance = modClass.getDeclaredConstructor().newInstance();

                // Call the onInitialize method
                modInstance.onInitialize();
            } catch (Exception e) {
                System.err.println("Failed to initialize mod: " + modClass.getName());
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }
    }
}
