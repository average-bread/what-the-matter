package cursedbread.whatsthematter;

import cursedbread.whatsthematter.matterblocks.BlueMatter;
import cursedbread.whatsthematter.matterblocks.GrayMatter;
import cursedbread.whatsthematter.matterblocks.OrangeMatter;
import cursedbread.whatsthematter.matterblocks.RedMatter;
import net.fabricmc.api.ModInitializer;
import net.minecraft.client.render.block.model.BlockModelRenderBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.sound.BlockSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.util.ConfigHandler;
import turniplabs.halplibe.util.GameStartEntrypoint;

import java.util.Properties;


public class WhatsTheMatter implements ModInitializer, GameStartEntrypoint {
	public static final String MOD_ID = "whatsthematter";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static BlockBuilder standardBlockBuilder = new BlockBuilder(MOD_ID)
		.setNorthTexture(16, 8) // the coordinates of the blue N texture from the terrain atlas
		.setSouthTexture(17, 8) // the coordinates of the green S texture from the terrain atlas
		.setBottomTexture(18, 8) // the coordinates of the purple D texture from the terrain atlas
		.setEastTexture(16, 9) // the coordinates of the red E texture from the terrain atlas
		.setWestTexture(17, 9) // the coordinates of the yellow W texture from the terrain atlas
		.setTopTexture(18, 9) // the coordinates of the orange U texture from the terrain atlas
		.setHardness(5f); // Sets the hardness which affects the time to mine the blocks

	public static BlockBuilder matterBlock = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelRenderBlocks(0))
		.setTags(BlockTags.FENCES_CONNECT)
		.setHardness(5.0f)
		.setResistance(10.0f)
		.setBlockSound(BlockSounds.STONE);

	public static int blockId;
	public static int redCraftsEnabled;
	public static int grayCraftsEnabled;
	public static int orangeCraftsEnabled;
	public static int blueCraftsEnabled;

	public static Block redMatter;
	public static Block grayMatter;
	public static Block orangeMatter;
	public static Block blueMatter;

	static {
		Properties prop = new Properties();
		prop.setProperty("starting_block_id","2000");
		prop.setProperty("Red_Matter_crafting(0_means_no_|_1_means_yes)", "0");
		prop.setProperty("Gray_Matter_crafting(0_means_no_|_1_means_yes)", "0");
		prop.setProperty("Orange_Matter_crafting(0_means_no_|_1_means_yes)", "0");
		prop.setProperty("Blue_Matter_crafting(0_means_no_|_1_means_yes)", "0");
		ConfigHandler config = new ConfigHandler(MOD_ID,prop);

		blockId = config.getInt("starting_block_id");

		redCraftsEnabled = config.getInt("Red_Matter_crafting(0_means_no_|_1_means_yes)");
		grayCraftsEnabled = config.getInt("Gray_Matter_crafting(0_means_no_|_1_means_yes)");
		orangeCraftsEnabled= config.getInt("Orange_Matter_crafting(0_means_no_|_1_means_yes)");
		blueCraftsEnabled = config.getInt("Blue_Matter_crafting(0_means_no_|_1_means_yes)");

		config.updateConfig();
	}
	@Override
	public void onInitialize() {
		LOGGER.info("What the Matter?");
	}

	@Override
	public void beforeGameStart() {

		redMatter = matterBlock
			.setTextures("redmatter.png")
			.build(new RedMatter("redmatter", blockId++));

		grayMatter = matterBlock
			.setTextures("graymatter.png")
			.build(new GrayMatter("graymatter", blockId++));

		orangeMatter = matterBlock
			.setTextures("orangematter.png")
			.build(new OrangeMatter("orangematter", blockId++));

		blueMatter = matterBlock
			.setTextures("bluematter.png")
			.build(new BlueMatter("bluematter", blockId++));


	}

	@Override
	public void afterGameStart() {

	}
}
