package darksun.betterpaths.lists;

import darksun.betterpaths.RegistryEvents;
import darksun.betterpaths.blocks.StonePath;
import net.minecraft.block.Block;
import net.minecraftforge.registries.IForgeRegistry;

public class BlockList
{
	public static Block stone_path_block;
	
	public static void registerBlocks(IForgeRegistry<Block> registry)
	{
		// build path block
		stone_path_block = new StonePath();
		stone_path_block.setRegistryName(RegistryEvents.location("stone_path_block"));
		
		// register blocks
		registry.register(stone_path_block);
	}
}
