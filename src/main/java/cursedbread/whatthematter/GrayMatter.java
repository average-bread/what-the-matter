package cursedbread.whatthematter;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.world.World;

import java.util.Random;

public class GrayMatter extends Block {
	public GrayMatter(String key, int id) {
		super(key, id, Material.stone);
	}
	int i = 5;
	protected int ticks = 0;

	public void randomDisplayTick(World world, int x, int y, int z, Random rand) {
		if (world.getBlockId(x+1, y, z) != 0)  {
			world.setBlock(x+1, y, z, WhatTheMatter.grayMatter.id);
		} if (world.getBlockId(x-1, y, z) != 0)  {
			world.setBlock(x-1, y, z, WhatTheMatter.grayMatter.id);
		} if (world.getBlockId(x, y+1, z) != 0)  {
			world.setBlock(x, y+1, z, WhatTheMatter.grayMatter.id);
		} if (world.getBlockId(x, y-1, z) != 0)  {
			world.setBlock(x, y-1, z, WhatTheMatter.grayMatter.id);
		} if (world.getBlockId(x, y, z+1) != 0)  {
			world.setBlock(x, y, z+1, WhatTheMatter.grayMatter.id);
		} if (world.getBlockId(x, y, z-1) != 0)  {
			world.setBlock(x, y, z-1, WhatTheMatter.grayMatter.id);
		}
		world.setBlock(x, y, z, 0);
	}
}
