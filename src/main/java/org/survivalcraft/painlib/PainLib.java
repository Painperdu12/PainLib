package org.survivalcraft.painlib;

import org.bukkit.plugin.java.JavaPlugin;

public class PainLib {

    private static PainLib instance;
    private static JavaPlugin hookedPlugin;

    public static void hook(JavaPlugin plugin) {
        hookedPlugin = plugin;
    }

    public static PainLib getInstance() {
        return instance;
    }

    public JavaPlugin getHookedPlugin() {
        return hookedPlugin;
    }
}