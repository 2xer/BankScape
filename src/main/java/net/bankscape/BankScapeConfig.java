package net.bankscape;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("BankScape")
public interface BankScapeConfig extends Config
{
	@ConfigItem(
		keyName = "bs",
		name = "BankScape command",
		description = "::bs performs an action"
	)
	default boolean bs()
	{
		return true;
	}
}
