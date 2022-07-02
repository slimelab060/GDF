package tool_modXXX.foodtest;

import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class Warm_milk extends ItemFood {
public Warm_milk(int par1, int par2, boolean par3)
{
	super(par2, par3);

	this.setUnlocalizedName("Warm_milk");
	this.setCreativeTab(Foodtest_Mod.food_mod);
	this.setTextureName("testfood:Warm_milk");
	this.setMaxStackSize(64);
	this.setAlwaysEdible();
	this.setPotionEffect(Potion.digSpeed.id, 60, 1, 1.0F);
	this.setContainerItem(Items.bucket);
}
}
