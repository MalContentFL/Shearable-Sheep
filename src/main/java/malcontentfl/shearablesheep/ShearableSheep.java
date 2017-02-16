package malcontentfl.shearablesheep;

import malcontentfl.shearablesheep.proxy.IProxy;
import malcontentfl.shearablesheep.handlers.RecipeHandler;
import malcontentfl.shearablesheep.handlers.RenderGuiHandler;
import malcontentfl.shearablesheep.creativeTabs.TabSSHEEP;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, version = Reference.VERSION, name = Reference.NAME)
public class ShearableSheep
{
	public static TabSSHEEP tabMod = new TabSSHEEP();
	
	@SidedProxy(clientSide=Reference.CLIENT_PROXY, serverSide=Reference.SERVER_PROXY)

	public static IProxy proxy;
    
    @Mod.Instance
    public static ShearableSheep instance;
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	proxy.preInit();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	proxy.init();
    	//EventHandler.registerEvents();
		RecipeHandler.registerCraftingRecipes();
		RecipeHandler.registerFurnaceRecipes();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	proxy.postInit();
    	MinecraftForge.EVENT_BUS.register(new RenderGuiHandler());
    }
}
