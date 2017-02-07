package malcontentfl.shearablesheep.items;

import malcontentfl.shearablesheep.Reference;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class ItemSheepalyzer extends Item
{
	
	public ItemSheepalyzer(String unlocalizedName, String registryName)
	{
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, registryName));
	}
}