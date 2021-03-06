package malcontentfl.shearablesheep.renderers.entity;

import malcontentfl.shearablesheep.entities.EntityShearableSheep;
import malcontentfl.shearablesheep.renderers.entity.layers.LayerShearableSheepWool;
import net.minecraft.client.model.ModelSheep2;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerSheepWool;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderShearableSheep extends RenderLiving<EntityShearableSheep>
{
    private static final ResourceLocation SHEARED_SHEEP_TEXTURES = new ResourceLocation("textures/entity/sheep/sheep.png");
    
    public RenderShearableSheep(RenderManager p_i47195_1_)
    {
        super(p_i47195_1_, new ModelSheep2(), 0.7F);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityShearableSheep entity)
    {
        return SHEARED_SHEEP_TEXTURES;
    }
    
    public void addWoolLayer(RenderShearableSheep renderSheep, String resourcePath)
    {
    	super.addLayer(new LayerShearableSheepWool(renderSheep, new ResourceLocation(resourcePath)));
    }
}