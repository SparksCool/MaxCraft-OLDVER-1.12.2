package sparks.maxcraft.proxy;

import sparks.maxcraft.*;
import sparks.maxcraft.blocks.*;
import sparks.maxcraft.blocks.distillery.*;
import sparks.maxcraft.items.*;


import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiProxy implements IGuiHandler {
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        BlockPos pos = new BlockPos(x, y, z);
        TileEntity te = world.getTileEntity(pos);
        if (te instanceof DistilleryTE) {
            return new Distillery(player.inventory, (DistilleryTE) te);
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        BlockPos pos = new BlockPos(x, y, z);
        TileEntity te = world.getTileEntity(pos);
        if (te instanceof DistilleryTE) {
            DistilleryTE containerTileEntity = (DistilleryTE) te;
            return new DistilleryGUI(containerTileEntity, new Distillery(player.inventory, containerTileEntity));
        }
        return null;
    }
}
