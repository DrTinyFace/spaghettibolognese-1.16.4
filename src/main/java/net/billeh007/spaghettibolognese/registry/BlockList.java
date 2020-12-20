package net.billeh007.spaghettibolognese.registry;

import net.billeh007.spaghettibolognese.blocks.ModBlock;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;

public class BlockList
{
	public static final ModBlock blockMossyOakPlank = new ModBlock(Material.WOOD, MaterialColor.WOOD, 2f);
	
	/**
	 * Adds all the blocks in the mod to the game.
	 */
	public static void addBlocks()
	{
		RegisterHelper.registerBlock("mossyoakplank", blockMossyOakPlank);
	}
}
