package tool_modXXX.foodtest;

import java.util.Map;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.network.NetworkCheckHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ServerChatEvent;


@Mod(modid = "foodtest", name = "FoodTest", version="1.0.4")


public class Foodtest_Mod {

	public static final CreativeTabs food_mod = new CreativeTabs("foodtool")
	{
	   public Item getTabIconItem()
	 {
	   return new ItemStack(Foodtest_Mod.testfood, 1, 0).getItem();
	 }
	};


	public static Item testfood;
	public static Item Zonbifu_grilled;
	public static Item Diamond_Apple;
	public static Item Baked_bread;
	public static Item Baked_apple;
	public static Item Warm_milk;
	public static Item Sugar_cube;
	public static Item Sugar_charcoal;
	public static Block Strengthening_coal_block;


	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		testfood = new Testfood(5000, 5, false);
		Zonbifu_grilled = new Zonbifu_grilledfood(5001, 5, true);
		Diamond_Apple = new Diamond_Apple(5003, 5, false);
		Baked_bread = new Baked_bread(5004, 5, false);
		Baked_apple = new Baked_apple(5005, 5, false);
		Warm_milk = new Warm_milk(5006, 5, false);
		Sugar_cube = new Sugar_cube(5007, 5, false);
		Sugar_charcoal = new Sugar_charcoal();
		Strengthening_coal_block = new Strengthening_coal_block ();


		GameRegistry.registerItem(testfood, "Test_food");
		GameRegistry.registerItem(Zonbifu_grilled, "Zonbifu_grilled");
		GameRegistry.registerItem(Diamond_Apple, "Diamond_Apple");
		GameRegistry.registerItem(Baked_bread, "Baked_bread");
		GameRegistry.registerItem(Baked_apple, "Baked_apple");
		GameRegistry.registerItem(Warm_milk, "Warm_milk");
		GameRegistry.registerItem(Sugar_cube, "Sugar_cube");
		GameRegistry.registerItem(Sugar_charcoal, "Sugar_charcoal");

	}


	@EventHandler
	public void init(FMLInitializationEvent event) {

		MinecraftForge.EVENT_BUS.register(this);

		GameRegistry.addRecipe(new ItemStack(testfood),
				new Object [] {
						"XXX",
						"X",
						"X",
						'X',Items.apple});

		GameRegistry.addRecipe(new ItemStack(Diamond_Apple),
				new Object [] {
						" X ",
						"XYX",
						" X ",
						'X',Items.diamond,
						'Y',Items.apple});

		GameRegistry.addRecipe(new ItemStack(Sugar_cube),
				new Object [] {
						"XXX",
						"XXX",
						"XXX",
						'X',Items.sugar});

		GameRegistry.addRecipe(new ItemStack(Items.sugar, 9),
				new Object [] {
						"   ",
						" X ",
						"   ",
						'X',Sugar_cube});

		GameRegistry.addRecipe(new ItemStack(Items.gunpowder, 2),
				new Object [] {
						"XX ",
						"XX ",
						"   ",
						'X',Blocks.dirt});

		GameRegistry.addRecipe(new ItemStack(Strengthening_coal_block),
		        new Object [] {
		        		"XXX",
		        		"XXX",
		        		"XXX",
		        		'X',Blocks.coal_block});

		GameRegistry.addSmelting(Items.rotten_flesh,new ItemStack(Zonbifu_grilled),0.1f);
		GameRegistry.addSmelting(Items.bread,new ItemStack(Baked_bread),0.1f);
		GameRegistry.addSmelting(Items.apple,new ItemStack(Baked_apple),0.1f);
		GameRegistry.addSmelting(Items.milk_bucket,new ItemStack(Warm_milk),0.1f);
		GameRegistry.addSmelting(Sugar_cube,new ItemStack(Sugar_charcoal),0.1F);
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