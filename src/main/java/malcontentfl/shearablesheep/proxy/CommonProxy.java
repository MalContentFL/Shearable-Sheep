package malcontentfl.shearablesheep.proxy;

import malcontentfl.shearablesheep.init.ModBlocks;
import malcontentfl.shearablesheep.init.ModItems;

public class CommonProxy implements IProxy
{	
	public void preInit()
	{
		ModItems.init();
		ModItems.register();
		
		ModBlocks.init();
		ModBlocks.register();
	}
	
	public void init()
	{
		
	}
	
	public void postInit()
	{
		
	}
}
