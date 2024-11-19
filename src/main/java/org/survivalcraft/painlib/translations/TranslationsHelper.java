package org.survivalcraft.painlib.translations;

import org.bukkit.configuration.file.FileConfiguration;

public class TranslationsHelper {

    public static void setupLanguageConfig() {
        LanguageConfigHandler.createLanguageFile();
        LanguageConfigHandler.saveConfig();
    }

    public static FileConfiguration getLanguageFile() {
        return LanguageConfigHandler.getLanguageFile();
    }
}