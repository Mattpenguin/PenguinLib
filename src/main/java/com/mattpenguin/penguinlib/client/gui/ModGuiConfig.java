package com.mattpenguin.penguinlib.client.gui;

import com.mattpenguin.penguinlib.handler.ConfigurationHandler;
import com.mattpenguin.penguinlib.reference.ConfRef;
import com.mattpenguin.penguinlib.reference.GenRef;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;

public class ModGuiConfig extends GuiConfig {
    public ModGuiConfig(GuiScreen guiScreen){
        super(guiScreen,
                new ConfigElement(ConfigurationHandler.config.getCategory(ConfRef.Category.GENERAL)).getChildElements(),
                GenRef.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.config.toString())
        );
    }
}
