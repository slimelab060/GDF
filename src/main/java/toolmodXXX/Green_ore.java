package tool_modXXX.toolMod;


import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class Green_ore extends Block
{

@SideOnly(Side.CLIENT)
   private IIcon TopIcon;

   @SideOnly(Side.CLIENT)
   private IIcon SideIcon;

public Green_ore() {
       super(Material.rock);
       setCreativeTab(ToolMod.tabtoolmod);
       setBlockName("green_ore");
       setBlockTextureName("toolmod:green_ore");
       setHardness(3.0F);
       setResistance(9000.0F);
       setStepSound(Block.soundTypeStone);
       setLightOpacity(1);
       setLightLevel(0.5F);
       setHarvestLevel("pickaxe", 3);
   }

   @Override
   public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float posX, float posY, float posZ){
       //ブロックを右クリックした際の動作
       return false;
   }

   @Override
   public void onBlockClicked(World world, int x, int y, int z, EntityPlayer player){
       //ブロックを左クリックした際の動作
   }

   @Override
   public void onNeighborBlockChange(World world, int x, int y, int z, Block neighborBlock){
       //周囲のブロックが更新された際の動作
   }

   @Override
   public int quantityDropped(int meta, int fortune, Random random){
       //ドロップするアイテムを返す
       return quantityDroppedWithBonus(fortune, random);
   }

   @Override
   public int quantityDropped(Random random){
       //ドロップさせる量を返す
       return 1;
   }

       @Override
   	public int quantityDroppedWithBonus(int fortune, Random random) {
   		if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped(0, random, fortune)) {
   			int i = random.nextInt(fortune + 2) - 1;
   			if (i < 0) {
   				i = 0;
   			}
   			return this.quantityDropped(random) * (i + 1);
   		} else {
   			return this.quantityDropped(random);
   		}
   }

   @SideOnly(Side.CLIENT)
   public void registerBlockIcons(IIconRegister par1IconRegister)
   {
       this.TopIcon = par1IconRegister.registerIcon("toolmod:green_ore");
       this.SideIcon = par1IconRegister.registerIcon("toolmod:green_ore");
   }

   @SideOnly(Side.CLIENT)
   public IIcon getIcon(int par1, int par2)
   {
        if(par1 == 0 || par1 == 1)
        {
                 return TopIcon;
        }
        else
        {
                 return SideIcon;
        }
   }
}