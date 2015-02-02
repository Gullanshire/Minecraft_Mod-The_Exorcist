package exorcist_items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class Silver_Ingot extends Item {

        public Silver_Ingot() {
                maxStackSize = 64;
                setUnlocalizedName("Silver Ingot");
                setTextureName("exorcist:silver_ingot_32");
        }
}