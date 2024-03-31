package cursedbread.whatsthematter.matterblocks;

import cursedbread.whatsthematter.WhatsTheMatter;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.world.World;

public class CloneMatter extends Block {
	public CloneMatter(String key, int id) {
		super(key, id, Material.stone);
	}
	int i;
	int j;
	int k;
	int time;
	int q;
	int t;
	int o;

	public boolean blockActivated(World world, int x, int y, int z, EntityPlayer player) {
		if (time == 10) {
			for (i= -1; i<=1; i++) {
				if (world.getBlockId(x, y+i, z) !=0 && world.getBlockId(x, y+i, z) != Block.mobspawnerDeactivated.id && world.getBlockId(x, y+i, z) !=Block.mobspawner.id && world.getBlockId(x, y+i, z) != WhatsTheMatter.cloneMatter.id && world.getBlockId(x, y+i, z) != Block.bedrock.id) {
					q = world.getBlockId(x, y+i, z);
					world.setBlock(x, y-(i+i), z, q);
				}
			}
			for (j= -1; j<=1; j++) {
				if (world.getBlockId(x+j, y, z) !=0 && world.getBlockId(x+j, y, z) != Block.mobspawnerDeactivated.id && world.getBlockId(x+j, y, z) !=Block.mobspawner.id && world.getBlockId(x+j, y, z) != WhatsTheMatter.cloneMatter.id && world.getBlockId(x+j, y, z) != Block.bedrock.id) {
					t = world.getBlockId(x + j, y, z);
					world.setBlock(x - (j+j), y, z, t);
				}
			}
			for (k= -1; k<=1; k++) {
				if (world.getBlockId(x, y, z+k) !=0 && world.getBlockId(x, y, z+k) != Block.mobspawnerDeactivated.id && world.getBlockId(x, y, z+k) !=Block.mobspawner.id && world.getBlockId(x, y, z+k) != WhatsTheMatter.cloneMatter.id && world.getBlockId(x, y, z+k) != Block.bedrock.id) {
					o = world.getBlockId(x, y, z+k);
					world.setBlock(x, y, z-(k+k), o);
				}
			}
			time = 0;
		} else {
			time++;
		}
		return false;
	}
}

