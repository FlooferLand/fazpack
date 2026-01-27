package com.flooferland.fazpack;

import com.hypixel.hytale.logger.HytaleLogger;
import com.hypixel.hytale.server.core.Message;
import com.hypixel.hytale.server.core.event.events.player.PlayerConnectEvent;
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
		final String earlyMessage = "The Fazpack mod is in early access, a lot of things are missing and/or buggy.";
	    LOGGER.atWarning().log(earlyMessage);
		getEventRegistry().registerGlobal(PlayerConnectEvent.class, event -> {
			event.getPlayerRef().sendMessage(Message.raw("NOTE: " + earlyMessage));
		});
    }
}
