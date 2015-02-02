package exorcist;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler; // used in 1.6.2
//import cpw.mods.fml.common.Mod.PreInit;    // used in 1.5.2
//import cpw.mods.fml.common.Mod.Init;       // used in 1.5.2
//import cpw.mods.fml.common.Mod.PostInit;   // used in 1.5.2
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import exorcist_blocks.Crystal_Ore;
import exorcist_blocks.Gem_Ore;
import exorcist_blocks.Mica_Ore;
import exorcist_blocks.Moonstone_Block;
import exorcist_blocks.Moonstone_Ore;
import exorcist_blocks.Ruins_Ore;
import exorcist_blocks.Silver_Block;
import exorcist_blocks.Silver_Ore;
import exorcist_items.Chip_Angel;
import exorcist_items.Chip_Demon;
import exorcist_items.Crystal;
import exorcist_items.Crystal_Blue;
import exorcist_items.Crystal_Purple;
import exorcist_items.Mica;
import exorcist_items.Moonstone;
import exorcist_items.Ruby;
import exorcist_items.Sapphire;
//import cpw.mods.fml.common.network.NetworkMod; // not used in 1.7
import exorcist_items.Silver_Ingot;
import exorcist_items.Silver_Nugget;

@Mod(modid="Exorcist", name="Exorcist", version="1.0.0")
//@NetworkMod(clientSideRequired=true) // not used in 1.7
public class Generic {

        // The instance of your mod that Forge uses.
        @Instance(value = "Exorcist")
        public static Generic instance;
        
        public static Block relicFossilsBlock;
        public static Item demonFossilsPieces;
        public static Item heavenFossilsPieces;
        
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
        
        //register mod block variables
        public static Block crystalOre;
        public static Block gemOre;
        public static Block micaOre;
        public static Block moonstoneBlock;
        public static Block moonstoneOre;
        public static Block ruinsOre;
        public static Block silverBlock;
        public static Block silverOre;
        
        //register worldgenerator
        EventManager ModWorldGenerator = new EventManager();
        
        // Says where the client and server 'proxy' code is loaded.
        @SidedProxy(clientSide="exorcist.client.ClientProxy", serverSide="exorcist.CommonProxy")
        public static CommonProxy proxy;
        
        @SideOnly(Side.CLIENT)
        public static CreativeTabs ExorcistCreativeTab = new CreativeTabs("Exorcist") {
            @Override
            @SideOnly(Side.CLIENT)
            public Item getTabIconItem() {
                return Items.ender_eye;
            }
        };
        
        @EventHandler // used in 1.6.2
        //@PreInit    // used in 1.5.2
        public void preInit(FMLPreInitializationEvent event) {
                // Stub Method
        }
        
