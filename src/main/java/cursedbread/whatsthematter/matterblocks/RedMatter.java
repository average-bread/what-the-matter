package cursedbread.whatsthematter.matterblocks;

import cursedbread.whatsthematter.WhatsTheMatter;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockGrass;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.EntityItem;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

import java.util.Random;

import static net.minecraft.core.item.Item.itemsList;

public class RedMatter extends Block {
	public RedMatter(String key, int id) {
		super(key, id, Material.stone);
	}
	int i;
	int j;
	int k;

	public void randomDisplayTick(World world, int x, int y, int z, Random rand) {
		for (i = -1; i <=1; i++) {
			for (j = -1; j <=1; j++) {
				for (k = -1; k <=1; k++) {
					if (world.getBlockId(x+i, y+j, z+k) == 0)  {
						world.setBlock(x+i, y+j, z+k, WhatsTheMatter.redMatter.id);
					}
				}
			}
		}
	}
}
