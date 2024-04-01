package cursedbread.whatsthematter;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.WeightedRandomLootObject;
import net.minecraft.core.block.Block;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemDye;
import net.minecraft.core.item.ItemStack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.helper.recipeBuilders.RecipeBuilderShaped;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;


public class CraftTheMatter implements RecipeEntrypoint {
	public static final String MOD_ID = "whatsthematter";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void initNamespaces() {
		Registries.ITEM_GROUPS.register("whatsthematter:matterblocks", Registries.stackListOf(
			WhatsTheMatter.redMatter,
			WhatsTheMatter.grayMatter,
			WhatsTheMatter.orangeMatter,
			WhatsTheMatter.blueMatter));

		Registries.ITEM_GROUPS.register("whatsthematter:sponges", Registries.stackListOf(
			Block.spongeDry,
			Block.spongeWet));

		Registries.ITEM_GROUPS.register("whatsthematter:coldwater", Registries.stackListOf(
			Block.ice,
			Block.permaice));

		Registries.ITEM_GROUPS.register("whatsthematter:coldlava", Registries.stackListOf(
			Block.obsidian,
			Block.netherrackIgneous));
	}
	@Override
	public void onRecipesReady() {
		if (WhatsTheMatter.noteCraftsEnabled == 1) {
			RecipeBuilder.Shapeless(MOD_ID)
				.addInput(Item.book)
				.addInput(Item.dye, 0)
				.addInput(Item.featherChicken)
				.addInput(Item.dustGlowstone)
				.addInput(Item.dustRedstone)
				.create("containmentNoteCrafting", new ItemStack(WhatsTheMatter.containingNote, 1));
		}
		if (WhatsTheMatter.redCraftsEnabled == 1) {
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("HHH", "HMH", "HHH")
				.addInput('H', Block.blockRedstone)
				.addInput('M', WhatsTheMatter.whiteMatter)
				.create("redMatterCrafting", new ItemStack(WhatsTheMatter.redMatter, 1));
		}
		if (WhatsTheMatter.grayCraftsEnabled == 1) {
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("HHH", "HMH", "HHH")
				.addInput('H', Block.blockSteel)
				.addInput('M', WhatsTheMatter.whiteMatter)
				.create("grayMatterCrafting", new ItemStack(WhatsTheMatter.grayMatter, 1));
		}
		if (WhatsTheMatter.orangeCraftsEnabled == 1) {
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("HHH", "HMH", "HHH")
				.addInput('H', Item.bucketLava)
				.addInput('M', WhatsTheMatter.whiteMatter)
				.create("orangeMatterCrafting", new ItemStack(WhatsTheMatter.orangeMatter, 1));
		}
		if (WhatsTheMatter.blueCraftsEnabled == 1) {
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("HHH", "HMH", "HHH")
				.addInput('H', Item.bucketWater)
				.addInput('M', WhatsTheMatter.whiteMatter)
				.create("blueMatterCrafting", new ItemStack(WhatsTheMatter.blueMatter, 1));
		}

		if (WhatsTheMatter.spongeCraftsEnabled == 1) {
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("HHH", "HMH", "HHH")
				.addInput('H', "whatsthematter:sponges")
				.addInput('M', WhatsTheMatter.whiteMatter)
				.create("spongeMatterCrafting", new ItemStack(WhatsTheMatter.spongeMatter, 1));
		}

		if (WhatsTheMatter.coldCraftsEnabled == 1) {
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("BHB", "HMH", "BHB")
				.addInput('H', "whatsthematter:coldwater")
				.addInput('B', "whatsthematter:coldlava")
				.addInput('M', WhatsTheMatter.whiteMatter)
				.create("coldMatterCrafting", new ItemStack(WhatsTheMatter.coldMatter, 1));
		}

		if (WhatsTheMatter.hotCraftsEnabled == 1) {
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("BHB", "HMH", "BHB")
				.addInput('H', Item.bucketWater)
				.addInput('B', Item.bucketLava)
				.addInput('M', WhatsTheMatter.whiteMatter)
				.create("coldMatterCrafting", new ItemStack(WhatsTheMatter.hotMatter, 1));
		}

		if (WhatsTheMatter.cloneCraftsEnabled == 1) {
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("HHH", "HMH", "HHH")
				.addInput('H', "minecraft:grasses")
				.addInput('M', WhatsTheMatter.whiteMatter)
				.create("spongeMatterCrafting", new ItemStack(WhatsTheMatter.cloneMatter, 1));
		}

		if (WhatsTheMatter.mossCraftsEnabled == 1) {
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("HHH", "HMH", "HHH")
				.addInput('H', "minecraft:moss_stones")
				.addInput('M', WhatsTheMatter.whiteMatter)
				.create("spongeMatterCrafting", new ItemStack(WhatsTheMatter.mossMatter, 1));
		}

		if (WhatsTheMatter.unmossCraftsEnabled == 1) {
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("HHH", "HMH", "HHH")
				.addInput('H', Item.toolShears)
				.addInput('M', WhatsTheMatter.whiteMatter)
				.create("spongeMatterCrafting", new ItemStack(WhatsTheMatter.unmossMatter, 1));
		}
	}
}
