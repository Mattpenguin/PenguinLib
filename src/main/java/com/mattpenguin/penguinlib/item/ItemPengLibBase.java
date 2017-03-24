package com.mattpenguin.penguinlib.item;

import com.mattpenguin.penguinlib.reference.GenRef;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

public class ItemPengLibBase extends Item {

    public ItemPengLibBase(){

    }

    @Override
    @Nonnull
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", GenRef.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @Nonnull
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", GenRef.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    private String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

}
