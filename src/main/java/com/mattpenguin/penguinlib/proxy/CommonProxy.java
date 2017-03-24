package com.mattpenguin.penguinlib.proxy;

import com.mattpenguin.penguinlib.handler.ConfigurationHandler;
import net.minecraftforge.common.MinecraftForge;

public abstract class CommonProxy implements IProxy{
    @Override
    public void registerEarlyEventHandlers(){
        //Register event handlers to the MinecraftForge.EVENT_BUS here
        MinecraftForge.EVENT_BUS.register(new ConfigurationHandler());
    }
}
