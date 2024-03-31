package cursedbread.whatsthematter.matterblocks;

import cursedbread.whatsthematter.WhatsTheMatter;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.world.World;

import javax.swing.text.html.parser.Entity;

public class SpawnMatter extends Block {
	public SpawnMatter(String key, int id) {
		super(key, id, Material.stone);
	}
	int i;
	int j;

	public void onBlockDestroyedByExplosion(World world, int x, int y, int z) {
		for (i = -1; i <= 1; i++) {
			for (j = -1; j <= 1; j++) {
				if (world.getBlockId(x + i, y, z +j) == 0) {
					world.setBlock(x + i, y, z +j, WhatsTheMatter.spawnMatter.id);
				}
			}
		}
	}
}

