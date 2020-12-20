package net.billeh007.spaghettibolognese.items;

import net.billeh007.spaghettibolognese.group.ModGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class ModStew extends ModFood
{
	private static final int maxStack = 1;
	private ItemConvertible returnedItem;
	
	/**
	 * Used for manually entered settings on a food item that returns something other than a bowl. Remember that you can use
	 * a comma and add a number to an ItemStack's passed information to increase the number of an item returned.
	 * @param settings		The food settings for the item
	 * @param holder		The item to be returned on consumption
	 */
	public ModStew(FabricItemSettings settings, ItemConvertible holder)
	{
		super(settings);
		this.returnedItem = holder;
	}
	
	/**
	 * Used for manually entered settings on a basic bowl held item.
	 * @param settings		The food settings for the item
	 */
	public ModStew(FabricItemSettings settings)
	{
		this(settings, Items.BOWL);
	}
	
	/**
	 * Used for simple to enter foods that use custom holders. Takes a max number count.
	 * @param hunger		The amount of hunger filled by the food
	 * @param count			The max stack size for the food
	 * @param saturation	The amount of saturation filled by the food
	 * @param holder		The item that holds the food, returned on consumption
	 */
	public ModStew(int hunger, int count, float saturation, ItemConvertible holder)
	{
		this(new FabricItemSettings().group(ModGroup.defaultGroup).food(new FoodComponent.Builder().hunger(hunger)
				.saturationModifier(saturation).build()).maxCount(count), holder);
	}
	
	/**
	 * Used for simple to enter foods that use bowls and not custom items. Takes a max number count.
	 * @param hunger		The amount of hunger filled by the food
	 * @param count			The max stack size for the food
	 * @param saturation	The amount of saturation filled by the food
	 */
	public ModStew(int hunger, int count, float saturation)
	{
		this(hunger, count, saturation, Items.BOWL);
	}
	
	/**
	 * Used to construct a custom holder food which by default has a max stack of 1.
	 * @param hunger		The amount of hunger filled by the food
	 * @param saturation	The max stack size for the food
	 * @param holder		The amount of saturation filled by the food
	 */
	public ModStew(int hunger, float saturation, ItemConvertible holder)
	{
		this(hunger, maxStack, saturation, holder);
	}
	
	/**
	 * Used to construct a bowl food which by default has a max stack of 1.
	 * @param hunger		The amount of hunger filled by the food
	 * @param saturation	The amount of saturation filled by the food
	 */
	public ModStew(int hunger, float saturation)
	{
		this(hunger, saturation, Items.BOWL);
	}
	
	/**
	 * Override to manually determine what items get returned on consumption. Currently bugged, need to figure out how to allow for more than
	 * one returned item.
	 */
	public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user)
	{
		ItemStack itemStack = super.finishUsing(stack, world, user);
		return user instanceof PlayerEntity && ((PlayerEntity)user).abilities.creativeMode ? itemStack : new ItemStack(this.returnedItem);
	}
}
