/**
 * this is just an op static class for storing data
 */
public class DirectoryTrees {

    public static final String basePath = "/assets/minecraft/textures/";

    //oops maybe dont need
    /*public static Directory[] getTreeByVersion(byte version) {
        switch (version) {
            case 12:
                return TREE_112;
            case 13:
                return TREE_113;
            default:
                throw new RuntimeException("version not found: " + version);
        }
    }*/

    // le epic definitions
    public static Directory BLOCKS = new Directory();
    public static Directory COLORMAPS = new Directory();
    public static Directory EFFECTS = new Directory();
    public static Directory ENTITIES = new Directory();
    public static Directory ARMORSTAND = new Directory();
    public static Directory BANNER = new Directory();
    public static Directory BEARS = new Directory();
    public static Directory BEDS = new Directory();
    public static Directory BOATS = new Directory();
    public static Directory CATS = new Directory();
    public static Directory CHESTS = new Directory();
    public static Directory CONDUIT = new Directory();
    public static Directory COWS = new Directory();
    public static Directory CREEPER = new Directory();
    public static Directory END_CRYSTAL = new Directory();
    public static Directory ENDER_DRAGON = new Directory();
    public static Directory ENDERMAN = new Directory();
    public static Directory FISH = new Directory();
    public static Directory GHAST = new Directory();
    public static Directory HORSES = new Directory();
    public static Directory HORSE_ARMOR = new Directory();
    public static Directory ILLAGERS = new Directory();
    public static Directory LLAMAS = new Directory();
    public static Directory LLAMA_DECOR = new Directory();
    public static Directory PARROTS = new Directory();
    public static Directory PIG = new Directory();
    public static Directory PROJECTILES = new Directory();
    public static Directory RABBITS = new Directory();
    public static Directory SHEEP = new Directory();
    public static Directory SHIELD = new Directory();
    public static Directory SHULKERS = new Directory();
    public static Directory SKELETONS = new Directory();
    public static Directory SLIMES = new Directory();
    public static Directory SPIDERS = new Directory();
    public static Directory TURTLE = new Directory();
    public static Directory VILLAGERS = new Directory();
    public static Directory WITHER = new Directory();
    public static Directory WOLVES = new Directory();
    public static Directory ZOMBIES = new Directory();
    public static Directory ZOMBIE_VILLAGERS = new Directory();
    public static Directory ENVIRONMENT = new Directory();
    public static Directory FONT = new Directory();
    public static Directory GUIS = new Directory();
    public static Directory ADVANCEMENTS = new Directory();
    public static Directory ADVANCEMENT_BACKGROUNDS = new Directory();
    public static Directory CONTAINERS = new Directory();
    public static Directory CONTAINER_CREATIVE_INVENTORY = new Directory();
    public static Directory PRESETS = new Directory();
    public static Directory TITLE = new Directory();
    public static Directory TITLE_BACKGROUND = new Directory();
    public static Directory ITEMS = new Directory();
    public static Directory MAP = new Directory();
    public static Directory MISC = new Directory();
    public static Directory MODELS = new Directory();
    public static Directory PAINTINGS = new Directory();
    public static Directory PARTICLES = new Directory();

    public static Directory[] TOP_LEVEL_DIRECTORIES = new Directory[] {
            BLOCKS,
            COLORMAPS,
            EFFECTS,
            ENTITIES,
            ENVIRONMENT,
            FONT,
            GUIS,
            ITEMS,
            MAP,
            MISC,
            MODELS,
            PAINTINGS,
            PARTICLES
    };

