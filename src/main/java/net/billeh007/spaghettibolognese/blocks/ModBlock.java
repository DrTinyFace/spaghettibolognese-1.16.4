package net.billeh007.spaghettibolognese.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;

public class ModBlock extends Block
{
	public ModBlock(FabricBlockSettings settings)
	{
		super(settings);
	}
	
	public ModBlock(Material material, MaterialColor color, float hardness)
	{
		this(FabricBlockSettings.of(material, color).hardness(hardness));
	}
}
