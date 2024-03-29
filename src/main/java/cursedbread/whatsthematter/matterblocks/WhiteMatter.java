package cursedbread.whatsthematter.matterblocks;

import cursedbread.whatsthematter.WhatsTheMatter;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.world.World;

import java.util.Random;

public class WhiteMatter extends Block {
	public WhiteMatter(String key, int id) {
		super(key, id, Material.stone);
	}
	int i = 5;
	protected int ticks = 0;

	public void onBlockDestroyedByExplosion(World world, int x, int y, int z) {
		if (world.getBlockId(x+1, y, z) == 0)  {
			world.setBlock(x+1, y, z, WhatsTheMatter.whiteMatter.id);
		} if (world.getBlockId(x-1, y, z) == 0)  {
			world.setBlock(x-1, y, z, WhatsTheMatter.whiteMatter.id);
		}  if (world.getBlockId(x, y, z+1) == 0)  {
			world.setBlock(x, y, z+1, WhatsTheMatter.whiteMatter.id);
		} if (world.getBlockId(x, y, z-1) == 0)  {
			world.setBlock(x, y, z-1, WhatsTheMatter.whiteMatter.id);
		}
	}
}

