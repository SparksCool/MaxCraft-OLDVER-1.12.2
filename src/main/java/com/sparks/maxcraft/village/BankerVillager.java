package sparks.maxcraft.village;

import sparks.maxcraft.*;
import net.minecraft.entity.passive.EntityVillager.PriceInfo;
import net.minecraft.item.ItemStack;
import net.minecraft.world.gen.structure.MapGenStructureIO;
import net.minecraftforge.fml.common.registry.VillagerRegistry;
import net.minecraftforge.fml.common.registry.VillagerRegistry.VillagerCareer;
import net.minecraftforge.fml.common.registry.VillagerRegistry.VillagerProfession;

public class BankerVillager{
    public static VillagerProfession bankerProfession;

    public static void initBankerVillagePart() {
        bankerProfession = new VillagerProfession(MaxCraft.MODID + ":banker", MaxCraft.MODID + ":textures/entity/villager/banker.png", MaxCraft.MODID + ":textures/entity/villager/banker.png");

        VillagerCareer career = new VillagerCareer(bankerProfession, MaxCraft.MODID + ".Bankman");
        career.addTrade(1, new BankerTradeList(new PriceInfo(1, 4), new ItemStack(ModItems.skooma), new PriceInfo(1, 3)));

       VillagerRegistry.instance().registerVillageCreationHandler(new BankHouseHandler());
       MapGenStructureIO.registerStructureComponent(VillageBankHouse.class, MaxCraft.MODID + ":bankStructure");
    }

}