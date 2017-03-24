package com.mattpenguin.penguinlib.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.client.IModGuiFactory;

import java.util.Set;

public class GuiFactory implements IModGuiFactory{
    @Override
    public void initialize(Minecraft minecraftInstance){

    }

    @Override
    public Class<? extends GuiScreen> mainConfigGuiClass(){
        return ModGuiConfig.class;
    }

    @Override
    public Set<IModGuiFactory.RuntimeOptionCategoryElement> runtimeGuiCategories(){
        return null;
    }

    @Override
    public IModGuiFactory.RuntimeOptionGuiHandler getHandlerFor(IModGuiFactory.RuntimeOptionCategoryElement element){
        return null;
    }
}
