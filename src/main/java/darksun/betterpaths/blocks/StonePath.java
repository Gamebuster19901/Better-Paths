package darksun.betterpaths.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCarpet;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class StonePath extends BlockCarpet
{
	public static final float SPEED_FACTOR = 1.11f;
	public static final float DEFAULT_SPEED_MAGNITUDE = .3f;
	
	public StonePath()
	{
		super
		(
			EnumDyeColor.WHITE,
			Block.Properties.create(Material.IRON)
				.hardnessAndResistance(1, 10)
				.sound(SoundType.STONE)
		);
	}

	@Override
	public void onEntityCollision(IBlockState state, World worldIn, BlockPos pos, Entity entityIn)
	{
		// exit if we aren't colliding with the player
		if (!(entityIn instanceof EntityPlayer))
			return;

		// return to default speed if we're jumping
		EntityPlayer player = (EntityPlayer)entityIn;
		if (player.motionY > 0)
		{
			double x = player.motionX;
			double z = player.motionZ;
			double magnitude = Math.sqrt(x*x + z*z);
			
			// exit if already moving at default speed or less
			if (magnitude <= DEFAULT_SPEED_MAGNITUDE)
				return;
			
			player.motionX = x * DEFAULT_SPEED_MAGNITUDE / magnitude;
			player.motionZ = z * DEFAULT_SPEED_MAGNITUDE / magnitude;
			
			return;
		}

		// apply speed factor to player motion
		player.motionX *= SPEED_FACTOR;
		player.motionZ *= SPEED_FACTOR;
	}
	
}
