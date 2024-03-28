package cursedbread.whatthematter;

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
	int i = 5;
	protected int ticks = 0;

	public void randomDisplayTick(World world, int x, int y, int z, Random rand) {
		if (world.getBlockId(x+1, y, z) == 0)  {
			world.setBlock(x+1, y, z, WhatTheMatter.redMatter.id);
		} else if (world.getBlockId(x-1, y, z) == 0)  {
			world.setBlock(x-1, y, z, WhatTheMatter.redMatter.id);
		}  else if (world.getBlockId(x, y+1, z) == 0)  {
			world.setBlock(x, y+1, z, WhatTheMatter.redMatter.id);
		} else if (world.getBlockId(x, y-1, z) == 0)  {
			world.setBlock(x, y-1, z, WhatTheMatter.redMatter.id);
		} else if (world.getBlockId(x, y, z+1) == 0)  {
			world.setBlock(x, y, z+1, WhatTheMatter.redMatter.id);
		} else if (world.getBlockId(x, y, z-1) == 0)  {
			world.setBlock(x, y, z-1, WhatTheMatter.redMatter.id);
		}
	}
}
