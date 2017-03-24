package com.mattpenguin.penguinlib.proxy;

public class ClientProxy extends CommonProxy{
    @Override
    public void registerEarlyEventHandlers(){
        super.registerEarlyEventHandlers();
    }

    @Override
    public void registerEventHandlers(){
        //Register the KeyPress Handler here is need be
    }

    @Override
    public void registerLateEventHandlers() {
        //Register post-Init handlers here
    }

    @Override
    public void registerKeyBindings() {
        //Register KeyBindings with ClientRegistry here
    }

    @Override
    public void registerRenderers() {
        //Register Renderers with ??? here
    }

    @Override
    public void registerItemModels() {
        //Register ItemModels with Minecraft.getMinecraft().getRenderItem().getItemModelMesher() here
    }
}
