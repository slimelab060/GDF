package tool_modXXX.foodtest;

import cpw.mods.fml.common.IFuelHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Sugar_charcoal extends Item {

	public Sugar_charcoal()
	{
		String name = "Sugar_charcoal";

		this .setCreativeTab(Foodtest_Mod.food_mod);
		this.setUnlocalizedName( name );
		maxStackSize = 64;
		this.setTextureName("testfood:Sugar_charcoal");

		GameRegistry.registerItem( this, name );
		GameRegistry.registerFuelHandler(new IFuelHandler(){
		    @Override
		    public int getBurnTime(ItemStack fuel){
		        if(fuel.getItem().equals(Foodtest_Mod.Sugar_charcoal)){
		                return 3200;
		        }
		        return 0;
		    }
		});

		return;
	}

}
