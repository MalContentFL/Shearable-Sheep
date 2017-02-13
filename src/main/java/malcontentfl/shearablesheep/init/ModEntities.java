package malcontentfl.shearablesheep.init;

import malcontentfl.shearablesheep.ShearableSheep;
import malcontentfl.shearablesheep.entities.EntityCobblestoneSheep;
import malcontentfl.shearablesheep.renderers.entity.RenderShearableSheep;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModEntities {

    public static void init() {
        // Every entity in our mod has an ID (local to this mod)
        int id = 1;
        EntityRegistry.registerModEntity(EntityCobblestoneSheep.class, "CobblestoneSheep", id++, ShearableSheep.instance, 64, 3, true, 0x996600, 0x00ff00);

        // We want our mob to spawn in Plains and ice plains biomes. If you don't add this then it will not spawn automatically
        // but you can of course still make it spawn manually
        EntityRegistry.addSpawn(EntityCobblestoneSheep.class, 100, 3, 5, EnumCreatureType.CREATURE, Biomes.PLAINS, Biomes.ICE_PLAINS);

        // This is the loot table for our mob
        LootTableList.register(EntityCobblestoneSheep.LOOT);
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        RenderingRegistry.registerEntityRenderingHandler(EntityCobblestoneSheep.class, RenderShearableSheep.FACTORY);
    }
}