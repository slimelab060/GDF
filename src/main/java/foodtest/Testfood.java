package tool_modXXX.foodtest;

import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class Testfood extends ItemFood {

	public Testfood(int par1, int par2, boolean par3)
	{
		super(par1, par2, par3);
		this.setUnlocalizedName("Testfood");
		this.setCreativeTab(Foodtest_Mod.food_mod);
		this.setTextureName("testfood:food1");
		this.setMaxStackSize(64);
		this.setAlwaysEdible();
		this.setPotionEffect(Potion.jump.id, 10, 2, 1.0F);
		    }
	}