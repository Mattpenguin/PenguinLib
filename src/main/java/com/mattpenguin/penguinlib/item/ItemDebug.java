package com.mattpenguin.penguinlib.item;

import com.mattpenguin.penguinlib.block.BlockPengLibBase;
import com.mattpenguin.penguinlib.reference.ConfRef;
import com.mattpenguin.penguinlib.reference.NameRef;
import com.mattpenguin.penguinlib.utility.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nonnull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ItemDebug extends ItemPengLibBase {

    public ItemDebug(){
        super();
        this.setCreativeTab(CreativeTabs.TOOLS);
        this.setUnlocalizedName(NameRef.Items.DEBUG_TOOL);
    }

    @Override
    @Nonnull
    public EnumActionResult onItemUseFirst(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ, EnumHand hand) {
        if(!world.isRemote){
            Block b = world.getBlockState(pos).getBlock();

            if(ConfRef.Values.useReflectionForDebugTool){
                for(Method m : b.getClass().getDeclaredMethods()){
                    String s = m.getName();
                    if(s.equalsIgnoreCase("printDebugInfo")){
                        try{
                            Object o = new Object();
                            m.invoke(o);
                            return EnumActionResult.SUCCESS;
                        }catch (Exception e){
                            if(e instanceof InvocationTargetException){
                                LogHelper.error("ItemDebug ERROR: Exception invoking target: ");
                            }else if(e instanceof IllegalAccessException){
                                LogHelper.error("ItemDebug ERROR: Attempt to illegally access target method \""+m.getName()+"\":");
                            }else{
                                LogHelper.error("ItemDebug ERROR: Unhandled exception");
                                LogHelper.warn("Please report this error along with the following stacktrace!");
                            }
                            e.printStackTrace();
                            return EnumActionResult.FAIL;
                        }
                    }
                }
            }else{
                if(b instanceof BlockPengLibBase){
                    ((BlockPengLibBase) b).printDebugInfo();
                    return EnumActionResult.SUCCESS;
                }
            }

        }
        return EnumActionResult.FAIL;
    }
}
