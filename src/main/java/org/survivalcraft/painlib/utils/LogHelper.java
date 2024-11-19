package org.survivalcraft.painlib.utils;

import org.survivalcraft.painlib.PainLib;

import java.util.logging.Level;

public class LogHelper {

    public static void log(Level level, Object obj) {
        PainLib.getInstance().getHookedPlugin().getLogger().log(level, String.valueOf(obj));
    }

    public static void info(Object obj) {
        log(Level.INFO, obj);
    }

    public static void warn(Object obj) {
        log(Level.WARNING, obj);
    }

    public static void error(Object obj) {
        log(Level.SEVERE, obj);
    }

}