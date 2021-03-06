

package sparks.maxcraft.proxy;

import sparks.maxcraft.*;
import sparks.maxcraft.blocks.*;
import sparks.maxcraft.blocks.distillery.*;
import sparks.maxcraft.items.*;
import sparks.maxcraft.MaxCraft;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.io.File;

@Mod.EventBusSubscriber
public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
    }
    
    public void init(FMLInitializationEvent e) {
        NetworkRegistry.INSTANCE.registerGuiHandler(MaxCraft.instance, new GuiProxy());
    }

    public void postInit(FMLPostInitializationEvent e) {
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new Money());
        event.getRegistry().register(new DistilleryBlock());

        GameRegistry.registerTileEntity(DistilleryTE.class, MaxCraft.MODID + "_distilleryblock");
    
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemBlock(ModBlocks.money).setRegistryName(ModBlocks.money.getRegistryName()));
        event.getRegistry().register(new ItemBlock(ModBlocks.distilleryblock).setRegistryName(ModBlocks.distilleryblock.getRegistryName()));
        event.getRegistry().register(ModItems.skooma);
        event.getRegistry().register(new MoneyItem());
    }
}