package malcontentfl.shearablesheep.creativeTabs;

import malcontentfl.shearablesheep.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TabSSHEEP extends CreativeTabs
{
	public TabSSHEEP(String label)
	{
		super(label); // put 'itemGroup.label' in your lang file for standard translated tab label
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ItemStack getTabIconItem()
	{
		return new ItemStack(Item.getItemFromBlock(Blocks.WOOL), 0, 0);
	}
}
