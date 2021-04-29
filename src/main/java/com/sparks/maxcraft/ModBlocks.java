package sparks.maxcraft;
import sparks.maxcraft.blocks.*;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
public class ModBlocks {

    @GameRegistry.ObjectHolder("maxcraft:money")
    public static Money money;
    @GameRegistry.ObjectHolder("maxcraft:distillery")
    public static Distillery distillery;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        money.initModel();
        distillery.initModel();
    }
}
