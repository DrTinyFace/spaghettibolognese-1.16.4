package net.billeh007.spaghettibolognese.registry;

import net.billeh007.spaghettibolognese.SpaghettiBolognese;
import net.billeh007.spaghettibolognese.group.ModGroup;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterHelper
{
	public static void registerItem(String name, Item item)
	{
		Registry.register(Registry.ITEM, new Identifier(SpaghettiBolognese.modName, name), item);
	}
	
	public static void registerBlock(String name, Block block)
	{
		Registry.register(Registry.BLOCK, new Identifier(SpaghettiBolognese.modName, name), block);
		Registry.register(Registry.ITEM, new Identifier(SpaghettiBolognese.modName, name), new BlockItem(block, new Item.Settings().group(ModGroup.defaultGroup)));
	}
	
	public static void registerTransparent(String name, Block block)
	{
		BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());
		registerBlock(name, block);
	}
}
