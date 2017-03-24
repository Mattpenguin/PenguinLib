package com.mattpenguin.penguinlib.init;

import com.mattpenguin.penguinlib.block.BlockTest;
import com.mattpenguin.penguinlib.reference.GenRef;
import com.mattpenguin.penguinlib.reference.NameRef;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(GenRef.MOD_ID)
public class ModBlocks {

    public static final BlockTest blockTest = new BlockTest();

    public static void init(){
        GameRegistry.register(blockTest, new ResourceLocation(NameRef.Blocks.TEST_BLOCK));
    }

}
