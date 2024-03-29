package cursedbread.whatsthematter.matterblocks;

import cursedbread.whatsthematter.WhatsTheMatter;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.world.World;

import java.util.Random;

public class ColdMatter extends Block {
	public ColdMatter(String key, int id) {
		super(key, id, Material.stone);
	}

	int i;
	int j;
	int k;
	public void randomDisplayTick(World world, int x, int y, int z, Random rand) {
		for (i = -1; i <= 1; i ++) {
			for (j = -1; j <= 1; j ++) {
				for (k = -1; k <= 1; k ++) {
					if (world.getBlockId(x+i, y+j, z+k) == Block.fluidWaterFlowing.id || world.getBlockId(x+i, y+j, z+k) == Block.fluidWaterStill.id) {
						world.setBlock(x + i, y + j, z + k, WhatsTheMatter.coldMatter.id);
						world.setBlock(x, y, z, Block.ice.id);
					}
					if (world.getBlockId(x+i, y+j, z+k) == Block.ice.id) {
						world.setBlock(x, y, z, Block.ice.id);
					}
				}
			}
		}
		for (i = -1; i <= 1; i ++) {
			for (j = -1; j <= 1; j ++) {
				for (k = -1; k <= 1; k ++) {
					if (world.getBlockId(x+i, y+j, z+k) == Block.fluidLavaFlowing.id || world.getBlockId(x+i, y+j, z+k) == Block.fluidLavaStill.id) {
						world.setBlock(x + i, y + j, z + k, WhatsTheMatter.coldMatter.id);
						world.setBlock(x, y, z, Block.obsidian.id);
					}
					if (world.getBlockId(x+i, y+j, z+k) == Block.obsidian.id) {
						world.setBlock(x, y, z, Block.obsidian.id);
					}
				}
			}
		}
	}
}
