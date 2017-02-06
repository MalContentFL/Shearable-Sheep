package malcontentfl.shearablesheep;

import malcontentfl.shearablesheep.proxy.CommonProxy;
import malcontentfl.shearablesheep.creativeTabs.TabSSHEEP;
import malcontentfl.shearablesheep.init.ModBlocks;
import malcontentfl.shearablesheep.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ShearableSheep.MODID, version = ShearableSheep.VERSION)
public class ShearableSheep
{
	public static final CreativeTabs MOD_TAB = new TabSSHEEP("Shearable Sheep");
    public static final String MODID = "ssheep";
    public static final String VERSION = "0.0.0.1";
    
	@SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
	public static CommonProxy proxy;
	
    @EventHandler
    public void init(FMLPreInitializationEvent event)
    {
    	ModItems.init();
		ModBlocks.init();
		ModItems.register();
		ModBlocks.register();
		
		proxy.registerRenders();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    }
    
    @EventHandler
    public void init(FMLPostInitializationEvent event)
    {

    }
}
