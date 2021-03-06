package malcontentfl.shearablesheep.entities;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.SERVER)
public class OffspringLogic
{
	private EntityShearableSheep father, mother;
	
	private double breedability = 0.5, mutationChance = 0.01;
    private int[] bounty = new int[]{1,3}, appetite = new int[]{1,1};
    private int drive = 600; //Unused currently. Left in in case of future changes
	
	public OffspringLogic(EntityShearableSheep father, EntityShearableSheep mother)
	{
		if (father.getBreedability() < 0)
		{
			this.father = new EntityShearableSheep(father.getEntityWorld(), 0.00, father.getBounty(), father.getAppetite(), father.getMutationChance(), father.getDrive(), father.getWoolBlock());
		}
		else
		{
			this.father = father;
		}
		
		if (mother.getBreedability() < 0)
		{
			this.mother = new EntityShearableSheep(mother.getEntityWorld(), 0.00, mother.getBounty(), mother.getAppetite(), mother.getMutationChance(), mother.getDrive(), father.getWoolBlock());
		}
		else
		{
			this.mother = mother;
		}
		
		runLogic();
	}
	
	private void runLogic()
	{
		breedability = ((father.getBreedability() + mother.getBreedability()) / 2) + randDouble(-0.15, 0.15); //Offspring breedability
		
		//Offspring mutation chance (The value used to determine the offspring's offspring's mutation chance)
		mutationChance = ((father.getBreedability() + mother.getBreedability()) / 2) + randDouble(-0.10, 0.10);
		
		bounty[0] = ((father.getBounty()[0] + mother.getBounty()[0]) / 2) + randInt(0, 1); //Offspring bounty minimum
		bounty[1] = ((father.getBounty()[1] + mother.getBounty()[1]) / 2) + randInt(0, 1); //Offspring bounty maximum
		
		appetite[0] = ((father.getAppetite()[0] + mother.getAppetite()[0]) / 2) + randInt(0, 2); //Offspring appetite minimum
		appetite[1] = ((father.getAppetite()[1] + mother.getAppetite()[1]) / 2) + randInt(0, 2); //Offspring appetite maximum
	}
	
	private static int randInt(int min, int max)
	{
	    Random rand = new Random();
	    return rand.nextInt((max - min) + 1) + min;
	}
	
	private static double randDouble(double rangeMin, double rangeMax)
	{
	    Random r = new Random();
	    return rangeMin + (rangeMax - rangeMin) * r.nextDouble();
	}
}
