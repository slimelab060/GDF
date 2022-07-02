package tool_modXXX.foodtest;

import net.minecraft.item.ItemFood;

public class Baked_apple extends ItemFood {

public Baked_apple(int par1, int par2, boolean par3)
{
	super(par1, par2, par3);

	this.setUnlocalizedName("Baked_apple");
	this.setCreativeTab(Foodtest_Mod.food_mod);
	this.setTextureName("testfood:Baked_apple");
	this.setMaxStackSize(64);
	this.setAlwaysEdible();}
}
