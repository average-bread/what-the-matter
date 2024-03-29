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
	public static final String MOD_ID = "What's The Matter?";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void initNamespaces() {
		Registries.ITEM_GROUPS.register("whatsthematter:matterblocks", Registries.stackListOf(
			WhatsTheMatter.redMatter,
			WhatsTheMatter.grayMatter,
			WhatsTheMatter.orangeMatter,
			WhatsTheMatter.blueMatter));
	}
	@Override
	public void onRecipesReady() {
		if (WhatsTheMatter.redCraftsEnabled == 1) {
			RecipeBuilder.Shapeless(MOD_ID)
				.addInput(Block.blockRedstone)
				.addInput(Block.blockRedstone)
				.create("redMatterCrafting", new ItemStack(WhatsTheMatter.redMatter, 1));
		}
		if (WhatsTheMatter.grayCraftsEnabled == 1) {
			RecipeBuilder.Shapeless(MOD_ID)
				.addInput(Block.blockSteel)
				.addInput(Block.blockSteel)
				.create("grayMatterCrafting", new ItemStack(WhatsTheMatter.grayMatter, 1));
		}
		if (WhatsTheMatter.orangeCraftsEnabled == 1) {
			RecipeBuilder.Shapeless(MOD_ID)
				.addInput(Item.bucketLava)
				.addInput(Item.bucketLava)
				.create("orangeMatterCrafting", new ItemStack(WhatsTheMatter.orangeMatter, 1));
		}
		if (WhatsTheMatter.blueCraftsEnabled == 1) {
			RecipeBuilder.Shapeless(MOD_ID)
				.addInput(Item.bucketWater)
				.addInput(Item.bucketWater)
				.create("blueMatterCrafting", new ItemStack(WhatsTheMatter.blueMatter, 1));
		}
	}
}
