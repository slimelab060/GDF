package tool_modXXX.foodtest;


import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class Strengthening_coal_block extends Block
{

@SideOnly(Side.CLIENT)
   private IIcon TopIcon;

   @SideOnly(Side.CLIENT)
   private IIcon SideIcon;


   public Strengthening_coal_block() {
       super(Material.rock);
       setCreativeTab(CreativeTabs.tabBlock);
       setBlockName("Strengthening_coal_block");
       setBlockTextureName("coal_block");
       setHardness(5.0F);
       setResistance(9000.0F);
       setStepSound(Block.soundTypeStone);
       setLightOpacity(0);
       setLightLevel(0.0F);
   }


   @Override
   public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float posX, float posY, float posZ){
       return false;
   }

   @Override
   public void onBlockClicked(World world, int x, int y, int z, EntityPlayer player){
   }

   @Override
   public void onNeighborBlockChange(World world, int x, int y, int z, Block neighborBlock){
   }

   @Override
   public int quantityDropped(int meta, int fortune, Random random){
       return quantityDroppedWithBonus(fortune, random);
   }

   @Override
   public int quantityDropped(Random random){
       return 1;
   }

   @Override
   @SideOnly(Side.CLIENT)
   public void registerBlockIcons(IIconRegister par1IconRegister)
   {
       this.TopIcon = par1IconRegister.registerIcon("coal_block");
       this.SideIcon = par1IconRegister.registerIcon("coal_block");
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