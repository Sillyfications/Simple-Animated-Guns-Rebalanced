package net.elidhan.anim_guns.item;

import net.elidhan.anim_guns.AnimatedGuns;
import net.elidhan.anim_guns.sound.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
	public static final Item HARDENED_IRON_INGOT = registerItem("hardened_iron_ingot", new Item(new FabricItemSettings().group(AnimatedGuns.MISC).maxCount(64)));
    public static final Item HARDENED_IRON_NUGGET = registerItem("hardened_iron_nugget", new Item(new FabricItemSettings().group(AnimatedGuns.MISC).maxCount(64)));
	public static final Item PLASTIC = registerItem("plastic", new Item(new FabricItemSettings().group(AnimatedGuns.MISC).maxCount(64)));
	public static final Item ENRICHED_IRON = registerItem("enriched_iron", new Item(new FabricItemSettings().group(AnimatedGuns.MISC).maxCount(64)));

	public static final Item PISTOL_GRIP = registerItem("pistol_grip", new Item(new FabricItemSettings().group(AnimatedGuns.MISC).maxCount(64)));
	public static final Item GUN_SCOPE = registerItem("gun_scope", new Item(new FabricItemSettings().group(AnimatedGuns.MISC).maxCount(64)));

	public static final Item LONG_BARREL = registerItem("long_barrel", new Item(new FabricItemSettings().group(AnimatedGuns.MISC).maxCount(64)));
	public static final Item SHORT_BARREL = registerItem("short_barrel", new Item(new FabricItemSettings().group(AnimatedGuns.MISC).maxCount(64)));
	public static final Item WOODEN_STOCK = registerItem("wooden_stock", new Item(new FabricItemSettings().group(AnimatedGuns.MISC).maxCount(64)));
	public static final Item MODERN_STOCK = registerItem("modern_stock", new Item(new FabricItemSettings().group(AnimatedGuns.MISC).maxCount(64)));
	public static final Item WOODEN_HANDGUARD = registerItem("wooden_handguard", new Item(new FabricItemSettings().group(AnimatedGuns.MISC).maxCount(64)));
	public static final Item MODERN_HANDGUARD = registerItem("modern_handguard", new Item(new FabricItemSettings().group(AnimatedGuns.MISC).maxCount(64)));
	public static final Item PISTOL_MAGAZINE = registerItem("pistol_magazine", new Item(new FabricItemSettings().group(AnimatedGuns.MISC).maxCount(64)));
	public static final Item REVOLVER_CHAMBER = registerItem("revolver_chamber", new Item(new FabricItemSettings().group(AnimatedGuns.MISC).maxCount(64)));
	public static final Item SMG_MAGAZINE = registerItem("smg_magazine", new Item(new FabricItemSettings().group(AnimatedGuns.MISC).maxCount(64)));
	public static final Item RIFLE_MAGAZINE = registerItem("rifle_magazine", new Item(new FabricItemSettings().group(AnimatedGuns.MISC).maxCount(64)));
	public static final Item TUBE_MAGAZINE = registerItem("tube_magazine", new Item(new FabricItemSettings().group(AnimatedGuns.MISC).maxCount(64)));
    public static final Item LMG_AMMO_BOX = registerItem("lmg_ammo_box", new Item(new FabricItemSettings().group(AnimatedGuns.MISC).maxCount(64)));

	public static final Item BLUEPRINT_BUNDLE = registerItem("blueprint_bundle", new BlueprintBundleItem(new FabricItemSettings().group(AnimatedGuns.MISC).maxCount(1)));

	public static final Item PISTOL_BLUEPRINT = registerItem("blueprint_pistol_light", new BlueprintItem(new FabricItemSettings().group(AnimatedGuns.MISC).maxCount(1)));
	public static final Item HEAVY_PISTOL_BLUEPRINT = registerItem("blueprint_pistol_heavy", new BlueprintItem(new FabricItemSettings().group(AnimatedGuns.MISC).maxCount(1)));
	public static final Item MAGNUM_REVOLVER_BLUEPRINT = registerItem("blueprint_revolver_magnum", new BlueprintItem(new FabricItemSettings().group(AnimatedGuns.MISC).maxCount(1)));
	public static final Item OLD_ARMY_REVOLVER_BLUEPRINT = registerItem("blueprint_revolver_coltarmy", new BlueprintItem(new FabricItemSettings().group(AnimatedGuns.MISC).maxCount(1)));
	public static final Item MACHINE_PISTOL_BLUEPRINT = registerItem("blueprint_smg_machinepistol", new BlueprintItem(new FabricItemSettings().group(AnimatedGuns.MISC).maxCount(1)));
	public static final Item HEAVY_SMG_BLUEPRINT = registerItem("blueprint_smg_heavy", new BlueprintItem(new FabricItemSettings().group(AnimatedGuns.MISC).maxCount(1)));
	public static final Item LIGHT_ASSAULT_RIFLE_BLUEPRINT = registerItem("blueprint_assaultrifle_light", new BlueprintItem(new FabricItemSettings().group(AnimatedGuns.MISC).maxCount(1)));
	public static final Item HEAVY_ASSAULT_RIFLE_BLUEPRINT = registerItem("blueprint_assaultrifle_heavy", new BlueprintItem(new FabricItemSettings().group(AnimatedGuns.MISC).maxCount(1)));
	public static final Item WAR_TORN_ASSAULT_RIFLE_BLUEPRINT = registerItem("blueprint_assaultrifle_rus", new BlueprintItem(new FabricItemSettings().group(AnimatedGuns.MISC).maxCount(1)));
	public static final Item COMBAT_SHOTGUN_BLUEPRINT = registerItem("blueprint_shotgun_combat", new BlueprintItem(new FabricItemSettings().group(AnimatedGuns.MISC).maxCount(1)));
	public static final Item RIOT_SHOTGUN_BLUEPRINT = registerItem("blueprint_shotgun_riot", new BlueprintItem(new FabricItemSettings().group(AnimatedGuns.MISC).maxCount(1)));
	public static final Item DOUBLE_BARRELED_SHOTGUN_BLUEPRINT = registerItem("blueprint_shotgun_doublebarrel", new BlueprintItem(new FabricItemSettings().group(AnimatedGuns.MISC).maxCount(1)));
	public static final Item CLASSIC_SNIPER_RIFLE_BLUEPRINT = registerItem("blueprint_sniper_classic", new BlueprintItem(new FabricItemSettings().group(AnimatedGuns.MISC).maxCount(1)));
	public static final Item BRUSH_GUN_BLUEPRINT = registerItem("blueprint_sniper_cowboy", new BlueprintItem(new FabricItemSettings().group(AnimatedGuns.MISC).maxCount(1)));
	public static final Item LMG_BLUEPRINT = registerItem("blueprint_lmg_m60", new BlueprintItem(new FabricItemSettings().group(AnimatedGuns.MISC).maxCount(1)));

	public static final Item STANDARD_HANDGUN_BULLET = registerItem("standard_handgun_cartridge", new Item(new FabricItemSettings().group(AnimatedGuns.GUNS).maxCount(64)));
	public static final Item HEAVY_HANDGUN_BULLET = registerItem("heavy_handgun_cartridge", new Item(new FabricItemSettings().group(AnimatedGuns.GUNS).maxCount(64)));
	public static final Item STANDARD_RIFLE_BULLET = registerItem("standard_rifle_cartridge", new Item(new FabricItemSettings().group(AnimatedGuns.GUNS).maxCount(64)));
	public static final Item HEAVY_RIFLE_BULLET = registerItem("heavy_rifle_cartridge", new Item(new FabricItemSettings().group(AnimatedGuns.GUNS).maxCount(64)));
	public static final Item SHOTGUN_SHELL = registerItem("shotgun_shell", new Item(new FabricItemSettings().group(AnimatedGuns.GUNS).maxCount(64)));

	public static final Item PISTOL = registerItem("pistol_light", new GunItem(new FabricItemSettings().group(AnimatedGuns.GUNS).maxCount(1),
			"pistol_light", //id name of gun [gunID]
			"pistol_generic", //animation id of gun [animationID]
			4f, //damage (2.5 hearts) [gunDamage]
			4, //rate of fire [rateOfFire]
			17, //magazine capacity [magSize]
			STANDARD_HANDGUN_BULLET, // ammo type (might be 9mm) [ammoType]
			35, //reload time (code divides this value to 20, actual reload time is 1,75 seconds) [reloadCooldown]
			new float[] {1.5f, 1.5f}, //bullet spread [bulletSpread]
			new float[] {1f, 2.5f}, //recoil [gunRecoil]
			1, //number of fired bullets [pelletCount]
			GunItem.LoadingType.MAGAZINE, //how do we reload? [loadingType]
			null, //reload start sound [reloadSoundStart]
			ModSounds.RELOAD_GENERIC_PISTOL_P1, //reload mag out sound [reloadSoundMagOut]
			ModSounds.RELOAD_GENERIC_PISTOL_P2, //reload mag in sound [reloadSoundMagIn]
			ModSounds.RELOAD_GENERIC_PISTOL_P3, //reload end sound [reloadSoundEnd]
			ModSounds.PISTOL_LIGHT, //shoot sound [shootSound]
			1, //reload cycles (used for shotguns) [reloadCycles]
			false, //does this weapon have a scope? [isScoped]
			false, //is this weapon going to unscope every shot?
			10, //first animation (clip out) [reloadStage1]
			11, //second animation (clip in) [reloadStage2]
			21) //third animation (slide release) [reloadStage3]
	{
	});
	public static final Item HEAVY_PISTOL = registerItem("pistol_heavy", new GunItem(new FabricItemSettings().group(AnimatedGuns.GUNS).maxCount(1),
			"pistol_heavy",
			"pistol_heavy",
			8f,
			8,
			7,
			HEAVY_HANDGUN_BULLET,
			35,
			new float[] {1.5f, 1.5f},
			new float[] {3f, 8.5f},
			1,
			GunItem.LoadingType.MAGAZINE,
			null,
			ModSounds.RELOAD_GENERIC_PISTOL_P1,
			ModSounds.RELOAD_GENERIC_PISTOL_P2,
			ModSounds.RELOAD_GENERIC_PISTOL_P3,
			ModSounds.PISTOL_HEAVY,
			1,
			false,
			false,
			10,
			11,
			21)
	{
	});
    public static final Item MAGNUM_REVOLVER = registerItem("revolver_magnum", new GunItem(new FabricItemSettings().group(AnimatedGuns.GUNS).maxCount(1),
			"revolver_magnum",
			"revolver_generic",
			8f,
            10,
            6,
            HEAVY_HANDGUN_BULLET,
            44,
			new float[] {0.125f, 0.125f},
			new float[] {2f, 6f},
            1,
			GunItem.LoadingType.MAGAZINE,
			ModSounds.RELOAD_GENERIC_REVOLVER_P0,
			ModSounds.RELOAD_GENERIC_REVOLVER_P1,
			ModSounds.RELOAD_GENERIC_REVOLVER_P2,
			ModSounds.RELOAD_GENERIC_REVOLVER_P3,
            ModSounds.REVOLVER_MAGNUM,
            1,
            false,
			false,
            10,
            20,
            30)
    {
    });
    public static final Item OLD_ARMY_REVOLVER = registerItem("revolver_coltarmy", new GunItem(new FabricItemSettings().group(AnimatedGuns.GUNS).maxCount(1),
            "revolver_coltarmy",
            "revolver_coltarmy",
            17,
            20,
            6,
            HEAVY_HANDGUN_BULLET,
            70,
			new float[] {0.125f, 0.125f},
			new float[] {2f, 8.5f},
            1,
			GunItem.LoadingType.PER_CARTRIDGE,
			null,
            ModSounds.RELOAD_OLD_ARMY_REVOLVER_P1,
            ModSounds.RELOAD_OLD_ARMY_REVOLVER_P2,
            ModSounds.RELOAD_OLD_ARMY_REVOLVER_P3,
            ModSounds.REVOLVER_COLTARMY,
            6,
            false,
			false,
            20,
            21,
            50)
    {
    });
	public static final Item MACHINE_PISTOL = registerItem("smg_machinepistol", new GunItem(new FabricItemSettings().group(AnimatedGuns.GUNS).maxCount(1),
			"smg_machinepistol",
			"smg_machinepistol",
			3f,
			2,
			30,
			STANDARD_HANDGUN_BULLET,
			35,
			new float[] {2.5f, 5f},
			new float[] {2.5f, 1.5f},
			1,
			GunItem.LoadingType.MAGAZINE,
			null,
			ModSounds.RELOAD_GENERIC_SMG_P1,
			ModSounds.RELOAD_GENERIC_SMG_P2,
			ModSounds.RELOAD_GENERIC_SMG_P3,
			ModSounds.SMG_MACHINEPISTOL,
			1,
			false,
			false,
			10,
			11,
			21)
	{
	});
    public static final Item HEAVY_SMG = registerItem("smg_heavy", new GunItem(new FabricItemSettings().group(AnimatedGuns.GUNS).maxCount(1),
            "smg_heavy",
            "smg_heavy",
            4f,
            3,
            25,
            STANDARD_HANDGUN_BULLET,
            60,
			new float[] {2.5f, 3.5f},
            new float[] {1.5f, 2f},
            1,
			GunItem.LoadingType.MAGAZINE,
			ModSounds.RELOAD_HEAVY_SMG_P0,
            ModSounds.RELOAD_HEAVY_SMG_P1,
            ModSounds.RELOAD_HEAVY_SMG_P2,
            ModSounds.RELOAD_HEAVY_SMG_P3,
            ModSounds.SMG_HEAVY,
            1,
            false,
			false,
            20,
            27,
            49)
    {
    });
	public static final Item LIGHT_ASSAULT_RIFLE = registerItem("assaultrifle_light", new GunItem(new FabricItemSettings().group(AnimatedGuns.GUNS).maxCount(1),
		"assaultrifle_light",
		"assaultrifle_generic",
		5f,
		3,
		30,
		STANDARD_RIFLE_BULLET,
		50,
		new float[] {0.5f, 0.5f},
		new float[] {1f, 2f},
		1,
		GunItem.LoadingType.MAGAZINE,
		null,
		ModSounds.RELOAD_GENERIC_AR_P1,
		ModSounds.RELOAD_GENERIC_AR_P2,
		ModSounds.RELOAD_GENERIC_AR_P3,
		ModSounds.ASSAULTRIFLE_LIGHT,
		1,
		false,
		false,
		5,
		21,
		32)
	{
	});
	public static final Item HEAVY_ASSAULT_RIFLE = registerItem("assaultrifle_heavy", new GunItem(new FabricItemSettings().group(AnimatedGuns.GUNS).maxCount(1),
		"assaultrifle_heavy",
		"assaultrifle_heavy",
		7f,
		7,
		20,
		STANDARD_RIFLE_BULLET,
		50,
		new float[] {0.5f, 0.5f},
		new float[] {1.25f, 3.5f},
		1,
		GunItem.LoadingType.MAGAZINE,
		null,
		ModSounds.RELOAD_HEAVY_AR_P1,
		ModSounds.RELOAD_HEAVY_AR_P2,
		ModSounds.RELOAD_HEAVY_AR_P3,
		ModSounds.ASSAULTRIFLE_HEAVY,
		1,
		false,
		false,
		5,
		21,
		32)
	{
	});
    public static final Item WAR_TORN_ASSAULT_RIFLE = registerItem("assaultrifle_rus", new GunItem(new FabricItemSettings().group(AnimatedGuns.GUNS).maxCount(1),
			"assaultrifle_rus",
			"assaultrifle_rus",
            6f,
            4,
            30,
            STANDARD_RIFLE_BULLET,
            50,
			new float[] {1.5f, 1.5f},
			new float[] {2.25f, 3f},
            1,
			GunItem.LoadingType.MAGAZINE,
			null,
			ModSounds.RELOAD_WAR_TORN_AR_P1,
			ModSounds.RELOAD_WAR_TORN_AR_P2,
			ModSounds.RELOAD_WAR_TORN_AR_P3,
            ModSounds.ASSAULTRIFLE_RUS,
            1,
            false,
			false,
            10,
            24,
            39)
    {
    });

	public static final Item DOUBLE_BARRELED_SHOTGUN = registerItem("shotgun_doublebarrel", new GunItem(new FabricItemSettings().group(AnimatedGuns.GUNS).maxCount(1),
			"shotgun_doublebarrel",
			"shotgun_doublebarrel",
			7f,
			4,
			2,
			SHOTGUN_SHELL,
			44,
			new float[] {7.5f, 7.5f},
			new float[] {0.5f, 15f},
			6,
			GunItem.LoadingType.MAGAZINE,
			null,
			ModSounds.RELOAD_DOUBLE_BARREL_SHOTGUN_P1,
			ModSounds.RELOAD_DOUBLE_BARREL_SHOTGUN_P2,
			ModSounds.RELOAD_DOUBLE_BARREL_SHOTGUN_P3,
			ModSounds.SHOTGUN_DOUBLEBARREL,
			1,
			false,
			false,
			11,
			12,
			30)
	{
	});

	public static final Item COMBAT_SHOTGUN = registerItem("shotgun_combat", new GunItem(new FabricItemSettings().group(AnimatedGuns.GUNS).maxCount(1),
		"shotgun_combat",
		"shotgun_combat",
        5.5f,
        15,
        6,
        SHOTGUN_SHELL,
        26,
		new float[] {2.5f, 3.5f},
		new float[] {1f, 8.25f},
        5,
		GunItem.LoadingType.PER_CARTRIDGE,
		null,
		ModSounds.RELOAD_COMBAT_SHOTGUN_P1,
		ModSounds.RELOAD_COMBAT_SHOTGUN_P2,
		ModSounds.RELOAD_COMBAT_SHOTGUN_P3,
        ModSounds.SHOTGUN_COMBAT,
        6,
        false,
		false,
        4,
        5,
        15)
	{
	});

    public static final Item RIOT_SHOTGUN = registerItem("shotgun_riot", new GunItem(new FabricItemSettings().group(AnimatedGuns.GUNS).maxCount(1),
            "shotgun_riot",
            "shotgun_riot",
            2.5f,
            8,
            8,
            SHOTGUN_SHELL,
            28,
			new float[] {1.25f, 12.5f},
            new float[] {2f, 6.25f},
            10,
            GunItem.LoadingType.PER_CARTRIDGE,
            null,
            ModSounds.RELOAD_RIOT_SHOTGUN_P1,
            ModSounds.RELOAD_RIOT_SHOTGUN_P2,
            ModSounds.RELOAD_RIOT_SHOTGUN_P3,
            ModSounds.SHOTGUN_RIOT,
            8,
            false,
			false,
            4,
            5,
            17)
    {
    });

	public static final Item CLASSIC_SNIPER_RIFLE = registerItem("sniper_classic", new GunItem(new FabricItemSettings().group(AnimatedGuns.GUNS).maxCount(1),
		"sniper_classic",
		"sniper_classic",
        16f,
        20,
        5,
        HEAVY_RIFLE_BULLET,
        36,
        new float[] {0.125f, 0.125f},
		new float[]{2.5f, 8.25f},
        1,
		GunItem.LoadingType.PER_CARTRIDGE,
		null,
		ModSounds.RELOAD_GENERIC_SNIPER_P1,
		ModSounds.RELOAD_CLASSIC_SNIPER_P2,
		ModSounds.RELOAD_GENERIC_SNIPER_P3,
        ModSounds.SNIPER_CLASSIC,
        5,
        true,
		true,
        12,
        13,
        24)
	{
	});

	public static final Item BRUSH_GUN = registerItem("sniper_cowboy", new GunItem(new FabricItemSettings().group(AnimatedGuns.GUNS).maxCount(1),
			"sniper_cowboy",
			"sniper_cowboy",
			9f,
			12,
			10,
			HEAVY_HANDGUN_BULLET,
			36,
			new float[] {0.25f, 0.75f},
			new float[] {1.75f, 5.25f},
			1,
			GunItem.LoadingType.PER_CARTRIDGE,
			null,
			ModSounds.RELOAD_BRUSH_GUN_P1,
			ModSounds.RELOAD_BRUSH_GUN_P2,
			ModSounds.RELOAD_BRUSH_GUN_P3,
			ModSounds.SNIPER_COWBOY,
			10,
			false,
			false,
			8,
			9,
			21)
	{
	});

	public static final Item LMG = registerItem("lmg_m60", new GunItem(new FabricItemSettings().group(AnimatedGuns.GUNS).maxCount(1),
			"lmg_m60",
			"lmg_m60",
			5,
			3,
			100,
			STANDARD_RIFLE_BULLET,
			117,
			new float[] {0.5f, 0.5f},
			new float[] {1f, 2f},
			1,
			GunItem.LoadingType.MAGAZINE,
			ModSounds.RELOAD_M60_P0,
			ModSounds.RELOAD_M60_P1,
			ModSounds.RELOAD_M60_P2,
			ModSounds.RELOAD_M60_P3,
			ModSounds.LMG_M60,
			1,
			false,
			false,
			49,
			70,
			90)
	{
	});

	private static Item registerItem(String name, Item item)
	{
		return Registry.register(Registry.ITEM, new Identifier(AnimatedGuns.MOD_ID, name), item);
	}
	
	public static void registerModItems()
	{
		AnimatedGuns.LOGGER.info("Registering ModItems for " + AnimatedGuns.MOD_ID);
	}

}
