package exorcist_items;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import exorcist.Generic;

public class Main_Items {

    //register mod item variables
    public static Item chipAngel;
    public static Item chipDemon;
    public static Item crystalBlue;
    public static Item crystalPurple;
    public static Item crystal;
    public static Item mica;
    public static Item moonstone;
    public static Item ruby;
    public static Item sapphire;
    public static Item silverIngot;
    public static Item silverNugget; 
    public static Item staff1;
    
    public static Item g5sFlyer;

    public static void Initialize_Items(){
    	
    	Main_Tools.Initialize_Tools();
    	
		//Load Items
        chipAngel=new Chip_Angel()
        .setCreativeTab(Generic.ExorcistCreativeTab);
		LanguageRegistry.addName(chipAngel,"Chip Angel");
		GameRegistry.registerItem(chipAngel,"Chip Angel");                
        
        chipDemon=new Chip_Demon()
        .setCreativeTab(Generic.ExorcistCreativeTab);
		LanguageRegistry.addName(chipDemon,"Chip Demon");
		GameRegistry.registerItem(chipDemon,"Chip Demon");
		
        crystalBlue=new Crystal_Blue()
        .setCreativeTab(Generic.ExorcistCreativeTab);
		LanguageRegistry.addName(crystalBlue,"Blue Crystal");
		GameRegistry.registerItem(crystalBlue,"Blue Crystal");
		
        crystalPurple=new Crystal_Purple()
        .setCreativeTab(Generic.ExorcistCreativeTab);
		LanguageRegistry.addName(crystalPurple,"Crystal Purple");
		GameRegistry.registerItem(crystalPurple,"Crystal Purple");        		

        crystal=new Crystal()
        .setCreativeTab(Generic.ExorcistCreativeTab);
		LanguageRegistry.addName(crystal,"Crystal");
		GameRegistry.registerItem(crystal,"Crystal");     
		
        mica=new Mica()
        .setCreativeTab(Generic.ExorcistCreativeTab);
		LanguageRegistry.addName(mica,"Mica");
		GameRegistry.registerItem(mica,"Mica");

        moonstone=new Moonstone()
        .setCreativeTab(Generic.ExorcistCreativeTab);
		LanguageRegistry.addName(moonstone,"Moonstone");
		GameRegistry.registerItem(moonstone,"Moonstone");
		
        ruby=new Ruby()
        .setCreativeTab(Generic.ExorcistCreativeTab);
		LanguageRegistry.addName(ruby,"Ruby");
		GameRegistry.registerItem(ruby,"Ruby");        		
		
        sapphire=new Sapphire()
        .setCreativeTab(Generic.ExorcistCreativeTab);
		LanguageRegistry.addName(sapphire,"Sapphire");
		GameRegistry.registerItem(sapphire,"Sapphire");         		
		
        silverIngot=new Silver_Ingot()
        .setCreativeTab(Generic.ExorcistCreativeTab);
		LanguageRegistry.addName(silverIngot,"Silver Ingot");
		GameRegistry.registerItem(silverIngot,"Silver Ingot");            		
		
        silverNugget=new Silver_Nugget()
        .setCreativeTab(Generic.ExorcistCreativeTab);
		LanguageRegistry.addName(silverNugget,"Silver Nugget");
		GameRegistry.registerItem(silverNugget,"Silver Nugget");
    }
}
