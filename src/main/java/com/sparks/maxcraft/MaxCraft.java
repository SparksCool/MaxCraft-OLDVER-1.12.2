package sparks.maxcraft;
import sparks.maxcraft.blocks.*;
import sparks.maxcraft.proxy.CommonProxy;
import sparks.maxcraft.proxy.*;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import org.apache.logging.log4j.Logger;
import net.minecraftforge.fml.common.network.NetworkRegistry;

@Mod(modid = MaxCraft.MODID, name = MaxCraft.NAME, version = MaxCraft.VERSION)
public class MaxCraft
{
    public CommonProxy Cproxy;

    @Mod.Instance
    public static MaxCraft instance;

    public static final String MODID = "maxcraft";
    public static final String NAME = "maxcraft";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiProxy());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
       
    }

}




