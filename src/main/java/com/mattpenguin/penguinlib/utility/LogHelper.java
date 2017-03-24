package com.mattpenguin.penguinlib.utility;

import com.mattpenguin.penguinlib.reference.GenRef;
import net.minecraftforge.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

public class LogHelper {
    private static void log(Level logLevel, Object object){
        FMLLog.log(GenRef.MOD_NAME, logLevel, "%s", String.valueOf(object));
    }
    public static void all(String text){log(Level.ALL, text);}
    public static void debug(String text){log(Level.DEBUG, text);}
    public static void error(String text){log(Level.ERROR, text);}
    public static void fatal(String text){log(Level.FATAL, text);}
    public static void info(String text){log(Level.INFO, text);}
    public static void off(String text){log(Level.OFF, text);}
    public static void trace(String text){log(Level.TRACE, text);}
    public static void warn(String text){log(Level.WARN, text);}
}
