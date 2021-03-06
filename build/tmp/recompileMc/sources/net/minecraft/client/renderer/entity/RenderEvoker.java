package net.minecraft.client.renderer.entity;

import net.minecraft.client.model.ModelEvoker;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderEvoker extends RenderLiving<EntityMob>
{
    private static final ResourceLocation field_191338_a = new ResourceLocation("textures/entity/illager/evoker.png");

    public RenderEvoker(RenderManager p_i47207_1_)
    {
        super(p_i47207_1_, new ModelEvoker(0.0F), 0.5F);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityMob entity)
    {
        return field_191338_a;
    }

    /**
     * Allows the render to do state modifications necessary before the model is rendered.
     */
    protected void preRenderCallback(EntityMob entitylivingbaseIn, float partialTickTime)
    {
        float f = 0.9375F;
        GlStateManager.scale(0.9375F, 0.9375F, 0.9375F);
    }
}