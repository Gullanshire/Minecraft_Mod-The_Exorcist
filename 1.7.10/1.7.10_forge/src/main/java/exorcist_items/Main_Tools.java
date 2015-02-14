package exorcist_items;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import exorcist.Generic;

public class Main_Tools {

	public static Item G5sSword;
	
	public static ToolMaterial Material_G5sSword=EnumHelper.addToolMaterial("g5suitmaterial", 3, 2000, 16.0F, 50F, 10); 
	
	public static void Initialize_Tools(){
		
		G5sSword=new G5sSword(Material_G5sSword)
		.setUnlocalizedName("G5sSword")
		.setCreativeTab(Generic.ExorcistCreativeTab)
		.setTextureName("exorcist:staff_3");

		LanguageRegistry.addName(G5sSword,"G5sSword");
		GameRegistry.registerItem(G5sSword,"G5sSword");  
		
	}
}
