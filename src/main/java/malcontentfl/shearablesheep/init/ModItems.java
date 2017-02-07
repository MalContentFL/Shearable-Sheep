package malcontentfl.shearablesheep.init;

import malcontentfl.shearablesheep.ShearableSheep;
import malcontentfl.shearablesheep.Reference;
import malcontentfl.shearablesheep.Utils;
import malcontentfl.shearablesheep.items.ItemSheepalyzer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems 
{
	public static Item solidifiedEnergy;
	public static Item sheepalyzer;
	
	public static void init()
	{
		sheepalyzer = new ItemSheepalyzer("sheepalyzer", "sheepalyzer");
	}
	
	public static void register()
	{
		registerItem(sheepalyzer);
	}
	
	public static void registerRenders()
	{
		registerRender(sheepalyzer);
	}
	
	public static void registerItem(Item item)
	{
		item.setCreativeTab(ShearableSheep.MOD_TAB);
		GameRegistry.register(item);
		Utils.getLogger().info("Registered item " + item.getUnlocalizedName().substring(5));
	}
	
	public static void registerRender(Item item)
	{
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
		Utils.getLogger().info("Register render for " + item.getUnlocalizedName().substring(5));
	}
}
