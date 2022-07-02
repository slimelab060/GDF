package tool_modXXX.foodtest;

import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class Sugar_cube extends ItemFood {

public Sugar_cube(int par1, int par2, boolean par3)
{
	super(par1, par2, par3);

	this.setUnlocalizedName("Sugar_cube");
	this.setCreativeTab(Foodtest_Mod.food_mod);
	this.setTextureName("testfood:Sugar_cube");
	this.setMaxStackSize(64);
	this.setAlwaysEdible();
	this.setPotionEffect(Potion.moveSpeed.id, 60, 2, 1.0F);}
}
