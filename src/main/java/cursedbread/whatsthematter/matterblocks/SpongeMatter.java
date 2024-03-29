package cursedbread.whatsthematter.matterblocks;

import cursedbread.whatsthematter.WhatsTheMatter;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.world.World;

import java.util.Random;

public class SpongeMatter extends Block {
	public SpongeMatter(String key, int id) {
		super(key, id, Material.stone);
	}
	int i = 5;
	protected int ticks = 0;

	public void randomDisplayTick(World world, int x, int y, int z, Random rand) {
		if (world.getBlockId(x+1, y, z) == Block.fluidWaterFlowing.id || world.getBlockId(x+1, y, z) == Block.fluidWaterStill.id || world.getBlockId(x+1, y, z) == Block.fluidLavaFlowing.id || world.getBlockId(x+1, y, z) == Block.fluidLavaStill.id) {
			world.setBlock(x+1, y, z, WhatsTheMatter.spongeMatter.id);
		} if (world.getBlockId(x-1, y, z) == Block.fluidWaterFlowing.id || world.getBlockId(x-1, y, z) == Block.fluidWaterStill.id || world.getBlockId(x-1, y, z) == Block.fluidLavaFlowing.id || world.getBlockId(x-1, y, z) == Block.fluidLavaStill.id)  {
			world.setBlock(x-1, y, z, WhatsTheMatter.spongeMatter.id);
		} if (world.getBlockId(x, y+1, z) == Block.fluidWaterFlowing.id || world.getBlockId(x, y+1, z) == Block.fluidWaterStill.id || world.getBlockId(x, y+1, z) == Block.fluidLavaFlowing.id || world.getBlockId(x, y+1, z) == Block.fluidLavaStill.id)  {
			world.setBlock(x, y+1, z, WhatsTheMatter.spongeMatter.id);
		} if (world.getBlockId(x, y-1, z) == Block.fluidWaterFlowing.id || world.getBlockId(x, y-1, z) == Block.fluidWaterStill.id || world.getBlockId(x, y-1, z) == Block.fluidLavaFlowing.id || world.getBlockId(x, y-1, z) == Block.fluidLavaStill.id)  {
			world.setBlock(x, y-1, z, WhatsTheMatter.spongeMatter.id);
		} if (world.getBlockId(x, y, z+1) == Block.fluidWaterFlowing.id || world.getBlockId(x, y, z+1) == Block.fluidWaterStill.id || world.getBlockId(x, y, z+1) == Block.fluidLavaFlowing.id || world.getBlockId(x, y, z+1) == Block.fluidLavaStill.id)  {
			world.setBlock(x, y, z+1, WhatsTheMatter.spongeMatter.id);
		} if (world.getBlockId(x, y, z-1) == Block.fluidWaterFlowing.id || world.getBlockId(x, y, z-1) == Block.fluidWaterStill.id || world.getBlockId(x, y, z-1) == Block.fluidLavaFlowing.id || world.getBlockId(x, y, z-1) == Block.fluidLavaStill.id)  {
			world.setBlock(x, y, z-1, WhatsTheMatter.spongeMatter.id);
		}
		world.setBlock(x, y, z, 0);
	}
}
