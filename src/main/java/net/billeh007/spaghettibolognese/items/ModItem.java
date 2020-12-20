package net.billeh007.spaghettibolognese.items;

import net.billeh007.spaghettibolognese.group.ModGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

public class ModItem extends Item
{
	/**
	 * Use this when you want to manually assign settings to an item.
	 * @param settings		The settings for the item
	 */
	public ModItem(Settings settings)
	{
		super(settings);
	}
	
	/**
	 * Default item constructor, auto assigns the default item group (creative tab)
	 */
	public ModItem()
	{
		super(new FabricItemSettings().group(ModGroup.defaultGroup));
	}
}
