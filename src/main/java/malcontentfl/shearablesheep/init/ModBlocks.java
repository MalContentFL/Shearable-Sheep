package malcontentfl.shearablesheep.init;

import malcontentfl.shearablesheep.ShearableSheep;
import malcontentfl.shearablesheep.Utils;
import malcontentfl.shearablesheep.blocks.BlockNetherCube;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks
{
	public static Block netherCube;
	
	public static void init()
	{
		netherCube = new BlockNetherCube(Material.ROCK, "nether_cube", ShearableSheep.tabMod, 5F, 15F, 3, "pickaxe");
	}
	
	public static void register()
	{
		registerBlock(netherCube);
	}
	
	public static void registerRenders()
	{
		registerRender(netherCube);
	}
	
	public static void registerBlock(Block block)
	{
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
		Utils.getLogger().info("Registered block " + block.getUnlocalizedName().substring(5));
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		Utils.getLogger().info("Register render for " + block.getUnlocalizedName().substring(5));
	}
}
