package exorcist_items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class Silver_Nugget extends Item {

        public Silver_Nugget() {
                maxStackSize = 64;
                setUnlocalizedName("Silver Nugget");
                setTextureName("exorcist:silver_nugget_32");
        }
}