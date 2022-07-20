package tool_modXXX.toolMod;

import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class Green_Apple extends ItemFood {

	public Green_Apple(int par1, int par2, boolean par3)
	{
		super(par1, par2, par3);

		this.setUnlocalizedName("Green_Apple");
		this.setCreativeTab(ToolMod.tabtoolmod);
		this.setTextureName("toolmod:green_apple");
		this.setMaxStackSize(64);
		this.setAlwaysEdible();
		this.setPotionEffect(Potion.resistance.id, 65, 3, 1.0F);

	}

}
