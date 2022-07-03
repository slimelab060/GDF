package tool_modXXX.toolMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Green_Item_Arror extends Item {

	public Green_Item_Arror(Item green_Item_Arror){
		super();
		this.setCreativeTab(CreativeTabs.tabMaterials);

	}
	public Green_Item_Arror() {
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1RegisterIcon){
		this.setUnlocalizedName("Green Arrow");
		this.itemIcon = par1RegisterIcon.registerIcon("toolmod:arrow");
	}
}
