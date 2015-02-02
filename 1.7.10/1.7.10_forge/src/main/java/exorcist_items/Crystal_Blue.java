package exorcist_items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class Crystal_Blue extends Item {

        public Crystal_Blue() {
                maxStackSize = 64;
                setUnlocalizedName("Blue Crystal");
                setTextureName("exorcist:crystal_blue_32");
        }
}