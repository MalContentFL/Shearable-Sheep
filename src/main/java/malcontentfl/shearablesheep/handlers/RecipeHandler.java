package malcontentfl.shearablesheep.handlers;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import malcontentfl.shearablesheep.Utils;
import malcontentfl.shearablesheep.init.ModBlocks;
import malcontentfl.shearablesheep.init.ModItems;

public class RecipeHandler
{
	public static void registerCraftingRecipes()
	{
		GameRegistry.addRecipe(new ItemStack(ModBlocks.netherCube), new Object[] {"SSS", "SSS", "SSS", 'S', Items.NETHER_STAR});
		
		Utils.getLogger().info("Registered Crafting Recipes!");
	}
	
	public static void registerFurnaceRecipes()
	{
		Utils.getLogger().info("Registered Furnace Recipes!");
	}
}
