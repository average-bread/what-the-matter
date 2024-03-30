package cursedbread.whatsthematter.matterblocks;

import cursedbread.whatsthematter.WhatsTheMatter;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.player.gamemode.Gamemode;
import net.minecraft.core.world.World;

import java.util.Random;

public class SpawnMatter extends Block {
	public SpawnMatter(String key, int id) {
		super(key, id, Material.stone);
	}
	int i;
	int j;
	int k;
	int q;
	int t;
	int o;

	public void randomDisplayTick(World world, int x, int y, int z, Random rand) {
		for (i= -1; i<=1; i++) {
			if (world.getBlockId(x, y+i, z) !=0) {
				q = world.getBlockId(x, y+i, z);
				world.setBlock(x, y-(i+i), z, q);
			}
		}
		for (j= -1; j<=1; j++) {
			if (world.getBlockId(x+j, y, z) !=0) {
				t = world.getBlockId(x + j, y, z);
				world.setBlock(x - (j+j), y, z, t);
			}
		}
		for (k= -1; k<=1; k++) {
			if (world.getBlockId(x, y, z+k) !=0) {
				o = world.getBlockId(x, y, z+k);
				world.setBlock(x, y, z-(k+k), o);
			}
		}
	}
}

