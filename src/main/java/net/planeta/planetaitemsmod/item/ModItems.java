package net.planeta.planetaitemsmod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.planeta.planetaitemsmod.PlanetaItemMod;


public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PlanetaItemMod.MOD_ID);

    public static final RegistryObject<Item> FISTPLATE = ITEMS.register("fistplate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DRACOPLATE = ITEMS.register("dracoplate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SKYPLATE = ITEMS.register("skyplate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOXICPLATE = ITEMS.register("toxicplate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EARTHPLATE = ITEMS.register("earthplate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STONEPLATE = ITEMS.register("stoneplate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INSECTPLATE = ITEMS.register("insectplate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SPOOKYPLATE = ITEMS.register("spookyplate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRONPLATE = ITEMS.register("ironplate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FLAMEPLATE = ITEMS.register("flameplate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SPLASHPLATE = ITEMS.register("splashplate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MEADOWPLATE = ITEMS.register("meadowplate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PIXIEPLATE = ITEMS.register("pixieplate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DREADPLATE = ITEMS.register("dreadplate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZAPPLATE = ITEMS.register("zapplate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ICICLEPLATE = ITEMS.register("icicleplate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MINDPLATE = ITEMS.register("mindplate",
            () -> new Item(new Item.Properties()));

    //Gym Badges Registries

    public static final RegistryObject<Item> AEGIS_BADGE = ITEMS.register("aegis_badge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> APHID_BADGE = ITEMS.register("aphid_badge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLIGHT_BADGE = ITEMS.register("blight_badge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CREST_BADGE = ITEMS.register("crest_badge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DEWDROP_BADGE = ITEMS.register("dewdrop_badge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DUSK_BADGE = ITEMS.register("dusk_badge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ESPER_BADGE = ITEMS.register("esper_badge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FABLE_BADGE = ITEMS.register("fable_badge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GARDEN_BADGE = ITEMS.register("garden_badge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GLACIER_BADGE = ITEMS.register("glacier_badge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HARMONY_BADGE = ITEMS.register("harmony_badge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INFERNO_BADGE = ITEMS.register("inferno_badge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MASTER_BADGE = ITEMS.register("master_badge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MELEE_BADGE = ITEMS.register("melee_badge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MYTHOS_BADGE = ITEMS.register("mythos_badge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PHANTOM_BADGE = ITEMS.register("phantom_badge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> QUARRY_BADGE = ITEMS.register("quarry_badge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAND_BADGE = ITEMS.register("sand_badge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TESLA_BADGE = ITEMS.register("tesla_badge",
            () -> new Item(new Item.Properties()));


    // Myths and Lends Items

    public static final RegistryObject<Item> ADAMANT_ORB = ITEMS.register("adamant_orb",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AURORA_TICKET = ITEMS.register("aurora_ticket",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AZURE_FLUTE = ITEMS.register("azure_flute",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLUE_ORB = ITEMS.register("blue_orb",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BONUS_DISK = ITEMS.register("bonus_disk",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CLEAR_BELL = ITEMS.register("clear_bell",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DNA_SPLICER = ITEMS.register("dna_splicer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EON_TICKET = ITEMS.register("eon_ticket",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GRISEOUS_ORB = ITEMS.register("griseous_orb",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GS_BALL = ITEMS.register("gs_ball",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JADE_ORB = ITEMS.register("jade_orb",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIBERTY_PASS = ITEMS.register("liberty_pass",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LUSTROUS_ORB = ITEMS.register("lustrous_orb",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MEMBER_CARD = ITEMS.register("member_card",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OAKS_LETTER = ITEMS.register("oaks_letter",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OLD_SEA_MAP = ITEMS.register("old_sea_map",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_ORB = ITEMS.register("red_orb",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUSTED_SHIELD = ITEMS.register("rusted_shield",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUSTED_SWORD = ITEMS.register("rusted_sword",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIDAL_BELL = ITEMS.register("tidal_bell",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DR_FUJIS_DIARY = ITEMS.register("dr_fujis_diary",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAINBOW_WING = ITEMS.register("rainbow_wing",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SCARLET_BOOK = ITEMS.register("scarlet_book",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_WING = ITEMS.register("silver_wing",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VIOLET_BOOK = ITEMS.register("violet_book",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COCOON_OF_DESTRUCTION = ITEMS.register("cocoon_of_destruction",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPLING_OF_LIFE = ITEMS.register("sapling_of_life",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZYGARDE_CUBE = ITEMS.register("zygarde_cube",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZYGARDE_CELL = ITEMS.register("zygarde_cell",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZYGARDE_CORE = ITEMS.register("zygarde_core",
            () -> new Item(new Item.Properties()));

    //Random Items

    public static final RegistryObject<Item> HEART_SKIN = ITEMS.register("skin_valentine_2024",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WATER_DUDE = ITEMS.register("water_dude",
            () -> new Item(new Item.Properties().rarity(Rarity.EPIC).fireResistant()));
    public static final RegistryObject<Item> WISHING_PIECE = ITEMS.register("wishing_piece",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE)));


    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
