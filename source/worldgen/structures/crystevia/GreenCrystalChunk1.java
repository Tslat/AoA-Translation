package net.tslat.aoa3.worldgen.structures.crystevia;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.tslat.aoa3.common.registration.AoABlocks;
import net.tslat.aoa3.worldgen.structures.AoAStructure;

import java.util.Random;

public class GreenCrystalChunk1 extends AoAStructure { //StructureSize: 3x4x3
	private static final BlockState greenCrystal = AoABlocks.GREEN_CRYSTAL_BLOCK.get().getDefaultState();

	public GreenCrystalChunk1() {
		super("GreenCrystalChunk1");
	}

	@Override
	protected void build(IWorld world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 0, 0, 0, greenCrystal);
		addBlock(world, basePos, 0, 0, 1, greenCrystal);
		addBlock(world, basePos, 0, 0, 2, greenCrystal);
		addBlock(world, basePos, 0, 1, 0, greenCrystal);
		addBlock(world, basePos, 0, 1, 1, greenCrystal);
		addBlock(world, basePos, 0, 1, 2, greenCrystal);
		addBlock(world, basePos, 0, 2, 0, greenCrystal);
		addBlock(world, basePos, 0, 2, 1, greenCrystal);
		addBlock(world, basePos, 0, 2, 2, greenCrystal);
		addBlock(world, basePos, 1, 0, 0, greenCrystal);
		addBlock(world, basePos, 1, 0, 1, greenCrystal);
		addBlock(world, basePos, 1, 0, 2, greenCrystal);
		addBlock(world, basePos, 1, 1, 0, greenCrystal);
		addBlock(world, basePos, 1, 1, 1, greenCrystal);
		addBlock(world, basePos, 1, 1, 2, greenCrystal);
		addBlock(world, basePos, 1, 2, 0, greenCrystal);
		addBlock(world, basePos, 1, 2, 1, greenCrystal);
		addBlock(world, basePos, 1, 2, 2, greenCrystal);
		addBlock(world, basePos, 1, 3, 1, greenCrystal);
		addBlock(world, basePos, 2, 0, 0, greenCrystal);
		addBlock(world, basePos, 2, 0, 1, greenCrystal);
		addBlock(world, basePos, 2, 0, 2, greenCrystal);
		addBlock(world, basePos, 2, 1, 0, greenCrystal);
		addBlock(world, basePos, 2, 1, 1, greenCrystal);
		addBlock(world, basePos, 2, 1, 2, greenCrystal);
		addBlock(world, basePos, 2, 2, 0, greenCrystal);
		addBlock(world, basePos, 2, 2, 1, greenCrystal);
		addBlock(world, basePos, 2, 2, 2, greenCrystal);
	}
}
