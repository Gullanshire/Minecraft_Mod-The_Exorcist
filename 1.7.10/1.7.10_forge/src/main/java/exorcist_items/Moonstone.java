package exorcist_items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class Moonstone extends Item {

        public Moonstone() {
                maxStackSize = 64;
                setUnlocalizedName("Moonstone");
                setTextureName("exorcist:moonstone_32");
        }
}