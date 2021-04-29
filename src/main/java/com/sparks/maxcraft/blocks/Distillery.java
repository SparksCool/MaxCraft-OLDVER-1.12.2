package sparks.maxcraft.blocks;
import sparks.maxcraft.MaxCraft;
import sparks.maxcraft.tilentities.*;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
public class Distillery extends Block {
    public Distillery() {
        super(Material.ROCK);
        setUnlocalizedName(MaxCraft.MODID + ".distillery");
        setRegistryName("distillery");        // The unique name (within your mod) that identifies this block
        setHarvestLevel("pickaxe",1);
        setHardness(0.7f);
    }
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new DistilleryTileEntity();
    }

    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, ItemStack heldItem, EnumFacing side,
                float hitX, float hitY, float hitZ) {
        // Only execute on the server
        if (world.isRemote) {
            return true;
        }
        TileEntity te = world.getTileEntity(pos);
        if (!(te instanceof TestContainerTileEntity)) {
            return false;
        }
        player.openGui(MaxCraft.instance, GUI_ID, world, pos.getX(), pos.getY(), pos.getZ());
        return true;
    }
    

}