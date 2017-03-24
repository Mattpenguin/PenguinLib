package com.mattpenguin.penguinlib;

import com.mattpenguin.penguinlib.handler.ConfigurationHandler;
import com.mattpenguin.penguinlib.init.ModBlocks;
import com.mattpenguin.penguinlib.init.ModItems;
import com.mattpenguin.penguinlib.proxy.IProxy;
import com.mattpenguin.penguinlib.reference.GenRef;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = GenRef.MOD_ID,
        name = GenRef.MOD_NAME,
        version = GenRef.VERSION,
        acceptedMinecraftVersions = GenRef.MINECRAFT_VER,
        guiFactory = GenRef.GUI_FACTORY_CLASS
    )
public class PenguinLib
{
    @Mod.Instance
    public static PenguinLib instance;

    @SidedProxy(clientSide = GenRef.CLIENT_PROXY, serverSide = GenRef.SERVER_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        proxy.registerEventHandlers();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        ModBlocks.init();
        ModItems.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }


}