package exorcist_items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class Crystal extends Item {

        public Crystal() {
                maxStackSize = 64;
                setUnlocalizedName("Crystal");
                setTextureName("exorcist:crystal_32");
        }
}