package exorcist_items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class Crystal_Purple extends Item {

        public Crystal_Purple() {
                maxStackSize = 64;
                setUnlocalizedName("Purple Crystal");
                setTextureName("exorcist:crystal_purple_32");
        }
}