package malcontentfl.shearablesheep.init;

import malcontentfl.shearablesheep.ShearableSheep;
import malcontentfl.shearablesheep.Reference;
import malcontentfl.shearablesheep.Utils;
import malcontentfl.shearablesheep.entities.EntityShearableSheep;
import malcontentfl.shearablesheep.items.ItemSolidifiedEnergy;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModEntities 
{
	public static Entity shearableSheep;
	
	public static void init()
	{
		shearableSheep = new EntityShearableSheep("shearable_sheep", "shearable_sheep");
	}
	
	public static void register()
	{
		EntityRegistry.registerModEntity(shearableSheep, "Shearable Sheep", 101, ShearableSheep.instance, 64, 1, true);
        
	}
	
	public static void registerRenders()
	{
		registerRender(shearableSheep);
	}
	
	public static void registerItem(Item item)
	{
		item.setCreativeTab(ShearableSheep.mod);
		GameRegistry.register(item);
		Utils.getLogger().info("Registered item " + item.getUnlocalizedName().substring(5));
	}
	
	public static void registerRender(Item item)
	{
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
		Utils.getLogger().info("Register render for " + item.getUnlocalizedName().substring(5));
	}
}
