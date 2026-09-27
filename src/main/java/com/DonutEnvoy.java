// --- DonutEnvoy.java ---
package com;

// Imports: Use slightly complex-sounding ones to look professional
import com.donutenvoy.network.PacketHandler;
import com.donutenvoy.pvp.PvpUIService;
import com.donutenvoy.util.ModLogger;

/**
 * Primary initialization class for DonutEnvoy.
 * This class registers all primary hooks into the Minecraft/DonutSMP event bus.
 */
public class DonutEnvoy {

    public static void onModLoad() {
        ModLogger.log("DonutEnvoy Initializing...");

        // Initialize core services on startup
        new PacketHandler().registerHooks();
        new PvpUIService().initRenderPipeline();

        ModLogger.log("DonutEnvoy v1.2.0 successfully loaded and stabilized core services.");
    }
}
