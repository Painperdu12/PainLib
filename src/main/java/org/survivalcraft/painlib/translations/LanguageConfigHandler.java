package org.survivalcraft.painlib.translations;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import org.survivalcraft.painlib.PainLib;

import java.io.File;
import java.io.IOException;

public class LanguageConfigHandler {

    private static File file;
    private static FileConfiguration config;

    public static void createLanguageFile() {
        JavaPlugin plugin = PainLib.getInstance().getHookedPlugin();

        file = new File(plugin.getDataFolder() + File.separator + "language.yml");
        config = YamlConfiguration.loadConfiguration(file);

        if(!plugin.getDataFolder().exists()) plugin.getDataFolder().mkdir();

        if(!file.exists()) {
            try {
                file.createNewFile();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void saveConfig() {
        try {
            config.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static FileConfiguration getLanguageFile() {
        return config;
    }
}