package net.tslat.aoa3.worldgen.structures.shyrelands;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.tslat.aoa3.common.registration.AoABlocks;
import net.tslat.aoa3.worldgen.structures.AoAStructure;

import java.util.Random;

public class BrightShyreTree1 extends AoAStructure { //StructureSize: 3x10x3
	private static final BlockState brightShyreLeaves = AoABlocks.BRIGHT_SHYRE_LEAVES.get().getDefaultState();
	private static final BlockState shyreLog = AoABlocks.SHYRE_LOG.get().getDefaultState();

	public BrightShyreTree1() {
		super("BrightShyreTree1");
	}

	@Override
	protected void build(IWorld world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 1, 0, 1, shyreLog);
		addBlock(world, basePos, 1, 1, 1, shyreLog);
		addBlock(world, basePos, 1, 2, 1, shyreLog);
		addBlock(world, basePos, 1, 3, 1, shyreLog);
		addBlock(world, basePos, 1, 4, 1, shyreLog);
		addBlock(world, basePos, 1, 5, 1, shyreLog);
		addBlock(world, basePos, 0, 6, 1, brightShyreLeaves);
		addBlock(world, basePos, 1, 6, 0, brightShyreLeaves);
		addBlock(world, basePos, 1, 6, 1, brightShyreLeaves);
		addBlock(world, basePos, 1, 6, 2, brightShyreLeaves);
		addBlock(world, basePos, 2, 6, 1, brightShyreLeaves);
		addBlock(world, basePos, 0, 7, 1, brightShyreLeaves);
		addBlock(world, basePos, 1, 7, 0, brightShyreLeaves);
		addBlock(world, basePos, 1, 7, 1, brightShyreLeaves);
		addBlock(world, basePos, 1, 7, 2, brightShyreLeaves);
		addBlock(world, basePos, 2, 7, 1, brightShyreLeaves);
		addBlock(world, basePos, 0, 8, 1, brightShyreLeaves);
		addBlock(world, basePos, 1, 8, 0, brightShyreLeaves);
		addBlock(world, basePos, 1, 8, 1, brightShyreLeaves);
		addBlock(world, basePos, 1, 8, 2, brightShyreLeaves);
		addBlock(world, basePos, 2, 8, 1, brightShyreLeaves);
		addBlock(world, basePos, 1, 9, 1, brightShyreLeaves);
	}
}
