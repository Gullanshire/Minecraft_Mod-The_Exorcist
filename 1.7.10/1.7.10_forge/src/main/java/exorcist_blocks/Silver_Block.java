package exorcist_blocks;

import java.util.Random;

import exorcist.Generic;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;

public class Silver_Block extends Block {
	public Silver_Block(){
		super(Material.rock);
		this.setHardness(3F);
		this.setResistance(50F);
		this.setHarvestLevel("pickaxe",2);
		this.setStepSound(soundTypeStone);
        this.setBlockTextureName("exorcist:silver_block_32");
	}
	
    private Random rand = new Random();
    
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
    	return Generic.silverIngot;
    }
    
    public int quantityDropped(Random p_149745_1_)
    {
    	//int j1=0;
    	//j1 = MathHelper.getRandomIntegerInRange(rand, 1, 4);
        return 9;
    }
}