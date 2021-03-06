package net.tslat.aoa3.worldgen.structures.shyrelands;

import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.state.properties.Half;
import net.minecraft.state.properties.SlabType;
import net.minecraft.state.properties.StairsShape;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.tslat.aoa3.common.registration.AoABlocks;
import net.tslat.aoa3.worldgen.structures.AoAStructure;

import java.util.Random;

public class WhitewashingStation extends AoAStructure { //StructureSize: 14x8x14
	private static final BlockState whiteBricks = AoABlocks.WHITE_SHYRE_BRICKS.get().getDefaultState();
	private static final BlockState whiteBricksSlabBottom = AoABlocks.WHITE_SHYRE_BRICKS_SLAB.get().getDefaultState().with(SlabBlock.TYPE, SlabType.BOTTOM);
	private static final BlockState whiteShyreStairsEast = AoABlocks.YELLOW_SHYRE_BRICKS_STAIRS.get().getDefaultState().with(StairsBlock.FACING, Direction.EAST).with(StairsBlock.HALF, Half.BOTTOM).with(StairsBlock.SHAPE, StairsShape.OUTER_LEFT);
	private static final BlockState whiteShyreStairsNorth = AoABlocks.YELLOW_SHYRE_BRICKS_STAIRS.get().getDefaultState().with(StairsBlock.FACING, Direction.WEST).with(StairsBlock.HALF, Half.BOTTOM).with(StairsBlock.SHAPE, StairsShape.OUTER_LEFT);
	private static final BlockState whiteShyreStairsSouth = AoABlocks.YELLOW_SHYRE_BRICKS_STAIRS.get().getDefaultState().with(StairsBlock.FACING, Direction.SOUTH).with(StairsBlock.HALF, Half.BOTTOM).with(StairsBlock.SHAPE, StairsShape.OUTER_LEFT);
	private static final BlockState whiteShyreStairsWest = AoABlocks.YELLOW_SHYRE_BRICKS_STAIRS.get().getDefaultState().with(StairsBlock.FACING, Direction.WEST).with(StairsBlock.HALF, Half.BOTTOM).with(StairsBlock.SHAPE, StairsShape.OUTER_RIGHT);
	private static final BlockState whitewashingTable = AoABlocks.WHITEWASHING_TABLE.get().getDefaultState();
	private static final BlockState yellowBricks = AoABlocks.YELLOW_SHYRE_BRICKS.get().getDefaultState();
	private static final BlockState yellowBricksSlabBottom = AoABlocks.YELLOW_SHYRE_BRICKS_SLAB.get().getDefaultState().with(SlabBlock.TYPE, SlabType.BOTTOM);
	private static final BlockState yellowShyreStairsEast = AoABlocks.YELLOW_SHYRE_BRICKS_STAIRS.get().getDefaultState().with(StairsBlock.FACING, Direction.EAST).with(StairsBlock.HALF, Half.BOTTOM).with(StairsBlock.SHAPE, StairsShape.STRAIGHT);
	private static final BlockState yellowShyreStairsNorth = AoABlocks.YELLOW_SHYRE_BRICKS_STAIRS.get().getDefaultState().with(StairsBlock.FACING, Direction.NORTH).with(StairsBlock.HALF, Half.BOTTOM).with(StairsBlock.SHAPE, StairsShape.STRAIGHT);
	private static final BlockState yellowShyreStairsSouth = AoABlocks.YELLOW_SHYRE_BRICKS_STAIRS.get().getDefaultState().with(StairsBlock.FACING, Direction.SOUTH).with(StairsBlock.HALF, Half.BOTTOM).with(StairsBlock.SHAPE, StairsShape.STRAIGHT);
	private static final BlockState yellowShyreStairsWest = AoABlocks.YELLOW_SHYRE_BRICKS_STAIRS.get().getDefaultState().with(StairsBlock.FACING, Direction.WEST).with(StairsBlock.HALF, Half.BOTTOM).with(StairsBlock.SHAPE, StairsShape.STRAIGHT);

	public WhitewashingStation() {
		super("WhitewashingStation");
	}

	@Override
	protected boolean replacesBlocks() {
		return true;
	}

