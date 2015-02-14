package exorcist;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import exorcist_blocks.Main_Blocks;
import exorcist_items.Main_Items;
//import cpw.mods.fml.common.network.NetworkMod; // not used in 1.7

@Mod(modid="Exorcist", name="Exorcist", version="1.0.0")
//@NetworkMod(clientSideRequired=true) // not used in 1.7
public class Generic {

        // The instance of your mod that Forge uses.
        @Instance(value = "Exorcist")
        public static Generic instance;
        
        public static Block relicFossilsBlock;
        public static Item demonFossilsPieces;
        public static Item heavenFossilsPieces;
        
        

        
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

        		
        		//Load Blocks
        		
        		Main_Blocks.Initialize_Blocks();
        		
        		//Load Items
        		
        		Main_Items.Initialize_Items();
        				
        		//generator
        		GameRegistry.registerWorldGenerator(ModWorldGenerator, 0);
        		
        		
        }
        
        @EventHandler // used in 1.6.2
        //@PostInit   // used in 1.5.2
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
}