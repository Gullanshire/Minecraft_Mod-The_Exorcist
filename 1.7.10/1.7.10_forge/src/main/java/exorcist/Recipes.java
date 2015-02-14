package exorcist;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import exorcist_blocks.Main_Blocks;
import exorcist_items.Main_Items;

public class Recipes {
	public static void Initialize_Recipes(){
		ItemStack moonstone1=new ItemStack(Main_Items.moonstone,1);
		ItemStack moonstone9=new ItemStack(Main_Items.moonstone,9);
		ItemStack moonstoneBlock1=new ItemStack(Main_Blocks.moonstoneBlock,1);
		GameRegistry.addRecipe(moonstoneBlock1, "xxx", "xxx", "xxx",'x', moonstone1);
		GameRegistry.addRecipe(moonstone9, "x",'x', moonstoneBlock1);

		ItemStack silverIngot1=new ItemStack(Main_Items.silverIngot,1);
		ItemStack silverIngot9=new ItemStack(Main_Items.silverIngot,9);
		ItemStack silverBlock1=new ItemStack(Main_Blocks.silverBlock,1);
		GameRegistry.addRecipe(silverBlock1, "xxx", "xxx", "xxx",'x', silverIngot1);
		GameRegistry.addRecipe(silverIngot9, "x",'x', silverBlock1);
	}
}