	@Override
	protected void build(IWorld world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 1, 0, 1, yellowBricksSlabBottom); 
		addBlock(world, basePos, 1, 0, 2, whiteBricks);
		addBlock(world, basePos, 1, 0, 11, whiteBricks);
		addBlock(world, basePos, 1, 0, 12, yellowBricksSlabBottom); 
		addBlock(world, basePos, 2, 0, 1, whiteBricks);
		addBlock(world, basePos, 2, 0, 2, yellowBricksSlabBottom); 
		addBlock(world, basePos, 2, 0, 11, yellowBricksSlabBottom); 
		addBlock(world, basePos, 2, 0, 12, whiteBricks);
		addBlock(world, basePos, 4, 0, 4, whiteShyreStairsSouth);
		addBlock(world, basePos, 4, 0, 5, yellowShyreStairsEast);
		addBlock(world, basePos, 4, 0, 6, yellowShyreStairsEast);
		addBlock(world, basePos, 4, 0, 7, yellowShyreStairsEast);
		addBlock(world, basePos, 4, 0, 8, yellowShyreStairsEast);
		addBlock(world, basePos, 4, 0, 9, whiteShyreStairsEast);
		addBlock(world, basePos, 5, 0, 4, yellowShyreStairsSouth);
		addBlock(world, basePos, 5, 0, 5, yellowBricks);
		addBlock(world, basePos, 5, 0, 6, yellowBricks);
		addBlock(world, basePos, 5, 0, 7, yellowBricks);
		addBlock(world, basePos, 5, 0, 8, yellowBricks);
		addBlock(world, basePos, 5, 0, 9, yellowShyreStairsNorth);
		addBlock(world, basePos, 6, 0, 4, yellowShyreStairsSouth);
		addBlock(world, basePos, 6, 0, 5, yellowBricks);
		addBlock(world, basePos, 6, 0, 6, yellowBricks);
		addBlock(world, basePos, 6, 0, 7, yellowBricks);
		addBlock(world, basePos, 6, 0, 8, yellowBricks);
		addBlock(world, basePos, 6, 0, 9, yellowShyreStairsNorth);
		addBlock(world, basePos, 7, 0, 4, yellowShyreStairsSouth);
		addBlock(world, basePos, 7, 0, 5, yellowBricks);
		addBlock(world, basePos, 7, 0, 6, yellowBricks);
		addBlock(world, basePos, 7, 0, 7, yellowBricks);
		addBlock(world, basePos, 7, 0, 8, yellowBricks);
		addBlock(world, basePos, 7, 0, 9, yellowShyreStairsNorth);
		addBlock(world, basePos, 8, 0, 4, yellowShyreStairsSouth);
		addBlock(world, basePos, 8, 0, 5, yellowBricks);
		addBlock(world, basePos, 8, 0, 6, yellowBricks);
		addBlock(world, basePos, 8, 0, 7, yellowBricks);
		addBlock(world, basePos, 8, 0, 8, yellowBricks);
		addBlock(world, basePos, 8, 0, 9, yellowShyreStairsNorth);
		addBlock(world, basePos, 9, 0, 4, whiteShyreStairsNorth);
		addBlock(world, basePos, 9, 0, 5, yellowShyreStairsWest);
		addBlock(world, basePos, 9, 0, 6, yellowShyreStairsWest);
		addBlock(world, basePos, 9, 0, 7, yellowShyreStairsWest);
		addBlock(world, basePos, 9, 0, 8, yellowShyreStairsWest);
		addBlock(world, basePos, 9, 0, 9, whiteShyreStairsWest);
		addBlock(world, basePos, 11, 0, 1, whiteBricks);
		addBlock(world, basePos, 11, 0, 2, yellowBricksSlabBottom); 
		addBlock(world, basePos, 11, 0, 11, yellowBricksSlabBottom); 
		addBlock(world, basePos, 11, 0, 12, whiteBricks);
		addBlock(world, basePos, 12, 0, 1, yellowBricksSlabBottom); 
		addBlock(world, basePos, 12, 0, 2, whiteBricks);
		addBlock(world, basePos, 12, 0, 11, whiteBricks);
		addBlock(world, basePos, 12, 0, 12, yellowBricksSlabBottom); 
		addBlock(world, basePos, 1, 1, 1, whiteBricks);
		addBlock(world, basePos, 1, 1, 2, yellowBricksSlabBottom); 
		addBlock(world, basePos, 1, 1, 11, yellowBricksSlabBottom); 
		addBlock(world, basePos, 1, 1, 12, whiteBricks);
		addBlock(world, basePos, 2, 1, 1, yellowBricksSlabBottom); 
		addBlock(world, basePos, 2, 1, 2, whiteBricks);
		addBlock(world, basePos, 2, 1, 11, whiteBricks);
		addBlock(world, basePos, 2, 1, 12, yellowBricksSlabBottom); 
		addBlock(world, basePos, 5, 1, 5, whiteBricksSlabBottom); 
		addBlock(world, basePos, 5, 1, 6, whiteBricksSlabBottom); 
		addBlock(world, basePos, 5, 1, 7, whiteBricksSlabBottom); 
		addBlock(world, basePos, 5, 1, 8, whiteBricksSlabBottom); 
		addBlock(world, basePos, 6, 1, 5, whiteBricksSlabBottom); 
		addBlock(world, basePos, 6, 1, 6, whitewashingTable);
		addBlock(world, basePos, 6, 1, 7, whitewashingTable);
		addBlock(world, basePos, 6, 1, 8, whiteBricksSlabBottom); 
		addBlock(world, basePos, 7, 1, 5, whiteBricksSlabBottom); 
		addBlock(world, basePos, 7, 1, 6, whitewashingTable);
		addBlock(world, basePos, 7, 1, 7, whitewashingTable);
		addBlock(world, basePos, 7, 1, 8, whiteBricksSlabBottom); 
		addBlock(world, basePos, 8, 1, 5, whiteBricksSlabBottom); 
		addBlock(world, basePos, 8, 1, 6, whiteBricksSlabBottom); 
		addBlock(world, basePos, 8, 1, 7, whiteBricksSlabBottom); 
		addBlock(world, basePos, 8, 1, 8, whiteBricksSlabBottom); 
		addBlock(world, basePos, 11, 1, 1, yellowBricksSlabBottom); 
		addBlock(world, basePos, 11, 1, 2, whiteBricks);
		addBlock(world, basePos, 11, 1, 11, whiteBricks);
		addBlock(world, basePos, 11, 1, 12, yellowBricksSlabBottom); 
		addBlock(world, basePos, 12, 1, 1, whiteBricks);
		addBlock(world, basePos, 12, 1, 2, yellowBricksSlabBottom); 
		addBlock(world, basePos, 12, 1, 11, yellowBricksSlabBottom); 
		addBlock(world, basePos, 12, 1, 12, whiteBricks);
		addBlock(world, basePos, 1, 2, 1, yellowBricksSlabBottom); 
		addBlock(world, basePos, 1, 2, 2, whiteBricks);
		addBlock(world, basePos, 1, 2, 11, whiteBricks);
		addBlock(world, basePos, 1, 2, 12, yellowBricksSlabBottom); 
		addBlock(world, basePos, 2, 2, 1, whiteBricks);
		addBlock(world, basePos, 2, 2, 2, yellowBricksSlabBottom); 
		addBlock(world, basePos, 2, 2, 11, yellowBricksSlabBottom); 
		addBlock(world, basePos, 2, 2, 12, whiteBricks);
		addBlock(world, basePos, 11, 2, 1, whiteBricks);
		addBlock(world, basePos, 11, 2, 2, yellowBricksSlabBottom); 
		addBlock(world, basePos, 11, 2, 11, yellowBricksSlabBottom); 
		addBlock(world, basePos, 11, 2, 12, whiteBricks);
		addBlock(world, basePos, 12, 2, 1, yellowBricksSlabBottom); 
		addBlock(world, basePos, 12, 2, 2, whiteBricks);
		addBlock(world, basePos, 12, 2, 11, whiteBricks);
		addBlock(world, basePos, 12, 2, 12, yellowBricksSlabBottom); 
		addBlock(world, basePos, 1, 3, 1, whiteBricks);
		addBlock(world, basePos, 1, 3, 2, yellowBricksSlabBottom); 
		addBlock(world, basePos, 1, 3, 11, yellowBricksSlabBottom); 
		addBlock(world, basePos, 1, 3, 12, whiteBricks);
		addBlock(world, basePos, 2, 3, 1, yellowBricksSlabBottom); 
		addBlock(world, basePos, 2, 3, 2, whiteBricks);
		addBlock(world, basePos, 2, 3, 11, whiteBricks);
		addBlock(world, basePos, 2, 3, 12, yellowBricksSlabBottom); 
		addBlock(world, basePos, 11, 3, 1, yellowBricksSlabBottom); 
		addBlock(world, basePos, 11, 3, 2, whiteBricks);
		addBlock(world, basePos, 11, 3, 11, whiteBricks);
		addBlock(world, basePos, 11, 3, 12, yellowBricksSlabBottom); 
		addBlock(world, basePos, 12, 3, 1, whiteBricks);
		addBlock(world, basePos, 12, 3, 2, yellowBricksSlabBottom); 
		addBlock(world, basePos, 12, 3, 11, yellowBricksSlabBottom); 
		addBlock(world, basePos, 12, 3, 12, whiteBricks);
		addBlock(world, basePos, 1, 4, 1, yellowBricksSlabBottom); 
		addBlock(world, basePos, 1, 4, 2, whiteBricks);
		addBlock(world, basePos, 1, 4, 11, whiteBricks);
		addBlock(world, basePos, 1, 4, 12, yellowBricksSlabBottom); 
		addBlock(world, basePos, 2, 4, 1, whiteBricks);
		addBlock(world, basePos, 2, 4, 2, yellowBricksSlabBottom); 
		addBlock(world, basePos, 2, 4, 11, yellowBricksSlabBottom); 
		addBlock(world, basePos, 2, 4, 12, whiteBricks);
		addBlock(world, basePos, 11, 4, 1, whiteBricks);
		addBlock(world, basePos, 11, 4, 2, yellowBricksSlabBottom); 
		addBlock(world, basePos, 11, 4, 11, yellowBricksSlabBottom); 
		addBlock(world, basePos, 11, 4, 12, whiteBricks);
		addBlock(world, basePos, 12, 4, 1, yellowBricksSlabBottom); 
		addBlock(world, basePos, 12, 4, 2, whiteBricks);
		addBlock(world, basePos, 12, 4, 11, whiteBricks);
		addBlock(world, basePos, 12, 4, 12, yellowBricksSlabBottom); 
		addBlock(world, basePos, 1, 5, 1, whiteBricks);
		addBlock(world, basePos, 1, 5, 2, yellowBricksSlabBottom); 
		addBlock(world, basePos, 1, 5, 11, yellowBricksSlabBottom); 
		addBlock(world, basePos, 1, 5, 12, whiteBricks);
		addBlock(world, basePos, 2, 5, 1, yellowBricksSlabBottom); 
		addBlock(world, basePos, 2, 5, 2, whiteBricks);
		addBlock(world, basePos, 2, 5, 11, whiteBricks);
		addBlock(world, basePos, 2, 5, 12, yellowBricksSlabBottom); 
		addBlock(world, basePos, 11, 5, 1, yellowBricksSlabBottom); 
		addBlock(world, basePos, 11, 5, 2, whiteBricks);
		addBlock(world, basePos, 11, 5, 11, whiteBricks);
		addBlock(world, basePos, 11, 5, 12, yellowBricksSlabBottom); 
		addBlock(world, basePos, 12, 5, 1, whiteBricks);
		addBlock(world, basePos, 12, 5, 2, yellowBricksSlabBottom); 
		addBlock(world, basePos, 12, 5, 11, yellowBricksSlabBottom); 
		addBlock(world, basePos, 12, 5, 12, whiteBricks);
		addBlock(world, basePos, 1, 6, 1, yellowBricksSlabBottom); 
		addBlock(world, basePos, 1, 6, 2, whiteBricks);
		addBlock(world, basePos, 1, 6, 11, whiteBricks);
		addBlock(world, basePos, 1, 6, 12, yellowBricksSlabBottom); 
		addBlock(world, basePos, 2, 6, 1, whiteBricks);
		addBlock(world, basePos, 2, 6, 2, yellowBricksSlabBottom); 
		addBlock(world, basePos, 2, 6, 11, yellowBricksSlabBottom); 
		addBlock(world, basePos, 2, 6, 12, whiteBricks);
		addBlock(world, basePos, 11, 6, 1, whiteBricks);
		addBlock(world, basePos, 11, 6, 2, yellowBricksSlabBottom); 
		addBlock(world, basePos, 11, 6, 11, yellowBricksSlabBottom); 
		addBlock(world, basePos, 11, 6, 12, whiteBricks);
		addBlock(world, basePos, 12, 6, 1, yellowBricksSlabBottom); 
		addBlock(world, basePos, 12, 6, 2, whiteBricks);
		addBlock(world, basePos, 12, 6, 11, whiteBricks);
		addBlock(world, basePos, 12, 6, 12, yellowBricksSlabBottom); 
		addBlock(world, basePos, 1, 7, 2, yellowBricksSlabBottom); 
		addBlock(world, basePos, 1, 7, 11, yellowBricksSlabBottom); 
		addBlock(world, basePos, 2, 7, 1, yellowBricksSlabBottom); 
		addBlock(world, basePos, 2, 7, 12, yellowBricksSlabBottom); 
		addBlock(world, basePos, 11, 7, 1, yellowBricksSlabBottom); 
		addBlock(world, basePos, 11, 7, 12, yellowBricksSlabBottom); 
		addBlock(world, basePos, 12, 7, 2, yellowBricksSlabBottom); 
		addBlock(world, basePos, 12, 7, 11, yellowBricksSlabBottom); 
	}
}
