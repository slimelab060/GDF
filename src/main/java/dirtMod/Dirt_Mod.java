package tool_modXXX.dirtMod;

import java.util.Map;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.network.NetworkCheckHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.ServerChatEvent;

@Mod(modid = "Dirt_Mod", name = "Dirt_Mod", version="1.0.0")

public class Dirt_Mod {

	public static Item Dirt_Mod_shovel;
	public static Item Dirt_Mod_axe;
	public static Item Dirt_Mod_pickaxe;
	public static Item Dirt_Mod_hoe;
	public static Item Dirt_Mod_sword;

	public static Strengthening_Glowstoneblock Glowstoneblock;

	@SuppressWarnings("deprecation")
	@EventHandler
	public void preInt(FMLPreInitializationEvent event)
	  {
		Item.ToolMaterial DirtMaterial = EnumHelper.addToolMaterial("Dirt", 3, 80, 5.5F, 1.0F, 18);
		DirtMaterial.customCraftingMaterial = Items.flint;

		Dirt_Mod_sword = new ItemSword(DirtMaterial){};
		Dirt_Mod_sword.setUnlocalizedName("Dirt Sword");
		Dirt_Mod_sword.setCreativeTab(CreativeTabs.tabTools);
		Dirt_Mod_sword.setTextureName("dirtmod:dirt_sword");
		GameRegistry.registerItem(Dirt_Mod_sword, "Dirt Sword");

		Dirt_Mod_shovel = new ItemSpade(DirtMaterial){};
		Dirt_Mod_shovel.setUnlocalizedName("Dirt Shovel");
		Dirt_Mod_shovel.setCreativeTab(CreativeTabs.tabTools);
		Dirt_Mod_shovel.setTextureName("dirtmod:dirt_shovel");
		GameRegistry.registerItem(Dirt_Mod_shovel, "Dirt Shovel");

		Dirt_Mod_axe = new ItemAxe(DirtMaterial){};
		Dirt_Mod_axe.setUnlocalizedName("Dirt Axe");
		Dirt_Mod_axe.setCreativeTab(CreativeTabs.tabTools);
		Dirt_Mod_axe.setTextureName("dirtmod:dirt_axe");
		GameRegistry.registerItem(Dirt_Mod_axe, "Dirt Axe");

		Dirt_Mod_pickaxe = new ItemPickaxe(DirtMaterial){};
		Dirt_Mod_pickaxe.setUnlocalizedName("Dirt Pickaxe");
		Dirt_Mod_pickaxe.setCreativeTab(CreativeTabs.tabTools);
		Dirt_Mod_pickaxe.setTextureName("dirtmod:dirt_pickaxe");
		GameRegistry.registerItem(Dirt_Mod_pickaxe, "Dirt Pickaxe");

		Dirt_Mod_hoe = new ItemHoe(DirtMaterial){};
		Dirt_Mod_hoe.setUnlocalizedName("Dirt Hoe");
		Dirt_Mod_hoe.setCreativeTab(CreativeTabs.tabTools);
		Dirt_Mod_hoe.setTextureName("dirtmod:dirt_hoe");
		GameRegistry.registerItem(Dirt_Mod_hoe, "Dirt hoe");

		Glowstoneblock = new Strengthening_Glowstoneblock();
		GameRegistry.registerBlock(Glowstoneblock, "Strengthening_Glowstoneblock");
	  }

		@EventHandler
	    public void init(FMLInitializationEvent event) {

		GameRegistry.addRecipe(new ItemStack(Dirt_Mod_sword),
				new Object [] {
					"X",
					"X",
					"Z",
					'X',Blocks.dirt,
					'Z',Items.stick});

		GameRegistry.addRecipe(new ItemStack(Dirt_Mod_shovel),
				new Object [] {
						"X",
						"Z",
						"Z",
						'X',Blocks.dirt,
						'Z',Items.stick});

		GameRegistry.addRecipe(new ItemStack(Dirt_Mod_axe),
				new Object [] {
						"XX ",
						"XZ ",
						" Z ",
						'X',Blocks.dirt,
						'Z',Items.stick});

		GameRegistry.addRecipe(new ItemStack(Dirt_Mod_pickaxe),
				new Object [] {
						"XXX",
						" Z ",
						" Z ",
						'X',Blocks.dirt,
						'Z',Items.stick});

		GameRegistry.addRecipe(new ItemStack(Dirt_Mod_hoe),
				new Object [] {
						"XX ",
						" Z ",
						" Z ",
						'X',Blocks.dirt,
						'Z',Items.stick});

		GameRegistry.addRecipe(new ItemStack(Glowstoneblock,8),
				new Object [] {
						"AAA",
						"AZA",
						"AAA",
						'A',Blocks.obsidian,
						'Z',Blocks.glowstone});
	  }
		 @SubscribeEvent
			public void onServerChat(ServerChatEvent event)
			{
				if (event.message.contains("fuck"))
				{
					event.player.addChatMessage(new ChatComponentText("NG WORD"));
				}
			}

		    @NetworkCheckHandler
			public boolean netCheckHandler(Map<String, String> mods, Side side)
			{
				return true;
			}

}
