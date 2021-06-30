
package net.mcreator.cayakili.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.cayakili.CayaKiliModElements;

@CayaKiliModElements.ModElement.Tag
public class ZumrutkiliItem extends CayaKiliModElements.ModElement {
	@ObjectHolder("caya_kili:zumrutkili")
	public static final Item block = null;
	public ZumrutkiliItem(CayaKiliModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 0f;
			}

			public float getAttackDamage() {
				return 8f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 20;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, 16f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("zumrutkili"));
	}
}
