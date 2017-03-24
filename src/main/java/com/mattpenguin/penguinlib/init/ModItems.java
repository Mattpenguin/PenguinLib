package com.mattpenguin.penguinlib.init;

import com.mattpenguin.penguinlib.item.ItemDebug;
import com.mattpenguin.penguinlib.reference.NameRef;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

    public static final ItemDebug itemDebug = new ItemDebug();

    public static void init(){
        GameRegistry.register(itemDebug, new ResourceLocation(NameRef.Items.DEBUG_TOOL));
    }

}
