package malcontentfl.shearablesheep.init;

import malcontentfl.shearablesheep.ShearableSheep;
import malcontentfl.shearablesheep.Reference;
import malcontentfl.shearablesheep.Utils;
import malcontentfl.shearablesheep.entities.EntityShearableSheep;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModEntities 
{
	public static Entity shearableSheep;
	
	
	public static void registerRender(Entity entity)
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityCobblestoneSheep.class, 
			      new EntityCobblestoneSheep(new EntityCobblestoneSheep(), 0.5F));
		Utils.getLogger().info("Register render for " + entity.getUnlocalizedName().substring(5));
	}
}
