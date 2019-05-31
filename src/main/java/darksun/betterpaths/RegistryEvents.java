package darksun.betterpaths;

import darksun.betterpaths.lists.BlockList;
import darksun.betterpaths.lists.ItemList;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = BetterPaths.modid, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class RegistryEvents
{
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event)
	{
		BetterPaths.logger.info("Items registered.");
		ItemList.registerItems(event.getRegistry());
	}
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event)
	{
		BetterPaths.logger.info("Blocks registered");
		BlockList.registerBlocks(event.getRegistry());
	}
	
	public static ResourceLocation location(String name)
	{
		return new ResourceLocation(BetterPaths.modid, name);
	}
}
