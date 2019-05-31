package darksun.betterpaths.lists;

import darksun.betterpaths.RegistryEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.registries.IForgeRegistry;

public class ItemList
{
	public static Item tutorial_item;
	public static Item stone_path_block;
	
	private static Item.Properties category = new Item.Properties().group(ItemGroup.MISC);
	
	public static void registerItems(IForgeRegistry<Item> registry)
	{
		// build tutorial item
		tutorial_item = new Item(category);
		tutorial_item.setRegistryName(RegistryEvents.location("tutorial_item"));
		
		// build path block item
		stone_path_block = new ItemBlock(BlockList.stone_path_block, category);
		stone_path_block.setRegistryName(BlockList.stone_path_block.getRegistryName());
		
		// register items
		registry.register(tutorial_item);
		registry.register(stone_path_block);
	}
}
