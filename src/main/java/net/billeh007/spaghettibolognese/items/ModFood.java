package net.billeh007.spaghettibolognese.items;

import net.billeh007.spaghettibolognese.group.ModGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;

public class ModFood extends ModItem
{
	/**
	 * Basic food constructor with no frills. Have to manually enter any settings yourself.
	 * @param hunger		The hunger filled by the food
	 * @param saturation	The saturation value for the food
	 */
	public ModFood(FabricItemSettings settings)
	{
		super(settings);
	}
	
	/**
	 * Simple food constructor. Only needs a hunger and saturation value. This does not create a dog valid food.
	 * @param hunger		The hunger filled by the food
	 * @param saturation	The saturation value for the food
	 */
	public ModFood(int hunger, float saturation)
	{
		this(hunger, 64, saturation);
	}
	
	/**
	 * Complete constructor for food that is valid for dogs.
	 * @param hunger		The hunger filled by the food
	 * @param saturation	The saturation value for the food
	 * @param count			The max number that can be in a stack
	 */
	public ModFood(int hunger, float saturation, int count)
	{
		this(new FabricItemSettings().group(ModGroup.defaultGroup).food(new FoodComponent.Builder().hunger(hunger)
				.saturationModifier(saturation).meat().build()).maxCount(count));
	}
	
	/**
	 * Complete constructor for food that is NOT valid for dogs.
	 * @param hunger		The hunger filled by the food
	 * @param count			The saturation value for the food
	 * @param saturation	The max number that can be in a stack
	 */
	public ModFood(int hunger, int count, float saturation)
	{
		this(new FabricItemSettings().group(ModGroup.defaultGroup).food(new FoodComponent.Builder().hunger(hunger)
				.saturationModifier(saturation).build()).maxCount(count));
	}
}
