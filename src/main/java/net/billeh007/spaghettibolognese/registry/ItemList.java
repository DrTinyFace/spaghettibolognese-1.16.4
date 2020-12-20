package net.billeh007.spaghettibolognese.registry;

import net.billeh007.spaghettibolognese.items.ModFood;
import net.billeh007.spaghettibolognese.items.ModItem;
import net.billeh007.spaghettibolognese.items.ModStew;

public class ItemList
{
	//standard items
	public static final ModItem itemPasta = new ModItem();
	public static final ModItem itemFlour = new ModItem();
	public static final ModItem itemMoss = new ModItem();
	
	//foods
	public static final ModFood foodPasta = new ModFood(1, 0.6f);
	public static final ModFood foodMeatball = new ModFood(4, 0.8f);
	
	//stews
	public static final ModStew foodSpaghettiBolognese = new ModStew(6, 0.8f);
	
	//potion foods
	public static final ModFood foodDogFood = new ModFood(4, 0.2f, 16);
	
	public static void addItems()
	{
		//spaghetti bolognese
		RegisterHelper.registerItem("flour", itemFlour);
		RegisterHelper.registerItem("pasta", itemPasta);
		RegisterHelper.registerItem("cookedpasta", foodPasta);
		RegisterHelper.registerItem("meatball", foodMeatball);
		RegisterHelper.registerItem("spaghettibolognese", foodSpaghettiBolognese);
		
		//mossy wood mod
		RegisterHelper.registerItem("moss", itemMoss);
		
		//dog food mod
		RegisterHelper.registerItem("dogfood", foodDogFood);
	}
}
