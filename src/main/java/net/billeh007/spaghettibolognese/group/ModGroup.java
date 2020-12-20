package net.billeh007.spaghettibolognese.group;

import net.billeh007.spaghettibolognese.SpaghettiBolognese;
import net.billeh007.spaghettibolognese.registry.ItemList;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModGroup
{
	public static final ItemGroup modGroup = FabricItemGroupBuilder.build(new Identifier(SpaghettiBolognese.modName, "spagbol"),
			() -> new ItemStack(ItemList.foodSpaghettiBolognese));
	
	public static final ItemGroup defaultGroup = modGroup;
	
	public static void test()
	{
		modGroup.setTexture("test");
	}
}
