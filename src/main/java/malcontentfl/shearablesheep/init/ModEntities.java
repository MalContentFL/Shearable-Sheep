package malcontentfl.shearablesheep.init;

import malcontentfl.shearablesheep.Reference;
import malcontentfl.shearablesheep.ShearableSheep;
import malcontentfl.shearablesheep.entities.EntityCobblestoneSheep;
import malcontentfl.shearablesheep.renderers.entity.RenderShearableSheep;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModEntities
{

    public static void init()
    {
        // Every entity in our mod has an ID (local to this mod)
        int id = 1;
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "textures/entity/sheep.png"), EntityCobblestoneSheep.class, "CobblestoneSheep", id++, ShearableSheep.instance, 64, 3, true, 0x996600, 0x00ff00);

        // Mob Spawning
        EntityRegistry.addSpawn(EntityCobblestoneSheep.class, 100, 3, 5, EnumCreatureType.CREATURE, Biomes.STONE_BEACH);

        // This is the loot table for our mob
        // LootTableList.register(new ResourceLocation(null));
    }
}