package exorcist_blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import exorcist_items.Main_Items;

public class Moonstone_Ore extends Block {
	public Moonstone_Ore(){
		super(Material.rock);
		this.setHardness(4F);
		this.setResistance(50F);
		this.setHarvestLevel("pickaxe",2);
		this.setStepSound(soundTypeStone);
        this.setBlockTextureName("exorcist:moonstone_ore_32");
	}
	
    private Random rand = new Random();
    
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
    	return Main_Items.moonstone;
    }
    
    public int quantityDropped(Random p_149745_1_)
    {
    	//int j1=0;
    	//j1 = MathHelper.getRandomIntegerInRange(rand, 1, 4);
        return 1;
    }
}