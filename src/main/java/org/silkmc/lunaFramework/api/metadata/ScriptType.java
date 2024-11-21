package org.silkmc.lunaFramework.api.metadata;

public enum ModType {
    SCRIPT, // Pure script, no java mod.
    ADDON, // Luna addon, such as a library or API.
    MOD // A java mod that uses Luna.
}
