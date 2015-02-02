package exorcist_items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class Sapphire extends Item {

        public Sapphire() {
                maxStackSize = 64;
                setUnlocalizedName("Sapphire");
                setTextureName("exorcist:sapphire");
        }
}