    //setup
    public static void setupPaths() {

        // 1.12
        byte var = 12;
        // setting names
        BLOCKS.setName("blocks", var);
        COLORMAPS.setName("colormap", var);
        EFFECTS.setName("effect", var);
        ENTITIES.setName("entity", var);
        ARMORSTAND.setName("armorstand", var);
        BANNER.setName("banner", var);
        BEARS.setName("bear", var);
        BEDS.setName("bed", var);
        BOATS.setName("boat", var);
        CATS.setName("cat", var);
        CHESTS.setName("chest", var);
        COWS.setName("cow", var);
        CREEPER.setName("creeper", var);
        END_CRYSTAL.setName("endercrystal", var);
        ENDER_DRAGON.setName("enderdragon", var);
        ENDERMAN.setName("enderman", var);
        GHAST.setName("ghast", var);
        HORSES.setName("horse", var);
        HORSE_ARMOR.setName("armor", var);
        ILLAGERS.setName("illager", var);
        LLAMAS.setName("llama", var);
        LLAMA_DECOR.setName("decor", var);
        PARROTS.setName("parrot", var);
        PIG.setName("pig", var);
        PROJECTILES.setName("projectiles", var);
        RABBITS.setName("rabbit", var);
        SHEEP.setName("sheep", var);
        SHIELD.setName("shield", var);
        SHULKERS.setName("shulker", var);
        SKELETONS.setName("skeleton", var);
        SLIMES.setName("slime", var);
        SPIDERS.setName("spider", var);
        VILLAGERS.setName("villager", var);
        WITHER.setName("wither", var);
        WOLVES.setName("wolf", var);
        ZOMBIES.setName("zombie", var);
        ZOMBIE_VILLAGERS.setName("zombie_villager", var);
        ENVIRONMENT.setName("environment", var);
        FONT.setName("font", var);
        GUIS.setName("gui", var);
        ADVANCEMENTS.setName("advancements", var);
        ADVANCEMENT_BACKGROUNDS.setName("backgrounds", var);
        CONTAINERS.setName("container", var);
        CONTAINER_CREATIVE_INVENTORY.setName("creative_inventory", var);
        PRESETS.setName("presets", var);
        TITLE.setName("title", var);
        TITLE_BACKGROUND.setName("background", var);
        ITEMS.setName("items", var);
        MAP.setName("map", var);
        MISC.setName("misc", var);
        MODELS.setName("models", var);
        PAINTINGS.setName("painting", var);
        PARTICLES.setName("particle", var);

        // setting subdirectories
        ENTITIES.setSubDirectories(new Directory[]{
                ARMORSTAND,
                BANNER,
                BEARS,
                BEDS,
                BOATS,
                CATS,
                CHESTS,
                CONDUIT,
                COWS,
                CREEPER,
                END_CRYSTAL,
                ENDER_DRAGON,
                ENDERMAN,
                FISH,
                GHAST,
                HORSES,
                ILLAGERS,
                LLAMAS,
                PARROTS,
                PIG,
                PROJECTILES,
                RABBITS,
                SHEEP,
                SHIELD,
                SHULKERS,
                SKELETONS,
                SLIMES,
                SPIDERS,
                TURTLE,
                VILLAGERS,
                WITHER,
                WOLVES,
                ZOMBIES,
                ZOMBIE_VILLAGERS
        }, var);
        HORSES.setSubDirectories(new Directory[]{
                HORSE_ARMOR
        }, var);
        LLAMAS.setSubDirectories(new Directory[]{
                LLAMA_DECOR
        }, var);

        GUIS.setSubDirectories(new Directory[]{
                ADVANCEMENTS,
                CONTAINERS,
                PRESETS,
                TITLE
        }, var);
        ADVANCEMENTS.setSubDirectories(new Directory[]{
                ADVANCEMENT_BACKGROUNDS
        }, var);
        CONTAINERS.setSubDirectories(new Directory[]{
                CONTAINER_CREATIVE_INVENTORY
        }, var);
        TITLE.setSubDirectories(new Directory[]{
                TITLE_BACKGROUND
        }, var);

        // setting textures
        BLOCKS.setTextures(new Texture[]{
                Textures.STAINED_CLAY,
                Textures.STAINED_GLASS,
                Textures.COBBLESTONE
        }, var);
        //todo

        // 1.13
        var++;
        // setting names
        BLOCKS.setName("block", var);
        COLORMAPS.setName("colormap", var);
        EFFECTS.setName("effect", var);
        ENTITIES.setName("entity", var);
        ARMORSTAND.setName("armorstand", var);
        BANNER.setName("banner", var);
        BEARS.setName("bear", var);
        BEDS.setName("bed", var);
        BOATS.setName("boat", var);
        CATS.setName("cat", var);
        CHESTS.setName("chest", var);
        CONDUIT.setName("conduit", var);
        COWS.setName("cow", var);
        CREEPER.setName("creeper", var);
        END_CRYSTAL.setName("end_crystal", var);
        ENDER_DRAGON.setName("enderdragon", var);
        ENDERMAN.setName("enderman", var);
        FISH.setName("fish", var);
        GHAST.setName("ghast", var);
        HORSES.setName("horse", var);
        HORSE_ARMOR.setName("armor", var);
        ILLAGERS.setName("illager", var);
        LLAMAS.setName("llama", var);
        LLAMA_DECOR.setName("decor", var);
        PARROTS.setName("parrot", var);
        PIG.setName("pig", var);
        PROJECTILES.setName("projectiles", var);
        RABBITS.setName("rabbit", var);
        SHEEP.setName("sheep", var);
        SHIELD.setName("shield", var);
        SHULKERS.setName("shulker", var);
        SKELETONS.setName("skeleton", var);
        SLIMES.setName("slime", var);
        SPIDERS.setName("spider", var);
        TURTLE.setName("turtle", var);
        VILLAGERS.setName("villager", var);
        WITHER.setName("wither", var);
        WOLVES.setName("wolf", var);
        ZOMBIES.setName("zombie", var);
        ZOMBIE_VILLAGERS.setName("zombie_villager", var);
        ENVIRONMENT.setName("environment", var);
        FONT.setName("font", var);
        GUIS.setName("gui", var);
        ADVANCEMENTS.setName("advancements", var);
        ADVANCEMENT_BACKGROUNDS.setName("backgrounds", var);
        CONTAINERS.setName("container", var);
        CONTAINER_CREATIVE_INVENTORY.setName("creative_inventory", var);
        PRESETS.setName("presets", var);
        TITLE.setName("title", var);
        TITLE_BACKGROUND.setName("background", var);
        ITEMS.setName("item", var);
        MAP.setName("map", var);
        MISC.setName("misc", var);
        MODELS.setName("models", var);
        PAINTINGS.setName("painting", var);
        PARTICLES.setName("particle", var);

        // setting subdirectories
        // setting subdirectories
        ENTITIES.setSubDirectories(new Directory[]{
                ARMORSTAND,
                BANNER,
                BEARS,
                BEDS,
                BOATS,
                CATS,
                CHESTS,
                CONDUIT,
                COWS,
                CREEPER,
                END_CRYSTAL,
                ENDER_DRAGON,
                ENDERMAN,
                FISH,
                GHAST,
                HORSES,
                ILLAGERS,
                LLAMAS,
                PARROTS,
                PIG,
                PROJECTILES,
                RABBITS,
                SHEEP,
                SHIELD,
                SHULKERS,
                SKELETONS,
                SLIMES,
                SPIDERS,
                TURTLE,
                VILLAGERS,
                WITHER,
                WOLVES,
                ZOMBIES,
                ZOMBIE_VILLAGERS
        }, var);
        HORSES.setSubDirectories(new Directory[]{
                HORSE_ARMOR
        }, var);
        LLAMAS.setSubDirectories(new Directory[]{
                LLAMA_DECOR
        }, var);

        GUIS.setSubDirectories(new Directory[]{
                ADVANCEMENTS,
                CONTAINERS,
                PRESETS,
                TITLE
        }, var);
    }
}
