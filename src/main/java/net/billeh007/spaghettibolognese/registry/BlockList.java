package net.billeh007.spaghettibolognese.registry;

import net.billeh007.spaghettibolognese.blocks.ModBlock;
import net.billeh007.spaghettibolognese.blocks.ModTransparent;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;

public class BlockList
{
	public static final ModBlock blockMossyOakPlank = new ModBlock(Material.WOOD, MaterialColor.WOOD, 2f);
	
	public static final ModTransparent blockBlinds = new ModTransparent(Material.GLASS, MaterialColor.CLEAR, 0.3f);
	
	/**
	 * Adds all the blocks in the mod to the game.
	 */
	public static void addBlocks()
	{
		//moss plank mod
		RegisterHelper.registerBlock("mossyoakplank", blockMossyOakPlank);
		
		//blinds mod
		RegisterHelper.registerTransparent("blinds", blockBlinds);
	}
}
