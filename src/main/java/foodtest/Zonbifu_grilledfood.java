package tool_modXXX.foodtest;

import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class Zonbifu_grilledfood extends ItemFood {

	public Zonbifu_grilledfood(int par1, int par2, boolean par3)
	{
		super(par1, par2, par3);
		this.setUnlocalizedName("Zonbifu_grilledfood");
		this.setCreativeTab(Foodtest_Mod.food_mod);
		this.setTextureName("testfood:meet");
		this.setMaxStackSize(64);
		this.setAlwaysEdible();
		this.setPotionEffect(Potion.confusion.id, 10, 2, 1.0F);
    }
}