package exorcist_blocks;

import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import exorcist.Generic;

public class Main_Blocks {
	
    //register mod block variables
    public static Block crystalOre;
    public static Block gemOre;
    public static Block micaOre;
    public static Block moonstoneBlock;
    public static Block moonstoneOre;
    public static Block ruinsOre;
    public static Block silverBlock;
    public static Block silverOre;
	
	public static void Initialize_Blocks(){
		crystalOre=new Crystal_Ore()
		.setBlockName("Crystal Ore")
		.setCreativeTab(Generic.ExorcistCreativeTab);
		LanguageRegistry.addName(crystalOre,"Crystal Ore");
		GameRegistry.registerBlock(crystalOre,"Crystal Ore");
		
		gemOre=new Gem_Ore()
		.setBlockName("Gem Ore")
		.setCreativeTab(Generic.ExorcistCreativeTab);
		LanguageRegistry.addName(gemOre,"Gem Ore");
		GameRegistry.registerBlock(gemOre,"Gem Ore");
		
		micaOre=new Mica_Ore()
		.setBlockName("Mica Ore")
		.setCreativeTab(Generic.ExorcistCreativeTab);
		LanguageRegistry.addName(micaOre,"Mica Ore");
		GameRegistry.registerBlock(micaOre,"Mica Ore");
		
		moonstoneBlock=new Moonstone_Block()
		.setBlockName("Moonstone Block")
		.setCreativeTab(Generic.ExorcistCreativeTab);
		LanguageRegistry.addName(moonstoneBlock,"Moonstone Block");
		GameRegistry.registerBlock(moonstoneBlock,"Moonstone Block");
		
		moonstoneOre=new Moonstone_Ore()
		.setBlockName("Moonstone Ore")
		.setCreativeTab(Generic.ExorcistCreativeTab);
		LanguageRegistry.addName(moonstoneOre,"Moonstone Ore");
		GameRegistry.registerBlock(moonstoneOre,"Moonstone Ore");

		ruinsOre=new Ruins_Ore()
		.setBlockName("Ruins Ore")
		.setCreativeTab(Generic.ExorcistCreativeTab);
		LanguageRegistry.addName(ruinsOre,"Ruins Ore");
		GameRegistry.registerBlock(ruinsOre,"Ruins Ore");

		silverBlock=new Silver_Block()
		.setBlockName("Silver Block")
		.setCreativeTab(Generic.ExorcistCreativeTab);
		LanguageRegistry.addName(silverBlock,"Silver Block");
		GameRegistry.registerBlock(silverBlock,"Silver Block");
		
		silverOre=new Silver_Ore()
		.setBlockName("Silver Ore")
		.setCreativeTab(Generic.ExorcistCreativeTab);
		LanguageRegistry.addName(silverOre,"Silver Ore");
		GameRegistry.registerBlock(silverOre,"Silver Ore");        		  		
	}
}
