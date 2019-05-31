package darksun.betterpaths;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("betterpaths")
public class BetterPaths
{
	public static BetterPaths instance;
	public static final String modid = "betterpaths";
	public static final Logger logger = LogManager.getLogger(modid);
	
	public BetterPaths()
	{
		instance = this;
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void setup(FMLCommonSetupEvent event)
	{
		logger.info("Setup method registered.");
	}
	private void clientRegistries(FMLClientSetupEvent event)
	{
		logger.info("clientRegistries method registered.");
	}

	/*
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents
	{
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event)
		{
			ItemList.registerItems(event.getRegistry());
			
			// register items here
			event.getRegistry().registerAll
			(
				// regular items
				ItemList.tutorial_item = new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("tutorial_item")),
				
				// item blocks
				ItemList.stone_path_block = new ItemBlock(BlockList.stone_path_block, new Item.Properties().group(ItemGroup.MISC)).setRegistryName(BlockList.stone_path_block.getRegistryName())
			);
			logger.info("Items registered.");
		}
		@SubscribeEvent
		public static void registerBlocks(RegistryEvent.Register<Block> event)
		{
			event.getRegistry().registerAll
			(
					BlockList.stone_path_block = new StonePath().setRegistryName(location("stone_path_block"))
			);
				
			logger.info("Blocks registered");
		}
	}
	*/
}
