package com.mattpenguin.penguinlib.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public abstract class BlockPengLibBase extends Block implements IDebugable{

    public BlockPengLibBase(){
        super(Material.ROCK);
        this.setCreativeTab(CreativeTabs.REDSTONE);
    }

}
