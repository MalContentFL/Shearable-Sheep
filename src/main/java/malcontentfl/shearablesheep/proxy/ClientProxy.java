package malcontentfl.shearablesheep.proxy;

import malcontentfl.shearablesheep.init.ModBlocks;
import malcontentfl.shearablesheep.init.ModItems;

public class ClientProxy extends CommonProxy
{
	public void init()
	{
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}
}
