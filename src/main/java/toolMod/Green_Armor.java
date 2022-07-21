package tool_modXXX.toolMod;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class Green_Armor extends ItemArmor {

	public Green_Armor(ArmorMaterial Greenmaterial, int renderIndex, int armorType)
	{
		super(Greenmaterial, renderIndex, armorType);
	}
public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
	if(stack.getItem().equals(ToolMod.Green_helmet) || stack.getItem().equals(ToolMod.Green_chestplate) || stack.getItem().equals(ToolMod.Green_boots)){
		return "toolmod:textures/models/armor/green_layer_1.png";
	}else if(stack.getItem().equals(ToolMod.Green_leggings)){
		return "toolmod:textures/models/armor/green_layer_2.png";
	}else{
		return null;
	}
	}
}