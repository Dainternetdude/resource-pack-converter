public class One12 extends Version {
	
	public int version = 12;
	
	public One12() {
		setupTextures();
		setupDirectories();
	}
	
	protected void setupTextures() {
		//TODO: super.setupTextures();
		
		//blocks
		ACACIA_DOOR_BOTTOM.setName("door_acacia_lower", version);
		ACACIA_DOOR_TOP.setName("door_acacia_upper", version);
		ACACIA_LEAVES.setName("leaves_acacia", version);
		ACACIA_LOG.setName("log_acacia", version);
		ACACIA_LOG_TOP.setName("log_acacia_top", version);
		ACACIA_PLANKS.setName("planks_acacia", version);
		ACACIA_SAPLING.setName("sapling_acacia", version);
		ACTIVATOR_RAIL.setName("rail_activator", version);
		ACTIVATOR_RAIL_ON.setName("rail_activator_powered", version);
		ALLIUM.setName("flower_allium", version);
		ANDESITE.setName("stone_andesite", version);
		ANVIL.setName("anvil_base", version);
		ANVIL_TOP.setName("anvil_top_damaged_0", version);
		ATTACHED_MELON_STEM.setName("melon_stem_connected", version);
		ATTACHED_PUMPKIN_STEM.setName("pumpkin_stem_connected", version);
		AZURE_BLUET.setName("flower_houstonia", version);
		BEACON.setName("beacon", version);
		BEDROCK.setName("bedrock", version);
		BEETROOTS_STAGE0.setName("beetroots_stage_0", version);
		BEETROOTS_STAGE1.setName("beetroots_stage_1", version);
		BEETROOTS_STAGE2.setName("beetroots_stage_2", version);
		BEETROOTS_STAGE3.setName("beetroots_stage_3", version);
		BIRCH_DOOR_BOTTOM.setName("door_birch_lower", version);
		BIRCH_DOOR_TOP.setName("door_birch_upper", version);
		BIRCH_LEAVES.setName("leaves_birch", version);
		BIRCH_LOG.setName("log_birch", version);
		BIRCH_LOG_TOP.setName("log_birch_top", version);
		BIRCH_PLANKS.setName("planks_birch", version);
		BIRCH_SAPLING.setName("sapling_birch", version);
		BLACK_CONCRETE.setName("concrete_black", version);
		BLACK_CONCRETE_POWDER.setName("concrete_powder_black", version);
		BLACK_GLAZED_TERRACOTTA.setName("glazed_terracotta_black", version);
		BLACK_SHULKER_BOX.setName("shulker_top_black", version);
		BLACK_STAINED_GLASS.setName("glass_black", version);
		BLACK_STAINED_GLASS_PANE_TOP.setName("glass_pane_top_black", version);
		BLACK_TERRACOTTA.setName("hardened_clay_stained_black", version);
		BLACK_WOOL.setName("wool_colored_black", version);
		BLUE_CONCRETE.setName("concrete_blue", version);
		BLUE_CONCRETE_POWDER.setName("concrete_powder_blue", version);
		BLUE_GLAZED_TERRACOTTA.setName("glazed_terracotta_blue", version);
		BLUE_ORCHID.setName("flower_blue_orchid", version);
		BLUE_SHULKER_BOX.setName("shulker_top_blue", version);
		BLUE_STAINED_GLASS.setName("glass_blue", version);
		BLUE_STAINED_GLASS_PANE_TOP.setName("glass_pane_top_blue", version);
		BLUE_TERRACOTTA.setName("hardened_clay_stained_blue", version);
		BLUE_WOOL.setName("wool_colored_blue", version);
		BONE_BLOCK_SIDE.setName("bone_block_side", version);
		BONE_BLOCK_TOP.setName("bone_block_top", version);
		BOOKSHELF.setName("bookshelf", version);
		BREWING_STAND.setName("brewing_stand", version);
		BREWING_STAND_BASE.setName("brewing_stand_base", version);
		BRICKS.setName("brick", version);
		BROWN_CONCRETE.setName("concrete_brown", version);
		BROWN_CONCRETE_POWDER.setName("concrete_powder_brown", version);
		BROWN_GLAZED_TERRACOTTA.setName("glazed_terracotta_brown", version);
		BROWN_MUSHROOM.setName("mushroom_brown", version);
		BROWN_MUSHROOM_BLOCK.setName("mushroom_block_skin_brown", version);
		BROWN_SHULKER_BOX.setName("shulker_top_brown", version);
		BROWN_STAINED_GLASS.setName("glass_brown", version);
		BROWN_STAINED_GLASS_PANE_TOP.setName("glass_pane_stained_brown", version);
		BROWN_TERRACOTTA.setName("hardened_clay_stained_brown", version);
		BROWN_WOOL.setName("wool_colored_brown", version);
		CACTUS_BOTTOM.setName("cactus_bottom", version);
		CACTUS_SIDE.setName("cactus_side", version);
		CACTUS_TOP.setName("cactus_top", version);
		CAKE_BOTTOM.setName("cake_bottom", version);
		CAKE_INNER.setName("cake_inner", version);
		CAKE_SIDE.setName("cake_side", version);
		CAKE_TOP.setName("cake_top", version);
		CARROTS_STAGE0.setName("carrots_stage_0", version);
		CARROTS_STAGE1.setName("carrots_stage_1", version);
		CARROTS_STAGE2.setName("carrots_stage_2", version);
		CARROTS_STAGE3.setName("carrots_stage_3", version);
		CARVED_PUMPKIN.setName("pumpkin_face_off", version);
		CAULDRON_BOTTOM.setName("cauldron_bottom", version);
		CAULDRON_INNER.setName("cauldron_innder", version);
		CAULDRON_SIDE.setName("cauldron_side", version);
		CAULDRON_TOP.setName("cauldron_top", version);
		CHAIN_COMMAND_BLOCK_BACK.setName("chain_command_block_back", version);
		CHAIN_COMMAND_BLOCK_CONDITIONAL.setName("chain_command_block_conditional", version);
		CHAIN_COMMAND_BLOCK_FRONT.setName("chain_command_block_front", version);
		CHAIN_COMMAND_BLOCK_SIDE.setName("chain_command_block_side", version);
		CHIPPED_ANVIL_TOP.setName("anvil_damaged_1", version);
		CHISELED_QUARTZ_BLOCK.setName("quartz_block_chiseled", version);
		CHISELED_QUARTZ_BLOCK_TOP.setName("quartz_block_chiseled_top", version);
		CHISELED_RED_SANDSTONE.setName("red_sandstone_carved", version);
		CHISELED_SANDSTONE.setName("sandstone_carved", version);
		CHISELED_STONE_BRICKS.setName("stonebrick_carved", version);
		CHORUS_FLOWER.setName("chorus_flower", version);
		CHORUS_FLOWER_DEAD.setName("chorus_flower_dead", version);
		CHORUS_PLANT.setName("chorus_plant", version);
		CLAY.setName("clay", version);
		COAL_BLOCK.setName("coal_blocl", version);
		COAL_ORE.setName("coal_ore", version);
		COARSE_DIRT.setName("coarse_dirt", version);
		COBBLESTONE.setName("cobblestone", version);
		COBWEB.setName("web", version);
		COCOA_STAGE0.setName("cocoa_stage_0", version);
		COCOA_STAGE1.setName("cocoa_stage_1", version);
		COCOA_STAGE2.setName("cocoa_stage_2", version);
		COMMAND_BLOCK_BACK.setName("command_block_back", version);
		COMMAND_BLOCK_CONDITIONAL.setName("command_block_conditional", version);
		COMMAND_BLOCK_FRONT.setName("command_block_front", version);
		COMMAND_BLOCK_SIDE.setName("command_block_side", version);
		COMPARATOR.setName("comparator_off", version);
		COMPARATOR_ON.setName("comparator_on", version);
		CRACKED_STONE_BRICKS.setName("stonebrick_cracked", version);
		CRAFTING_TABLE_FRONT.setName("crafting_table_front", version);
		CRAFTING_TABLE_SIDE.setName("crafting_table_side", version);
		CRAFTING_TABLE_TOP.setName("crafting_table_top", version);
		CUT_RED_SANDSTONE.setName("red_sandstone_smooth", version);
		CUT_SANDSTONE.setName("sandstone_smooth", version);
		CYAN_CONCRETE.setName("concrete_cyan", version);
		CYAN_CONCRETE_POWDER.setName("concrete_powder_cyan", version);
		CYAN_GLAZED_TERRACOTTA.setName("glazed_terracotta_cyan", version);
		CYAN_SHULKER_BOX.setName("shulker_top_cyan", version);
		CYAN_STAINED_GLASS.setName("glass_cyan", version);
		CYAN_STAINED_GLASS_PANE_TOP.setName("glass_pane_top_cyan", version);
		CYAN_TERRACOTTA.setName("hardened_clay_stained_cyan", version);
		CYAN_WOOL.setName("wool_colored_cyan", version);
		DAMAGED_ANVIL_TOP.setName("anvil_damaged_2", version);
		DANDELION.setName("flower_dandelion", version);
		DARK_OAK_DOOR_BOTTOM.setName("door_dark_oak_lower", version);
		DARK_OAK_DOOR_TOP.setName("door_dark_oak_upper", version);
		DARK_OAK_LEAVES.setName("leaves_big_oak", version);
		DARK_OAK_LOG.setName("log_big_oak", version);
		DARK_OAK_LOG_TOP.setName("log_big_oak_top", version);
		DARK_OAK_PLANKS.setName("planks_big_oak", version);
		DARK_OAK_SAPLING.setName("sapling_roofed_oak", version);
		DARK_PRISMARINE.setName("prismarine_dark", version);
		DAYLIGHT_DETECTOR_INVERTED_TOP.setName("daylight_detector_inverted_top", version);
		DAYLIGHT_DETECTOR_SIDE.setName("daylight_detector_side", version);
		DAYLIGHT_DETECTOR_TOP.setName("daylight_detector_top", version);
		DEAD_BUSH.setName("deadbush", version);
		DEBUG.setName("debug", version);
		DEBUG2.setName("debug2", version);
		DESTROY_STAGE_0.setName("destroy_stage_0", version);
		DESTROY_STAGE_1.setName("destroy_stage_1", version);
		DESTROY_STAGE_2.setName("destroy_stage_2", version);
		DESTROY_STAGE_3.setName("destroy_stage_3", version);
		DESTROY_STAGE_4.setName("destroy_stage_4", version);
		DESTROY_STAGE_5.setName("destroy_stage_5", version);
		DESTROY_STAGE_6.setName("destroy_stage_6", version);
		DESTROY_STAGE_7.setName("destroy_stage_7", version);
		DESTROY_STAGE_8.setName("destroy_stage_8", version);
		DESTROY_STAGE_9.setName("destroy_stage_9", version);
		DETECTOR_RAIL.setName("rail_detector", version);
		DETECTOR_RAIL_ON.setName("rail_detector_powered", version);
		DIAMOND_BLOCK.setName("diamond_block", version);
		DIAMOND_ORE.setName("diamond_ore", version);
		DIORITE.setName("stone_diorite", version);
		DIRT.setName("dirt", version);
		DISPENSER_FRONT.setName("dispenser_front_horizontal", version);
		DISPENSER_FRONT_VERTICAL.setName("dispenser_front_vertical", version);
		DRAGON_EGG.setName("dragon_egg", version);
		DROPPER_FRONT.setName("dropper_front_horizontal", version);
		DROPPER_FRONT_VERTICAL.setName("dropper_front_vertical", version);
		EMERALD_BLOCK.setName("emerald_block", version);
		EMERALD_ORE.setName("emerald_ore", version);
		ENCHANTING_TABLE_BOTTOM.setName("enchanting_table_bottom", version);
		ENCHANTING_TABLE_SIDE.setName("enchanting_table_side", version);
		ENCHANTING_TABLE_TOP.setName("enchanting_table_top", version);
		END_PORTAL_FRAME_EYE.setName("endframe_eye", version);
		END_PORTAL_FRAME_SIDE.setName("endframe_side", version);
		END_PORTAL_FRAME_TOP.setName("endframe_top", version);
		END_ROD.setName("end_rod", version);
		END_STONE.setName("end_stone", version);
		END_STONE_BRICKS.setName("end_bricks", version);
		FARMLAND.setName("farmland_dry", version);
		FARMLAND_MOIST.setName("farmland_wet", version);
		FERN.setName("fern", version);
		FIRE_0.setName("fire_layer_0", version);
		FIRE_1.setName("fire_layer_1", version);
		FLOWER_POT.setName("flower_pot", version);
		FROSTED_ICE_0.setName("frosted_ice_0", version);
		FROSTED_ICE_1.setName("frosted_ice_1", version);
		FROSTED_ICE_2.setName("frosted_ice_2", version);
		FROSTED_ICE_3.setName("frosted_ice_3", version);
		FURNACE_FRONT.setName("furnace_front_off", version);
		FURNACE_FRONT_ON.setName("furnace_front_on", version);
		FURNACE_SIDE.setName("furnace_side", version);
		FURNACE_TOP.setName("furnace_top", version);
		GLASS.setName("glass", version);
		GLASS_PANE_TOP.setName("glass_pane_top", version);
		GLOWSTONE.setName("glowstone", version);
		GOLD_BLOCK.setName("gold_block", version);
		GOLD_ORE.setName("gold_ore", version);
		GRANITE.setName("stone_granite", version);
		GRASS.setName("tallgrass", version);
		GRASS_BLOCK_SIDE.setName("grass_side", version);
		GRASS_BLOCK_SIDE_OVERLAY.setName("grass_side_overlay", version);
		GRASS_BLOCK_SNOW.setName("grass_side_snowed", version);
		GRASS_BLOCK_TOP.setName("grass_top", version);
		GRASS_PATH_SIDE.setName("grass_path_side", version);
		GRASS_PATH_TOP.setName("grass_path_top", version);
		GRAVEL.setName("gravel", version);
		GRAY_CONCRETE.setName("concrete_gray", version);
		GRAY_CONCRETE_POWDER.setName("concrete_powder_gray", version);
		GRAY_GLAZED_TERRACOTTA.setName("glazed_terracotta_gray", version);
		GRAY_SHULKER_BOX.setName("shulker_top_gray", version);
		GRAY_STAINED_GLASS.setName("glass_gray", version);
		GRAY_STAINED_GLASS_PANE_TOP.setName("glass_pane_top_gray", version);
		GRAY_TERRACOTTA.setName("hardened_clay_stained_gray", version);
		GRAY_WOOL.setName("wool_colored_gray", version);
		GREEN_CONCRETE.setName("concrete_green", version);
		GREEN_CONCRETE_POWDER.setName("concrete_powder_green", version);
		GREEN_GLAZED_TERRACOTTA.setName("glazed_terracotta_green", version);
		GREEN_SHULKER_BOX.setName("shulker_top_green", version);
		GREEN_STAINED_GLASS.setName("glass_green", version);
		GREEN_STAINED_GLASS_PANE_TOP.setName("glass_pane_top_green", version);
		GREEN_TERRACOTTA.setName("hardened_clay_stained_green", version);
		GREEN_WOOL.setName("wool_colored_green", version);
		HAY_BLOCK_SIDE.setName("hay_block_side", version);
		HAY_BLOCK_TOP.setName("hay_block_top", version);
		HOPPER_INSIDE.setName("hopper_inside", version);
		HOPPER_OUTSIDE.setName("hopper_outside", version);
		HOPPER_TOP.setName("hopper_top", version);
		ICE.setName("ice", version);
		IRON_BARS.setName("iron_bars", version);
		IRON_BLOCK.setName("iron_block", version);
		IRON_DOOR_BOTTOM.setName("door_iron_lower", version);
		IRON_DOOR_TOP.setName("door_iron_upper", version);
		IRON_ORE.setName("iron_ore", version);
		IRON_TRAPDOOR.setName("iron_trapdoor", version);
		ITEM_FRAME.setName("itemframe_background", version);
		JACK_O_LANTERN.setName("pumpkin_face_on", version);
		JUKEBOX_SIDE.setName("jukebox_side", version);
		JUKEBOX_TOP.setName("jukebox_top", version);
		JUNGLE_DOOR_BOTTOM.setName("door_jungle_lower", version);
		JUNGLE_DOOR_TOP.setName("door_jungle_upper", version);
		JUNGLE_LEAVES.setName("leaves_jungle", version);
		JUNGLE_LOG.setName("log_jungle", version);
		JUNGLE_LOG_TOP.setName("log_jungle_top", version);
		JUNGLE_PLANKS.setName("planks_jungle", version);
		JUNGLE_SAPLING.setName("sapling_jungle", version);
		LADDER.setName("ladder", version);
		LAPIS_BLOCK.setName("lapis_block", version);
		LAPIS_ORE.setName("lapis_ore", version);
		LARGE_FERN_BOTTOM.setName("double_plant_fern_bottom", version);
		LARGE_FERN_TOP.setName("double_plant_fern_top", version);
		LAVA_FLOW.setName("lava_flow", version);
		LAVA_STILL.setName("lava_still", version);
		LEVER.setName("leverdoub", version);
		LIGHT_BLUE_CONCRETE.setName("concrete_light_blue", version);
		LIGHT_BLUE_CONCRETE_POWDER.setName("concrete_powder_light_blue", version);
		LIGHT_BLUE_GLAZED_TERRACOTTA.setName("glazed_terracotta_light_blue", version);
		LIGHT_BLUE_SHULKER_BOX.setName("shulker_top_light_blue", version);
		LIGHT_BLUE_STAINED_GLASS.setName("glass_light_blue", version);
		LIGHT_BLUE_STAINED_GLASS_PANE_TOP.setName("glass_pane_top_light_blue", version);
		LIGHT_BLUE_TERRACOTTA.setName("hardened_clay_stained_light_blue", version);
		LIGHT_BLUE_WOOL.setName("wool_colored_light_blue", version);
		LIGHT_GRAY_CONCRETE.setName("concrete_silver", version);
		LIGHT_GRAY_CONCRETE_POWDER.setName("concrete_powder_silver", version);
		LIGHT_GRAY_GLAZED_TERRACOTTA.setName("glazed_terracotta_silver", version);
		LIGHT_GRAY_SHULKER_BOX.setName("shulker_top_silver", version);
		LIGHT_GRAY_STAINED_GLASS.setName("glass_silver", version);
		LIGHT_GRAY_STAINED_GLASS_PANE_TOP.setName("glass_pane_top_silver", version);
		LIGHT_GRAY_TERRACOTTA.setName("hardened_clay_stained_silver", version);
		LIGHT_GRAY_WOOL.setName("wool_colored_silver", version);
		LILAC_BOTTOM.setName("double_plant_syringa_bottom", version);
		LILAC_TOP.setName("double_plant_syringa_top", version);
		LILY_PAD.setName("waterlily", version);
		LIME_CONCRETE.setName("concrete_lime", version);
		LIME_CONCRETE_POWDER.setName("concrete_powder_lime", version);
		LIME_GLAZED_TERRACOTTA.setName("glazed_terracotta_lime", version);
		LIME_SHULKER_BOX.setName("shulker_top_lime", version);
		LIME_STAINED_GLASS.setName("glass_lime", version);
		LIME_STAINED_GLASS_PANE_TOP.setName("glass_pane_top_lime", version);
		LIME_TERRACOTTA.setName("hardened_clay_stained_lime", version);
		LIME_WOOL.setName("wool_colored_lime", version);
		MAGENTA_CONCRETE.setName("concrete_magenta", version);
		MAGENTA_CONCRETE_POWDER.setName("concrete_powder_magenta", version);
		MAGENTA_GLAZED_TERRACOTTA.setName("glazed_terracotta_magenta", version);
		MAGENTA_SHULKER_BOX.setName("shulker_top_magenta", version);
		MAGENTA_STAINED_GLASS.setName("glass_magenta", version);
		MAGENTA_STAINED_GLASS_PANE_TOP.setName("glass_pane_top_magenta", version);
		MAGENTA_TERRACOTTA.setName("hardened_clay_stained_magenta", version);
		MAGENTA_WOOL.setName("wool_colored_magenta", version);
		MAGMA.setName("magma", version);
		MELON_SIDE.setName("melon_side", version);
		MELON_STEM.setName("melon_stem_disconnected", version);
		MELON_TOP.setName("melon_top", version);
		MOSSY_COBBLESTONE.setName("cobblestone_mossy", version);
		MOSSY_STONE_BRICKS.setName("stonebrick_mossy", version);
		MUSHROOM_BLOCK_INSIDE.setName("mushroom_block_inside", version);
		MUSHROOM_STEM.setName("mushroom_block_skin_stem", version);
		MYCELIUM_SIDE.setName("mycelium_side", version);
		MYCELIUM_TOP.setName("mycelium_top", version);
		NETHER_BRICKS.setName("nether_brick", version);
		NETHER_PORTAL.setName("portal", version);
		NETHER_QUARTZ_ORE.setName("quartz_ore", version);
		NETHER_WART_BLOCK.setName("nether_wart_block", version);
		NETHER_WART_STAGE0.setName("nether_wart_stage_0", version);
		NETHER_WART_STAGE1.setName("nether_wart_stage_1", version);
		NETHER_WART_STAGE2.setName("nether_wart_stage_2", version);
		NETHERRACK.setName("netherrack", version);
		NOTE_BLOCK.setName("noteblock", version);
		OAK_DOOR_BOTTOM.setName("door_wood_lower", version);
		OAK_DOOR_TOP.setName("door_wood_upper", version);
		OAK_LEAVES.setName("leaves_oak", version);
		OAK_LOG.setName("log_oak", version);
		OAK_LOG_TOP.setName("log_oak_top", version);
		OAK_PLANKS.setName("planks_oak", version);
		OAK_SAPLING.setName("sapling_oak", version);
		OAK_TRAPDOOR.setName("trapdoor", version);
		OBSERVER_BACK.setName("observer_back", version);
		OBSERVER_BACK_ON.setName("observer_back_lit", version);
		OBSERVER_FRONT.setName("observer_front", version);
		OBSERVER_SIDE.setName("observer_side", version);
		OBSERVER_TOP.setName("observer_top", version);
		OBSIDIAN.setName("obsidian", version);
		ORANGE_CONCRETE.setName("concrete_orange", version);
		ORANGE_CONCRETE_POWDER.setName("concrete_powder_orange", version);
		ORANGE_GLAZED_TERRACOTTA.setName("glazed_terracotta_orange", version);
		ORANGE_SHULKER_BOX.setName("shulker_top_orange", version);
		ORANGE_STAINED_GLASS.setName("glass_orange", version);
		ORANGE_STAINED_GLASS_PANE_TOP.setName("glass_pane_top_orange", version);
		ORANGE_TERRACOTTA.setName("hardened_clay_stained_orange", version);
		ORANGE_TULIP.setName("flower_tulip_orange", version);
		ORANGE_WOOL.setName("wool_colored_orange", version);
		OXEYE_DAISY.setName("flower_oxeye_daisy", version);
		PACKED_ICE.setName("ice_packed", version);
		PEONY_BOTTOM.setName("double_plant_paeonia_bottom", version);
		PEONY_TOP.setName("double_plant_paeonia_top", version);
		PINK_CONCRETE.setName("concrete_pink", version);
		PINK_CONCRETE_POWDER.setName("concrete_powder_pink", version);
		PINK_GLAZED_TERRACOTTA.setName("glazed_terracotta_pink", version);
		PINK_SHULKER_BOX.setName("shulker_top_pink", version);
		PINK_STAINED_GLASS.setName("glass_pink", version);
		PINK_STAINED_GLASS_PANE_TOP.setName("glass_pane_top_pink", version);
		PINK_TERRACOTTA.setName("hardened_clay_stained_pink", version);
		PINK_TULIP.setName("flower_tulip_pink", version);
		PINK_WOOL.setName("wool_colored_pink", version);
		PISTON_BOTTOM.setName("piston_bottom", version);
		PISTON_INNER.setName("piston_inner", version);
		PISTON_SIDE.setName("piston_side", version);
		PISTON_TOP.setName("piston_top_normal", version);
		PISTON_TOP_STICKY.setName("piston_top_sticky", version);
		PODZOL_SIDE.setName("dirt_podzol_side", version);
		PODZOL_TOP.setName("dirt_podzol_top", version);
		POLISHED_ANDESITE.setName("stone_andesite_smooth", version);
		POLISHED_DIORITE.setName("stone_diorite_smooth", version);
		POLISHED_GRANITE.setName("stone_granite_smooth", version);
		POPPY.setName("flower_rose", version);
		POTATOES_STAGE0.setName("potatoes_stage_0", version);
		POTATOES_STAGE1.setName("potatoes_stage_1", version);
		POTATOES_STAGE2.setName("potatoes_stage_2", version);
		POTATOES_STAGE3.setName("potatoes_stage_3", version);
		POWERED_RAIL.setName("rail_golden", version);
		POWERED_RAIL_ON.setName("rail_golden_powered", version);
		PRISMARINE.setName("prismarine_rough", version);
		PRISMARINE_BRICKS.setName("prismarine_bricks", version);
		PUMPKIN_SIDE.setName("pumpkin_side", version);
		PUMPKIN_STEM.setName("pumpkin_stem_disconnected", version);
		PUMPKIN_TOP.setName("pumpkin_top", version);
		PURPLE_CONCRETE.setName("concrete_purple", version);
		PURPLE_CONCRETE_POWDER.setName("concrete_powder_purple", version);
		PURPLE_GLAZED_TERRACOTTA.setName("glazed_terracotta_purple", version);
		PURPLE_STAINED_GLASS.setName("glass_purple", version);
		PURPLE_STAINED_GLASS_PANE_TOP.setName("glass_pane_top_purple", version);
		PURPLE_TERRACOTTA.setName("hardened_clay_stained_purple", version);
		PURPLE_WOOL.setName("wool_colored_purple", version);
		PURPUR_BLOCK.setName("purpur_block", version);
		PURPUR_PILLAR.setName("purpur_pillar", version);
		PURPUR_PILLAR_TOP.setName("purpur_pillar_top", version);
		QUARTZ_BLOCK_BOTTOM.setName("quartz_block_bottom", version);
		QUARTZ_BLOCK_SIDE.setName("quartz_block_side", version);
		QUARTZ_BLOCK_TOP.setName("quartz_block_top", version);
		QUARTZ_PILLAR.setName("quartz_block_lines", version);
		QUARTZ_PILLAR_TOP.setName("quartz_block_lines_top", version);
		RAIL.setName("rail_normal", version);
		RAIL_CORNER.setName("rail_normal_turned", version);
		RED_CONCRETE.setName("concrete_red", version);
		RED_CONCRETE_POWDER.setName("concrete_powder_red", version);
		RED_GLAZED_TERRACOTTA.setName("glazed_terracotta_red", version);
		RED_MUSHROOM.setName("mushroom_red", version);
		RED_MUSHROOM_BLOCK.setName("mushroom_block_skin_red", version);
		RED_NETHER_BRICKS.setName("red_nether_brick", version);
		RED_SAND.setName("red_sand", version);
		RED_SANDSTONE.setName("red_sandstone_normal", version);
		RED_SANDSTONE_BOTTOM.setName("red_sandstone_bottom", version);
		RED_SANDSTONE_TOP.setName("red_sandstone_top", version);
		RED_SHULKER_BOX.setName("shulker_top_red", version);
		RED_STAINED_GLASS.setName("glass_red", version);
		RED_STAINED_GLASS_PANE_TOP.setName("glass_pane_top_red", version);
		RED_TERRACOTTA.setName("hardened_clay_stained_red", version);
		RED_TULIP.setName("flower_tulip_red", version);
		RED_WOOL.setName("wool_colored_red", version);
		REDSTONE_BLOCK.setName("redstone_block", version);
		REDSTONE_DUST_DOT.setName("redstone_dust_dot", version);
		REDSTONE_DUST_LINE0.setName("redstone_dust_line0", version);
		REDSTONE_DUST_LINE1.setName("redstone_dust_line1", version);
		REDSTONE_DUST_OVERLAY.setName("redstone_dust_overlay", version);
		REDSTONE_LAMP.setName("redstone_lamp_off", version);
		REDSTONE_LAMP_ON.setName("redstone_lamp_on", version);
		REDSTONE_ORE.setName("redstone_ore", version);
		REDSTONE_TORCH.setName("redstone_torch_on", version);
		REDSTONE_TORCH_OFF.setName("redstone_torch_off", version);
		REPEATER.setName("repeater_off", version);
		REPEATER_ON.setName("repeater_on", version);
		REPEATING_COMMAND_BLOCK_BACK.setName("repeating_command_block_back", version);
		REPEATING_COMMAND_BLOCK_CONDITIONAL.setName("repeating_command_block_conditional", version);
		REPEATING_COMMAND_BLOCK_FRONT.setName("repeating_command_block_front", version);
		REPEATING_COMMAND_BLOCK_SIDE.setName("repeating_command_block_side", version);
		ROSE_BUSH_BOTTOM.setName("double_plant_rose_bottom", version);
		ROSE_BUSH_TOP.setName("double_plant_rose_top", version);
		SAND.setName("sand", version);
		SANDSTONE.setName("sandstone_normal", version);
		SANDSTONE_BOTTOM.setName("sandstone_bottom", version);
		SANDSTONE_TOP.setName("sandstone_sotp", version);
		SEA_LANTERN.setName("sea_lantern", version);
		SHULKER_BOX.setName("shulker_top_purple", version);
		SLIME_BLOCK.setName("slime", version);
		SNOW.setName("snow", version);
		SOUL_SAND.setName("soul_sand", version);
		SPAWNER.setName("mob_spawner", version);
		SPONGE.setName("sponge", version);
		SPRUCE_DOOR_BOTTOM.setName("door_spruce_lower", version);
		SPRUCE_DOOR_TOP.setName("door_spruce_upper", version);
		SPRUCE_LEAVES.setName("leaves_spruce", version);
		SPRUCE_LOG.setName("log_spruce", version);
		SPRUCE_LOG_TOP.setName("log_spruce_top", version);
		SPRUCE_PLANKS.setName("planks_spruce", version);
		SPRUCE_SAPLING.setName("sapling_spruce", version);
		STONE.setName("stone", version);
		STONE_BRICKS.setName("stonebrick", version);
		STONE_SLAB_SIDE.setName("stone_slab_side", version);
		STONE_SLAB_TOP.setName("stone_slab_top", version);
		STRUCTURE_BLOCK.setName("structure_block", version);
		STRUCTURE_BLOCK_CORNER.setName("structure_block_corner", version);
		STRUCTURE_BLOCK_DATA.setName("structure_block_data", version);
		STRUCTURE_BLOCK_LOAD.setName("structure_block_load", version);
		STRUCTURE_BLOCK_SAVE.setName("structure_block_save", version);
		SUGAR_CANE.setName("reeds", version);
		SUNFLOWER_BACK.setName("double_plant_sunflower_back", version);
		SUNFLOWER_BOTTOM.setName("double_plant_sunflower_bottom", version);
		SUNFLOWER_FRONT.setName("double_plant_sunflower_front", version);
		SUNFLOWER_TOP.setName("double_plant_sunflower_top", version);
		TALL_GRASS_BOTTOM.setName("double_plant_grass_bottom", version);
		TALL_GRASS_TOP.setName("double_plant_grass_top", version);
		TERRACOTTA.setName("hardened_clay", version);
		TNT_BOTTOM.setName("tnt_bottom", version);
		TNT_SIDE.setName("tnt_side", version);
		TNT_TOP.setName("tnt_top", version);
		TORCH.setName("torch_on", version);
		TRIPWIRE.setName("trip_wire", version);
		TRIPWIRE_HOOK.setName("trip_wire_source", version);
		VINE.setName("vine", version);
		WATER_FLOW.setName("water_flow", version);
		WATER_OVERLAY.setName("water_overlay", version);
		WATER_STILL.setName("water_still", version);
		WET_SPONGE.setName("sponge_wet", version);
		WHEAT_STAGE0.setName("wheat_stage_0", version);
		WHEAT_STAGE1.setName("wheat_stage_1", version);
		WHEAT_STAGE2.setName("wheat_stage_2", version);
		WHEAT_STAGE3.setName("wheat_stage_3", version);
		WHEAT_STAGE4.setName("wheat_stage_4", version);
		WHEAT_STAGE5.setName("wheat_stage_5", version);
		WHEAT_STAGE6.setName("wheat_stage_6", version);
		WHEAT_STAGE7.setName("wheat_stage_7", version);
		WHITE_CONCRETE.setName("concrete_white", version);
		WHITE_CONCRETE_POWDER.setName("concrete_powder_white", version);
		WHITE_GLAZED_TERRACOTTA.setName("glazed_terracotta_white", version);
		WHITE_SHULKER_BOX.setName("shulker_top_white", version);
		WHITE_STAINED_GLASS.setName("glass_white", version);
		WHITE_STAINED_GLASS_PANE_TOP.setName("glass_pane_top_white", version);
		WHITE_TERRACOTTA.setName("hardened_clay_stained_white", version);
		WHITE_TULIP.setName("flower_tulip_white", version);
		WHITE_WOOL.setName("wool_colored_white", version);
		YELLOW_CONCRETE.setName("concrete_yellow", version);
		YELLOW_CONCRETE_POWDER.setName("concrete_powder_yellow", version);
		YELLOW_GLAZED_TERRACOTTA.setName("glazed_terracotta_yellow", version);
		YELLOW_SHULKER_BOX.setName("shulker_top_yellow", version);
		YELLOW_STAINED_GLASS.setName("glass_yellow", version);
		YELLOW_STAINED_GLASS_PANE_TOP.setName("glass_pane_top_yellow", version);
		YELLOW_TERRACOTTA.setName("hardened_clay_stained_yellow", version);
		YELLOW_WOOL.setName("wool_colored_yellow", version);
		
		//items
		ACACIA_BOAT.setName("acacia_boat", version);
		ACACIA_DOOR.setName("door_acacia", version);
		APPLE.setName("apple", version);
		ARMOR_STAND.setName("wooden_armorstand", version);
		ARROW.setName("arrow", version);
		BAKED_POTATO.setName("potato_baked", version);
		BARRIER.setName("barrier", version);
		BEEF.setName("beef_raw", version);
		BEETROOT.setName("beetroot", version);
		BEETROOT_SEEDS.setName("beetroot_seeds", version);
		BEETROOT_SOUP.setName("beetroot_soup", version);
		BIRCH_BOAT.setName("birch_boat", version);
		BIRCH_DOOR.setName("door_birch", version);
		BLAZE_POWDER.setName("blaze_powder", version);
		BLAZE_ROD.setName("blaze_rod", version);
		BONE.setName("bone", version);
		BONE_MEAL.setName("dye_powder_white", version);
		BOOK.setName("book_normal", version);
		BOW.setName("bow_standby", version);
		BOW_PULLING_0.setName("bow_pulling_0", version);
		BOW_PULLING_1.setName("bow_pulling_1", version);
		BOW_PULLING_2.setName("bow_pulling_2", version);
		BOWL.setName("bowl", version);
		BREAD.setName("bread", version);
		BREWING_STAND_ITEM.setName("brewing_stand", version);
		BRICK.setName("brick", version);
		BROKEN_ELYTRA.setName("broken_elytra", version);
		BUCKET.setName("bucket_empty", version);
		CACTUS_GREEN.setName("dye_powder_green", version);
		CAKE.setName("cake", version);
		CARROT.setName("carrot", version);
		CARROT_ON_A_STICK.setName("carrot_on_a_stick", version);
		CAULDRON.setName("cauldron", version);
		CHAINMAIL_BOOTS.setName("chainmail_boots", version);
		CHAINMAIL_CHESTPLATE.setName("chainmail_chestplate.pn", version);
		CHAINMAIL_HELMET.setName("chainmail_helmet", version);
		CHAINMAIL_LEGGINGS.setName("chainmail_leggings", version);
		CHARCOAL.setName("charcoal", version);
		CHEST_MINECART.setName("minecart_chest", version);
		CHICKEN.setName("chicken_raw", version);
		CHORUS_FRUIT.setName("chorus_fruit", version);
		CLAY_BALL.setName("clay_ball", version);
		CLOCK_00.setName("clock_00", version);
		CLOCK_01.setName("clock_01", version);
		CLOCK_02.setName("clock_02", version);
		CLOCK_03.setName("clock_03", version);
		CLOCK_04.setName("clock_04", version);
		CLOCK_05.setName("clock_05", version);
		CLOCK_06.setName("clock_06", version);
		CLOCK_07.setName("clock_07", version);
		CLOCK_08.setName("clock_08", version);
		CLOCK_09.setName("clock_09", version);
		CLOCK_10.setName("clock_10", version);
		CLOCK_11.setName("clock_11", version);
		CLOCK_12.setName("clock_12", version);
		CLOCK_13.setName("clock_13", version);
		CLOCK_14.setName("clock_14", version);
		CLOCK_15.setName("clock_15", version);
		CLOCK_16.setName("clock_16", version);
		CLOCK_17.setName("clock_17", version);
		CLOCK_18.setName("clock_18", version);
		CLOCK_19.setName("clock_19", version);
		CLOCK_20.setName("clock_20", version);
		CLOCK_21.setName("clock_21", version);
		CLOCK_22.setName("clock_22", version);
		CLOCK_23.setName("clock_23", version);
		CLOCK_24.setName("clock_24", version);
		CLOCK_25.setName("clock_25", version);
		CLOCK_26.setName("clock_26", version);
		CLOCK_27.setName("clock_27", version);
		CLOCK_28.setName("clock_28", version);
		CLOCK_29.setName("clock_29", version);
		CLOCK_30.setName("clock_30", version);
		CLOCK_31.setName("clock_31", version);
		CLOCK_32.setName("clock_32", version);
		CLOCK_33.setName("clock_33", version);
		CLOCK_34.setName("clock_34", version);
		CLOCK_35.setName("clock_35", version);
		CLOCK_36.setName("clock_36", version);
		CLOCK_37.setName("clock_37", version);
		CLOCK_38.setName("clock_38", version);
		CLOCK_39.setName("clock_39", version);
		CLOCK_40.setName("clock_40", version);
		CLOCK_41.setName("clock_41", version);
		CLOCK_42.setName("clock_42", version);
		CLOCK_43.setName("clock_43", version);
		CLOCK_44.setName("clock_44", version);
		CLOCK_45.setName("clock_45", version);
		CLOCK_46.setName("clock_46", version);
		CLOCK_47.setName("clock_47", version);
		CLOCK_48.setName("clock_48", version);
		CLOCK_49.setName("clock_49", version);
		CLOCK_50.setName("clock_50", version);
		CLOCK_51.setName("clock_51", version);
		CLOCK_52.setName("clock_52", version);
		CLOCK_53.setName("clock_53", version);
		CLOCK_54.setName("clock_54", version);
		CLOCK_55.setName("clock_55", version);
		CLOCK_56.setName("clock_56", version);
		CLOCK_57.setName("clock_57", version);
		CLOCK_58.setName("clock_58", version);
		CLOCK_59.setName("clock_59", version);
		CLOCK_60.setName("clock_60", version);
		CLOCK_61.setName("clock_61", version);
		CLOCK_62.setName("clock_62", version);
		CLOCK_63.setName("clock_63", version);
		COAL.setName("coal", version);
		COCOA_BEANS.setName("dye_powder_brown", version);
		COD.setName("fish_cod_raw", version);
		COMMAND_BLOCK_MINECART.setName("minecart_command_block.", version);
		COMPASS_00.setName("comparator", version);
		COMPASS_01.setName("compass_00", version);
		COMPASS_02.setName("compass_01", version);
		COMPASS_03.setName("compass_02", version);
		COMPASS_04.setName("compass_03", version);
		COMPASS_05.setName("compass_04", version);
		COMPASS_06.setName("compass_05", version);
		COMPASS_07.setName("compass_06", version);
		COMPASS_08.setName("compass_07", version);
		COMPASS_09.setName("compass_08", version);
		COMPASS_10.setName("compass_09", version);
		COMPASS_11.setName("compass_10", version);
		COMPASS_12.setName("compass_11", version);
		COMPASS_13.setName("compass_12", version);
		COMPASS_14.setName("compass_13", version);
		COMPASS_15.setName("compass_14", version);
		COMPASS_16.setName("compass_15", version);
		COMPASS_17.setName("compass_16", version);
		COMPASS_18.setName("compass_17", version);
		COMPASS_19.setName("compass_18", version);
		COMPASS_20.setName("compass_19", version);
		COMPASS_21.setName("compass_20", version);
		COMPASS_22.setName("compass_21", version);
		COMPASS_23.setName("compass_22", version);
		COMPASS_24.setName("compass_23", version);
		COMPASS_25.setName("compass_24", version);
		COMPASS_26.setName("compass_25", version);
		COMPASS_27.setName("compass_26", version);
		COMPASS_28.setName("compass_27", version);
		COMPASS_29.setName("compass_28", version);
		COMPASS_30.setName("compass_29", version);
		COMPASS_31.setName("compass_30", version);
		COOKED_BEEF.setName("compass_31", version);
		COOKED_CHICKEN.setName("beef_cooked", version);
		COOKED_COD.setName("chicken_cooked", version);
		COOKED_MUTTON.setName("fish_cod_cooked", version);
		COOKED_PORKCHOP.setName("mutton_cooked", version);
		COOKED_RABBIT.setName("porkchop_cooked", version);
		COOKED_SALMON.setName("rabbit_cooked", version);
		COOKIE.setName("fish_salmon_cooked", version);
		CYAN_DYE.setName("cookie", version);
		DANDELION_YELLOW.setName("dye_powder_cyan", version);
		DARK_OAK_BOAT.setName("dye_powder_yellow", version);
		DARK_OAK_DOOR.setName("dark_oak_boat", version);
		DIAMOND.setName("door_dark_oak", version);
		DIAMOND_AXE.setName("diamond", version);
		DIAMOND_BOOTS.setName("diamond_axe", version);
		DIAMOND_CHESTPLATE.setName("diamond_boots", version);
		DIAMOND_HELMET.setName("diamond_chestplate", version);
		DIAMOND_HOE.setName("diamond_helmet", version);
		DIAMOND_HORSE_ARMOR.setName("diamond_hoe", version);
		DIAMOND_LEGGINGS.setName("diamond_horse_armor", version);
		DIAMOND_PICKAXE.setName("diamond_leggings", version);
		DIAMOND_SHOVEL.setName("diamond_pickaxe", version);
		DIAMOND_SWORD.setName("diamond_shovel", version);
		DRAGON_BREATH.setName("diamond_sword", version);
		EGG.setName("dragon_breath", version);
		ELYTRA.setName("egg", version);
		EMERALD.setName("elytra", version);
		EMPTY_ARMOR_SLOT_BOOTS.setName("emerald", version);
		EMPTY_ARMOR_SLOT_CHESTPLATE.setName("empty_armor_slot_boots.", version);
		EMPTY_ARMOR_SLOT_HELMET.setName("empty_armor_slot_chestp", version);
		EMPTY_ARMOR_SLOT_LEGGINGS.setName("empty_armor_slot_helmet", version);
		EMPTY_ARMOR_SLOT_SHIELD.setName("empty_armor_slot_leggin", version);
		ENCHANTED_BOOK.setName("empty_armor_slot_shield", version);
		DIR_END_CRYSTAL.setName("book_enchanted", version);
		ENDER_EYE.setName("end_crystal", version);
		ENDER_PEARL.setName("ender_eye", version);
		EXPERIENCE_BOTTLE.setName("ender_pearl", version);
		FEATHER.setName("experience_bottle", version);
		FERMENTED_SPIDER_EYE.setName("feather", version);
		FILLED_MAP.setName("spider_eye_fermented.pn", version);
		FILLED_MAP_MARKINGS.setName("map_filled", version);
		FIRE_CHARGE.setName("map_filled_markings", version);
		FIREWORK_ROCKET.setName("fireball", version);
		FIREWORK_STAR.setName("fireworks", version);
		FIREWORK_STAR_OVERLAY.setName("fireworks_charge", version);
		FISHING_ROD.setName("fireworks_charge_overla", version);
		FISHING_ROD_CAST.setName("fishing_rod_uncast", version);
		FLINT.setName("fishing_rod_cast", version);
		FLINT_AND_STEEL.setName("flint", version);
		FLOWER_POT_ITEM.setName("flint_and_steel", version);
		FURNACE_MINECART.setName("flower_pot", version);
		GHAST_TEAR.setName("minecart_furnace", version);
		GLASS_BOTTLE.setName("ghast_tear", version);
		GLISTERING_MELON_SLICE.setName("potion_bottle_empty", version);
		GLOWSTONE_DUST.setName("melon_speckled", version);
		GOLD_INGOT.setName("glowstone_dust", version);
		GOLD_NUGGET.setName("gold_ingot", version);
		GOLDEN_APPLE.setName("gold_nugget", version);
		GOLDEN_AXE.setName("apple_golden", version);
		GOLDEN_BOOTS.setName("gold_axe", version);
		GOLDEN_CARROT.setName("gold_boots", version);
		GOLDEN_CHESTPLATE.setName("carrot_golden", version);
		GOLDEN_HELMET.setName("gold_chestplate", version);
		GOLDEN_HOE.setName("gold_helmet", version);
		GOLDEN_HORSE_ARMOR.setName("gold_hoe", version);
		GOLDEN_LEGGINGS.setName("gold_horse_armor", version);
		GOLDEN_PICKAXE.setName("gold_leggings", version);
		GOLDEN_SHOVEL.setName("gold_pickaxe", version);
		GOLDEN_SWORD.setName("gold_shovel", version);
		GRAY_DYE.setName("gold_sword", version);
		GUNPOWDER.setName("dye_powder_gray", version);
		HOPPER.setName("gunpowder", version);
		HOPPER_MINECART.setName("hopper", version);
		INK_SAC.setName("minecart_hopper", version);
		IRON_AXE.setName("dye_powder_black", version);
		IRON_BOOTS.setName("iron_axe", version);
		IRON_CHESTPLATE.setName("iron_boots", version);
		IRON_DOOR.setName("iron_chestplate", version);
		IRON_HELMET.setName("door_iron", version);
		IRON_HOE.setName("iron_helmet", version);
		IRON_HORSE_ARMOR.setName("iron_hoe", version);
		IRON_INGOT.setName("iron_horse_armor", version);
		IRON_LEGGINGS.setName("iron_ingot", version);
		IRON_NUGGET.setName("iron_leggings", version);
		IRON_PICKAXE.setName("iron_nugget", version);
		IRON_SHOVEL.setName("iron_pickaxe", version);
		IRON_SWORD.setName("iron_shovel", version);
		ITEM_FRAME_ITEM.setName("iron_sword", version);
		JUNGLE_BOAT.setName("item_frame", version);
		JUNGLE_DOOR.setName("jungle_boat", version);
		KNOWLEDGE_BOOK.setName("door_jungle", version);
		LAPIS_LAZULI.setName("knowledge_book", version);
		LAVA_BUCKET.setName("dye_powder_blue", version);
		LEAD.setName("bucket_lava", version);
		LEATHER.setName("lead", version);
		LEATHER_BOOTS.setName("leather", version);
		LEATHER_BOOTS_OVERLAY.setName("leather_boots", version);
		LEATHER_CHESTPLATE.setName("leather_boots_overlay.p", version);
		LEATHER_CHESTPLATE_OVERLAY.setName("leather_chestplate", version);
		LEATHER_HELMET.setName("leather_chestplate_over", version);
		LEATHER_HELMET_OVERLAY.setName("leather_helmet", version);
		LEATHER_LEGGINGS.setName("leather_helmet_overlay.", version);
		LEATHER_LEGGINGS_OVERLAY.setName("leather_leggings", version);
		LIGHT_BLUE_DYE.setName("leather_leggings_overla", version);
		LIGHT_GRAY_DYE.setName("dye_powder_light_blue.p", version);
		LIME_DYE.setName("dye_powder_silver", version);
		LINGERING_POTION.setName("dye_powder_lime", version);
		MAGENTA_DYE.setName("potion_bottle_lingering", version);
		MAGMA_CREAM.setName("dye_powder_magenta", version);
		DIR_MAP.setName("magma_cream", version);
		MELON_SEEDS.setName("map_empty", version);
		MELON_SLICE.setName("seeds_melon", version);
		MILK_BUCKET.setName("melon", version);
		MINECART.setName("bucket_milk", version);
		MUSHROOM_STEW.setName("minecart_normal", version);
		MUSIC_DISC_11.setName("mushroom_stew", version);
		MUSIC_DISC_13.setName("record_11", version);
		MUSIC_DISC_BLOCKS.setName("record_13", version);
		MUSIC_DISC_CAT.setName("record_blocks", version);
		MUSIC_DISC_CHIRP.setName("record_cat", version);
		MUSIC_DISC_FAR.setName("record_chirp", version);
		MUSIC_DISC_MALL.setName("record_far", version);
		MUSIC_DISC_MELLOHI.setName("record_mall", version);
		MUSIC_DISC_STAL.setName("record_mellohi", version);
		MUSIC_DISC_STRAD.setName("record_stal", version);
		MUSIC_DISC_WAIT.setName("record_strad", version);
		MUSIC_DISC_WARD.setName("record_wait", version);
		MUTTON.setName("record_ward", version);
		NAME_TAG.setName("mutton_raw", version);
		NETHER_BRICK.setName("name_tag", version);
		NETHER_STAR.setName("netherbrick", version);
		NETHER_WART.setName("nether_star", version);
		OAK_BOAT.setName("nether_wart", version);
		OAK_DOOR.setName("oak_boat", version);
		ORANGE_DYE.setName("door_wood", version);
		PAINTING.setName("dye_powder_orange", version);
		PAPER.setName("painting", version);
		PINK_DYE.setName("paper", version);
		POISONOUS_POTATO.setName("dye_powder_pink", version);
		POPPED_CHORUS_FRUIT.setName("potato_poisonous", version);
		PORKCHOP.setName("chorus_fruit_popped", version);
		POTATO.setName("porkchop_raw", version);
		POTION.setName("potato", version);
		POTION_OVERLAY.setName("potion_bottle_drinkable", version);
		PRISMARINE_CRYSTALS.setName("potion_overlay", version);
		PRISMARINE_SHARD.setName("prismarine_crystals", version);
		PUFFERFISH.setName("prismarine_shard", version);
		PUFFERFISH_BUCKET.setName("fish_pufferfish_raw", version);
		PUMPKIN_PIE.setName("pumpkin_pie", version);
		PUMPKIN_SEEDS.setName("seeds_pumpkin", version);
		PURPLE_DYE.setName("dye_powder_purple", version);
		QUARTZ.setName("quartz", version);
		RABBIT.setName("rabbit_raw", version);
		RABBIT_FOOT.setName("rabbit_foot", version);
		RABBIT_HIDE.setName("rabbit_hide", version);
		RABBIT_STEW.setName("rabbit_stew", version);
		REDSTONE.setName("redstone_dust", version);
		REPEATER_ITEM.setName("dye_powder_red", version);
		ROSE_RED.setName("repeater", version);
		ROTTEN_FLESH.setName("rotten_flesh", version);
		RUBY.setName("ruby", version);
		SADDLE.setName("saddle", version);
		SALMON.setName("fish_salmon_raw", version);
		SHEARS.setName("shears", version);
		SHULKER_SHELL.setName("shulker_shell", version);
		SIGN.setName("sign", version);
		SLIME_BALL.setName("slimeball", version);
		SNOWBALL.setName("snowball", version);
		SPAWN_EGG.setName("spawn_egg", version);
		SPAWN_EGG_OVERLAY.setName("spawn_egg_overlay", version);
		SPECTRAL_ARROW.setName("spectral_arrow", version);
		SPIDER_EYE.setName("spider_eye", version);
		SPLASH_POTION.setName("potion_bottle_splash.pn", version);
		SPRUCE_BOAT.setName("spruce_boat", version);
		SPRUCE_DOOR.setName("door_spruce", version);
		STICK.setName("stick", version);
		STONE_AXE.setName("stone_axe", version);
		STONE_HOE.setName("stone_hoe", version);
		STONE_PICKAXE.setName("stone_pickaxe", version);
		STONE_SHOVEL.setName("stone_shovel", version);
		STONE_SWORD.setName("stone_sword", version);
		STRING.setName("string", version);
		STRUCTURE_VOID.setName("structure_void", version);
		SUGAR.setName("sugar", version);
		SUGAR_CANE_ITEM.setName("reeds", version);
		TIPPED_ARROW_BASE.setName("tipped_arrow_base", version);
		TIPPED_ARROW_HEAD.setName("tipped_arrow_head", version);
		TNT_MINECART.setName("minecart_tnt", version);
		TOTEM_OF_UNDYING.setName("totem", version);
		TROPICAL_FISH.setName("fish_clownfish_raw", version);
		WATER_BUCKET.setName("bucket_water", version);
		WHEAT.setName("wheat", version);
		WHEAT_SEEDS.setName("seeds_wheat", version);
		WOODEN_AXE.setName("wood_axe", version);
		WOODEN_HOE.setName("wood_hoe", version);
		WOODEN_PICKAXE.setName("wood_pickaxe", version);
		WOODEN_SHOVEL.setName("wood_shovel", version);
		WOODEN_SWORD.setName("wood_sword", version);
		WRITABLE_BOOK.setName("book_writable", version);
		WRITTEN_BOOK.setName("book_written", version);
		
		//colormap
		FOLIAGE.setName("foliage", version);
		GRASS_COLORMAP.setName("grass", version);
		
		//entity
		ALEX.setName("alex", version);
		ARMORSTAND_WOOD.setName("wood", version);
		ARROW_ENTITY.setName("arrow", version);
		BANNER_BASE.setName("base", version);
		BANNER_BORDER.setName("border", version);
		BANNER_BRICKS.setName("bricks", version);
		BANNER_CIRCLE.setName("circle", version);
		BANNER_CREEPER.setName("creeper", version);
		BANNER_CROSS.setName("cross", version);
		BANNER_CURLY_BORDER.setName("curly_border", version);
		BANNER_DIAGONAL_LEFT.setName("diagonal_left", version);
		BANNER_DIAGONAL_RIGHT.setName("diagonal_right", version);
		BANNER_DIAGONAL_UP_LEFT.setName("diagonal_up_left", version);
		BANNER_DIAGONAL_UP_RIGHT.setName("diagonal_up_right", version);
		BANNER_FLOWER.setName("flower", version);
		BANNER_GRADIENT.setName("gradient_up", version);
		BANNER_GRADIENT_UP.setName("gradient", version);
		BANNER_HALF_HORIZONTAL.setName("half_horizontal_bottom", version);
		BANNER_HALF_HORIZONTAL_BOTTOM.setName("half_horizontal", version);
		BANNER_HALF_VERTICAL.setName("half_vertical_right", version);
		BANNER_HALF_VERTICAL_RIGHT.setName("half_vertical", version);
		BANNER_MOJANG.setName("mojang", version);
		BANNER_RHOMBUS.setName("rhombus", version);
		BANNER_SKULL.setName("skull", version);
		BANNER_SMALL_STRIPES.setName("small_stripes", version);
		BANNER_SQUARE_BOTTOM_LEFT.setName("square_bottom_left", version);
		BANNER_SQUARE_BOTTOM_RIGHT.setName("square_bottom_right", version);
		BANNER_SQUARE_TOP_LEFT.setName("square_top_left", version);
		BANNER_SQUARE_TOP_RIGHT.setName("square_top_right", version);
		BANNER_STRAIGHT_CROSS.setName("straight_cross", version);
		BANNER_STRIPE_BOTTOM.setName("stripe_bottom", version);
		BANNER_STRIPE_CENTER.setName("stripe_center", version);
		BANNER_STRIPE_DOWNLEFT.setName("stripe_downleft", version);
		BANNER_STRIPE_DOWNRIGHT.setName("stripe_downright", version);
		BANNER_STRIPE_LEFT.setName("stripe_left", version);
		BANNER_STRIPE_MIDDLE.setName("stripe_middle", version);
		BANNER_STRIPE_RIGHT.setName("stripe_right", version);
		BANNER_STRIPE_TOP.setName("stripe_top", version);
		BANNER_TRIANGLE_BOTTOM.setName("triangle_bottom", version);
		BANNER_TRIANGLE_TOP.setName("triangle_top", version);
		BANNER_TRIANGLES_BOTTOM.setName("triangles_bottom", version);
		BANNER_TRIANGLES_TOP.setName("triangles_top", version);
		BANNER_BASE.setName("banner_base", version);
		BAT.setName("bat", version);
		BEACON_BEAM.setName("beacon_beam", version);
		BEAR_POLARBEAR.setName("polarbear", version);
		BED_BLACK.setName("black", version);
		BED_BLUE.setName("blue", version);
		BED_BROWN.setName("brown", version);
		BED_CYAN.setName("cyan", version);
		BED_GRAY.setName("gray", version);
		BED_GREEN.setName("green", version);
		BED_LIGHT_BLUE.setName("light_blue", version);
		BED_LIGHT_GRAY.setName("silver", version);
		BED_LIME.setName("lime", version);
		BED_MAGENTA.setName("magenta", version);
		BED_ORANGE.setName("orange", version);
		BED_PINK.setName("pink", version);
		BED_PURPLE.setName("purple", version);
		BED_RED.setName("red", version);
		BED_WHITE.setName("white", version);
		BED_YELLOW.setName("yellow", version);
		BLAZE.setName("blaze", version);
		BOAT_ACACIA.setName("boat_acacia", version);
		BOAT_BIRCH.setName("boat_birch", version);
		BOAT_DARK_OAK.setName("boat_darkoak", version);
		BOAT_JUNGLE.setName("boat_jungle", version);
		BOAT_OAK.setName("boat_oak", version);
		BOAT_SPRUCE.setName("boat_spruce", version);
		CAT_BLACK.setName("black", version);
		CAT_OCELOT.setName("ocelot", version);
		CAT_RED.setName("red", version);
		CAT_SIAMESE.setName("siamese", version);
		CHEST_CHRISTMAS.setName("christmas", version);
		CHEST_CHRISTMAS_DOUBLE.setName("christmas_double", version);
		CHEST_ENDER.setName("ender", version);
		CHEST_NORMAL.setName("normal", version);
		CHEST_NORMAL_DOUBLE.setName("normal_double", version);
		CHEST_TRAPPED.setName("trapped", version);
		CHEST_TRAPPED_DOUBLE.setName("trapped_double", version);
		CHICKEN_ENTITY.setName("chicken", version);
		COW_COW.setName("cow", version);
		COW_MOOSHROOM.setName("mooshroom", version);
		DIR_CREEPER.setName("creeper", version);
		CREEPER_CREEPER_ARMOR.setName("creeper_armor", version);
		ELYTRA_ENTITY.setName("elytra", version);
		ENCHANTING_TABLE_BOOK.setName("enchanting_table_book", version);
		END_CRYSTAL_END_CRYSTAL.setName("endercrystal", version);
		END_CRYSTAL_END_CRYSTAL_BEAM.setName("endercrystal_beam", version);
		END_GATEWAY_BEAM.setName("end_gateway_beam", version);
		END_PORTAL.setName("end_portal", version);
		ENDERDRAGON_DRAGON.setName("dragon", version);
		ENDERDRAGON_DRAGON_EXPLODING.setName("dragon_exploding", version);
		ENDERDRAGON_DRAGON_EYES.setName("dragon_eyes", version);
		ENDERDRAGON_DRAGON_FIREBALL.setName("dragon_fireball", version);
		DIR_ENDERMAN.setName("enderman", version);
		ENDERMAN_ENDERMAN_EYES.setName("enderman_eyes", version);
		ENDERMITE.setName("endermite", version);
		EXPERIENCE_ORB.setName("experience_orb", version);
		EXPLOSION.setName("explosion", version);
		DIR_GHAST.setName("ghast", version);
		GHAST_GHAST_SHOOTING.setName("ghast_shooting", version);
		GUARDIAN.setName("guardian", version);
		GUARDIAN_BEAM.setName("guardian_beam", version);
		GUARDIAN_ELDER.setName("guardian_elder", version);
		HORSE_ARMOR_HORSE_ARMOR_DIAMOND.setName("horse_armor_diamond", version);
		HORSE_ARMOR_HORSE_ARMOR_GOLD.setName("horse_armor_gold", version);
		HORSE_ARMOR_HORSE_ARMOR_IRON.setName("horse_armor_iron", version);
		HORSE_DONKEY.setName("donkey", version);
		HORSE_HORSE_BLACK.setName("horse_black", version);
		HORSE_HORSE_BROWN.setName("horse_brown", version);
		HORSE_HORSE_CHESTNUT.setName("horse_chestnut", version);
		HORSE_HORSE_CREAMY.setName("horse_creamy", version);
		HORSE_HORSE_DARKBROWN.setName("horse_darkbrown", version);
		HORSE_HORSE_GRAY.setName("horse_gray", version);
		HORSE_HORSE_MARKINGS_BLACKDOTS.setName("horse_markings_blackdots", version);
		HORSE_HORSE_MARKINGS_WHITE.setName("horse_markings_white", version);
		HORSE_HORSE_MARKINGS_WHITEDOTS.setName("horse_markings_whitedots", version);
		HORSE_HORSE_MARKINGS_WHITEFIELD.setName("horse_markings_whitefield", version);
		HORSE_HORSE_SKELETON.setName("horse_skeleton", version);
		HORSE_HORSE_WHITE.setName("horse_white", version);
		HORSE_HORSE_ZOMBIE.setName("horse_zombie", version);
		HORSE_MULE.setName("mule", version);
		ILLAGER_EVOKER.setName("evoker", version);
		ILLAGER_EVOKER_FANGS.setName("fangs", version);
		ILLAGER_ILLUSIONER.setName("illusionist", version);
		ILLAGER_VEX.setName("vex", version);
		ILLAGER_VEX_CHARGING.setName("vex_charging", version);
		ILLAGER_VINDICATOR.setName("vindicator", version);
		IRON_GOLEM.setName("iron_golem", version);
		LEAD_KNOT.setName("lead_knot", version);
		LLAMA_BROWN.setName("llama_brown", version);
		LLAMA_CREAMY.setName("llama_creamy", version);
		LLAMA_DECOR_BLACK.setName("decor_black", version);
		LLAMA_DECOR_BLUE.setName("decor_blue", version);
		LLAMA_DECOR_BROWN.setName("decor_brown", version);
		LLAMA_DECOR_CYAN.setName("decor_cyan", version);
		LLAMA_DECOR_GRAY.setName("decor_gray", version);
		LLAMA_DECOR_GREEN.setName("decor_green", version);
		LLAMA_DECOR_LIGHT_BLUE.setName("decor_light_blue", version);
		LLAMA_DECOR_LIGHT_GRAY.setName("decor_silver", version);
		LLAMA_DECOR_LIME.setName("decor_lime", version);
		LLAMA_DECOR_MAGENTA.setName("decor_magenta", version);
		LLAMA_DECOR_ORANGE.setName("decor_orange", version);
		LLAMA_DECOR_PINK.setName("decor_pink", version);
		LLAMA_DECOR_PURPLE.setName("decor_purple", version);
		LLAMA_DECOR_RED.setName("decor_red", version);
		LLAMA_DECOR_WHITE.setName("decor_white", version);
		LLAMA_DECOR_YELLOW.setName("decor_yellow", version);
		LLAMA_GRAY.setName("llama_gray", version);
		LLAMA_SPIT.setName("spit", version);
		LLAMA_WHITE.setName("llama_white", version);
		LLAMA.setName("llama", version);
		MINECART_ENTITY.setName("minecart", version);
		PARROT_PARROT_BLUE.setName("parrot_blue", version);
		PARROT_PARROT_GREEN.setName("parrot_green", version);
		PARROT_PARROT_GREY.setName("parrot_grey", version);
		PARROT_PARROT_RED_BLUE.setName("parrot_red_blue", version);
		PARROT_PARROT_YELLOW_BLUE.setName("parrot_yellow_blue", version);
		DIR_PIG.setName("pig", version);
		PIG_PIG_SADDLE.setName("pig_saddle", version);
		PROJECTILES_ARROW.setName("arrow", version);
		PROJECTILES_SPECTRAL_ARROW.setName("spectral_arrow", version);
		PROJECTILES_TIPPED_ARROW.setName("tipped_arrow", version);
		RABBIT_BLACK.setName("black", version);
		RABBIT_BROWN.setName("brown", version);
		RABBIT_CAERBANNOG.setName("caerbannog", version);
		RABBIT_GOLD.setName("gold", version);
		RABBIT_SALT.setName("salt", version);
		RABBIT_TOAST.setName("toast", version);
		RABBIT_WHITE.setName("white", version);
		RABBIT_WHITE_SPLOTCHED.setName("white_splotched", version);
		DIR_SHEEP.setName("sheep", version);
		SHEEP_SHEEP_FUR.setName("sheep_fur", version);
		SHIELD_BASE.setName("base", version);
		SHIELD_BORDER.setName("border", version);
		SHIELD_BRICKS.setName("bricks", version);
		SHIELD_CIRCLE.setName("circle", version);
		SHIELD_CREEPER.setName("creeper", version);
		SHIELD_CROSS.setName("cross", version);
		SHIELD_CURLY_BORDER.setName("curly_border", version);
		SHIELD_DIAGONAL_LEFT.setName("diagonal_left", version);
		SHIELD_DIAGONAL_RIGHT.setName("diagonal_right", version);
		SHIELD_DIAGONAL_UP_LEFT.setName("diagonal_up_left", version);
		SHIELD_DIAGONAL_UP_RIGHT.setName("diagonal_up_right", version);
		SHIELD_FLOWER.setName("flower", version);
		SHIELD_GRADIENT.setName("gradient_up", version);
		SHIELD_GRADIENT_UP.setName("gradient", version);
		SHIELD_HALF_HORIZONTAL.setName("half_horizontal_bottom", version);
		SHIELD_HALF_HORIZONTAL_BOTTOM.setName("half_horizontal", version);
		SHIELD_HALF_VERTICAL.setName("half_vertical_right", version);
		SHIELD_HALF_VERTICAL_RIGHT.setName("half_vertical", version);
		SHIELD_MOJANG.setName("mojang", version);
		SHIELD_RHOMBUS.setName("rhombus", version);
		SHIELD_SKULL.setName("skull", version);
		SHIELD_SMALL_STRIPES.setName("small_stripes", version);
		SHIELD_SQUARE_BOTTOM_LEFT.setName("square_bottom_left", version);
		SHIELD_SQUARE_BOTTOM_RIGHT.setName("square_bottom_right", version);
		SHIELD_SQUARE_TOP_LEFT.setName("square_top_left", version);
		SHIELD_SQUARE_TOP_RIGHT.setName("square_top_right", version);
		SHIELD_STRAIGHT_CROSS.setName("straight_cross", version);
		SHIELD_STRIPE_BOTTOM.setName("stripe_bottom", version);
		SHIELD_STRIPE_CENTER.setName("stripe_center", version);
		SHIELD_STRIPE_DOWNLEFT.setName("stripe_downleft", version);
		SHIELD_STRIPE_DOWNRIGHT.setName("stripe_downright", version);
		SHIELD_STRIPE_LEFT.setName("stripe_left", version);
		SHIELD_STRIPE_MIDDLE.setName("stripe_middle", version);
		SHIELD_STRIPE_RIGHT.setName("stripe_right", version);
		SHIELD_STRIPE_TOP.setName("stripe_top", version);
		SHIELD_TRIANGLE_BOTTOM.setName("triangle_bottom", version);
		SHIELD_TRIANGLE_TOP.setName("triangle_top", version);
		SHIELD_TRIANGLES_BOTTOM.setName("triangles_bottom", version);
		SHIELD_TRIANGLES_TOP.setName("triangles_top", version);
		SHIELD_BASE.setName("shield_base", version);
		SHIELD_BASE_NOPATTERN.setName("shield_base_nopattern", version);
		SHULKER_SHULKER.setName("shulker_purple", version);
		SHULKER_SHULKER_BLACK.setName("shulker_black", version);
		SHULKER_SHULKER_BLUE.setName("shulker_blue", version);
		SHULKER_SHULKER_BROWN.setName("shulker_brown", version);
		SHULKER_SHULKER_CYAN.setName("shulker_cyan", version);
		SHULKER_SHULKER_GRAY.setName("shulker_gray", version);
		SHULKER_SHULKER_GREEN.setName("shulker_green", version);
		SHULKER_SHULKER_LIGHT_BLUE.setName("shulker_light_blue", version);
		SHULKER_SHULKER_LIGHT_GRAY.setName("shulker_silver", version);
		SHULKER_SHULKER_LIME.setName("shulker_lime", version);
		SHULKER_SHULKER_MAGENTA.setName("shulker_magenta", version);
		SHULKER_SHULKER_ORANGE.setName("shulker_orange", version);
		SHULKER_SHULKER_PINK.setName("shulker_pink", version);
		SHULKER_SHULKER_RED.setName("shulker_red", version);
		SHULKER_SHULKER_WHITE.setName("shulker_white", version);
		SHULKER_SHULKER_YELLOW.setName("shulker_yellow", version);
		SHULKER_SPARK.setName("spark", version);
		SIGN_BLOCK.setName("sign", version);
		SILVERFISH.setName("silverfish", version);
		SKELETON_SKELETON.setName("skeleton", version);
		SKELETON_STRAY.setName("stray", version);
		SKELETON_STRAY_OVERLAY.setName("stray_overlay", version);
		SKELETON_WITHER_SKELETON.setName("wither_skeleton", version);
		SLIME_MAGMACUBE.setName("magmacube", version);
		SLIME_SLIME.setName("slime", version);
		SNOW_GOLEM.setName("snowman", version);
		SPIDER_CAVE_SPIDER.setName("cave_spider", version);
		SPIDER_SPIDER.setName("spider", version);
		SPIDER_EYES.setName("spider_eyes", version);
		SQUID.setName("squid", version);
		STEVE.setName("steve", version);
		SWEEP.setName("sweep", version);
		VILLAGER_BUTCHER.setName("butcher", version);
		VILLAGER_FARMER.setName("farmer", version);
		VILLAGER_LIBRARIAN.setName("librarian", version);
		VILLAGER_PRIEST.setName("priest", version);
		VILLAGER_SMITH.setName("smith", version);
		VILLAGER_VILLAGER.setName("villager", version);
		WITCH.setName("witch", version);
		DIR_WITHER.setName("wither", version); //fixme
		WITHER_WITHER_ARMOR.setName("wither_armor", version);
		WITHER_WITHER_INVULNERABLE.setName("wither_invulnerable", version);
		WOLF_WOLF.setName("wolf", version);
		WOLF_WOLF_ANGRY.setName("wolf_angry", version);
		WOLF_WOLF_COLLAR.setName("wolf_collar", version);
		WOLF_WOLF_TAME.setName("wolf_tame", version);
		ZOMBIE_HUSK.setName("husk", version);
		ZOMBIE_ZOMBIE.setName("zombie", version);
		ZOMBIE_ZOMBIE_VILLAGER.setName("zombie_villager", version);
		ZOMBIE_PIGMAN.setName("zombie_pigman", version);
		ZOMBIE_VILLAGER_ZOMBIE_BUTCHER.setName("zombie_butcher", version);
		ZOMBIE_VILLAGER_ZOMBIE_FARMER.setName("zombie_farmer", version);
		ZOMBIE_VILLAGER_ZOMBIE_LIBRARIAN.setName("zombie_librarian", version);
		ZOMBIE_VILLAGER_ZOMBIE_PRIEST.setName("zombie_priest", version);
		ZOMBIE_VILLAGER_ZOMBIE_SMITH.setName("zombie_smith", version);
		ZOMBIE_VILLAGER_ZOMBIE_VILLAGER.setName("zombie_villager", version);
		
		//environment
		CLOUDS.setName("clouds", version);
		END_SKY.setName("end_sky", version);
		MOON_PHASES.setName("moon_phases", version);
		RAIN.setName("rain", version);
		SNOW_ENV.setName("snow", version);
		SUN.setName("sun", version);
		
		//gui
		ADVANCEMENTS_BACKGROUNDS_ADVENTURE.setName("adventure", version);
		ADVANCEMENTS_BACKGROUNDS_END.setName("end", version);
		ADVANCEMENTS_BACKGROUNDS_HUSBANDRY.setName("husbandry", version);
		ADVANCEMENTS_BACKGROUNDS_NETHER.setName("nether", version);
		ADVANCEMENTS_BACKGROUNDS_STONE.setName("stone", version);
		ADVANCEMENTS_TABS.setName("tabs", version);
		ADVANCEMENTS_WIDGETS.setName("widgets", version);
		ADVANCEMENTS_WINDOW.setName("window", version);
		BARS.setName("bars", version);
		BOOK_GUI.setName("book", version);
		CONTAINER_ANVIL.setName("anvil", version);
		CONTAINER_BEACON.setName("beacon", version);
		CONTAINER_BREWING_STAND.setName("brewing_stand", version);
		CONTAINER_CRAFTING_TABLE.setName("crafting_table", version);
		CONTAINER_CREATIVE_INVENTORY_TAB_INVENTORY.setName("tab_inventory", version);
		CONTAINER_CREATIVE_INVENTORY_TAB_ITEM_SEARCH.setName("tab_item_search", version);
		CONTAINER_CREATIVE_INVENTORY_TAB_ITEMS.setName("tab_items", version);
		CONTAINER_CREATIVE_INVENTORY_TABS.setName("tabs", version);
		CONTAINER_DISPENSER.setName("dispenser", version);
		CONTAINER_ENCHANTING_TABLE.setName("enchanting_table", version);
		CONTAINER_FURNACE.setName("furnace", version);
		CONTAINER_GENERIC_54.setName("generic_54", version);
		CONTAINER_HOPPER.setName("hopper", version);
		CONTAINER_HORSE.setName("horse", version);
		CONTAINER_INVENTORY.setName("inventory", version);
		CONTAINER_RECIPE_BACKGROUND.setName("recipe_background", version);
		CONTAINER_SHULKER_BOX.setName("shulker_box", version);
		CONTAINER_STATS_ICONS.setName("stats_icons", version);
		CONTAINER_VILLAGER.setName("villager", version);
		DEMO_BACKGROUND.setName("demo_background", version);
		ICONS.setName("icons", version);
		OPTIONS_BACKGROUND.setName("options_background", version);
		PRESETS_CHAOS.setName("chaos", version);
		PRESETS_DELIGHT.setName("delight", version);
		PRESETS_DROUGHT.setName("drought", version);
		PRESETS_ISLES.setName("isles", version);
		PRESETS_LUCK.setName("luck", version);
		PRESETS_MADNESS.setName("madness", version);
		PRESETS_WATER.setName("water", version);
		RECIPE_BOOK.setName("recipe_book", version);
		RESOURCE_PACKS.setName("resource_packs", version);
		SERVER_SELECTION.setName("server_selection", version);
		SPECTATOR_WIDGETS.setName("spectator_widgets", version);
		STREAM_INDICATOR.setName("stream_indicator", version);
		TITLE_BACKGROUND_PANORAMA_0.setName("panorama_0", version);
		TITLE_BACKGROUND_PANORAMA_1.setName("panorama_1", version);
		TITLE_BACKGROUND_PANORAMA_2.setName("panorama_2", version);
		TITLE_BACKGROUND_PANORAMA_3.setName("panorama_3", version);
		TITLE_BACKGROUND_PANORAMA_4.setName("panorama_4", version);
		TITLE_BACKGROUND_PANORAMA_5.setName("panorama_5", version);
		TITLE_EDITION.setName("edition", version);
		TITLE_MINECRAFT.setName("minecraft", version);
		TITLE_MOJANG.setName("mojang", version);
		TOASTS.setName("toasts", version);
		WIDGETS.setName("widgets", version);
		WORLD_SELECTION.setName("world_selection", version);
		
		//map
		MAP_BACKGROUND.setName("map_background", version);
		MAP_ICONS.setName("map_icons", version);
		
		//misc
		ENCHANTED_ITEM_GLINT.setName("enchanted_item_glint", version);
		FORCEFIELD.setName("forcefield", version);
		PUMPKINBLUR.setName("pumpkinblur", version);
		SHADOW.setName("shadow", version);
		UNDERWATER.setName("underwater", version);
		UNKNOWN_PACK.setName("unknown_pack", version);
		UNKNOWN_SERVER.setName("unknown_server", version);
		VIGNETTE.setName("vignette", version);
		
		//armor
		ARMOR_CHAINMAIL_LAYER_1.setName("chainmail_layer_1", version);
		ARMOR_CHAINMAIL_LAYER_2.setName("chainmail_layer_2", version);
		ARMOR_DIAMOND_LAYER_1.setName("diamond_layer_1", version);
		ARMOR_DIAMOND_LAYER_2.setName("diamond_layer_2", version);
		ARMOR_GOLD_LAYER_1.setName("gold_layer_1", version);
		ARMOR_GOLD_LAYER_2.setName("gold_layer_2", version);
		ARMOR_IRON_LAYER_1.setName("iron_layer_1", version);
		ARMOR_IRON_LAYER_2.setName("iron_layer_2", version);
		ARMOR_LEATHER_LAYER_1_OVERLAY.setName("leather_layer_1_overlay", version);
		ARMOR_LEATHER_LAYER_2_OVERLAY.setName("leather_layer_1", version);
		ARMOR_LEATHER_LAYER_1.setName("leather_layer_2_overlay", version);
		ARMOR_LEATHER_LAYER_2.setName("leather_layer_2", version);
		
		//painting
		//fixme
		DIR_PAINTINGS.setName("paintings_kristoffer_zetterstrand", version);
		
		//particle
		//fixme
		DIR_PARTICLES.setName("particles", version);
	}
	
	protected void setupDirectories() {
		//TODO: super.setupDirectories();
		
		// setting names
		DIR_BLOCKS.setName("blocks", version);
		DIR_COLORMAPS.setName("colormap", version);
		DIR_EFFECTS.setName("effect", version);
		DIR_ENTITIES.setName("entity", version);
		DIR_ARMORSTAND.setName("armorstand", version);
		DIR_BANNER.setName("banner", version);
		DIR_BEARS.setName("bear", version);
		DIR_BEDS.setName("bed", version);
		DIR_BOATS.setName("boat", version);
		DIR_CATS.setName("cat", version);
		DIR_CHESTS.setName("chest", version);
		DIR_COWS.setName("cow", version);
		DIR_CREEPER.setName("creeper", version);
		DIR_END_CRYSTAL.setName("endercrystal", version);
		DIR_ENDER_DRAGON.setName("enderdragon", version);
		DIR_ENDERMAN.setName("enderman", version);
		DIR_GHAST.setName("ghast", version);
		DIR_HORSES.setName("horse", version);
		DIR_HORSE_ARMOR.setName("armor", version);
		DIR_ILLAGERS.setName("illager", version);
		DIR_LLAMAS.setName("llama", version);
		DIR_LLAMA_DECOR.setName("decor", version);
		DIR_PARROTS.setName("parrot", version);
		DIR_PIG.setName("pig", version);
		DIR_PROJECTILES.setName("projectiles", version);
		DIR_RABBITS.setName("rabbit", version);
		DIR_SHEEP.setName("sheep", version);
		DIR_SHIELD.setName("shield", version);
		DIR_SHULKERS.setName("shulker", version);
		DIR_SKELETONS.setName("skeleton", version);
		DIR_SLIMES.setName("slime", version);
		DIR_SPIDERS.setName("spider", version);
		DIR_VILLAGERS.setName("villager", version);
		DIR_WITHER.setName("wither", version);
		DIR_WOLVES.setName("wolf", version);
		DIR_ZOMBIES.setName("zombie", version);
		DIR_ZOMBIE_VILLAGERS.setName("zombie_villager", version);
		DIR_ENVIRONMENT.setName("environment", version);
		DIR_FONT.setName("font", version);
		DIR_GUIS.setName("gui", version);
		DIR_ADVANCEMENTS.setName("advancements", version);
		DIR_ADVANCEMENT_BACKGROUNDS.setName("backgrounds", version);
		DIR_CONTAINERS.setName("container", version);
		DIR_CONTAINER_CREATIVE_INVENTORY.setName("creative_inventory", version);
		DIR_PRESETS.setName("presets", version);
		DIR_TITLE.setName("title", version);
		DIR_TITLE_BACKGROUND.setName("background", version);
		DIR_ITEMS.setName("items", version);
		DIR_MAP.setName("map", version);
		DIR_MISC.setName("misc", version);
		DIR_MODELS.setName("models", version);
		DIR_PAINTINGS.setName("painting", version);
		DIR_PARTICLES.setName("particle", version);
		
		// setting subdirectories
		DIR_ENTITIES.setSubDirectories(new Directory[]{
				DIR_ARMORSTAND,
				DIR_BANNER,
				DIR_BEARS,
				DIR_BEDS,
				DIR_BOATS,
				DIR_CATS,
				DIR_CHESTS,
				DIR_CONDUIT,
				DIR_COWS,
				DIR_CREEPER,
				DIR_END_CRYSTAL,
				DIR_ENDER_DRAGON,
				DIR_ENDERMAN,
				DIR_FISH,
				DIR_GHAST,
				DIR_HORSES,
				DIR_ILLAGERS,
				DIR_LLAMAS,
				DIR_PARROTS,
				DIR_PIG,
				DIR_PROJECTILES,
				DIR_RABBITS,
				DIR_SHEEP,
				DIR_SHIELD,
				DIR_SHULKERS,
				DIR_SKELETONS,
				DIR_SLIMES,
				DIR_SPIDERS,
				DIR_TURTLE,
				DIR_VILLAGERS,
				DIR_WITHER,
				DIR_WOLVES,
				DIR_ZOMBIES,
				DIR_ZOMBIE_VILLAGERS
		}, version);
		DIR_HORSES.setSubDirectories(new Directory[]{
				DIR_HORSE_ARMOR
		}, version);
		DIR_LLAMAS.setSubDirectories(new Directory[]{
				DIR_LLAMA_DECOR
		}, version);
		
		DIR_GUIS.setSubDirectories(new Directory[]{
				DIR_ADVANCEMENTS,
				DIR_CONTAINERS,
				DIR_PRESETS,
				DIR_TITLE
		}, version);
		DIR_ADVANCEMENTS.setSubDirectories(new Directory[]{
				DIR_ADVANCEMENT_BACKGROUNDS
		}, version);
		DIR_CONTAINERS.setSubDirectories(new Directory[]{
				DIR_CONTAINER_CREATIVE_INVENTORY
		}, version);
		DIR_TITLE.setSubDirectories(new Directory[]{
				DIR_TITLE_BACKGROUND
		}, version);
		
		// setting textures
		setupDirectoryContents();
	}
	
	protected void setupDirectoryContents() {
		DIR_BLOCKS.setTextures(new Texture[]{
				Version.ACACIA_DOOR_BOTTOM,
				Version.ACACIA_DOOR_TOP,
				Version.ACACIA_LEAVES,
				Version.ACACIA_LOG,
				Version.ACACIA_LOG_TOP,
				Version.ACACIA_PLANKS,
				Version.ACACIA_SAPLING,
				Version.ACACIA_TRAPDOOR,
				Version.ACTIVATOR_RAIL,
				Version.ACTIVATOR_RAIL_ON,
				Version.ALLIUM,
				Version.ANDESITE,
				Version.ANVIL,
				Version.ANVIL_TOP,
				Version.ATTACHED_MELON_STEM,
				Version.ATTACHED_PUMPKIN_STEM,
				Version.AZURE_BLUET,
				Version.BEACON,
				Version.BEDROCK,
				Version.BEETROOTS_STAGE0,
				Version.BEETROOTS_STAGE1,
				Version.BEETROOTS_STAGE2,
				Version.BEETROOTS_STAGE3,
				Version.BIRCH_DOOR_BOTTOM,
				Version.BIRCH_DOOR_TOP,
				Version.BIRCH_LEAVES,
				Version.BIRCH_LOG,
				Version.BIRCH_LOG_TOP,
				Version.BIRCH_PLANKS,
				Version.BIRCH_SAPLING,
				Version.BIRCH_TRAPDOOR,
				Version.BLACK_CONCRETE,
				Version.BLACK_CONCRETE_POWDER,
				Version.BLACK_GLAZED_TERRACOTTA,
				Version.BLACK_SHULKER_BOX,
				Version.BLACK_STAINED_GLASS,
				Version.BLACK_STAINED_GLASS_PANE_TOP,
				Version.BLACK_TERRACOTTA,
				Version.BLACK_WOOL,
				Version.BLUE_CONCRETE,
				Version.BLUE_CONCRETE_POWDER,
				Version.BLUE_GLAZED_TERRACOTTA,
				Version.BLUE_ICE,
				Version.BLUE_ORCHID,
				Version.BLUE_SHULKER_BOX,
				Version.BLUE_STAINED_GLASS,
				Version.BLUE_STAINED_GLASS_PANE_TOP,
				Version.BLUE_TERRACOTTA,
				Version.BLUE_WOOL,
				Version.BONE_BLOCK_SIDE,
				Version.BONE_BLOCK_TOP,
				Version.BOOKSHELF,
				Version.BRAIN_CORAL,
				Version.BRAIN_CORAL_BLOCK,
				Version.BRAIN_CORAL_FAN,
				Version.BREWING_STAND,
				Version.BREWING_STAND_BASE,
				Version.BRICKS,
				Version.BROWN_CONCRETE,
				Version.BROWN_CONCRETE_POWDER,
				Version.BROWN_GLAZED_TERRACOTTA,
				Version.BROWN_MUSHROOM,
				Version.BROWN_MUSHROOM_BLOCK,
				Version.BROWN_SHULKER_BOX,
				Version.BROWN_STAINED_GLASS,
				Version.BROWN_STAINED_GLASS_PANE_TOP,
				Version.BROWN_TERRACOTTA,
				Version.BROWN_WOOL,
				Version.BUBBLE_CORAL,
				Version.BUBBLE_CORAL_BLOCK,
				Version.BUBBLE_CORAL_FAN,
				Version.CACTUS_BOTTOM,
				Version.CACTUS_SIDE,
				Version.CACTUS_TOP,
				Version.CAKE_BOTTOM,
				Version.CAKE_INNER,
				Version.CAKE_SIDE,
				Version.CAKE_TOP,
				Version.CARROTS_STAGE0,
				Version.CARROTS_STAGE1,
				Version.CARROTS_STAGE2,
				Version.CARROTS_STAGE3,
				Version.CARVED_PUMPKIN,
				Version.CAULDRON_BOTTOM,
				Version.CAULDRON_INNER,
				Version.CAULDRON_SIDE,
				Version.CAULDRON_TOP,
				Version.CHAIN_COMMAND_BLOCK_BACK,
				Version.CHAIN_COMMAND_BLOCK_CONDITIONAL,
				Version.CHAIN_COMMAND_BLOCK_FRONT,
				Version.CHAIN_COMMAND_BLOCK_SIDE,
				Version.CHIPPED_ANVIL_TOP,
				Version.CHISELED_QUARTZ_BLOCK,
				Version.CHISELED_QUARTZ_BLOCK_TOP,
				Version.CHISELED_RED_SANDSTONE,
				Version.CHISELED_SANDSTONE,
				Version.CHISELED_STONE_BRICKS,
				Version.CHORUS_FLOWER,
				Version.CHORUS_FLOWER_DEAD,
				Version.CHORUS_PLANT,
				Version.CLAY,
				Version.COAL_BLOCK,
				Version.COAL_ORE,
				Version.COARSE_DIRT,
				Version.COBBLESTONE,
				Version.COBWEB,
				Version.COCOA_STAGE0,
				Version.COCOA_STAGE1,
				Version.COCOA_STAGE2,
				Version.COMMAND_BLOCK_BACK,
				Version.COMMAND_BLOCK_CONDITIONAL,
				Version.COMMAND_BLOCK_FRONT,
				Version.COMMAND_BLOCK_SIDE,
				Version.COMPARATOR,
				Version.COMPARATOR_ON,
				Version.CONDUIT,
				Version.CRACKED_STONE_BRICKS,
				Version.CRAFTING_TABLE_FRONT,
				Version.CRAFTING_TABLE_SIDE,
				Version.CRAFTING_TABLE_TOP,
				Version.CUT_RED_SANDSTONE,
				Version.CUT_SANDSTONE,
				Version.CYAN_CONCRETE,
				Version.CYAN_CONCRETE_POWDER,
				Version.CYAN_GLAZED_TERRACOTTA,
				Version.CYAN_SHULKER_BOX,
				Version.CYAN_STAINED_GLASS,
				Version.CYAN_STAINED_GLASS_PANE_TOP,
				Version.CYAN_TERRACOTTA,
				Version.CYAN_WOOL,
				Version.DAMAGED_ANVIL_TOP,
				Version.DANDELION,
				Version.DARK_OAK_DOOR_BOTTOM,
				Version.DARK_OAK_DOOR_TOP,
				Version.DARK_OAK_LEAVES,
				Version.DARK_OAK_LOG,
				Version.DARK_OAK_LOG_TOP,
				Version.DARK_OAK_PLANKS,
				Version.DARK_OAK_SAPLING,
				Version.DARK_OAK_TRAPDOOR,
				Version.DARK_PRISMARINE,
				Version.DAYLIGHT_DETECTOR_INVERTED_TOP,
				Version.DAYLIGHT_DETECTOR_SIDE,
				Version.DAYLIGHT_DETECTOR_TOP,
				Version.DEAD_BRAIN_CORAL_BLOCK,
				Version.DEAD_BRAIN_CORAL_FAN,
				Version.DEAD_BUBBLE_CORAL_BLOCK,
				Version.DEAD_BUBBLE_CORAL_FAN,
				Version.DEAD_BUSH,
				Version.DEAD_FIRE_CORAL_BLOCK,
				Version.DEAD_FIRE_CORAL_FAN,
				Version.DEAD_HORN_CORAL_BLOCK,
				Version.DEAD_HORN_CORAL_FAN,
				Version.DEAD_TUBE_CORAL_BLOCK,
				Version.DEAD_TUBE_CORAL_FAN,
				Version.DEBUG,
				Version.DEBUG2,
				Version.DESTROY_STAGE_0,
				Version.DESTROY_STAGE_1,
				Version.DESTROY_STAGE_2,
				Version.DESTROY_STAGE_3,
				Version.DESTROY_STAGE_4,
				Version.DESTROY_STAGE_5,
				Version.DESTROY_STAGE_6,
				Version.DESTROY_STAGE_7,
				Version.DESTROY_STAGE_8,
				Version.DESTROY_STAGE_9,
				Version.DETECTOR_RAIL,
				Version.DETECTOR_RAIL_ON,
				Version.DIAMOND_BLOCK,
				Version.DIAMOND_ORE,
				Version.DIORITE,
				Version.DIRT,
				Version.DISPENSER_FRONT,
				Version.DISPENSER_FRONT_VERTICAL,
				Version.DRAGON_EGG,
				Version.DRIED_KELP_BOTTOM,
				Version.DRIED_KELP_SIDE,
				Version.DRIED_KELP_TOP,
				Version.DROPPER_FRONT,
				Version.DROPPER_FRONT_VERTICAL,
				Version.EMERALD_BLOCK,
				Version.EMERALD_ORE,
				Version.ENCHANTING_TABLE_BOTTOM,
				Version.ENCHANTING_TABLE_SIDE,
				Version.ENCHANTING_TABLE_TOP,
				Version.END_PORTAL_FRAME_EYE,
				Version.END_PORTAL_FRAME_SIDE,
				Version.END_PORTAL_FRAME_TOP,
				Version.END_ROD,
				Version.END_STONE,
				Version.END_STONE_BRICKS,
				Version.FARMLAND,
				Version.FARMLAND_MOIST,
				Version.FERN,
				Version.FIRE_0,
				Version.FIRE_1,
				Version.FIRE_CORAL,
				Version.FIRE_CORAL_BLOCK,
				Version.FIRE_CORAL_FAN,
				Version.FLOWER_POT,
				Version.FROSTED_ICE_0,
				Version.FROSTED_ICE_1,
				Version.FROSTED_ICE_2,
				Version.FROSTED_ICE_3,
				Version.FURNACE_FRONT,
				Version.FURNACE_FRONT_ON,
				Version.FURNACE_SIDE,
				Version.FURNACE_TOP,
				Version.GLASS,
				Version.GLASS_PANE_TOP,
				Version.GLOWSTONE,
				Version.GOLD_BLOCK,
				Version.GOLD_ORE,
				Version.GRANITE,
				Version.GRASS,
				Version.GRASS_BLOCK_SIDE,
				Version.GRASS_BLOCK_SIDE_OVERLAY,
				Version.GRASS_BLOCK_SNOW,
				Version.GRASS_BLOCK_TOP,
				Version.GRASS_PATH_SIDE,
				Version.GRASS_PATH_TOP,
				Version.GRAVEL,
				Version.GRAY_CONCRETE,
				Version.GRAY_CONCRETE_POWDER,
				Version.GRAY_GLAZED_TERRACOTTA,
				Version.GRAY_SHULKER_BOX,
				Version.GRAY_STAINED_GLASS,
				Version.GRAY_STAINED_GLASS_PANE_TOP,
				Version.GRAY_TERRACOTTA,
				Version.GRAY_WOOL,
				Version.GREEN_CONCRETE,
				Version.GREEN_CONCRETE_POWDER,
				Version.GREEN_GLAZED_TERRACOTTA,
				Version.GREEN_SHULKER_BOX,
				Version.GREEN_STAINED_GLASS,
				Version.GREEN_STAINED_GLASS_PANE_TOP,
				Version.GREEN_TERRACOTTA,
				Version.GREEN_WOOL,
				Version.HAY_BLOCK_SIDE,
				Version.HAY_BLOCK_TOP,
				Version.HOPPER_INSIDE,
				Version.HOPPER_OUTSIDE,
				Version.HOPPER_TOP,
				Version.HORN_CORAL,
				Version.HORN_CORAL_BLOCK,
				Version.HORN_CORAL_FAN,
				Version.ICE,
				Version.IRON_BARS,
				Version.IRON_BLOCK,
				Version.IRON_DOOR_BOTTOM,
				Version.IRON_DOOR_TOP,
				Version.IRON_ORE,
				Version.IRON_TRAPDOOR,
				Version.ITEM_FRAME,
				Version.JACK_O_LANTERN,
				Version.JUKEBOX_SIDE,
				Version.JUKEBOX_TOP,
				Version.JUNGLE_DOOR_BOTTOM,
				Version.JUNGLE_DOOR_TOP,
				Version.JUNGLE_LEAVES,
				Version.JUNGLE_LOG,
				Version.JUNGLE_LOG_TOP,
				Version.JUNGLE_PLANKS,
				Version.JUNGLE_SAPLING,
				Version.JUNGLE_TRAPDOOR,
				Version.KELP,
				Version.KELP_PLANT,
				Version.LADDER,
				Version.LAPIS_BLOCK,
				Version.LAPIS_ORE,
				Version.LARGE_FERN_BOTTOM,
				Version.LARGE_FERN_TOP,
				Version.LAVA_FLOW,
				Version.LAVA_STILL,
				Version.LEVER,
				Version.LIGHT_BLUE_CONCRETE,
				Version.LIGHT_BLUE_CONCRETE_POWDER,
				Version.LIGHT_BLUE_GLAZED_TERRACOTTA,
				Version.LIGHT_BLUE_SHULKER_BOX,
				Version.LIGHT_BLUE_STAINED_GLASS,
				Version.LIGHT_BLUE_STAINED_GLASS_PANE_TOP,
				Version.LIGHT_BLUE_TERRACOTTA,
				Version.LIGHT_BLUE_WOOL,
				Version.LIGHT_GRAY_CONCRETE,
				Version.LIGHT_GRAY_CONCRETE_POWDER,
				Version.LIGHT_GRAY_GLAZED_TERRACOTTA,
				Version.LIGHT_GRAY_SHULKER_BOX,
				Version.LIGHT_GRAY_STAINED_GLASS,
				Version.LIGHT_GRAY_STAINED_GLASS_PANE_TOP,
				Version.LIGHT_GRAY_TERRACOTTA,
				Version.LIGHT_GRAY_WOOL,
				Version.LILAC_BOTTOM,
				Version.LILAC_TOP,
				Version.LILY_PAD,
				Version.LIME_CONCRETE,
				Version.LIME_CONCRETE_POWDER,
				Version.LIME_GLAZED_TERRACOTTA,
				Version.LIME_SHULKER_BOX,
				Version.LIME_STAINED_GLASS,
				Version.LIME_STAINED_GLASS_PANE_TOP,
				Version.LIME_TERRACOTTA,
				Version.LIME_WOOL,
				Version.MAGENTA_CONCRETE,
				Version.MAGENTA_CONCRETE_POWDER,
				Version.MAGENTA_GLAZED_TERRACOTTA,
				Version.MAGENTA_SHULKER_BOX,
				Version.MAGENTA_STAINED_GLASS,
				Version.MAGENTA_STAINED_GLASS_PANE_TOP,
				Version.MAGENTA_TERRACOTTA,
				Version.MAGENTA_WOOL,
				Version.MAGMA,
				Version.MELON_SIDE,
				Version.MELON_STEM,
				Version.MELON_TOP,
				Version.MOSSY_COBBLESTONE,
				Version.MOSSY_STONE_BRICKS,
				Version.MUSHROOM_BLOCK_INSIDE,
				Version.MUSHROOM_STEM,
				Version.MYCELIUM_SIDE,
				Version.MYCELIUM_TOP,
				Version.NETHER_BRICKS,
				Version.NETHER_PORTAL,
				Version.NETHER_QUARTZ_ORE,
				Version.NETHER_WART_BLOCK,
				Version.NETHER_WART_STAGE0,
				Version.NETHER_WART_STAGE1,
				Version.NETHER_WART_STAGE2,
				Version.NETHERRACK,
				Version.NOTE_BLOCK,
				Version.OAK_DOOR_BOTTOM,
				Version.OAK_DOOR_TOP,
				Version.OAK_LEAVES,
				Version.OAK_LOG,
				Version.OAK_LOG_TOP,
				Version.OAK_PLANKS,
				Version.OAK_SAPLING,
				Version.OAK_TRAPDOOR,
				Version.OBSERVER_BACK,
				Version.OBSERVER_BACK_ON,
				Version.OBSERVER_FRONT,
				Version.OBSERVER_SIDE,
				Version.OBSERVER_TOP,
				Version.OBSIDIAN,
				Version.ORANGE_CONCRETE,
				Version.ORANGE_CONCRETE_POWDER,
				Version.ORANGE_GLAZED_TERRACOTTA,
				Version.ORANGE_SHULKER_BOX,
				Version.ORANGE_STAINED_GLASS,
				Version.ORANGE_STAINED_GLASS_PANE_TOP,
				Version.ORANGE_TERRACOTTA,
				Version.ORANGE_TULIP,
				Version.ORANGE_WOOL,
				Version.OXEYE_DAISY,
				Version.PACKED_ICE,
				Version.PEONY_BOTTOM,
				Version.PEONY_TOP,
				Version.PINK_CONCRETE,
				Version.PINK_CONCRETE_POWDER,
				Version.PINK_GLAZED_TERRACOTTA,
				Version.PINK_SHULKER_BOX,
				Version.PINK_STAINED_GLASS,
				Version.PINK_STAINED_GLASS_PANE_TOP,
				Version.PINK_TERRACOTTA,
				Version.PINK_TULIP,
				Version.PINK_WOOL,
				Version.PISTON_BOTTOM,
				Version.PISTON_INNER,
				Version.PISTON_SIDE,
				Version.PISTON_TOP,
				Version.PISTON_TOP_STICKY,
				Version.PODZOL_SIDE,
				Version.PODZOL_TOP,
				Version.POLISHED_ANDESITE,
				Version.POLISHED_DIORITE,
				Version.POLISHED_GRANITE,
				Version.POPPY,
				Version.POTATOES_STAGE0,
				Version.POTATOES_STAGE1,
				Version.POTATOES_STAGE2,
				Version.POTATOES_STAGE3,
				Version.POWERED_RAIL,
				Version.POWERED_RAIL_ON,
				Version.PRISMARINE,
				Version.PRISMARINE_BRICKS,
				Version.PUMPKIN_SIDE,
				Version.PUMPKIN_STEM,
				Version.PUMPKIN_TOP,
				Version.PURPLE_CONCRETE,
				Version.PURPLE_CONCRETE_POWDER,
				Version.PURPLE_GLAZED_TERRACOTTA,
				Version.PURPLE_SHULKER_BOX,
				Version.PURPLE_STAINED_GLASS,
				Version.PURPLE_STAINED_GLASS_PANE_TOP,
				Version.PURPLE_TERRACOTTA,
				Version.PURPLE_WOOL,
				Version.PURPUR_BLOCK,
				Version.PURPUR_PILLAR,
				Version.PURPUR_PILLAR_TOP,
				Version.QUARTZ_BLOCK_BOTTOM,
				Version.QUARTZ_BLOCK_SIDE,
				Version.QUARTZ_BLOCK_TOP,
				Version.QUARTZ_PILLAR,
				Version.QUARTZ_PILLAR_TOP,
				Version.RAIL,
				Version.RAIL_CORNER,
				Version.RED_CONCRETE,
				Version.RED_CONCRETE_POWDER,
				Version.RED_GLAZED_TERRACOTTA,
				Version.RED_MUSHROOM,
				Version.RED_MUSHROOM_BLOCK,
				Version.RED_NETHER_BRICKS,
				Version.RED_SAND,
				Version.RED_SANDSTONE,
				Version.RED_SANDSTONE_BOTTOM,
				Version.RED_SANDSTONE_TOP,
				Version.RED_SHULKER_BOX,
				Version.RED_STAINED_GLASS,
				Version.RED_STAINED_GLASS_PANE_TOP,
				Version.RED_TERRACOTTA,
				Version.RED_TULIP,
				Version.RED_WOOL,
				Version.REDSTONE_BLOCK,
				Version.REDSTONE_DUST_DOT,
				Version.REDSTONE_DUST_LINE0,
				Version.REDSTONE_DUST_LINE1,
				Version.REDSTONE_DUST_OVERLAY,
				Version.REDSTONE_LAMP,
				Version.REDSTONE_LAMP_ON,
				Version.REDSTONE_ORE,
				Version.REDSTONE_TORCH,
				Version.REDSTONE_TORCH_OFF,
				Version.REPEATER,
				Version.REPEATER_ON,
				Version.REPEATING_COMMAND_BLOCK_BACK,
				Version.REPEATING_COMMAND_BLOCK_CONDITIONAL,
				Version.REPEATING_COMMAND_BLOCK_FRONT,
				Version.REPEATING_COMMAND_BLOCK_SIDE,
				Version.ROSE_BUSH_BOTTOM,
				Version.ROSE_BUSH_TOP,
				Version.SAND,
				Version.SANDSTONE,
				Version.SANDSTONE_BOTTOM,
				Version.SANDSTONE_TOP,
				Version.SEA_LANTERN,
				Version.SEA_PICKLE,
				Version.SEAGRASS,
				Version.SHULKER_BOX,
				Version.SLIME_BLOCK,
				Version.SNOW,
				Version.SOUL_SAND,
				Version.SPAWNER,
				Version.SPONGE,
				Version.SPRUCE_DOOR_BOTTOM,
				Version.SPRUCE_DOOR_TOP,
				Version.SPRUCE_LEAVES,
				Version.SPRUCE_LOG,
				Version.SPRUCE_LOG_TOP,
				Version.SPRUCE_PLANKS,
				Version.SPRUCE_SAPLING,
				Version.SPRUCE_TRAPDOOR,
				Version.STONE,
				Version.STONE_BRICKS,
				Version.STONE_SLAB_SIDE,
				Version.STONE_SLAB_TOP,
				Version.STRIPPED_ACACIA_LOG,
				Version.STRIPPED_ACACIA_LOG_TOP,
				Version.STRIPPED_BIRCH_LOG,
				Version.STRIPPED_BIRCH_LOG_TOP,
				Version.STRIPPED_DARK_OAK_LOG,
				Version.STRIPPED_DARK_OAK_LOG_TOP,
				Version.STRIPPED_JUNGLE_LOG,
				Version.STRIPPED_JUNGLE_LOG_TOP,
				Version.STRIPPED_OAK_LOG,
				Version.STRIPPED_OAK_LOG_TOP,
				Version.STRIPPED_SPRUCE_LOG,
				Version.STRIPPED_SPRUCE_LOG_TOP,
				Version.STRUCTURE_BLOCK,
				Version.STRUCTURE_BLOCK_CORNER,
				Version.STRUCTURE_BLOCK_DATA,
				Version.STRUCTURE_BLOCK_LOAD,
				Version.STRUCTURE_BLOCK_SAVE,
				Version.SUGAR_CANE,
				Version.SUNFLOWER_BACK,
				Version.SUNFLOWER_BOTTOM,
				Version.SUNFLOWER_FRONT,
				Version.SUNFLOWER_TOP,
				Version.TALL_GRASS_BOTTOM,
				Version.TALL_GRASS_TOP,
				Version.TALL_SEAGRASS_BOTTOM,
				Version.TALL_SEAGRASS_TOP,
				Version.TERRACOTTA,
				Version.TNT_BOTTOM,
				Version.TNT_SIDE,
				Version.TNT_TOP,
				Version.TORCH,
				Version.TRIPWIRE,
				Version.TRIPWIRE_HOOK,
				Version.TUBE_CORAL,
				Version.TUBE_CORAL_BLOCK,
				Version.TUBE_CORAL_FAN,
				Version.TURTLE_EGG,
				Version.TURTLE_EGG_SLIGHTLY_CRACKED,
				Version.TURTLE_EGG_VERY_CRACKED,
				Version.VINE,
				Version.WATER_FLOW,
				Version.WATER_OVERLAY,
				Version.WATER_STILL,
				Version.WET_SPONGE,
				Version.WHEAT_STAGE0,
				Version.WHEAT_STAGE1,
				Version.WHEAT_STAGE2,
				Version.WHEAT_STAGE3,
				Version.WHEAT_STAGE4,
				Version.WHEAT_STAGE5,
				Version.WHEAT_STAGE6,
				Version.WHEAT_STAGE7,
				Version.WHITE_CONCRETE,
				Version.WHITE_CONCRETE_POWDER,
				Version.WHITE_GLAZED_TERRACOTTA,
				Version.WHITE_SHULKER_BOX,
				Version.WHITE_STAINED_GLASS,
				Version.WHITE_STAINED_GLASS_PANE_TOP,
				Version.WHITE_TERRACOTTA,
				Version.WHITE_TULIP,
				Version.WHITE_WOOL,
				Version.YELLOW_CONCRETE,
				Version.YELLOW_CONCRETE_POWDER,
				Version.YELLOW_GLAZED_TERRACOTTA,
				Version.YELLOW_SHULKER_BOX,
				Version.YELLOW_STAINED_GLASS,
				Version.YELLOW_STAINED_GLASS_PANE_TOP,
				Version.YELLOW_TERRACOTTA,
				Version.YELLOW_WOOL,
		}, version);
		DIR_COLORMAPS.setTextures(new Texture[]{
				Version.FOLIAGE,
				Version.GRASS,
		}, version);
		DIR_EFFECTS.setTextures(new Texture[]{
				Version.DITHER,
		}, version);
		DIR_ENTITIES.setTextures(new Texture[]{
				Version.ALEX,
				Version.ARMORSTAND_WOOD,
				Version.ARROW,
				Version.BANNER_BASE,
				Version.BANNER_BORDER,
				Version.BANNER_BRICKS,
				Version.BANNER_CIRCLE,
				Version.BANNER_CREEPER,
				Version.BANNER_CROSS,
				Version.BANNER_CURLY_BORDER,
				Version.BANNER_DIAGONAL_LEFT,
				Version.BANNER_DIAGONAL_RIGHT,
				Version.BANNER_DIAGONAL_UP_LEFT,
				Version.BANNER_DIAGONAL_UP_RIGHT,
				Version.BANNER_FLOWER,
				Version.BANNER_GRADIENT,
				Version.BANNER_GRADIENT_UP,
				Version.BANNER_HALF_HORIZONTAL,
				Version.BANNER_HALF_HORIZONTAL_BOTTOM,
				Version.BANNER_HALF_VERTICAL,
				Version.BANNER_HALF_VERTICAL_RIGHT,
				Version.BANNER_MOJANG,
				Version.BANNER_RHOMBUS,
				Version.BANNER_SKULL,
				Version.BANNER_SMALL_STRIPES,
				Version.BANNER_SQUARE_BOTTOM_LEFT,
				Version.BANNER_SQUARE_BOTTOM_RIGHT,
				Version.BANNER_SQUARE_TOP_LEFT,
				Version.BANNER_SQUARE_TOP_RIGHT,
				Version.BANNER_STRAIGHT_CROSS,
				Version.BANNER_STRIPE_BOTTOM,
				Version.BANNER_STRIPE_CENTER,
				Version.BANNER_STRIPE_DOWNLEFT,
				Version.BANNER_STRIPE_DOWNRIGHT,
				Version.BANNER_STRIPE_LEFT,
				Version.BANNER_STRIPE_MIDDLE,
				Version.BANNER_STRIPE_RIGHT,
				Version.BANNER_STRIPE_TOP,
				Version.BANNER_TRIANGLE_BOTTOM,
				Version.BANNER_TRIANGLE_TOP,
				Version.BANNER_TRIANGLES_BOTTOM,
				Version.BANNER_TRIANGLES_TOP,
				Version.BANNER_BASE,
				Version.BAT,
				Version.BEACON_BEAM,
				Version.BEAR_POLARBEAR,
				Version.BED_BLACK,
				Version.BED_BLUE,
				Version.BED_BROWN,
				Version.BED_CYAN,
				Version.BED_GRAY,
				Version.BED_GREEN,
				Version.BED_LIGHT_BLUE,
				Version.BED_LIGHT_GRAY,
				Version.BED_LIME,
				Version.BED_MAGENTA,
				Version.BED_ORANGE,
				Version.BED_PINK,
				Version.BED_PURPLE,
				Version.BED_RED,
				Version.BED_WHITE,
				Version.BED_YELLOW,
				Version.BLAZE,
				Version.BOAT_ACACIA,
				Version.BOAT_BIRCH,
				Version.BOAT_DARK_OAK,
				Version.BOAT_JUNGLE,
				Version.BOAT_OAK,
				Version.BOAT_SPRUCE,
				Version.CAT_BLACK,
				Version.CAT_OCELOT,
				Version.CAT_RED,
				Version.CAT_SIAMESE,
				Version.CHEST_CHRISTMAS,
				Version.CHEST_CHRISTMAS_DOUBLE,
				Version.CHEST_ENDER,
				Version.CHEST_NORMAL,
				Version.CHEST_NORMAL_DOUBLE,
				Version.CHEST_TRAPPED,
				Version.CHEST_TRAPPED_DOUBLE,
				Version.CHICKEN,
				Version.CONDUIT_BASE,
				Version.CONDUIT_BREAK_PARTICLE,
				Version.CONDUIT_CAGE,
				Version.CONDUIT_CLOSED_EYE,
				Version.CONDUIT_OPEN_EYE,
				Version.CONDUIT_WIND,
				Version.CONDUIT_WIND_VERTICAL,
				Version.COW_COW,
				Version.COW_MOOSHROOM,
				Version.CREEPER_CREEPER,
				Version.CREEPER_CREEPER_ARMOR,
				Version.DOLPHIN,
				Version.ELYTRA,
				Version.ENCHANTING_TABLE_BOOK,
				Version.END_CRYSTAL_END_CRYSTAL,
				Version.END_CRYSTAL_END_CRYSTAL_BEAM,
				Version.END_GATEWAY_BEAM,
				Version.END_PORTAL,
				Version.ENDERDRAGON_DRAGON,
				Version.ENDERDRAGON_DRAGON_EXPLODING,
				Version.ENDERDRAGON_DRAGON_EYES,
				Version.ENDERDRAGON_DRAGON_FIREBALL,
				Version.ENDERMAN_ENDERMAN,
				Version.ENDERMAN_ENDERMAN_EYES,
				Version.ENDERMITE,
				Version.EXPERIENCE_ORB,
				Version.EXPLOSION,
				Version.FISH_COD,
				Version.FISH_PUFFERFISH,
				Version.FISH_SALMON,
				Version.FISH_TROPICAL_A,
				Version.FISH_TROPICAL_A_PATTERN_1,
				Version.FISH_TROPICAL_A_PATTERN_2,
				Version.FISH_TROPICAL_A_PATTERN_3,
				Version.FISH_TROPICAL_A_PATTERN_4,
				Version.FISH_TROPICAL_A_PATTERN_5,
				Version.FISH_TROPICAL_A_PATTERN_6,
				Version.FISH_TROPICAL_B,
				Version.FISH_TROPICAL_B_PATTERN_1,
				Version.FISH_TROPICAL_B_PATTERN_2,
				Version.FISH_TROPICAL_B_PATTERN_3,
				Version.FISH_TROPICAL_B_PATTERN_4,
				Version.FISH_TROPICAL_B_PATTERN_5,
				Version.FISH_TROPICAL_B_PATTERN_6,
				Version.GHAST_GHAST,
				Version.GHAST_GHAST_SHOOTING,
				Version.GUARDIAN,
				Version.GUARDIAN_BEAM,
				Version.GUARDIAN_ELDER,
				Version.HORSE_ARMOR_HORSE_ARMOR_DIAMOND,
				Version.HORSE_ARMOR_HORSE_ARMOR_GOLD,
				Version.HORSE_ARMOR_HORSE_ARMOR_IRON,
				Version.HORSE_DONKEY,
				Version.HORSE_HORSE_BLACK,
				Version.HORSE_HORSE_BROWN,
				Version.HORSE_HORSE_CHESTNUT,
				Version.HORSE_HORSE_CREAMY,
				Version.HORSE_HORSE_DARKBROWN,
				Version.HORSE_HORSE_GRAY,
				Version.HORSE_HORSE_MARKINGS_BLACKDOTS,
				Version.HORSE_HORSE_MARKINGS_WHITE,
				Version.HORSE_HORSE_MARKINGS_WHITEDOTS,
				Version.HORSE_HORSE_MARKINGS_WHITEFIELD,
				Version.HORSE_HORSE_SKELETON,
				Version.HORSE_HORSE_WHITE,
				Version.HORSE_HORSE_ZOMBIE,
				Version.HORSE_MULE,
				Version.ILLAGER_EVOKER,
				Version.ILLAGER_EVOKER_FANGS,
				Version.ILLAGER_ILLUSIONER,
				Version.ILLAGER_VEX,
				Version.ILLAGER_VEX_CHARGING,
				Version.ILLAGER_VINDICATOR,
				Version.IRON_GOLEM,
				Version.LEAD_KNOT,
				Version.LLAMA_BROWN,
				Version.LLAMA_CREAMY,
				Version.LLAMA_DECOR_BLACK,
				Version.LLAMA_DECOR_BLUE,
				Version.LLAMA_DECOR_BROWN,
				Version.LLAMA_DECOR_CYAN,
				Version.LLAMA_DECOR_GRAY,
				Version.LLAMA_DECOR_GREEN,
				Version.LLAMA_DECOR_LIGHT_BLUE,
				Version.LLAMA_DECOR_LIGHT_GRAY,
				Version.LLAMA_DECOR_LIME,
				Version.LLAMA_DECOR_MAGENTA,
				Version.LLAMA_DECOR_ORANGE,
				Version.LLAMA_DECOR_PINK,
				Version.LLAMA_DECOR_PURPLE,
				Version.LLAMA_DECOR_RED,
				Version.LLAMA_DECOR_WHITE,
				Version.LLAMA_DECOR_YELLOW,
				Version.LLAMA_GRAY,
				Version.LLAMA_SPIT,
				Version.LLAMA_WHITE,
				Version.MINECART,
				Version.PARROT_PARROT_BLUE,
				Version.PARROT_PARROT_GREEN,
				Version.PARROT_PARROT_GREY,
				Version.PARROT_PARROT_RED_BLUE,
				Version.PARROT_PARROT_YELLOW_BLUE,
				Version.PHANTOM,
				Version.PHANTOM_EYES,
				Version.PIG_PIG,
				Version.PIG_PIG_SADDLE,
				Version.PROJECTILES_ARROW,
				Version.PROJECTILES_SPECTRAL_ARROW,
				Version.PROJECTILES_TIPPED_ARROW,
				Version.RABBIT_BLACK,
				Version.RABBIT_BROWN,
				Version.RABBIT_CAERBANNOG,
				Version.RABBIT_GOLD,
				Version.RABBIT_SALT,
				Version.RABBIT_TOAST,
				Version.RABBIT_WHITE,
				Version.RABBIT_WHITE_SPLOTCHED,
				Version.SHEEP_SHEEP,
				Version.SHEEP_SHEEP_FUR,
				Version.SHIELD_BASE,
				Version.SHIELD_BORDER,
				Version.SHIELD_BRICKS,
				Version.SHIELD_CIRCLE,
				Version.SHIELD_CREEPER,
				Version.SHIELD_CROSS,
				Version.SHIELD_CURLY_BORDER,
				Version.SHIELD_DIAGONAL_LEFT,
				Version.SHIELD_DIAGONAL_RIGHT,
				Version.SHIELD_DIAGONAL_UP_LEFT,
				Version.SHIELD_DIAGONAL_UP_RIGHT,
				Version.SHIELD_FLOWER,
				Version.SHIELD_GRADIENT,
				Version.SHIELD_GRADIENT_UP,
				Version.SHIELD_HALF_HORIZONTAL,
				Version.SHIELD_HALF_HORIZONTAL_BOTTOM,
				Version.SHIELD_HALF_VERTICAL,
				Version.SHIELD_HALF_VERTICAL_RIGHT,
				Version.SHIELD_MOJANG,
				Version.SHIELD_RHOMBUS,
				Version.SHIELD_SKULL,
				Version.SHIELD_SMALL_STRIPES,
				Version.SHIELD_SQUARE_BOTTOM_LEFT,
				Version.SHIELD_SQUARE_BOTTOM_RIGHT,
				Version.SHIELD_SQUARE_TOP_LEFT,
				Version.SHIELD_SQUARE_TOP_RIGHT,
				Version.SHIELD_STRAIGHT_CROSS,
				Version.SHIELD_STRIPE_BOTTOM,
				Version.SHIELD_STRIPE_CENTER,
				Version.SHIELD_STRIPE_DOWNLEFT,
				Version.SHIELD_STRIPE_DOWNRIGHT,
				Version.SHIELD_STRIPE_LEFT,
				Version.SHIELD_STRIPE_MIDDLE,
				Version.SHIELD_STRIPE_RIGHT,
				Version.SHIELD_STRIPE_TOP,
				Version.SHIELD_TRIANGLE_BOTTOM,
				Version.SHIELD_TRIANGLE_TOP,
				Version.SHIELD_TRIANGLES_BOTTOM,
				Version.SHIELD_TRIANGLES_TOP,
				Version.SHIELD_BASE,
				Version.SHIELD_BASE_NOPATTERN,
				Version.SHULKER_SHULKER,
				Version.SHULKER_SHULKER_BLACK,
				Version.SHULKER_SHULKER_BLUE,
				Version.SHULKER_SHULKER_BROWN,
				Version.SHULKER_SHULKER_CYAN,
				Version.SHULKER_SHULKER_GRAY,
				Version.SHULKER_SHULKER_GREEN,
				Version.SHULKER_SHULKER_LIGHT_BLUE,
				Version.SHULKER_SHULKER_LIGHT_GRAY,
				Version.SHULKER_SHULKER_LIME,
				Version.SHULKER_SHULKER_MAGENTA,
				Version.SHULKER_SHULKER_ORANGE,
				Version.SHULKER_SHULKER_PINK,
				Version.SHULKER_SHULKER_PURPLE,
				Version.SHULKER_SHULKER_RED,
				Version.SHULKER_SHULKER_WHITE,
				Version.SHULKER_SHULKER_YELLOW,
				Version.SHULKER_SPARK,
				Version.SIGN,
				Version.SILVERFISH,
				Version.SKELETON_SKELETON,
				Version.SKELETON_STRAY,
				Version.SKELETON_STRAY_OVERLAY,
				Version.SKELETON_WITHER_SKELETON,
				Version.SLIME_MAGMACUBE,
				Version.SLIME_SLIME,
				Version.SNOW_GOLEM,
				Version.SPIDER_CAVE_SPIDER,
				Version.SPIDER_SPIDER,
				Version.SPIDER_EYES,
				Version.SQUID,
				Version.STEVE,
				Version.SWEEP,
				Version.TRIDENT,
				Version.TRIDENT_RIPTIDE,
				Version.TURTLE_BIG_SEA_TURTLE,
				Version.VILLAGER_BUTCHER,
				Version.VILLAGER_FARMER,
				Version.VILLAGER_LIBRARIAN,
				Version.VILLAGER_PRIEST,
				Version.VILLAGER_SMITH,
				Version.VILLAGER_VILLAGER,
				Version.WITCH,
				Version.WITHER_WITHER,
				Version.WITHER_WITHER_ARMOR,
				Version.WITHER_WITHER_INVULNERABLE,
				Version.WOLF_WOLF,
				Version.WOLF_WOLF_ANGRY,
				Version.WOLF_WOLF_COLLAR,
				Version.WOLF_WOLF_TAME,
				Version.ZOMBIE_DROWNED,
				Version.ZOMBIE_DROWNED_OUTER_LAYER,
				Version.ZOMBIE_HUSK,
				Version.ZOMBIE_ZOMBIE,
				Version.ZOMBIE_ZOMBIE_VILLAGER,
				Version.ZOMBIE_PIGMAN,
				Version.ZOMBIE_VILLAGER_ZOMBIE_BUTCHER,
				Version.ZOMBIE_VILLAGER_ZOMBIE_FARMER,
				Version.ZOMBIE_VILLAGER_ZOMBIE_LIBRARIAN,
				Version.ZOMBIE_VILLAGER_ZOMBIE_PRIEST,
				Version.ZOMBIE_VILLAGER_ZOMBIE_SMITH,
				Version.ZOMBIE_VILLAGER_ZOMBIE_VILLAGER,
		}, version);
		DIR_ENVIRONMENT.setTextures(new Texture[]{
				Version.CLOUDS,
				Version.END_SKY,
				Version.MOON_PHASES,
				Version.RAIN,
				Version.SNOW,
				Version.SUN,
		}, version);
		DIR_GUIS.setTextures(new Texture[]{
				Version.ADVANCEMENTS_BACKGROUNDS_ADVENTURE,
				Version.ADVANCEMENTS_BACKGROUNDS_END,
				Version.ADVANCEMENTS_BACKGROUNDS_HUSBANDRY,
				Version.ADVANCEMENTS_BACKGROUNDS_NETHER,
				Version.ADVANCEMENTS_BACKGROUNDS_STONE,
				Version.ADVANCEMENTS_TABS,
				Version.ADVANCEMENTS_WIDGETS,
				Version.ADVANCEMENTS_WINDOW,
				Version.BARS,
				Version.BOOK,
				Version.CONTAINER_ANVIL,
				Version.CONTAINER_BEACON,
				Version.CONTAINER_BREWING_STAND,
				Version.CONTAINER_CRAFTING_TABLE,
				Version.CONTAINER_CREATIVE_INVENTORY_TAB_INVENTORY,
				Version.CONTAINER_CREATIVE_INVENTORY_TAB_ITEM_SEARCH,
				Version.CONTAINER_CREATIVE_INVENTORY_TAB_ITEMS,
				Version.CONTAINER_CREATIVE_INVENTORY_TABS,
				Version.CONTAINER_DISPENSER,
				Version.CONTAINER_ENCHANTING_TABLE,
				Version.CONTAINER_FURNACE,
				Version.CONTAINER_GENERIC_54,
				Version.CONTAINER_HOPPER,
				Version.CONTAINER_HORSE,
				Version.CONTAINER_INVENTORY,
				Version.CONTAINER_SHULKER_BOX,
				Version.CONTAINER_STATS_ICONS,
				Version.CONTAINER_VILLAGER,
				Version.DEMO_BACKGROUND,
				Version.ICONS,
				Version.OPTIONS_BACKGROUND,
				Version.PRESETS_CHAOS,
				Version.PRESETS_DELIGHT,
				Version.PRESETS_DROUGHT,
				Version.PRESETS_ISLES,
				Version.PRESETS_LUCK,
				Version.PRESETS_MADNESS,
				Version.PRESETS_WATER,
				Version.RECIPE_BOOK,
				Version.RECIPE_BUTTON,
				Version.RESOURCE_PACKS,
				Version.SERVER_SELECTION,
				Version.SPECTATOR_WIDGETS,
				Version.STREAM_INDICATOR,
				Version.TITLE_BACKGROUND_PANORAMA_0,
				Version.TITLE_BACKGROUND_PANORAMA_1,
				Version.TITLE_BACKGROUND_PANORAMA_2,
				Version.TITLE_BACKGROUND_PANORAMA_3,
				Version.TITLE_BACKGROUND_PANORAMA_4,
				Version.TITLE_BACKGROUND_PANORAMA_5,
				Version.TITLE_BACKGROUND_PANORAMA_OVERLAY,
				Version.TITLE_EDITION,
				Version.TITLE_MINECRAFT,
				Version.TITLE_MOJANG,
				Version.TOASTS,
				Version.WIDGETS,
				Version.WORLD_SELECTION,
		}, version);
		DIR_ITEMS.setTextures(new Texture[]{
				Version.ACACIA_BOAT,
				Version.ACACIA_DOOR,
				Version.APPLE,
				Version.ARMOR_STAND,
				Version.ARROW,
				Version.BAKED_POTATO,
				Version.BARRIER,
				Version.BEEF,
				Version.BEETROOT,
				Version.BEETROOT_SEEDS,
				Version.BEETROOT_SOUP,
				Version.BIRCH_BOAT,
				Version.BIRCH_DOOR,
				Version.BLAZE_POWDER,
				Version.BLAZE_ROD,
				Version.BONE,
				Version.BONE_MEAL,
				Version.BOOK,
				Version.BOW,
				Version.BOW_PULLING_0,
				Version.BOW_PULLING_1,
				Version.BOW_PULLING_2,
				Version.BOWL,
				Version.BREAD,
				Version.BREWING_STAND,
				Version.BRICK,
				Version.BROKEN_ELYTRA,
				Version.BUCKET,
				Version.CACTUS_GREEN,
				Version.CAKE,
				Version.CARROT,
				Version.CARROT_ON_A_STICK,
				Version.CAULDRON,
				Version.CHAINMAIL_BOOTS,
				Version.CHAINMAIL_CHESTPLATE,
				Version.CHAINMAIL_HELMET,
				Version.CHAINMAIL_LEGGINGS,
				Version.CHARCOAL,
				Version.CHEST_MINECART,
				Version.CHICKEN,
				Version.CHORUS_FRUIT,
				Version.CLAY_BALL,
				Version.CLOCK_00,
				Version.CLOCK_01,
				Version.CLOCK_02,
				Version.CLOCK_03,
				Version.CLOCK_04,
				Version.CLOCK_05,
				Version.CLOCK_06,
				Version.CLOCK_07,
				Version.CLOCK_08,
				Version.CLOCK_09,
				Version.CLOCK_10,
				Version.CLOCK_11,
				Version.CLOCK_12,
				Version.CLOCK_13,
				Version.CLOCK_14,
				Version.CLOCK_15,
				Version.CLOCK_16,
				Version.CLOCK_17,
				Version.CLOCK_18,
				Version.CLOCK_19,
				Version.CLOCK_20,
				Version.CLOCK_21,
				Version.CLOCK_22,
				Version.CLOCK_23,
				Version.CLOCK_24,
				Version.CLOCK_25,
				Version.CLOCK_26,
				Version.CLOCK_27,
				Version.CLOCK_28,
				Version.CLOCK_29,
				Version.CLOCK_30,
				Version.CLOCK_31,
				Version.CLOCK_32,
				Version.CLOCK_33,
				Version.CLOCK_34,
				Version.CLOCK_35,
				Version.CLOCK_36,
				Version.CLOCK_37,
				Version.CLOCK_38,
				Version.CLOCK_39,
				Version.CLOCK_40,
				Version.CLOCK_41,
				Version.CLOCK_42,
				Version.CLOCK_43,
				Version.CLOCK_44,
				Version.CLOCK_45,
				Version.CLOCK_46,
				Version.CLOCK_47,
				Version.CLOCK_48,
				Version.CLOCK_49,
				Version.CLOCK_50,
				Version.CLOCK_51,
				Version.CLOCK_52,
				Version.CLOCK_53,
				Version.CLOCK_54,
				Version.CLOCK_55,
				Version.CLOCK_56,
				Version.CLOCK_57,
				Version.CLOCK_58,
				Version.CLOCK_59,
				Version.CLOCK_60,
				Version.CLOCK_61,
				Version.CLOCK_62,
				Version.CLOCK_63,
				Version.COAL,
				Version.COCOA_BEANS,
				Version.COD,
				Version.COD_BUCKET,
				Version.COMMAND_BLOCK_MINECART,
				Version.COMPARATOR,
				Version.COMPASS_00,
				Version.COMPASS_01,
				Version.COMPASS_02,
				Version.COMPASS_03,
				Version.COMPASS_04,
				Version.COMPASS_05,
				Version.COMPASS_06,
				Version.COMPASS_07,
				Version.COMPASS_08,
				Version.COMPASS_09,
				Version.COMPASS_10,
				Version.COMPASS_11,
				Version.COMPASS_12,
				Version.COMPASS_13,
				Version.COMPASS_14,
				Version.COMPASS_15,
				Version.COMPASS_16,
				Version.COMPASS_17,
				Version.COMPASS_18,
				Version.COMPASS_19,
				Version.COMPASS_20,
				Version.COMPASS_21,
				Version.COMPASS_22,
				Version.COMPASS_23,
				Version.COMPASS_24,
				Version.COMPASS_25,
				Version.COMPASS_26,
				Version.COMPASS_27,
				Version.COMPASS_28,
				Version.COMPASS_29,
				Version.COMPASS_30,
				Version.COMPASS_31,
				Version.COOKED_BEEF,
				Version.COOKED_CHICKEN,
				Version.COOKED_COD,
				Version.COOKED_MUTTON,
				Version.COOKED_PORKCHOP,
				Version.COOKED_RABBIT,
				Version.COOKED_SALMON,
				Version.COOKIE,
				Version.CYAN_DYE,
				Version.DANDELION_YELLOW,
				Version.DARK_OAK_BOAT,
				Version.DARK_OAK_DOOR,
				Version.DIAMOND,
				Version.DIAMOND_AXE,
				Version.DIAMOND_BOOTS,
				Version.DIAMOND_CHESTPLATE,
				Version.DIAMOND_HELMET,
				Version.DIAMOND_HOE,
				Version.DIAMOND_HORSE_ARMOR,
				Version.DIAMOND_LEGGINGS,
				Version.DIAMOND_PICKAXE,
				Version.DIAMOND_SHOVEL,
				Version.DIAMOND_SWORD,
				Version.DRAGON_BREATH,
				Version.DRIED_KELP,
				Version.EGG,
				Version.ELYTRA,
				Version.EMERALD,
				Version.EMPTY_ARMOR_SLOT_BOOTS,
				Version.EMPTY_ARMOR_SLOT_CHESTPLATE,
				Version.EMPTY_ARMOR_SLOT_HELMET,
				Version.EMPTY_ARMOR_SLOT_LEGGINGS,
				Version.EMPTY_ARMOR_SLOT_SHIELD,
				Version.ENCHANTED_BOOK,
				Version.END_CRYSTAL,
				Version.ENDER_EYE,
				Version.ENDER_PEARL,
				Version.EXPERIENCE_BOTTLE,
				Version.FEATHER,
				Version.FERMENTED_SPIDER_EYE,
				Version.FILLED_MAP,
				Version.FILLED_MAP_MARKINGS,
				Version.FIRE_CHARGE,
				Version.FIREWORK_ROCKET,
				Version.FIREWORK_STAR,
				Version.FIREWORK_STAR_OVERLAY,
				Version.FISHING_ROD,
				Version.FISHING_ROD_CAST,
				Version.FLINT,
				Version.FLINT_AND_STEEL,
				Version.FLOWER_POT,
				Version.FURNACE_MINECART,
				Version.GHAST_TEAR,
				Version.GLASS_BOTTLE,
				Version.GLISTERING_MELON_SLICE,
				Version.GLOWSTONE_DUST,
				Version.GOLD_INGOT,
				Version.GOLD_NUGGET,
				Version.GOLDEN_APPLE,
				Version.GOLDEN_AXE,
				Version.GOLDEN_BOOTS,
				Version.GOLDEN_CARROT,
				Version.GOLDEN_CHESTPLATE,
				Version.GOLDEN_HELMET,
				Version.GOLDEN_HOE,
				Version.GOLDEN_HORSE_ARMOR,
				Version.GOLDEN_LEGGINGS,
				Version.GOLDEN_PICKAXE,
				Version.GOLDEN_SHOVEL,
				Version.GOLDEN_SWORD,
				Version.GRAY_DYE,
				Version.GUNPOWDER,
				Version.HEART_OF_THE_SEA,
				Version.HOPPER,
				Version.HOPPER_MINECART,
				Version.INK_SAC,
				Version.IRON_AXE,
				Version.IRON_BOOTS,
				Version.IRON_CHESTPLATE,
				Version.IRON_DOOR,
				Version.IRON_HELMET,
				Version.IRON_HOE,
				Version.IRON_HORSE_ARMOR,
				Version.IRON_INGOT,
				Version.IRON_LEGGINGS,
				Version.IRON_NUGGET,
				Version.IRON_PICKAXE,
				Version.IRON_SHOVEL,
				Version.IRON_SWORD,
				Version.ITEM_FRAME,
				Version.JUNGLE_BOAT,
				Version.JUNGLE_DOOR,
				Version.KELP,
				Version.KNOWLEDGE_BOOK,
				Version.LAPIS_LAZULI,
				Version.LAVA_BUCKET,
				Version.LEAD,
				Version.LEATHER,
				Version.LEATHER_BOOTS,
				Version.LEATHER_BOOTS_OVERLAY,
				Version.LEATHER_CHESTPLATE,
				Version.LEATHER_CHESTPLATE_OVERLAY,
				Version.LEATHER_HELMET,
				Version.LEATHER_HELMET_OVERLAY,
				Version.LEATHER_LEGGINGS,
				Version.LEATHER_LEGGINGS_OVERLAY,
				Version.LIGHT_BLUE_DYE,
				Version.LIGHT_GRAY_DYE,
				Version.LIME_DYE,
				Version.LINGERING_POTION,
				Version.MAGENTA_DYE,
				Version.MAGMA_CREAM,
				Version.MAP,
				Version.MELON_SEEDS,
				Version.MELON_SLICE,
				Version.MILK_BUCKET,
				Version.MINECART,
				Version.MUSHROOM_STEW,
				Version.MUSIC_DISC_11,
				Version.MUSIC_DISC_13,
				Version.MUSIC_DISC_BLOCKS,
				Version.MUSIC_DISC_CAT,
				Version.MUSIC_DISC_CHIRP,
				Version.MUSIC_DISC_FAR,
				Version.MUSIC_DISC_MALL,
				Version.MUSIC_DISC_MELLOHI,
				Version.MUSIC_DISC_STAL,
				Version.MUSIC_DISC_STRAD,
				Version.MUSIC_DISC_WAIT,
				Version.MUSIC_DISC_WARD,
				Version.MUTTON,
				Version.NAME_TAG,
				Version.NAUTILUS_SHELL,
				Version.NETHER_BRICK,
				Version.NETHER_STAR,
				Version.NETHER_WART,
				Version.OAK_BOAT,
				Version.OAK_DOOR,
				Version.ORANGE_DYE,
				Version.PAINTING,
				Version.PAPER,
				Version.PHANTOM_MEMBRANE,
				Version.PINK_DYE,
				Version.POISONOUS_POTATO,
				Version.POPPED_CHORUS_FRUIT,
				Version.PORKCHOP,
				Version.POTATO,
				Version.POTION,
				Version.POTION_OVERLAY,
				Version.PRISMARINE_CRYSTALS,
				Version.PRISMARINE_SHARD,
				Version.PUFFERFISH,
				Version.PUFFERFISH_BUCKET,
				Version.PUMPKIN_PIE,
				Version.PUMPKIN_SEEDS,
				Version.PURPLE_DYE,
				Version.QUARTZ,
				Version.RABBIT,
				Version.RABBIT_FOOT,
				Version.RABBIT_HIDE,
				Version.RABBIT_STEW,
				Version.REDSTONE,
				Version.REPEATER,
				Version.ROSE_RED,
				Version.ROTTEN_FLESH,
				Version.RUBY,
				Version.SADDLE,
				Version.SALMON,
				Version.SALMON_BUCKET,
				Version.SCUTE,
				Version.SEA_PICKLE,
				Version.SEAGRASS,
				Version.SHEARS,
				Version.SHULKER_SHELL,
				Version.SIGN,
				Version.SLIME_BALL,
				Version.SNOWBALL,
				Version.SPAWN_EGG,
				Version.SPAWN_EGG_OVERLAY,
				Version.SPECTRAL_ARROW,
				Version.SPIDER_EYE,
				Version.SPLASH_POTION,
				Version.SPRUCE_BOAT,
				Version.SPRUCE_DOOR,
				Version.STICK,
				Version.STONE_AXE,
				Version.STONE_HOE,
				Version.STONE_PICKAXE,
				Version.STONE_SHOVEL,
				Version.STONE_SWORD,
				Version.STRING,
				Version.STRUCTURE_VOID,
				Version.SUGAR,
				Version.SUGAR_CANE,
				Version.TIPPED_ARROW_BASE,
				Version.TIPPED_ARROW_HEAD,
				Version.TNT_MINECART,
				Version.TOTEM_OF_UNDYING,
				Version.TRIDENT,
				Version.TROPICAL_FISH,
				Version.TROPICAL_FISH_BUCKET,
				Version.TURTLE_EGG,
				Version.TURTLE_HELMET,
				Version.WATER_BUCKET,
				Version.WHEAT,
				Version.WHEAT_SEEDS,
				Version.WOODEN_AXE,
				Version.WOODEN_HOE,
				Version.WOODEN_PICKAXE,
				Version.WOODEN_SHOVEL,
				Version.WOODEN_SWORD,
				Version.WRITABLE_BOOK,
				Version.WRITTEN_BOOK,
		}, version);
		DIR_MAP.setTextures(new Texture[]{
				Version.MAP_BACKGROUND,
				Version.MAP_ICONS,
		}, version);
		DIR_MISC.setTextures(new Texture[]{
				Version.ENCHANTED_ITEM_GLINT,
				Version.FORCEFIELD,
				Version.PUMPKINBLUR,
				Version.SHADOW,
				Version.UNDERWATER,
				Version.UNKNOWN_PACK,
				Version.UNKNOWN_SERVER,
				Version.VIGNETTE,
		}, version);
		DIR_MODELS.setTextures(new Texture[]{
				Version.ARMOR_CHAINMAIL_LAYER_1,
				Version.ARMOR_CHAINMAIL_LAYER_2,
				Version.ARMOR_DIAMOND_LAYER_1,
				Version.ARMOR_DIAMOND_LAYER_2,
				Version.ARMOR_GOLD_LAYER_1,
				Version.ARMOR_GOLD_LAYER_2,
				Version.ARMOR_IRON_LAYER_1,
				Version.ARMOR_IRON_LAYER_2,
				Version.ARMOR_LEATHER_LAYER_1,
				Version.ARMOR_LEATHER_LAYER_1_OVERLAY,
				Version.ARMOR_LEATHER_LAYER_2,
				Version.ARMOR_LEATHER_LAYER_2_OVERLAY,
				Version.ARMOR_TURTLE_LAYER_1,
		}, version);
		DIR_PAINTINGS.setTextures(new Texture[]{
				Version.PAINTINGS_KRISTOFFER_ZETTERSTRAND,
		}, version);
		DIR_PARTICLES.setTextures(new Texture[]{
				Version.FOOTPRINT,
				Version.PARTICLES,
		}, version);
	}
}
