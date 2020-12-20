package net.billeh007.spaghettibolognese;

import net.billeh007.spaghettibolognese.registry.BlockList;
import net.billeh007.spaghettibolognese.registry.ItemList;
import net.fabricmc.api.ModInitializer;

public class SpaghettiBolognese implements ModInitializer
{
	public static final String modName = "spaghettibolognese"; //our mod's name
	
	@Override
	public void onInitialize() 
	{
		ItemList.addItems();
		BlockList.addBlocks();
	}
}
