package org.silkmc.lunaFramework.api.metadata;

import java.util.Collection;

public interface ScriptMetadata {
    /**
     * Returns the type of mod.
     */
    ModType getModType();

    /**
     * Returns the type of script.
     */
    ScriptType getScriptType();

    /**
     * Returns the identifier for the mod.
     */
    String getId();

    String getDisplayName();

    String getDescription();

    Collection<Dependency> getDependencies();

    Collection<String> getAuthors();

    Collection<String> getContributors();

    Collection<String> getLicense();

    Collection<String> getScripts();
}
