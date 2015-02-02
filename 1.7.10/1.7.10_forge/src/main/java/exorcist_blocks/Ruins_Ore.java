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

public class Ruins_Ore extends Block {
	public Ruins_Ore(){
		super(Material.rock);
		this.setHardness(5F);
		this.setResistance(30F);
		this.setHarvestLevel("pickaxe",2);
		this.setStepSound(soundTypeStone);
        this.setBlockTextureName("exorcist:ruins_ore_32");
		
	}
	
    private Random rand = new Random();
    
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
    	int j1=0;
    	j1 = MathHelper.getRandomIntegerInRange(rand, 1, 2);
    	if(j1==1)
        return Generic.chipAngel;
    	else
    	return Generic.chipDemon;
    }
    
    public int quantityDropped(Random p_149745_1_)
    {
    	int j1=0;
    	j1 = MathHelper.getRandomIntegerInRange(rand, 1, 4);
        return 2;
    }
}