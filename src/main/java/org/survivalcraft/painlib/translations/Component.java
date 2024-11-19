package org.survivalcraft.painlib.translations;

import org.bukkit.ChatColor;
import java.util.List;

public class Component {

    public static void addStringToConfig(String path, String translation) {
        LanguageConfigHandler.getLanguageFile().set(path, translation);
    }

    public static void addStringListToConfig(String path, List<String> translations) {
        LanguageConfigHandler.getLanguageFile().set(path, translations);
    }

    public static String literal(String text) {
        return ChatColor.translateAlternateColorCodes('&', text);
    }

    public static String translatable(String path) {
        return LanguageConfigHandler.getLanguageFile().contains(path) ? ChatColor.translateAlternateColorCodes('&', LanguageConfigHandler.getLanguageFile().getString(path)) : "&cPainLib Error: The component is not in the language file!";
    }

    public static List<String> list(String path) {
        return LanguageConfigHandler.getLanguageFile().getStringList(path);
    }
}