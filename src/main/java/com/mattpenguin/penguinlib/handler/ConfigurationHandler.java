package com.mattpenguin.penguinlib.handler;

import com.mattpenguin.penguinlib.reference.ConfRef;
import com.mattpenguin.penguinlib.reference.GenRef;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

public class ConfigurationHandler {
    public static Configuration config;

    public static void init(File file){
        if(config==null){
            config = new Configuration(file);
            loadConfiguration();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){
        if(event.getModID().equalsIgnoreCase(GenRef.MOD_ID)) loadConfiguration();
    }

    private static void loadConfiguration(){
        //General Options
        ConfRef.Values.dummyInt = config.get(ConfRef.Category.GENERAL, "dummyInt",0,"A test value").getInt(0);

        //Debug Options
        ConfRef.Values.useReflectionForDebugTool = config.get(
                ConfRef.Category.DEBUG,
                "reflectionForDebugTool",
                true,
                "Set this to false if the debug tool should use inheritance checking rather than reflection.\n" +
                        "This could speed the tool up, and fix issues, but make it less compatible.").getBoolean(true);
        ConfRef.Values.enableTestBlocks = config.get(
                ConfRef.Category.DEBUG,
                "enableTestBlocks",
                true,
                "Set this to true if the testing/debug blocks should be enabled.\n" +
                        "It is recommended to NOT use this setting for actual game play. Will be removed").getBoolean(true);
        ConfRef.Values.enableTestItems = config.get(
                ConfRef.Category.DEBUG,
                "enableTestItems",
                true,
                "Set this to true if the testing/debug items should be enabled.\n" +
                        "It is recommended to NOT use this setting for actual game play. Will be removed").getBoolean(true);

        ConfRef.setHasBeenInitialized();

        if(config.hasChanged()){
            config.save();
        }
    }
}
