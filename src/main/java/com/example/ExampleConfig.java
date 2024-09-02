package com.example;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("example")
public interface ExampleConfig extends Config
{
	@ConfigItem(
		keyName = "ItemsToCheck",
		name = "Items to remind when in bank/inventory",
		description = "Comma-separated list of items that you want to be reminded of when in inventory/bank whilst logging off"
	)
	default String itemsToCheck()
	{
		return "Dragon Warhammer,Blowpipe";
	}
}
