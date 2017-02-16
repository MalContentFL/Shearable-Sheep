package malcontentfl.shearablesheep.blocks;

import java.util.Random;

import malcontentfl.shearablesheep.Reference;
import malcontentfl.shearablesheep.creativeTabs.TabSSHEEP;
import malcontentfl.shearablesheep.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class BlockNetherCube extends ModBlock
{
	public BlockNetherCube(Material mat, String name, CreativeTabs tab, float hardness, float resistance, int harvest, String tool)
	{
		super(mat, name, tab, hardness, resistance, harvest, tool);
	}
	
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return Item.getItemFromBlock(ModBlocks.netherCube);
	}
}