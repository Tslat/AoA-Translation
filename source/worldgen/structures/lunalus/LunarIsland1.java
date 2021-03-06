package net.tslat.aoa3.worldgen.structures.lunalus;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.tslat.aoa3.common.registration.AoABlocks;
import net.tslat.aoa3.worldgen.structures.AoAStructure;

import java.util.Random;

public class LunarIsland1 extends AoAStructure { //StructureSize: 15x15x15
	private static final BlockState moonlightOrb = AoABlocks.MOONLIGHT_ORB.get().getDefaultState();
	private static final BlockState lunasoleDirt = AoABlocks.LUNASOLE_DIRT.get().getDefaultState();
	private static final BlockState lunasoleGrass = AoABlocks.LUNASOLE_GRASS.get().getDefaultState();

	public LunarIsland1() {
		super("LunarIsland1");
	}

	@Override
	protected boolean replacesBlocks() {
		return true;
	}

	@Override
	protected void build(IWorld world, Random rand, BlockPos basePos) {
		if (rand.nextInt(10) == 0) {
			if (rand.nextInt(5) == 0) {
				addBlock(world, basePos, 5, 5, 5, AoABlocks.DARKLIGHT_ORB.get().getDefaultState());
			}
			else {
				addBlock(world, basePos, 5, 5, 5, moonlightOrb);
			}
		}

		addBlock(world, basePos, 5, 0, 6, lunasoleDirt);
		addBlock(world, basePos, 5, 0, 7, lunasoleDirt);
		addBlock(world, basePos, 5, 0, 8, lunasoleDirt);
		addBlock(world, basePos, 6, 0, 5, lunasoleDirt);
		addBlock(world, basePos, 6, 0, 6, lunasoleDirt);
		addBlock(world, basePos, 6, 0, 7, lunasoleDirt);
		addBlock(world, basePos, 6, 0, 8, lunasoleDirt);
		addBlock(world, basePos, 6, 0, 9, lunasoleDirt);
		addBlock(world, basePos, 7, 0, 5, lunasoleDirt);
		addBlock(world, basePos, 7, 0, 6, lunasoleDirt);
		addBlock(world, basePos, 7, 0, 7, lunasoleDirt);
		addBlock(world, basePos, 7, 0, 8, lunasoleDirt);
		addBlock(world, basePos, 7, 0, 9, lunasoleDirt);
		addBlock(world, basePos, 8, 0, 5, lunasoleDirt);
		addBlock(world, basePos, 8, 0, 6, lunasoleDirt);
		addBlock(world, basePos, 8, 0, 7, lunasoleDirt);
		addBlock(world, basePos, 8, 0, 8, lunasoleDirt);
		addBlock(world, basePos, 8, 0, 9, lunasoleDirt);
		addBlock(world, basePos, 9, 0, 6, lunasoleDirt);
		addBlock(world, basePos, 9, 0, 7, lunasoleDirt);
		addBlock(world, basePos, 9, 0, 8, lunasoleDirt);
		addBlock(world, basePos, 3, 1, 5, lunasoleDirt);
		addBlock(world, basePos, 3, 1, 6, lunasoleDirt);
		addBlock(world, basePos, 3, 1, 7, lunasoleDirt);
		addBlock(world, basePos, 3, 1, 8, lunasoleDirt);
		addBlock(world, basePos, 3, 1, 9, lunasoleDirt);
		addBlock(world, basePos, 4, 1, 4, lunasoleDirt);
		addBlock(world, basePos, 4, 1, 5, lunasoleDirt);
		addBlock(world, basePos, 4, 1, 6, lunasoleDirt);
		addBlock(world, basePos, 4, 1, 7, lunasoleDirt);
		addBlock(world, basePos, 4, 1, 8, lunasoleDirt);
		addBlock(world, basePos, 4, 1, 9, lunasoleDirt);
		addBlock(world, basePos, 4, 1, 10, lunasoleDirt);
		addBlock(world, basePos, 5, 1, 3, lunasoleDirt);
		addBlock(world, basePos, 5, 1, 4, lunasoleDirt);
		addBlock(world, basePos, 5, 1, 5, lunasoleDirt);
		addBlock(world, basePos, 5, 1, 9, lunasoleDirt);
		addBlock(world, basePos, 5, 1, 10, lunasoleDirt);
		addBlock(world, basePos, 5, 1, 11, lunasoleDirt);
		addBlock(world, basePos, 6, 1, 3, lunasoleDirt);
		addBlock(world, basePos, 6, 1, 4, lunasoleDirt);
		addBlock(world, basePos, 6, 1, 10, lunasoleDirt);
		addBlock(world, basePos, 6, 1, 11, lunasoleDirt);
		addBlock(world, basePos, 7, 1, 3, lunasoleDirt);
		addBlock(world, basePos, 7, 1, 4, lunasoleDirt);
		addBlock(world, basePos, 7, 1, 10, lunasoleDirt);
		addBlock(world, basePos, 7, 1, 11, lunasoleDirt);
		addBlock(world, basePos, 8, 1, 3, lunasoleDirt);
		addBlock(world, basePos, 8, 1, 4, lunasoleDirt);
		addBlock(world, basePos, 8, 1, 10, lunasoleDirt);
		addBlock(world, basePos, 8, 1, 11, lunasoleDirt);
		addBlock(world, basePos, 9, 1, 3, lunasoleDirt);
		addBlock(world, basePos, 9, 1, 4, lunasoleDirt);
		addBlock(world, basePos, 9, 1, 5, lunasoleDirt);
		addBlock(world, basePos, 9, 1, 9, lunasoleDirt);
		addBlock(world, basePos, 9, 1, 10, lunasoleDirt);
		addBlock(world, basePos, 9, 1, 11, lunasoleDirt);
		addBlock(world, basePos, 10, 1, 4, lunasoleDirt);
		addBlock(world, basePos, 10, 1, 5, lunasoleDirt);
		addBlock(world, basePos, 10, 1, 6, lunasoleDirt);
		addBlock(world, basePos, 10, 1, 7, lunasoleDirt);
		addBlock(world, basePos, 10, 1, 8, lunasoleDirt);
		addBlock(world, basePos, 10, 1, 9, lunasoleDirt);
		addBlock(world, basePos, 10, 1, 10, lunasoleDirt);
		addBlock(world, basePos, 11, 1, 5, lunasoleDirt);
		addBlock(world, basePos, 11, 1, 6, lunasoleDirt);
		addBlock(world, basePos, 11, 1, 7, lunasoleDirt);
		addBlock(world, basePos, 11, 1, 8, lunasoleDirt);
		addBlock(world, basePos, 11, 1, 9, lunasoleDirt);
		addBlock(world, basePos, 2, 2, 5, lunasoleDirt);
		addBlock(world, basePos, 2, 2, 6, lunasoleDirt);
		addBlock(world, basePos, 2, 2, 7, lunasoleDirt);
		addBlock(world, basePos, 2, 2, 8, lunasoleDirt);
		addBlock(world, basePos, 2, 2, 9, lunasoleDirt);
		addBlock(world, basePos, 3, 2, 4, lunasoleDirt);
		addBlock(world, basePos, 3, 2, 10, lunasoleDirt);
		addBlock(world, basePos, 4, 2, 3, lunasoleDirt);
		addBlock(world, basePos, 4, 2, 11, lunasoleDirt);
		addBlock(world, basePos, 5, 2, 2, lunasoleDirt);
		addBlock(world, basePos, 5, 2, 12, lunasoleDirt);
		addBlock(world, basePos, 6, 2, 2, lunasoleDirt);
		addBlock(world, basePos, 6, 2, 12, lunasoleDirt);
		addBlock(world, basePos, 7, 2, 2, lunasoleDirt);
		addBlock(world, basePos, 7, 2, 12, lunasoleDirt);
		addBlock(world, basePos, 8, 2, 2, lunasoleDirt);
		addBlock(world, basePos, 8, 2, 12, lunasoleDirt);
		addBlock(world, basePos, 9, 2, 2, lunasoleDirt);
		addBlock(world, basePos, 9, 2, 12, lunasoleDirt);
		addBlock(world, basePos, 10, 2, 3, lunasoleDirt);
		addBlock(world, basePos, 10, 2, 11, lunasoleDirt);
		addBlock(world, basePos, 11, 2, 4, lunasoleDirt);
		addBlock(world, basePos, 11, 2, 10, lunasoleDirt);
		addBlock(world, basePos, 12, 2, 5, lunasoleDirt);
		addBlock(world, basePos, 12, 2, 6, lunasoleDirt);
		addBlock(world, basePos, 12, 2, 7, lunasoleDirt);
		addBlock(world, basePos, 12, 2, 8, lunasoleDirt);
		addBlock(world, basePos, 12, 2, 9, lunasoleDirt);
		addBlock(world, basePos, 1, 3, 5, lunasoleDirt);
		addBlock(world, basePos, 1, 3, 6, lunasoleDirt);
		addBlock(world, basePos, 1, 3, 7, lunasoleDirt);
		addBlock(world, basePos, 1, 3, 8, lunasoleDirt);
		addBlock(world, basePos, 1, 3, 9, lunasoleDirt);
		addBlock(world, basePos, 2, 3, 4, lunasoleDirt);
		addBlock(world, basePos, 2, 3, 10, lunasoleDirt);
		addBlock(world, basePos, 3, 3, 3, lunasoleDirt);
		addBlock(world, basePos, 3, 3, 11, lunasoleDirt);
		addBlock(world, basePos, 4, 3, 2, lunasoleDirt);
		addBlock(world, basePos, 4, 3, 12, lunasoleDirt);
		addBlock(world, basePos, 5, 3, 1, lunasoleDirt);
		addBlock(world, basePos, 5, 3, 13, lunasoleDirt);
		addBlock(world, basePos, 6, 3, 1, lunasoleDirt);
		addBlock(world, basePos, 6, 3, 13, lunasoleDirt);
		addBlock(world, basePos, 7, 3, 1, lunasoleDirt);
		addBlock(world, basePos, 7, 3, 13, lunasoleDirt);
		addBlock(world, basePos, 8, 3, 1, lunasoleDirt);
		addBlock(world, basePos, 8, 3, 13, lunasoleDirt);
		addBlock(world, basePos, 9, 3, 1, lunasoleDirt);
		addBlock(world, basePos, 9, 3, 13, lunasoleDirt);
		addBlock(world, basePos, 10, 3, 2, lunasoleDirt);
		addBlock(world, basePos, 10, 3, 12, lunasoleDirt);
		addBlock(world, basePos, 11, 3, 3, lunasoleDirt);
		addBlock(world, basePos, 11, 3, 11, lunasoleDirt);
		addBlock(world, basePos, 12, 3, 4, lunasoleDirt);
		addBlock(world, basePos, 12, 3, 10, lunasoleDirt);
		addBlock(world, basePos, 13, 3, 5, lunasoleDirt);
		addBlock(world, basePos, 13, 3, 6, lunasoleDirt);
		addBlock(world, basePos, 13, 3, 7, lunasoleDirt);
		addBlock(world, basePos, 13, 3, 8, lunasoleDirt);
		addBlock(world, basePos, 13, 3, 9, lunasoleDirt);
		addBlock(world, basePos, 1, 4, 4, lunasoleDirt);
		addBlock(world, basePos, 1, 4, 5, lunasoleDirt);
		addBlock(world, basePos, 1, 4, 6, lunasoleDirt);
		addBlock(world, basePos, 1, 4, 7, lunasoleDirt);
		addBlock(world, basePos, 1, 4, 8, lunasoleDirt);
		addBlock(world, basePos, 1, 4, 9, lunasoleDirt);
		addBlock(world, basePos, 1, 4, 10, lunasoleDirt);
		addBlock(world, basePos, 2, 4, 3, lunasoleDirt);
		addBlock(world, basePos, 2, 4, 11, lunasoleDirt);
		addBlock(world, basePos, 3, 4, 2, lunasoleDirt);
		addBlock(world, basePos, 3, 4, 12, lunasoleDirt);
		addBlock(world, basePos, 4, 4, 1, lunasoleDirt);
		addBlock(world, basePos, 4, 4, 13, lunasoleDirt);
		addBlock(world, basePos, 5, 4, 1, lunasoleDirt);
		addBlock(world, basePos, 5, 4, 13, lunasoleDirt);
		addBlock(world, basePos, 6, 4, 1, lunasoleDirt);
		addBlock(world, basePos, 6, 4, 13, lunasoleDirt);
		addBlock(world, basePos, 7, 4, 1, lunasoleDirt);
		addBlock(world, basePos, 7, 4, 13, lunasoleDirt);
		addBlock(world, basePos, 8, 4, 1, lunasoleDirt);
		addBlock(world, basePos, 8, 4, 13, lunasoleDirt);
		addBlock(world, basePos, 9, 4, 1, lunasoleDirt);
		addBlock(world, basePos, 9, 4, 13, lunasoleDirt);
		addBlock(world, basePos, 10, 4, 1, lunasoleDirt);
		addBlock(world, basePos, 10, 4, 13, lunasoleDirt);
		addBlock(world, basePos, 11, 4, 2, lunasoleDirt);
		addBlock(world, basePos, 11, 4, 12, lunasoleDirt);
		addBlock(world, basePos, 12, 4, 3, lunasoleDirt);
		addBlock(world, basePos, 12, 4, 11, lunasoleDirt);
		addBlock(world, basePos, 13, 4, 4, lunasoleDirt);
		addBlock(world, basePos, 13, 4, 5, lunasoleDirt);
		addBlock(world, basePos, 13, 4, 6, lunasoleDirt);
		addBlock(world, basePos, 13, 4, 7, lunasoleDirt);
		addBlock(world, basePos, 13, 4, 8, lunasoleDirt);
		addBlock(world, basePos, 13, 4, 9, lunasoleDirt);
		addBlock(world, basePos, 13, 4, 10, lunasoleDirt);
		addBlock(world, basePos, 0, 5, 6, lunasoleDirt);
		addBlock(world, basePos, 0, 5, 7, lunasoleDirt);
		addBlock(world, basePos, 0, 5, 8, lunasoleDirt);
		addBlock(world, basePos, 1, 5, 3, lunasoleDirt);
		addBlock(world, basePos, 1, 5, 4, lunasoleDirt);
		addBlock(world, basePos, 1, 5, 5, lunasoleDirt);
		addBlock(world, basePos, 1, 5, 9, lunasoleDirt);
		addBlock(world, basePos, 1, 5, 10, lunasoleDirt);
		addBlock(world, basePos, 1, 5, 11, lunasoleDirt);
		addBlock(world, basePos, 2, 5, 2, lunasoleDirt);
		addBlock(world, basePos, 2, 5, 12, lunasoleDirt);
		addBlock(world, basePos, 3, 5, 1, lunasoleDirt);
		addBlock(world, basePos, 3, 5, 13, lunasoleDirt);
		addBlock(world, basePos, 4, 5, 1, lunasoleDirt);
		addBlock(world, basePos, 4, 5, 13, lunasoleDirt);
		addBlock(world, basePos, 5, 5, 1, lunasoleDirt);
		addBlock(world, basePos, 5, 5, 13, lunasoleDirt);
		addBlock(world, basePos, 6, 5, 0, lunasoleDirt);
		addBlock(world, basePos, 6, 5, 14, lunasoleDirt);
		addBlock(world, basePos, 7, 5, 0, lunasoleDirt);
		addBlock(world, basePos, 7, 5, 14, lunasoleDirt);
		addBlock(world, basePos, 8, 5, 0, lunasoleDirt);
		addBlock(world, basePos, 8, 5, 14, lunasoleDirt);
		addBlock(world, basePos, 9, 5, 1, lunasoleDirt);
		addBlock(world, basePos, 9, 5, 13, lunasoleDirt);
		addBlock(world, basePos, 10, 5, 1, lunasoleDirt);
		addBlock(world, basePos, 10, 5, 13, lunasoleDirt);
		addBlock(world, basePos, 11, 5, 1, lunasoleDirt);
		addBlock(world, basePos, 11, 5, 13, lunasoleDirt);
		addBlock(world, basePos, 12, 5, 2, lunasoleDirt);
		addBlock(world, basePos, 12, 5, 12, lunasoleDirt);
		addBlock(world, basePos, 13, 5, 3, lunasoleDirt);
		addBlock(world, basePos, 13, 5, 4, lunasoleDirt);
		addBlock(world, basePos, 13, 5, 5, lunasoleDirt);
		addBlock(world, basePos, 13, 5, 9, lunasoleDirt);
		addBlock(world, basePos, 13, 5, 10, lunasoleDirt);
		addBlock(world, basePos, 13, 5, 11, lunasoleDirt);
		addBlock(world, basePos, 14, 5, 6, lunasoleDirt);
		addBlock(world, basePos, 14, 5, 7, lunasoleDirt);
		addBlock(world, basePos, 14, 5, 8, lunasoleDirt);
		addBlock(world, basePos, 0, 6, 5, lunasoleDirt);
		addBlock(world, basePos, 0, 6, 6, lunasoleDirt);
		addBlock(world, basePos, 0, 6, 7, lunasoleDirt);
		addBlock(world, basePos, 0, 6, 8, lunasoleDirt);
		addBlock(world, basePos, 0, 6, 9, lunasoleDirt);
		addBlock(world, basePos, 1, 6, 3, lunasoleDirt);
		addBlock(world, basePos, 1, 6, 4, lunasoleDirt);
		addBlock(world, basePos, 1, 6, 10, lunasoleDirt);
		addBlock(world, basePos, 1, 6, 11, lunasoleDirt);
		addBlock(world, basePos, 2, 6, 2, lunasoleDirt);
		addBlock(world, basePos, 2, 6, 12, lunasoleDirt);
		addBlock(world, basePos, 3, 6, 1, lunasoleDirt);
		addBlock(world, basePos, 3, 6, 13, lunasoleDirt);
		addBlock(world, basePos, 4, 6, 1, lunasoleDirt);
		addBlock(world, basePos, 4, 6, 13, lunasoleDirt);
		addBlock(world, basePos, 5, 6, 0, lunasoleDirt);
		addBlock(world, basePos, 5, 6, 14, lunasoleDirt);
		addBlock(world, basePos, 6, 6, 0, lunasoleDirt);
		addBlock(world, basePos, 6, 6, 14, lunasoleDirt);
		addBlock(world, basePos, 7, 6, 0, lunasoleDirt);
		addBlock(world, basePos, 7, 6, 14, lunasoleDirt);
		addBlock(world, basePos, 8, 6, 0, lunasoleDirt);
		addBlock(world, basePos, 8, 6, 14, lunasoleDirt);
		addBlock(world, basePos, 9, 6, 0, lunasoleDirt);
		addBlock(world, basePos, 9, 6, 14, lunasoleDirt);
		addBlock(world, basePos, 10, 6, 1, lunasoleDirt);
		addBlock(world, basePos, 10, 6, 13, lunasoleDirt);
		addBlock(world, basePos, 11, 6, 1, lunasoleDirt);
		addBlock(world, basePos, 11, 6, 13, lunasoleDirt);
		addBlock(world, basePos, 12, 6, 2, lunasoleDirt);
		addBlock(world, basePos, 12, 6, 12, lunasoleDirt);
		addBlock(world, basePos, 13, 6, 3, lunasoleDirt);
		addBlock(world, basePos, 13, 6, 4, lunasoleDirt);
		addBlock(world, basePos, 13, 6, 10, lunasoleDirt);
		addBlock(world, basePos, 13, 6, 11, lunasoleDirt);
		addBlock(world, basePos, 14, 6, 5, lunasoleDirt);
		addBlock(world, basePos, 14, 6, 6, lunasoleDirt);
		addBlock(world, basePos, 14, 6, 7, lunasoleDirt);
		addBlock(world, basePos, 14, 6, 8, lunasoleDirt);
		addBlock(world, basePos, 14, 6, 9, lunasoleDirt);
		addBlock(world, basePos, 0, 7, 5, lunasoleDirt);
		addBlock(world, basePos, 0, 7, 6, lunasoleDirt);
		addBlock(world, basePos, 0, 7, 7, lunasoleDirt);
		addBlock(world, basePos, 0, 7, 8, lunasoleDirt);
		addBlock(world, basePos, 0, 7, 9, lunasoleDirt);
		addBlock(world, basePos, 1, 7, 3, lunasoleDirt);
		addBlock(world, basePos, 1, 7, 4, lunasoleDirt);
		addBlock(world, basePos, 1, 7, 10, lunasoleDirt);
		addBlock(world, basePos, 1, 7, 11, lunasoleDirt);
		addBlock(world, basePos, 2, 7, 2, lunasoleDirt);
		addBlock(world, basePos, 2, 7, 12, lunasoleDirt);
		addBlock(world, basePos, 3, 7, 1, lunasoleDirt);
		addBlock(world, basePos, 3, 7, 13, lunasoleDirt);
		addBlock(world, basePos, 4, 7, 1, lunasoleDirt);
		addBlock(world, basePos, 4, 7, 13, lunasoleDirt);
		addBlock(world, basePos, 5, 7, 0, lunasoleDirt);
		addBlock(world, basePos, 5, 7, 14, lunasoleDirt);
		addBlock(world, basePos, 6, 7, 0, lunasoleDirt);
		addBlock(world, basePos, 6, 7, 14, lunasoleDirt);
		addBlock(world, basePos, 7, 7, 0, lunasoleDirt);
		addBlock(world, basePos, 7, 7, 14, lunasoleDirt);
		addBlock(world, basePos, 8, 7, 0, lunasoleDirt);
		addBlock(world, basePos, 8, 7, 14, lunasoleDirt);
		addBlock(world, basePos, 9, 7, 0, lunasoleDirt);
		addBlock(world, basePos, 9, 7, 14, lunasoleDirt);
		addBlock(world, basePos, 10, 7, 1, lunasoleDirt);
		addBlock(world, basePos, 10, 7, 13, lunasoleDirt);
		addBlock(world, basePos, 11, 7, 1, lunasoleDirt);
		addBlock(world, basePos, 11, 7, 13, lunasoleDirt);
		addBlock(world, basePos, 12, 7, 2, lunasoleDirt);
		addBlock(world, basePos, 12, 7, 12, lunasoleDirt);
		addBlock(world, basePos, 13, 7, 3, lunasoleDirt);
		addBlock(world, basePos, 13, 7, 4, lunasoleDirt);
		addBlock(world, basePos, 13, 7, 10, lunasoleDirt);
		addBlock(world, basePos, 13, 7, 11, lunasoleDirt);
		addBlock(world, basePos, 14, 7, 5, lunasoleDirt);
		addBlock(world, basePos, 14, 7, 6, lunasoleDirt);
		addBlock(world, basePos, 14, 7, 7, lunasoleDirt);
		addBlock(world, basePos, 14, 7, 8, lunasoleDirt);
		addBlock(world, basePos, 14, 7, 9, lunasoleDirt);
		addBlock(world, basePos, 0, 8, 5, lunasoleGrass);
		addBlock(world, basePos, 0, 8, 6, lunasoleDirt);
		addBlock(world, basePos, 0, 8, 7, lunasoleDirt);
		addBlock(world, basePos, 0, 8, 8, lunasoleDirt);
		addBlock(world, basePos, 0, 8, 9, lunasoleGrass);
		addBlock(world, basePos, 1, 8, 3, lunasoleDirt);
		addBlock(world, basePos, 1, 8, 4, lunasoleDirt);
		addBlock(world, basePos, 1, 8, 10, lunasoleDirt);
		addBlock(world, basePos, 1, 8, 11, lunasoleDirt);
		addBlock(world, basePos, 2, 8, 2, lunasoleDirt);
		addBlock(world, basePos, 2, 8, 12, lunasoleDirt);
		addBlock(world, basePos, 3, 8, 1, lunasoleDirt);
		addBlock(world, basePos, 3, 8, 13, lunasoleDirt);
		addBlock(world, basePos, 4, 8, 1, lunasoleDirt);
		addBlock(world, basePos, 4, 8, 13, lunasoleDirt);
		addBlock(world, basePos, 5, 8, 0, lunasoleGrass);
		addBlock(world, basePos, 5, 8, 14, lunasoleGrass);
		addBlock(world, basePos, 6, 8, 0, lunasoleDirt);
		addBlock(world, basePos, 6, 8, 14, lunasoleDirt);
		addBlock(world, basePos, 7, 8, 0, lunasoleDirt);
		addBlock(world, basePos, 7, 8, 14, lunasoleDirt);
		addBlock(world, basePos, 8, 8, 0, lunasoleDirt);
		addBlock(world, basePos, 8, 8, 14, lunasoleDirt);
		addBlock(world, basePos, 9, 8, 0, lunasoleGrass);
		addBlock(world, basePos, 9, 8, 14, lunasoleGrass);
		addBlock(world, basePos, 10, 8, 1, lunasoleDirt);
		addBlock(world, basePos, 10, 8, 13, lunasoleDirt);
		addBlock(world, basePos, 11, 8, 1, lunasoleDirt);
		addBlock(world, basePos, 11, 8, 13, lunasoleDirt);
		addBlock(world, basePos, 12, 8, 2, lunasoleDirt);
		addBlock(world, basePos, 12, 8, 12, lunasoleDirt);
		addBlock(world, basePos, 13, 8, 3, lunasoleDirt);
		addBlock(world, basePos, 13, 8, 4, lunasoleDirt);
		addBlock(world, basePos, 13, 8, 10, lunasoleDirt);
		addBlock(world, basePos, 13, 8, 11, lunasoleDirt);
		addBlock(world, basePos, 14, 8, 5, lunasoleGrass);
		addBlock(world, basePos, 14, 8, 6, lunasoleDirt);
		addBlock(world, basePos, 14, 8, 7, lunasoleDirt);
		addBlock(world, basePos, 14, 8, 8, lunasoleDirt);
		addBlock(world, basePos, 14, 8, 9, lunasoleGrass);
		addBlock(world, basePos, 0, 9, 6, lunasoleGrass);
		addBlock(world, basePos, 0, 9, 7, lunasoleGrass);
		addBlock(world, basePos, 0, 9, 8, lunasoleGrass);
		addBlock(world, basePos, 1, 9, 3, lunasoleGrass);
		addBlock(world, basePos, 1, 9, 4, lunasoleDirt);
		addBlock(world, basePos, 1, 9, 5, lunasoleDirt);
		addBlock(world, basePos, 1, 9, 9, lunasoleDirt);
		addBlock(world, basePos, 1, 9, 10, lunasoleDirt);
		addBlock(world, basePos, 1, 9, 11, lunasoleGrass);
		addBlock(world, basePos, 2, 9, 2, lunasoleGrass);
		addBlock(world, basePos, 2, 9, 12, lunasoleGrass);
		addBlock(world, basePos, 3, 9, 1, lunasoleGrass);
		addBlock(world, basePos, 3, 9, 13, lunasoleGrass);
		addBlock(world, basePos, 4, 9, 1, lunasoleDirt);
		addBlock(world, basePos, 4, 9, 13, lunasoleDirt);
		addBlock(world, basePos, 5, 9, 1, lunasoleDirt);
		addBlock(world, basePos, 5, 9, 13, lunasoleDirt);
		addBlock(world, basePos, 6, 9, 0, lunasoleGrass);
		addBlock(world, basePos, 6, 9, 14, lunasoleGrass);
		addBlock(world, basePos, 7, 9, 0, lunasoleGrass);
		addBlock(world, basePos, 7, 9, 14, lunasoleGrass);
		addBlock(world, basePos, 8, 9, 0, lunasoleGrass);
		addBlock(world, basePos, 8, 9, 14, lunasoleGrass);
		addBlock(world, basePos, 9, 9, 1, lunasoleDirt);
		addBlock(world, basePos, 9, 9, 13, lunasoleDirt);
		addBlock(world, basePos, 10, 9, 1, lunasoleDirt);
		addBlock(world, basePos, 10, 9, 13, lunasoleDirt);
		addBlock(world, basePos, 11, 9, 1, lunasoleGrass);
		addBlock(world, basePos, 11, 9, 13, lunasoleGrass);
		addBlock(world, basePos, 12, 9, 2, lunasoleGrass);
		addBlock(world, basePos, 12, 9, 12, lunasoleGrass);
		addBlock(world, basePos, 13, 9, 3, lunasoleGrass);
		addBlock(world, basePos, 13, 9, 4, lunasoleDirt);
		addBlock(world, basePos, 13, 9, 5, lunasoleDirt);
		addBlock(world, basePos, 13, 9, 9, lunasoleDirt);
		addBlock(world, basePos, 13, 9, 10, lunasoleDirt);
		addBlock(world, basePos, 13, 9, 11, lunasoleGrass);
		addBlock(world, basePos, 14, 9, 6, lunasoleGrass);
		addBlock(world, basePos, 14, 9, 7, lunasoleGrass);
		addBlock(world, basePos, 14, 9, 8, lunasoleGrass);
		addBlock(world, basePos, 1, 10, 4, lunasoleGrass);
		addBlock(world, basePos, 1, 10, 5, lunasoleDirt);
		addBlock(world, basePos, 1, 10, 6, lunasoleDirt);
		addBlock(world, basePos, 1, 10, 7, lunasoleDirt);
		addBlock(world, basePos, 1, 10, 8, lunasoleDirt);
		addBlock(world, basePos, 1, 10, 9, lunasoleDirt);
		addBlock(world, basePos, 1, 10, 10, lunasoleGrass);
		addBlock(world, basePos, 2, 10, 3, lunasoleGrass);
		addBlock(world, basePos, 2, 10, 11, lunasoleGrass);
		addBlock(world, basePos, 3, 10, 2, lunasoleGrass);
		addBlock(world, basePos, 3, 10, 12, lunasoleGrass);
		addBlock(world, basePos, 4, 10, 1, lunasoleGrass);
		addBlock(world, basePos, 4, 10, 13, lunasoleGrass);
		addBlock(world, basePos, 5, 10, 1, lunasoleDirt);
		addBlock(world, basePos, 5, 10, 13, lunasoleDirt);
		addBlock(world, basePos, 6, 10, 1, lunasoleDirt);
		addBlock(world, basePos, 6, 10, 13, lunasoleDirt);
		addBlock(world, basePos, 7, 10, 1, lunasoleDirt);
		addBlock(world, basePos, 7, 10, 13, lunasoleDirt);
		addBlock(world, basePos, 8, 10, 1, lunasoleDirt);
		addBlock(world, basePos, 8, 10, 13, lunasoleDirt);
		addBlock(world, basePos, 9, 10, 1, lunasoleDirt);
		addBlock(world, basePos, 9, 10, 13, lunasoleDirt);
		addBlock(world, basePos, 10, 10, 1, lunasoleGrass);
		addBlock(world, basePos, 10, 10, 13, lunasoleGrass);
		addBlock(world, basePos, 11, 10, 2, lunasoleGrass);
		addBlock(world, basePos, 11, 10, 12, lunasoleGrass);
		addBlock(world, basePos, 12, 10, 3, lunasoleGrass);
		addBlock(world, basePos, 12, 10, 11, lunasoleGrass);
		addBlock(world, basePos, 13, 10, 4, lunasoleGrass);
		addBlock(world, basePos, 13, 10, 5, lunasoleDirt);
		addBlock(world, basePos, 13, 10, 6, lunasoleDirt);
		addBlock(world, basePos, 13, 10, 7, lunasoleDirt);
		addBlock(world, basePos, 13, 10, 8, lunasoleDirt);
		addBlock(world, basePos, 13, 10, 9, lunasoleDirt);
		addBlock(world, basePos, 13, 10, 10, lunasoleGrass);
		addBlock(world, basePos, 1, 11, 5, lunasoleGrass);
		addBlock(world, basePos, 1, 11, 6, lunasoleGrass);
		addBlock(world, basePos, 1, 11, 7, lunasoleGrass);
		addBlock(world, basePos, 1, 11, 8, lunasoleGrass);
		addBlock(world, basePos, 1, 11, 9, lunasoleGrass);
		addBlock(world, basePos, 2, 11, 4, lunasoleGrass);
		addBlock(world, basePos, 2, 11, 10, lunasoleGrass);
		addBlock(world, basePos, 3, 11, 3, lunasoleGrass);
		addBlock(world, basePos, 3, 11, 11, lunasoleGrass);
		addBlock(world, basePos, 4, 11, 2, lunasoleGrass);
		addBlock(world, basePos, 4, 11, 12, lunasoleGrass);
		addBlock(world, basePos, 5, 11, 1, lunasoleGrass);
		addBlock(world, basePos, 5, 11, 13, lunasoleGrass);
		addBlock(world, basePos, 6, 11, 1, lunasoleGrass);
		addBlock(world, basePos, 6, 11, 13, lunasoleGrass);
		addBlock(world, basePos, 7, 11, 1, lunasoleGrass);
		addBlock(world, basePos, 7, 11, 13, lunasoleGrass);
		addBlock(world, basePos, 8, 11, 1, lunasoleGrass);
		addBlock(world, basePos, 8, 11, 13, lunasoleGrass);
		addBlock(world, basePos, 9, 11, 1, lunasoleGrass);
		addBlock(world, basePos, 9, 11, 13, lunasoleGrass);
		addBlock(world, basePos, 10, 11, 2, lunasoleGrass);
		addBlock(world, basePos, 10, 11, 12, lunasoleGrass);
		addBlock(world, basePos, 11, 11, 3, lunasoleGrass);
		addBlock(world, basePos, 11, 11, 11, lunasoleGrass);
		addBlock(world, basePos, 12, 11, 4, lunasoleGrass);
		addBlock(world, basePos, 12, 11, 10, lunasoleGrass);
		addBlock(world, basePos, 13, 11, 5, lunasoleGrass);
		addBlock(world, basePos, 13, 11, 6, lunasoleGrass);
		addBlock(world, basePos, 13, 11, 7, lunasoleGrass);
		addBlock(world, basePos, 13, 11, 8, lunasoleGrass);
		addBlock(world, basePos, 13, 11, 9, lunasoleGrass);
		addBlock(world, basePos, 2, 12, 5, lunasoleGrass);
		addBlock(world, basePos, 2, 12, 6, lunasoleGrass);
		addBlock(world, basePos, 2, 12, 7, lunasoleGrass);
		addBlock(world, basePos, 2, 12, 8, lunasoleGrass);
		addBlock(world, basePos, 2, 12, 9, lunasoleGrass);
		addBlock(world, basePos, 3, 12, 4, lunasoleGrass);
		addBlock(world, basePos, 3, 12, 10, lunasoleGrass);
		addBlock(world, basePos, 4, 12, 3, lunasoleGrass);
		addBlock(world, basePos, 4, 12, 11, lunasoleGrass);
		addBlock(world, basePos, 5, 12, 2, lunasoleGrass);
		addBlock(world, basePos, 5, 12, 12, lunasoleGrass);
		addBlock(world, basePos, 6, 12, 2, lunasoleGrass);
		addBlock(world, basePos, 6, 12, 12, lunasoleGrass);
		addBlock(world, basePos, 7, 12, 2, lunasoleGrass);
		addBlock(world, basePos, 7, 12, 12, lunasoleGrass);
		addBlock(world, basePos, 8, 12, 2, lunasoleGrass);
		addBlock(world, basePos, 8, 12, 12, lunasoleGrass);
		addBlock(world, basePos, 9, 12, 2, lunasoleGrass);
		addBlock(world, basePos, 9, 12, 12, lunasoleGrass);
		addBlock(world, basePos, 10, 12, 3, lunasoleGrass);
		addBlock(world, basePos, 10, 12, 11, lunasoleGrass);
		addBlock(world, basePos, 11, 12, 4, lunasoleGrass);
		addBlock(world, basePos, 11, 12, 10, lunasoleGrass);
		addBlock(world, basePos, 12, 12, 5, lunasoleGrass);
		addBlock(world, basePos, 12, 12, 6, lunasoleGrass);
		addBlock(world, basePos, 12, 12, 7, lunasoleGrass);
		addBlock(world, basePos, 12, 12, 8, lunasoleGrass);
		addBlock(world, basePos, 12, 12, 9, lunasoleGrass);
		addBlock(world, basePos, 3, 13, 5, lunasoleGrass);
		addBlock(world, basePos, 3, 13, 6, lunasoleGrass);
		addBlock(world, basePos, 3, 13, 7, lunasoleGrass);
		addBlock(world, basePos, 3, 13, 8, lunasoleGrass);
		addBlock(world, basePos, 3, 13, 9, lunasoleGrass);
		addBlock(world, basePos, 4, 13, 4, lunasoleGrass);
		addBlock(world, basePos, 4, 13, 5, lunasoleGrass);
		addBlock(world, basePos, 4, 13, 6, lunasoleGrass);
		addBlock(world, basePos, 4, 13, 7, lunasoleGrass);
		addBlock(world, basePos, 4, 13, 8, lunasoleGrass);
		addBlock(world, basePos, 4, 13, 9, lunasoleGrass);
		addBlock(world, basePos, 4, 13, 10, lunasoleGrass);
		addBlock(world, basePos, 5, 13, 3, lunasoleGrass);
		addBlock(world, basePos, 5, 13, 4, lunasoleGrass);
		addBlock(world, basePos, 5, 13, 5, lunasoleGrass);
		addBlock(world, basePos, 5, 13, 9, lunasoleGrass);
		addBlock(world, basePos, 5, 13, 10, lunasoleGrass);
		addBlock(world, basePos, 5, 13, 11, lunasoleGrass);
		addBlock(world, basePos, 6, 13, 3, lunasoleGrass);
		addBlock(world, basePos, 6, 13, 4, lunasoleGrass);
		addBlock(world, basePos, 6, 13, 10, lunasoleGrass);
		addBlock(world, basePos, 6, 13, 11, lunasoleGrass);
		addBlock(world, basePos, 7, 13, 3, lunasoleGrass);
		addBlock(world, basePos, 7, 13, 4, lunasoleGrass);
		addBlock(world, basePos, 7, 13, 10, lunasoleGrass);
		addBlock(world, basePos, 7, 13, 11, lunasoleGrass);
		addBlock(world, basePos, 8, 13, 3, lunasoleGrass);
		addBlock(world, basePos, 8, 13, 4, lunasoleGrass);
		addBlock(world, basePos, 8, 13, 10, lunasoleGrass);
		addBlock(world, basePos, 8, 13, 11, lunasoleGrass);
		addBlock(world, basePos, 9, 13, 3, lunasoleGrass);
		addBlock(world, basePos, 9, 13, 4, lunasoleGrass);
		addBlock(world, basePos, 9, 13, 5, lunasoleGrass);
		addBlock(world, basePos, 9, 13, 9, lunasoleGrass);
		addBlock(world, basePos, 9, 13, 10, lunasoleGrass);
		addBlock(world, basePos, 9, 13, 11, lunasoleGrass);
		addBlock(world, basePos, 10, 13, 4, lunasoleGrass);
		addBlock(world, basePos, 10, 13, 5, lunasoleGrass);
		addBlock(world, basePos, 10, 13, 6, lunasoleGrass);
		addBlock(world, basePos, 10, 13, 7, lunasoleGrass);
		addBlock(world, basePos, 10, 13, 8, lunasoleGrass);
		addBlock(world, basePos, 10, 13, 9, lunasoleGrass);
		addBlock(world, basePos, 10, 13, 10, lunasoleGrass);
		addBlock(world, basePos, 11, 13, 5, lunasoleGrass);
		addBlock(world, basePos, 11, 13, 6, lunasoleGrass);
		addBlock(world, basePos, 11, 13, 7, lunasoleGrass);
		addBlock(world, basePos, 11, 13, 8, lunasoleGrass);
		addBlock(world, basePos, 11, 13, 9, lunasoleGrass);
		addBlock(world, basePos, 5, 14, 6, lunasoleGrass);
		addBlock(world, basePos, 5, 14, 7, lunasoleGrass);
		addBlock(world, basePos, 5, 14, 8, lunasoleGrass);
		addBlock(world, basePos, 6, 14, 5, lunasoleGrass);
		addBlock(world, basePos, 6, 14, 6, lunasoleGrass);
		addBlock(world, basePos, 6, 14, 7, lunasoleGrass);
		addBlock(world, basePos, 6, 14, 8, lunasoleGrass);
		addBlock(world, basePos, 6, 14, 9, lunasoleGrass);
		addBlock(world, basePos, 7, 14, 5, lunasoleGrass);
		addBlock(world, basePos, 7, 14, 6, lunasoleGrass);
		addBlock(world, basePos, 7, 14, 7, lunasoleGrass);
		addBlock(world, basePos, 7, 14, 8, lunasoleGrass);
		addBlock(world, basePos, 7, 14, 9, lunasoleGrass);
		addBlock(world, basePos, 8, 14, 5, lunasoleGrass);
		addBlock(world, basePos, 8, 14, 6, lunasoleGrass);
		addBlock(world, basePos, 8, 14, 7, lunasoleGrass);
		addBlock(world, basePos, 8, 14, 8, lunasoleGrass);
		addBlock(world, basePos, 8, 14, 9, lunasoleGrass);
		addBlock(world, basePos, 9, 14, 6, lunasoleGrass);
		addBlock(world, basePos, 9, 14, 7, lunasoleGrass);
		addBlock(world, basePos, 9, 14, 8, lunasoleGrass);
	}
}
