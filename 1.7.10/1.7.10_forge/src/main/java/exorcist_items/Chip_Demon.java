package exorcist_items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class Chip_Demon extends Item {

        public Chip_Demon() {
                maxStackSize = 64;
                setUnlocalizedName("Demon Chip");
                setTextureName("exorcist:chip_demon_32");
        }
}