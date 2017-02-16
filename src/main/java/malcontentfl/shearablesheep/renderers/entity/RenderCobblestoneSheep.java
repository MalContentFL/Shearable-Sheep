package malcontentfl.shearablesheep.renderers.entity;

import net.minecraft.client.renderer.entity.RenderManager;

public class RenderCobblestoneSheep extends RenderShearableSheep
{
	private String resourcePath = "";
	
	public RenderCobblestoneSheep(RenderManager p_i47195_1_)
	{
		super(p_i47195_1_);
		super.addWoolLayer(this, resourcePath);
	}
}
