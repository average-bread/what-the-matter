package cursedbread.whatsthematter.matterblocks;

import cursedbread.whatsthematter.WhatsTheMatter;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.world.World;

import java.util.Random;

public class MossMatter extends Block {
	public MossMatter(String key, int id) {
		super(key, id, Material.stone);
	}

	int i;
	int j;
	int k;
	public void randomDisplayTick(World world, int x, int y, int z, Random rand) {
		for (i = -1; i <= 1; i ++) {
			for (j = -1; j <= 1; j ++) {
				for (k = -1; k <= 1; k ++) {
					if (world.getBlockId(x+i, y+j, z+k) == Block.stone.id) {
						world.setBlock(x + i, y + j, z + k, WhatsTheMatter.mossMatter.id);
						world.setBlock(x, y, z, Block.mossStone.id);
					}
					if (world.getBlockId(x+i, y+j, z+k) == Block.mossStone.id) {
						world.setBlock(x, y, z, Block.mossStone.id);
					}
				}
			}
		}
		for (i = -1; i <= 1; i ++) {
			for (j = -1; j <= 1; j ++) {
				for (k = -1; k <= 1; k ++) {
					if (world.getBlockId(x+i, y+j, z+k) == Block.basalt.id) {
						world.setBlock(x + i, y + j, z + k, WhatsTheMatter.mossMatter.id);
						world.setBlock(x, y, z, Block.mossBasalt.id);
					}
					if (world.getBlockId(x+i, y+j, z+k) == Block.mossBasalt.id) {
						world.setBlock(x, y, z, Block.mossBasalt.id);
					}
				}
			}
		}
		for (i = -1; i <= 1; i ++) {
			for (j = -1; j <= 1; j ++) {
				for (k = -1; k <= 1; k ++) {
					if (world.getBlockId(x+i, y+j, z+k) == Block.limestone.id) {
						world.setBlock(x + i, y + j, z + k, WhatsTheMatter.mossMatter.id);
						world.setBlock(x, y, z, Block.mossLimestone.id);
					}
					if (world.getBlockId(x+i, y+j, z+k) == Block.mossLimestone.id) {
						world.setBlock(x, y, z, Block.mossLimestone.id);
					}
				}
			}
		}
		for (i = -1; i <= 1; i ++) {
			for (j = -1; j <= 1; j ++) {
				for (k = -1; k <= 1; k ++) {
					if (world.getBlockId(x+i, y+j, z+k) == Block.granite.id) {
						world.setBlock(x + i, y + j, z + k, WhatsTheMatter.mossMatter.id);
						world.setBlock(x, y, z, Block.mossGranite.id);
					}
					if (world.getBlockId(x+i, y+j, z+k) == Block.mossGranite.id) {
						world.setBlock(x, y, z, Block.mossGranite.id);
					}
				}
			}
		}
		for (i = -1; i <= 1; i ++) {
			for (j = -1; j <= 1; j ++) {
				for (k = -1; k <= 1; k ++) {
					if (world.getBlockId(x+i, y+j, z+k) == Block.logOak.id) {
						world.setBlock(x + i, y + j, z + k, WhatsTheMatter.mossMatter.id);
						world.setBlock(x, y, z, Block.logOakMossy.id);
					}
					if (world.getBlockId(x+i, y+j, z+k) == Block.logOakMossy.id) {
						world.setBlock(x, y, z, Block.logOakMossy.id);
					}
				}
			}
		}
		for (i = -1; i <= 1; i ++) {
			for (j = -1; j <= 1; j ++) {
				for (k = -1; k <= 1; k ++) {
					if (world.getBlockId(x+i, y+j, z+k) == Block.cobbleStone.id) {
						world.setBlock(x + i, y + j, z + k, WhatsTheMatter.mossMatter.id);
						world.setBlock(x, y, z, Block.cobbleStoneMossy.id);
					}
					if (world.getBlockId(x+i, y+j, z+k) == Block.cobbleStoneMossy.id) {
						world.setBlock(x, y, z, Block.cobbleStoneMossy.id);
					}
				}
			}
		}
	}
}
