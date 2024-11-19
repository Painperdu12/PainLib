package org.survivalcraft.painlib.utils;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import org.survivalcraft.painlib.PainLib;

public class ConfigHelper {

    private static JavaPlugin plugin = PainLib.getInstance().getHookedPlugin();

    public static void setupConfig() {
        plugin.getConfig().options().copyDefaults(true);
        plugin.saveConfig();
        plugin.saveDefaultConfig();
        plugin.reloadConfig();
    }

    public static FileConfiguration getConfig() {
        return plugin.getConfig();
    }
}