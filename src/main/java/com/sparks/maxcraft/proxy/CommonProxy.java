

package sparks.maxcraft.proxy;

import sparks.maxcraft.*;
import sparks.maxcraft.blocks.*;
import sparks.maxcraft.items.*;
import sparks.maxcraft.village.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
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
import net.minecraftforge.fml.common.registry.VillagerRegistry.VillagerProfession;
import java.io.File;

@Mod.EventBusSubscriber
public class CommonProxy {


    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new Money());
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemBlock(ModBlocks.money).setRegistryName(ModBlocks.money.getRegistryName()));
        event.getRegistry().register(ModItems.skooma);
        event.getRegistry().register(new MoneyItem());
    }
    @SubscribeEvent
    public void onVillagerRegistry(RegistryEvent.Register<VillagerProfession> event) {
        BankerVillager.initBankerVillagePart();
        event.getRegistry().register(BankerVillager.bankerProfession);

    }
}