package malcontentfl.shearablesheep.entities;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class EntityCobblestoneSheep extends EntityShearableSheep
{	
	public EntityCobblestoneSheep(World worldIn, double breedability, int[] bounty, int[] appetite, double mutationChance, int drive)
    {
        super(worldIn, breedability, bounty, appetite, mutationChance, drive, Blocks.COBBLESTONE);
    }
}
