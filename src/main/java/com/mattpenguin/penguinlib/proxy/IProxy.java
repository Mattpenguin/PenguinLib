package com.mattpenguin.penguinlib.proxy;

public interface IProxy {
    void registerKeyBindings();
    void registerRenderers();
    void registerEarlyEventHandlers();
    void registerEventHandlers();
    void registerLateEventHandlers();
    void registerItemModels();
}
