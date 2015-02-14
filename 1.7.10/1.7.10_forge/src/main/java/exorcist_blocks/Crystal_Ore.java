package exorcist_blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import exorcist_items.Main_Items;

public class Crystal_Ore extends Block {
	public Crystal_Ore(){
		super(Material.rock);
		this.setHardness(4F);
		this.setResistance(50F);
		this.setHarvestLevel("pickaxe",2);
		this.setStepSound(soundTypeStone);
        this.setBlockTextureName("exorcist:crystal_ore_32");
		
	}
	
    private Random rand = new Random();
    
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
    	int j1=0;
    	j1 = MathHelper.getRandomIntegerInRange(rand, 1, 5);
    	if(j1==1||j1==2||j1==3)
        return Main_Items.crystal;
    	else if(j1==4)
    	return Main_Items.crystalBlue;
    	else
    	return Main_Items.crystalPurple;
    }
    
    public int quantityDropped(Random p_149745_1_)
    {
    	//int j1=0;
    	//j1 = MathHelper.getRandomIntegerInRange(rand, 1, 4);
        return 1;
    }
}