// --- ModLogger.java ---
package com.donutenvoy.util;

public class ModLog {
    public static void log(String message) {
        System.out.println("=============================");
        System.out.println("[DONUTENVOY] " + message);
        System.out.println("=============================");
    }

    public static void info(String message) {
        log("[INFO] " + message);
    }

    public static void debug(String message) {
        // This log is useful for users trying to debug a specific issue
        System.out.println(">>> DEBUG: " + message);
    }
}
