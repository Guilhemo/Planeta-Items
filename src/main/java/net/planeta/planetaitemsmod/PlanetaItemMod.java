package net.planeta.planetaitemsmod;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.planeta.planetaitemsmod.item.ModCreativeModTabs;
import net.planeta.planetaitemsmod.item.ModItems;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(PlanetaItemMod.MOD_ID)
public class PlanetaItemMod
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "planetaitemsmod";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();


    public PlanetaItemMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModTabs.register(modEventBus);

        ModItems.register(modEventBus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS)
        {
            event.accept(ModItems.FISTPLATE);
            event.accept(ModItems.SKYPLATE);
            event.accept(ModItems.TOXICPLATE);
            event.accept(ModItems.EARTHPLATE);
            event.accept(ModItems.STONEPLATE);
            event.accept(ModItems.INSECTPLATE);
            event.accept(ModItems.SPOOKYPLATE);
            event.accept(ModItems.IRONPLATE);
            event.accept(ModItems.FLAMEPLATE);
            event.accept(ModItems.SPLASHPLATE);
            event.accept(ModItems.MEADOWPLATE);
            event.accept(ModItems.PIXIEPLATE);
            event.accept(ModItems.DRACOPLATE);
            event.accept(ModItems.DREADPLATE);
            event.accept(ModItems.ZAPPLATE);
            event.accept(ModItems.ICICLEPLATE);
            event.accept(ModItems.MINDPLATE);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
