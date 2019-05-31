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
public class RegistryEvents
{
	@SubscribeEvent
	public void registerItems(RegistryEvent.Register<Item> event)
	{
		ItemList.registerItems(event.getRegistry());
		BetterPaths.logger.info("Items registered.");
	}
	@SubscribeEvent
	public void registerBlocks(RegistryEvent.Register<Block> event)
	{
		BlockList.registerBlocks(event.getRegistry());
		BetterPaths.logger.info("Blocks registered");
	}
	
	public static ResourceLocation location(String name)
	{
		return new ResourceLocation(BetterPaths.modid, name);
	}
}
