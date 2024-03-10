package net.planeta.planetaitemsmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.planeta.planetaitemsmod.PlanetaItemMod;

public class ModCreativeModTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PlanetaItemMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PLANETA_LENDS = CREATIVE_MODE_TABS.register("planeta_lends",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RED_ORB.get()))
                    .title(Component.translatable("creativetab.planeta_lends"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.FISTPLATE.get());
                        output.accept(ModItems.SKYPLATE.get());
                        output.accept(ModItems.TOXICPLATE.get());
                        output.accept(ModItems.EARTHPLATE.get());
                        output.accept(ModItems.STONEPLATE.get());
                        output.accept(ModItems.INSECTPLATE.get());
                        output.accept(ModItems.SPOOKYPLATE.get());
                        output.accept(ModItems.IRONPLATE.get());
                        output.accept(ModItems.FLAMEPLATE.get());
                        output.accept(ModItems.SPLASHPLATE.get());
                        output.accept(ModItems.MEADOWPLATE.get());
                        output.accept(ModItems.PIXIEPLATE.get());
                        output.accept(ModItems.DRACOPLATE.get());
                        output.accept(ModItems.DREADPLATE.get());
                        output.accept(ModItems.ZAPPLATE.get());
                        output.accept(ModItems.ICICLEPLATE.get());
                        output.accept(ModItems.MINDPLATE.get());

                        output.accept(ModItems.ADAMANT_ORB.get());
                        output.accept(ModItems.AURORA_TICKET.get());
                        output.accept(ModItems.AZURE_FLUTE.get());
                        output.accept(ModItems.BLUE_ORB.get());
                        output.accept(ModItems.BONUS_DISK.get());
                        output.accept(ModItems.CLEAR_BELL.get());
                        output.accept(ModItems.DNA_SPLICER.get());
                        output.accept(ModItems.EON_TICKET.get());
                        output.accept(ModItems.GRISEOUS_ORB.get());
                        output.accept(ModItems.GS_BALL.get());
                        output.accept(ModItems.JADE_ORB.get());
                        output.accept(ModItems.LIBERTY_PASS.get());
                        output.accept(ModItems.LUSTROUS_ORB.get());
                        output.accept(ModItems.MEMBER_CARD.get());
                        output.accept(ModItems.OAKS_LETTER.get());
                        output.accept(ModItems.OLD_SEA_MAP.get());
                        output.accept(ModItems.RED_ORB.get());
                        output.accept(ModItems.RUSTED_SHIELD.get());
                        output.accept(ModItems.RUSTED_SWORD.get());
                        output.accept(ModItems.TIDAL_BELL.get());
                        output.accept(ModItems.DR_FUJIS_DIARY.get());
                        output.accept(ModItems.RAINBOW_WING.get());
                        output.accept(ModItems.SCARLET_BOOK.get());
                        output.accept(ModItems.SILVER_WING.get());
                        output.accept(ModItems.VIOLET_BOOK.get());
                        output.accept(ModItems.COCOON_OF_DESTRUCTION.get());
                        output.accept(ModItems.SAPLING_OF_LIFE.get());
                        output.accept(ModItems.ZYGARDE_CUBE.get());
                        output.accept(ModItems.ZYGARDE_CELL.get());
                        output.accept(ModItems.ZYGARDE_CORE.get());
                        output.accept(ModItems.WATER_DUDE.get());
                        output.accept(ModItems.WISHING_PIECE.get());

                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> PLANETA_GYM = CREATIVE_MODE_TABS.register("planeta_gym",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TESLA_BADGE.get()))
                    .title(Component.translatable("creativetab.planeta_gym"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.AEGIS_BADGE.get());
                        output.accept(ModItems.APHID_BADGE.get());
                        output.accept(ModItems.BLIGHT_BADGE.get());
                        output.accept(ModItems.CREST_BADGE.get());
                        output.accept(ModItems.DEWDROP_BADGE.get());
                        output.accept(ModItems.DUSK_BADGE.get());
                        output.accept(ModItems.ESPER_BADGE.get());
                        output.accept(ModItems.FABLE_BADGE.get());
                        output.accept(ModItems.GARDEN_BADGE.get());
                        output.accept(ModItems.GLACIER_BADGE.get());
                        output.accept(ModItems.HARMONY_BADGE.get());
                        output.accept(ModItems.INFERNO_BADGE.get());
                        output.accept(ModItems.MASTER_BADGE.get());
                        output.accept(ModItems.MELEE_BADGE.get());
                        output.accept(ModItems.MYTHOS_BADGE.get());
                        output.accept(ModItems.PHANTOM_BADGE.get());
                        output.accept(ModItems.QUARRY_BADGE.get());
                        output.accept(ModItems.SAND_BADGE.get());
                        output.accept(ModItems.TESLA_BADGE.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> PLANETA_SKIN = CREATIVE_MODE_TABS.register("planeta_skin",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.HEART_SKIN.get()))
                    .title(Component.translatable("creativetab.planeta_skin"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.HEART_SKIN.get());
                    })
                    .build());

    public static  void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
