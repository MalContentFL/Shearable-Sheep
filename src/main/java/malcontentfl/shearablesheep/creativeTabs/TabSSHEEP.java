package malcontentfl.shearablesheep.creativeTabs;

import malcontentfl.shearablesheep.Reference;
import malcontentfl.shearablesheep.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabSSHEEP extends CreativeTabs
{
	public TabSSHEEP()
	{
		super(Reference.MODID);
	}

	@Override
	public ItemStack getIconItemStack()
	{
		return new ItemStack(ModItems.sheepalyzer);
	}

	@Override
	public ItemStack getTabIconItem()
	{
		return getIconItemStack();
	}
}