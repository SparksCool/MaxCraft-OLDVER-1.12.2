package sparks.maxcraft.blocks;
import sparks.maxcraft.MaxCraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
public class Money extends Block {
    public Money() {
        super(Material.SAND);
        setUnlocalizedName(MaxCraft.MODID + ".money");
        setRegistryName("money");        // The unique name (within your mod) that identifies this block
        setHarvestLevel("pickaxe",0);
        setHardness(0.7f);
    }
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}