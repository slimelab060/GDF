package tool_modXXX.foodtest;

import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class Diamond_Apple extends ItemFood {

public Diamond_Apple(int par1, int par2, boolean par3)
{
	super(par1, par2, par3);

	this.setUnlocalizedName("Diamond_Apple");
	this.setCreativeTab(Foodtest_Mod.food_mod);
	this.setTextureName("testfood:diamond_apple");
	this.setMaxStackSize(64);
	this.setAlwaysEdible();
	this.setPotionEffect(Potion.regeneration.id, 65, 3, 1.0F);}
}