        @EventHandler // used in 1.6.2
        //@Init       // used in 1.5.2
        public void load(FMLInitializationEvent event) {
        	
                proxy.registerRenderers();

        		//Load Items
                chipAngel=new Chip_Angel()
                .setCreativeTab(this.ExorcistCreativeTab);
        		LanguageRegistry.addName(chipAngel,"Chip Angel");
        		GameRegistry.registerItem(chipAngel,"Chip Angel");                
                
                chipDemon=new Chip_Demon()
                .setCreativeTab(this.ExorcistCreativeTab);
        		LanguageRegistry.addName(chipDemon,"Chip Demon");
        		GameRegistry.registerItem(chipDemon,"Chip Demon");
        		
                crystalBlue=new Crystal_Blue()
                .setCreativeTab(this.ExorcistCreativeTab);
        		LanguageRegistry.addName(crystalBlue,"Blue Crystal");
        		GameRegistry.registerItem(crystalBlue,"Blue Crystal");
        		
                crystalPurple=new Crystal_Purple()
                .setCreativeTab(this.ExorcistCreativeTab);
        		LanguageRegistry.addName(crystalPurple,"Crystal Purple");
        		GameRegistry.registerItem(crystalPurple,"Crystal Purple");        		

                crystal=new Crystal()
                .setCreativeTab(this.ExorcistCreativeTab);
        		LanguageRegistry.addName(crystal,"Crystal");
        		GameRegistry.registerItem(crystal,"Crystal");     
        		
                mica=new Mica()
                .setCreativeTab(this.ExorcistCreativeTab);
        		LanguageRegistry.addName(mica,"Mica");
        		GameRegistry.registerItem(mica,"Mica");

                moonstone=new Moonstone()
                .setCreativeTab(this.ExorcistCreativeTab);
        		LanguageRegistry.addName(moonstone,"Moonstone");
        		GameRegistry.registerItem(moonstone,"Moonstone");
        		
                ruby=new Ruby()
                .setCreativeTab(this.ExorcistCreativeTab);
        		LanguageRegistry.addName(ruby,"Ruby");
        		GameRegistry.registerItem(ruby,"Ruby");        		
        		
                sapphire=new Sapphire()
                .setCreativeTab(this.ExorcistCreativeTab);
        		LanguageRegistry.addName(sapphire,"Sapphire");
        		GameRegistry.registerItem(sapphire,"Sapphire");         		
        		
                silverIngot=new Silver_Ingot()
                .setCreativeTab(this.ExorcistCreativeTab);
        		LanguageRegistry.addName(silverIngot,"Silver Ingot");
        		GameRegistry.registerItem(silverIngot,"Silver Ingot");            		
        		
                silverNugget=new Silver_Nugget()
                .setCreativeTab(this.ExorcistCreativeTab);
        		LanguageRegistry.addName(silverNugget,"Silver Nugget");
        		GameRegistry.registerItem(silverNugget,"Silver Nugget");
        		
        		//Load Blocks
        		
        		crystalOre=new Crystal_Ore()
        		.setBlockName("Crystal Ore")
        		.setCreativeTab(this.ExorcistCreativeTab);
        		LanguageRegistry.addName(crystalOre,"Crystal Ore");
        		GameRegistry.registerBlock(crystalOre,"Crystal Ore");
        		
        		gemOre=new Gem_Ore()
        		.setBlockName("Gem Ore")
        		.setCreativeTab(this.ExorcistCreativeTab);
        		LanguageRegistry.addName(gemOre,"Gem Ore");
        		GameRegistry.registerBlock(gemOre,"Gem Ore");
        		
        		micaOre=new Mica_Ore()
        		.setBlockName("Mica Ore")
        		.setCreativeTab(this.ExorcistCreativeTab);
        		LanguageRegistry.addName(micaOre,"Mica Ore");
        		GameRegistry.registerBlock(micaOre,"Mica Ore");
        		
        		moonstoneBlock=new Moonstone_Block()
        		.setBlockName("Moonstone Block")
        		.setCreativeTab(this.ExorcistCreativeTab);
        		LanguageRegistry.addName(moonstoneBlock,"Moonstone Block");
        		GameRegistry.registerBlock(moonstoneBlock,"Moonstone Block");
        		
        		moonstoneOre=new Moonstone_Ore()
        		.setBlockName("Moonstone Ore")
        		.setCreativeTab(this.ExorcistCreativeTab);
        		LanguageRegistry.addName(moonstoneOre,"Moonstone Ore");
        		GameRegistry.registerBlock(moonstoneOre,"Moonstone Ore");
     
        		ruinsOre=new Ruins_Ore()
        		.setBlockName("Ruins Ore")
        		.setCreativeTab(this.ExorcistCreativeTab);
        		LanguageRegistry.addName(ruinsOre,"Ruins Ore");
        		GameRegistry.registerBlock(ruinsOre,"Ruins Ore");
     
        		silverBlock=new Silver_Block()
        		.setBlockName("Silver Block")
        		.setCreativeTab(this.ExorcistCreativeTab);
        		LanguageRegistry.addName(silverBlock,"Silver Block");
        		GameRegistry.registerBlock(silverBlock,"Silver Block");
        		
        		silverOre=new Silver_Ore()
        		.setBlockName("Silver Ore")
        		.setCreativeTab(this.ExorcistCreativeTab);
        		LanguageRegistry.addName(silverOre,"Silver Ore");
        		GameRegistry.registerBlock(silverOre,"Silver Ore");        		  		
        		
        		//recipe
        		ItemStack moonstone1=new ItemStack(this.moonstone,1);
        		ItemStack moonstone9=new ItemStack(this.moonstone,9);
        		ItemStack moonstoneBlock1=new ItemStack(this.moonstoneBlock,1);
        		GameRegistry.addRecipe(moonstoneBlock1, "xxx", "xxx", "xxx",'x', moonstone1);
        		GameRegistry.addRecipe(moonstone9, "x",'x', moonstoneBlock1);

        		ItemStack silverIngot1=new ItemStack(this.silverIngot,1);
        		ItemStack silverIngot9=new ItemStack(this.silverIngot,9);
        		ItemStack silverBlock1=new ItemStack(this.silverBlock,1);
        		GameRegistry.addRecipe(silverBlock1, "xxx", "xxx", "xxx",'x', silverIngot1);
        		GameRegistry.addRecipe(silverIngot9, "x",'x', silverBlock1);
        		
        		//generator
        		GameRegistry.registerWorldGenerator(ModWorldGenerator, 0);
        		
        		
        }
        
        @EventHandler // used in 1.6.2
        //@PostInit   // used in 1.5.2
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
}