package com.mattpenguin.penguinlib.utility;

import com.mattpenguin.penguinlib.reference.GenRef;
import net.minecraft.util.ResourceLocation;

public class ResourceLocationHelper {

    public static ResourceLocation getResourceLocation(String modID, String loc){
        return new ResourceLocation(modID,loc);
    }

    public static ResourceLocation getResourceLocation(String loc){
        return new ResourceLocation(GenRef.L_MOD_ID,loc);
    }
}
