package com.flooferland.fazpack;

import com.hypixel.hytale.logger.HytaleLogger;
import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;

public class FazpackPlugin extends JavaPlugin {
    private static final HytaleLogger LOGGER = HytaleLogger.forEnclosingClass();

    public FazpackPlugin(JavaPluginInit init) {
        super(init);
	    LOGGER.atInfo().log("Initialized %s v%s", getName(), getManifest().getVersion().toString());
    }

    @Override
    protected void setup() {
	    LOGGER.atWarning().log("Fazpack is in very early access, a lot of things are missing and/or buggy.");
    }
}
