package sparks.maxcraft.items;

import sparks.maxcraft.MaxCraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class DrugEffect extends ItemFood {

    public DrugEffect(String name, int food, float saturation, boolean WolfLike) {
        super(food, saturation, WolfLike);
        setRegistryName(name);
        setUnlocalizedName(MaxCraft.MODID + "." + name);
    }
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}

