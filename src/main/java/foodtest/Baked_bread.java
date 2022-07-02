package tool_modXXX.foodtest;

import net.minecraft.item.ItemFood;

public class Baked_bread extends ItemFood {

public Baked_bread(int par1, int par2, boolean par3)
{
	super(par1, par2, par3);

	this.setUnlocalizedName("Baked_bread");
	this.setCreativeTab(Foodtest_Mod.food_mod);
	this.setTextureName("testfood:Baked_bread");
	this.setMaxStackSize(64);
	this.setAlwaysEdible();}
}
