package malcontentfl.shearablesheep.proxy;

import malcontentfl.shearablesheep.init.ModBlocks;
import malcontentfl.shearablesheep.init.ModItems;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerRenders()
	{
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		ModEntities.registerRenders();
	}
	
}
