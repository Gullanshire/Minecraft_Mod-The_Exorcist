package exorcist_items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class Mica extends Item {

        public Mica() {
                maxStackSize = 64;
                setUnlocalizedName("Mica");
                setTextureName("exorcist:mica_32");
        }
}