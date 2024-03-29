package cursedbread.whatsthematter.miscitems;

import cursedbread.whatsthematter.WhatsTheMatter;
import net.minecraft.core.block.Block;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

public class ContainingNote extends Item {
	public ContainingNote(String item, int i) {
		super(item, i);
	}

	int i;
	int j;
	int k;
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, Side side, double xPlaced, double yPlaced) {
		//celling
		for (i=-3; i<=3; i++) {
			for (j=-3; j<=3; j++) {
				world.setBlock(x+i, y+4, z+j, Block.glass.id);
			}
		}
		//walls
		for (k=0; k<=3; k++) {
			for (i=-3; i<=3; i++) {
				for (j=-3; j<=3; j++) {
					world.setBlock(x+i, y+k, z+j, Block.glass.id);
				}
			}
			for (i=-2; i<=2; i++) {
				for (j=-2; j<=2; j++) {
					world.setBlock(x+i, y+k, z+j, 0);
				}
			}
		}
		//floor
		for (i=-3; i<=3; i++) {
			for (j=-3; j<=3; j++) {
				world.setBlockAndMetadata(x+i, y-1, z+j, Block.wool.id, 14);
			}
		}
		world.setBlock(x, y, z, WhatsTheMatter.whiteMatter.id);
		stack.consumeItem(player);
		return true;
	}
}
