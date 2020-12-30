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
	/**
	 * Used to register an item for use in the game.
	 * @param name		The item name, as a string
	 * @param item		The item to be registered
	 */
	public static void registerItem(String name, Item item)
	{
		Registry.register(Registry.ITEM, new Identifier(SpaghettiBolognese.modName, name), item);
	}
	
	/**
	 * Used to register both a block and an item to represent that block in the game.
	 * @param name		The block name, as a string
	 * @param block		The block to be registered
	 */
	public static void registerBlock(String name, Block block)
	{
		Registry.register(Registry.BLOCK, new Identifier(SpaghettiBolognese.modName, name), block);
		Registry.register(Registry.ITEM, new Identifier(SpaghettiBolognese.modName, name), new BlockItem(block, new Item.Settings().group(ModGroup.defaultGroup)));
	}
	
	/**
	 * Used to register specifically transparent blocks.
	 * @param name		The block name, as a string
	 * @param block		The transparent block to be registered
	 */
	public static void registerTransparent(String name, Block block)
	{
		BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());
		registerBlock(name, block);
	}
}
