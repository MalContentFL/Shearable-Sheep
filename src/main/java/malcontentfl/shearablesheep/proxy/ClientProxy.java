package malcontentfl.shearablesheep.proxy;

import malcontentfl.shearablesheep.entities.EntityShearableSheep;
import malcontentfl.shearablesheep.init.ModBlocks;
import malcontentfl.shearablesheep.init.ModEntities;
import malcontentfl.shearablesheep.init.ModItems;
import malcontentfl.shearablesheep.renderers.entity.RenderShearableSheep;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

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
