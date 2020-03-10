package net.tslat.aoa3.structure.candyland;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class CottonCandyTower extends AoAStructure { //StructureSize: 9x20x9
	private static final IBlockState aquaCottonCandy = BlockRegister.cottonCandyAqua.getDefaultState();
	private static final IBlockState pinkCottonCandy = BlockRegister.cottonCandyPink.getDefaultState();
	private static final IBlockState plasticPole = BlockRegister.plastic.getDefaultState();

	public CottonCandyTower() {
		super("CottonCandyTower");
	}

	@Override
	protected boolean replacesBlocks() {
		return true;
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 4, 0, 4, plasticPole);
		addBlock(world, basePos, 4, 1, 4, plasticPole);
		addBlock(world, basePos, 4, 2, 4, plasticPole);
		addBlock(world, basePos, 3, 3, 3, pinkCottonCandy);
		addBlock(world, basePos, 3, 3, 4, pinkCottonCandy);
		addBlock(world, basePos, 3, 3, 5, pinkCottonCandy);
		addBlock(world, basePos, 4, 3, 3, pinkCottonCandy);
		addBlock(world, basePos, 4, 3, 4, pinkCottonCandy);
		addBlock(world, basePos, 4, 3, 5, pinkCottonCandy);
		addBlock(world, basePos, 5, 3, 3, pinkCottonCandy);
		addBlock(world, basePos, 5, 3, 4, pinkCottonCandy);
		addBlock(world, basePos, 5, 3, 5, pinkCottonCandy);
		addBlock(world, basePos, 2, 4, 2, pinkCottonCandy);
		addBlock(world, basePos, 2, 4, 3, pinkCottonCandy);
		addBlock(world, basePos, 2, 4, 4, pinkCottonCandy);
		addBlock(world, basePos, 2, 4, 5, pinkCottonCandy);
		addBlock(world, basePos, 2, 4, 6, pinkCottonCandy);
		addBlock(world, basePos, 3, 4, 2, pinkCottonCandy);
		addBlock(world, basePos, 3, 4, 3, pinkCottonCandy);
		addBlock(world, basePos, 3, 4, 4, pinkCottonCandy);
		addBlock(world, basePos, 3, 4, 5, pinkCottonCandy);
		addBlock(world, basePos, 3, 4, 6, pinkCottonCandy);
		addBlock(world, basePos, 4, 4, 2, pinkCottonCandy);
		addBlock(world, basePos, 4, 4, 3, pinkCottonCandy);
		addBlock(world, basePos, 4, 4, 4, pinkCottonCandy);
		addBlock(world, basePos, 4, 4, 5, pinkCottonCandy);
		addBlock(world, basePos, 4, 4, 6, pinkCottonCandy);
		addBlock(world, basePos, 5, 4, 2, pinkCottonCandy);
		addBlock(world, basePos, 5, 4, 3, pinkCottonCandy);
		addBlock(world, basePos, 5, 4, 4, pinkCottonCandy);
		addBlock(world, basePos, 5, 4, 5, pinkCottonCandy);
		addBlock(world, basePos, 5, 4, 6, pinkCottonCandy);
		addBlock(world, basePos, 6, 4, 2, pinkCottonCandy);
		addBlock(world, basePos, 6, 4, 3, pinkCottonCandy);
		addBlock(world, basePos, 6, 4, 4, pinkCottonCandy);
		addBlock(world, basePos, 6, 4, 5, pinkCottonCandy);
		addBlock(world, basePos, 6, 4, 6, pinkCottonCandy);
		addBlock(world, basePos, 2, 5, 2, pinkCottonCandy);
		addBlock(world, basePos, 2, 5, 3, pinkCottonCandy);
		addBlock(world, basePos, 2, 5, 4, pinkCottonCandy);
		addBlock(world, basePos, 2, 5, 5, pinkCottonCandy);
		addBlock(world, basePos, 2, 5, 6, pinkCottonCandy);
		addBlock(world, basePos, 3, 5, 2, pinkCottonCandy);
		addBlock(world, basePos, 3, 5, 3, pinkCottonCandy);
		addBlock(world, basePos, 3, 5, 4, pinkCottonCandy);
		addBlock(world, basePos, 3, 5, 5, pinkCottonCandy);
		addBlock(world, basePos, 3, 5, 6, pinkCottonCandy);
		addBlock(world, basePos, 4, 5, 2, pinkCottonCandy);
		addBlock(world, basePos, 4, 5, 3, pinkCottonCandy);
		addBlock(world, basePos, 4, 5, 4, pinkCottonCandy);
		addBlock(world, basePos, 4, 5, 5, pinkCottonCandy);
		addBlock(world, basePos, 4, 5, 6, pinkCottonCandy);
		addBlock(world, basePos, 5, 5, 2, pinkCottonCandy);
		addBlock(world, basePos, 5, 5, 3, pinkCottonCandy);
		addBlock(world, basePos, 5, 5, 4, pinkCottonCandy);
		addBlock(world, basePos, 5, 5, 5, pinkCottonCandy);
		addBlock(world, basePos, 5, 5, 6, pinkCottonCandy);
		addBlock(world, basePos, 6, 5, 2, pinkCottonCandy);
		addBlock(world, basePos, 6, 5, 3, pinkCottonCandy);
		addBlock(world, basePos, 6, 5, 4, pinkCottonCandy);
		addBlock(world, basePos, 6, 5, 5, pinkCottonCandy);
		addBlock(world, basePos, 6, 5, 6, pinkCottonCandy);
		addBlock(world, basePos, 2, 6, 2, pinkCottonCandy);
		addBlock(world, basePos, 2, 6, 3, pinkCottonCandy);
		addBlock(world, basePos, 2, 6, 4, pinkCottonCandy);
		addBlock(world, basePos, 2, 6, 5, pinkCottonCandy);
		addBlock(world, basePos, 2, 6, 6, pinkCottonCandy);
		addBlock(world, basePos, 3, 6, 2, pinkCottonCandy);
		addBlock(world, basePos, 3, 6, 3, pinkCottonCandy);
		addBlock(world, basePos, 3, 6, 4, pinkCottonCandy);
		addBlock(world, basePos, 3, 6, 5, pinkCottonCandy);
		addBlock(world, basePos, 3, 6, 6, pinkCottonCandy);
		addBlock(world, basePos, 4, 6, 2, pinkCottonCandy);
		addBlock(world, basePos, 4, 6, 3, pinkCottonCandy);
		addBlock(world, basePos, 4, 6, 4, pinkCottonCandy);
		addBlock(world, basePos, 4, 6, 5, pinkCottonCandy);
		addBlock(world, basePos, 4, 6, 6, pinkCottonCandy);
		addBlock(world, basePos, 5, 6, 2, pinkCottonCandy);
		addBlock(world, basePos, 5, 6, 3, pinkCottonCandy);
		addBlock(world, basePos, 5, 6, 4, pinkCottonCandy);
		addBlock(world, basePos, 5, 6, 5, pinkCottonCandy);
		addBlock(world, basePos, 5, 6, 6, pinkCottonCandy);
		addBlock(world, basePos, 6, 6, 2, pinkCottonCandy);
		addBlock(world, basePos, 6, 6, 3, pinkCottonCandy);
		addBlock(world, basePos, 6, 6, 4, pinkCottonCandy);
		addBlock(world, basePos, 6, 6, 5, pinkCottonCandy);
		addBlock(world, basePos, 6, 6, 6, pinkCottonCandy);
		addBlock(world, basePos, 2, 7, 2, pinkCottonCandy);
		addBlock(world, basePos, 2, 7, 3, pinkCottonCandy);
		addBlock(world, basePos, 2, 7, 4, pinkCottonCandy);
		addBlock(world, basePos, 2, 7, 5, pinkCottonCandy);
		addBlock(world, basePos, 2, 7, 6, pinkCottonCandy);
		addBlock(world, basePos, 3, 7, 2, pinkCottonCandy);
		addBlock(world, basePos, 3, 7, 3, pinkCottonCandy);
		addBlock(world, basePos, 3, 7, 4, pinkCottonCandy);
		addBlock(world, basePos, 3, 7, 5, pinkCottonCandy);
		addBlock(world, basePos, 3, 7, 6, pinkCottonCandy);
		addBlock(world, basePos, 4, 7, 2, pinkCottonCandy);
		addBlock(world, basePos, 4, 7, 3, pinkCottonCandy);
		addBlock(world, basePos, 4, 7, 4, pinkCottonCandy);
		addBlock(world, basePos, 4, 7, 5, pinkCottonCandy);
		addBlock(world, basePos, 4, 7, 6, pinkCottonCandy);
		addBlock(world, basePos, 5, 7, 2, pinkCottonCandy);
		addBlock(world, basePos, 5, 7, 3, pinkCottonCandy);
		addBlock(world, basePos, 5, 7, 4, pinkCottonCandy);
		addBlock(world, basePos, 5, 7, 5, pinkCottonCandy);
		addBlock(world, basePos, 5, 7, 6, pinkCottonCandy);
		addBlock(world, basePos, 6, 7, 2, pinkCottonCandy);
		addBlock(world, basePos, 6, 7, 3, pinkCottonCandy);
		addBlock(world, basePos, 6, 7, 4, pinkCottonCandy);
		addBlock(world, basePos, 6, 7, 5, pinkCottonCandy);
		addBlock(world, basePos, 6, 7, 6, pinkCottonCandy);
		addBlock(world, basePos, 3, 8, 3, pinkCottonCandy);
		addBlock(world, basePos, 3, 8, 4, pinkCottonCandy);
		addBlock(world, basePos, 3, 8, 5, pinkCottonCandy);
		addBlock(world, basePos, 4, 8, 3, pinkCottonCandy);
		addBlock(world, basePos, 4, 8, 4, pinkCottonCandy);
		addBlock(world, basePos, 4, 8, 5, pinkCottonCandy);
		addBlock(world, basePos, 5, 8, 3, pinkCottonCandy);
		addBlock(world, basePos, 5, 8, 4, pinkCottonCandy);
		addBlock(world, basePos, 5, 8, 5, pinkCottonCandy);
		addBlock(world, basePos, 4, 9, 4, plasticPole);
		addBlock(world, basePos, 4, 10, 4, plasticPole);
		addBlock(world, basePos, 4, 11, 4, plasticPole);
		addBlock(world, basePos, 3, 12, 3, pinkCottonCandy);
		addBlock(world, basePos, 3, 12, 4, pinkCottonCandy);
		addBlock(world, basePos, 3, 12, 5, pinkCottonCandy);
		addBlock(world, basePos, 4, 12, 3, pinkCottonCandy);
		addBlock(world, basePos, 4, 12, 4, pinkCottonCandy);
		addBlock(world, basePos, 4, 12, 5, pinkCottonCandy);
		addBlock(world, basePos, 5, 12, 3, pinkCottonCandy);
		addBlock(world, basePos, 5, 12, 4, pinkCottonCandy);
		addBlock(world, basePos, 5, 12, 5, pinkCottonCandy);
		addBlock(world, basePos, 2, 13, 2, pinkCottonCandy);
		addBlock(world, basePos, 2, 13, 3, pinkCottonCandy);
		addBlock(world, basePos, 2, 13, 4, pinkCottonCandy);
		addBlock(world, basePos, 2, 13, 5, pinkCottonCandy);
		addBlock(world, basePos, 2, 13, 6, pinkCottonCandy);
		addBlock(world, basePos, 3, 13, 2, pinkCottonCandy);
		addBlock(world, basePos, 3, 13, 3, pinkCottonCandy);
		addBlock(world, basePos, 3, 13, 4, pinkCottonCandy);
		addBlock(world, basePos, 3, 13, 5, pinkCottonCandy);
		addBlock(world, basePos, 3, 13, 6, pinkCottonCandy);
		addBlock(world, basePos, 4, 13, 2, pinkCottonCandy);
		addBlock(world, basePos, 4, 13, 3, pinkCottonCandy);
		addBlock(world, basePos, 4, 13, 4, pinkCottonCandy);
		addBlock(world, basePos, 4, 13, 5, pinkCottonCandy);
		addBlock(world, basePos, 4, 13, 6, pinkCottonCandy);
		addBlock(world, basePos, 5, 13, 2, pinkCottonCandy);
		addBlock(world, basePos, 5, 13, 3, pinkCottonCandy);
		addBlock(world, basePos, 5, 13, 4, pinkCottonCandy);
		addBlock(world, basePos, 5, 13, 5, pinkCottonCandy);
		addBlock(world, basePos, 5, 13, 6, pinkCottonCandy);
		addBlock(world, basePos, 6, 13, 2, pinkCottonCandy);
		addBlock(world, basePos, 6, 13, 3, pinkCottonCandy);
		addBlock(world, basePos, 6, 13, 4, pinkCottonCandy);
		addBlock(world, basePos, 6, 13, 5, pinkCottonCandy);
		addBlock(world, basePos, 6, 13, 6, pinkCottonCandy);
		addBlock(world, basePos, 2, 14, 2, pinkCottonCandy);
		addBlock(world, basePos, 2, 14, 3, pinkCottonCandy);
		addBlock(world, basePos, 2, 14, 4, pinkCottonCandy);
		addBlock(world, basePos, 2, 14, 5, pinkCottonCandy);
		addBlock(world, basePos, 2, 14, 6, pinkCottonCandy);
		addBlock(world, basePos, 3, 14, 2, pinkCottonCandy);
		addBlock(world, basePos, 3, 14, 3, pinkCottonCandy);
		addBlock(world, basePos, 3, 14, 4, pinkCottonCandy);
		addBlock(world, basePos, 3, 14, 5, pinkCottonCandy);
		addBlock(world, basePos, 3, 14, 6, pinkCottonCandy);
		addBlock(world, basePos, 4, 14, 2, pinkCottonCandy);
		addBlock(world, basePos, 4, 14, 3, pinkCottonCandy);
		addBlock(world, basePos, 4, 14, 4, pinkCottonCandy);
		addBlock(world, basePos, 4, 14, 5, pinkCottonCandy);
		addBlock(world, basePos, 4, 14, 6, pinkCottonCandy);
		addBlock(world, basePos, 5, 14, 2, pinkCottonCandy);
		addBlock(world, basePos, 5, 14, 3, pinkCottonCandy);
		addBlock(world, basePos, 5, 14, 4, pinkCottonCandy);
		addBlock(world, basePos, 5, 14, 5, pinkCottonCandy);
		addBlock(world, basePos, 5, 14, 6, pinkCottonCandy);
		addBlock(world, basePos, 6, 14, 2, pinkCottonCandy);
		addBlock(world, basePos, 6, 14, 3, pinkCottonCandy);
		addBlock(world, basePos, 6, 14, 4, pinkCottonCandy);
		addBlock(world, basePos, 6, 14, 5, pinkCottonCandy);
		addBlock(world, basePos, 6, 14, 6, pinkCottonCandy);
		addBlock(world, basePos, 2, 15, 2, pinkCottonCandy);
		addBlock(world, basePos, 2, 15, 3, pinkCottonCandy);
		addBlock(world, basePos, 2, 15, 4, pinkCottonCandy);
		addBlock(world, basePos, 2, 15, 5, pinkCottonCandy);
		addBlock(world, basePos, 2, 15, 6, pinkCottonCandy);
		addBlock(world, basePos, 3, 15, 2, pinkCottonCandy);
		addBlock(world, basePos, 3, 15, 3, pinkCottonCandy);
		addBlock(world, basePos, 3, 15, 4, pinkCottonCandy);
		addBlock(world, basePos, 3, 15, 5, pinkCottonCandy);
		addBlock(world, basePos, 3, 15, 6, pinkCottonCandy);
		addBlock(world, basePos, 4, 15, 2, pinkCottonCandy);
		addBlock(world, basePos, 4, 15, 3, pinkCottonCandy);
		addBlock(world, basePos, 4, 15, 4, pinkCottonCandy);
		addBlock(world, basePos, 4, 15, 5, pinkCottonCandy);
		addBlock(world, basePos, 4, 15, 6, pinkCottonCandy);
		addBlock(world, basePos, 5, 15, 2, pinkCottonCandy);
		addBlock(world, basePos, 5, 15, 3, pinkCottonCandy);
		addBlock(world, basePos, 5, 15, 4, pinkCottonCandy);
		addBlock(world, basePos, 5, 15, 5, pinkCottonCandy);
		addBlock(world, basePos, 5, 15, 6, pinkCottonCandy);
		addBlock(world, basePos, 6, 15, 2, pinkCottonCandy);
		addBlock(world, basePos, 6, 15, 3, pinkCottonCandy);
		addBlock(world, basePos, 6, 15, 4, pinkCottonCandy);
		addBlock(world, basePos, 6, 15, 5, pinkCottonCandy);
		addBlock(world, basePos, 6, 15, 6, pinkCottonCandy);
		addBlock(world, basePos, 2, 16, 2, pinkCottonCandy);
		addBlock(world, basePos, 2, 16, 3, pinkCottonCandy);
		addBlock(world, basePos, 2, 16, 4, pinkCottonCandy);
		addBlock(world, basePos, 2, 16, 5, pinkCottonCandy);
		addBlock(world, basePos, 2, 16, 6, pinkCottonCandy);
		addBlock(world, basePos, 3, 16, 2, pinkCottonCandy);
		addBlock(world, basePos, 3, 16, 3, pinkCottonCandy);
		addBlock(world, basePos, 3, 16, 4, pinkCottonCandy);
		addBlock(world, basePos, 3, 16, 5, pinkCottonCandy);
		addBlock(world, basePos, 3, 16, 6, pinkCottonCandy);
		addBlock(world, basePos, 4, 16, 2, pinkCottonCandy);
		addBlock(world, basePos, 4, 16, 3, pinkCottonCandy);
		addBlock(world, basePos, 4, 16, 4, pinkCottonCandy);
		addBlock(world, basePos, 4, 16, 5, pinkCottonCandy);
		addBlock(world, basePos, 4, 16, 6, pinkCottonCandy);
		addBlock(world, basePos, 5, 16, 2, pinkCottonCandy);
		addBlock(world, basePos, 5, 16, 3, pinkCottonCandy);
		addBlock(world, basePos, 5, 16, 4, pinkCottonCandy);
		addBlock(world, basePos, 5, 16, 5, pinkCottonCandy);
		addBlock(world, basePos, 5, 16, 6, pinkCottonCandy);
		addBlock(world, basePos, 6, 16, 2, pinkCottonCandy);
		addBlock(world, basePos, 6, 16, 3, pinkCottonCandy);
		addBlock(world, basePos, 6, 16, 4, pinkCottonCandy);
		addBlock(world, basePos, 6, 16, 5, pinkCottonCandy);
		addBlock(world, basePos, 6, 16, 6, pinkCottonCandy);
		addBlock(world, basePos, 3, 17, 3, pinkCottonCandy);
		addBlock(world, basePos, 3, 17, 4, pinkCottonCandy);
		addBlock(world, basePos, 3, 17, 5, pinkCottonCandy);
		addBlock(world, basePos, 4, 17, 3, pinkCottonCandy);
		addBlock(world, basePos, 4, 17, 4, pinkCottonCandy);
		addBlock(world, basePos, 4, 17, 5, pinkCottonCandy);
		addBlock(world, basePos, 5, 17, 3, pinkCottonCandy);
		addBlock(world, basePos, 5, 17, 4, pinkCottonCandy);
		addBlock(world, basePos, 5, 17, 5, pinkCottonCandy);
		addBlock(world, basePos, 4, 18, 4, plasticPole);
		addBlock(world, basePos, 0, 19, 0, aquaCottonCandy);
		addBlock(world, basePos, 0, 19, 1, aquaCottonCandy);
		addBlock(world, basePos, 0, 19, 2, aquaCottonCandy);
		addBlock(world, basePos, 0, 19, 3, aquaCottonCandy);
		addBlock(world, basePos, 0, 19, 4, aquaCottonCandy);
		addBlock(world, basePos, 0, 19, 5, aquaCottonCandy);
		addBlock(world, basePos, 0, 19, 6, aquaCottonCandy);
		addBlock(world, basePos, 0, 19, 7, aquaCottonCandy);
		addBlock(world, basePos, 0, 19, 8, aquaCottonCandy);
		addBlock(world, basePos, 1, 19, 0, aquaCottonCandy);
		addBlock(world, basePos, 1, 19, 1, pinkCottonCandy);
		addBlock(world, basePos, 1, 19, 2, pinkCottonCandy);
		addBlock(world, basePos, 1, 19, 3, pinkCottonCandy);
		addBlock(world, basePos, 1, 19, 4, pinkCottonCandy);
		addBlock(world, basePos, 1, 19, 5, pinkCottonCandy);
		addBlock(world, basePos, 1, 19, 6, pinkCottonCandy);
		addBlock(world, basePos, 1, 19, 7, pinkCottonCandy);
		addBlock(world, basePos, 1, 19, 8, aquaCottonCandy);
		addBlock(world, basePos, 2, 19, 0, aquaCottonCandy);
		addBlock(world, basePos, 2, 19, 1, pinkCottonCandy);
		addBlock(world, basePos, 2, 19, 2, aquaCottonCandy);
		addBlock(world, basePos, 2, 19, 3, aquaCottonCandy);
		addBlock(world, basePos, 2, 19, 4, aquaCottonCandy);
		addBlock(world, basePos, 2, 19, 5, aquaCottonCandy);
		addBlock(world, basePos, 2, 19, 6, aquaCottonCandy);
		addBlock(world, basePos, 2, 19, 7, pinkCottonCandy);
		addBlock(world, basePos, 2, 19, 8, aquaCottonCandy);
		addBlock(world, basePos, 3, 19, 0, aquaCottonCandy);
		addBlock(world, basePos, 3, 19, 1, pinkCottonCandy);
		addBlock(world, basePos, 3, 19, 2, aquaCottonCandy);
		addBlock(world, basePos, 3, 19, 3, pinkCottonCandy);
		addBlock(world, basePos, 3, 19, 4, pinkCottonCandy);
		addBlock(world, basePos, 3, 19, 5, pinkCottonCandy);
		addBlock(world, basePos, 3, 19, 6, aquaCottonCandy);
		addBlock(world, basePos, 3, 19, 7, pinkCottonCandy);
		addBlock(world, basePos, 3, 19, 8, aquaCottonCandy);
		addBlock(world, basePos, 4, 19, 0, aquaCottonCandy);
		addBlock(world, basePos, 4, 19, 1, pinkCottonCandy);
		addBlock(world, basePos, 4, 19, 2, aquaCottonCandy);
		addBlock(world, basePos, 4, 19, 3, pinkCottonCandy);
		addBlock(world, basePos, 4, 19, 4, pinkCottonCandy);
		addBlock(world, basePos, 4, 19, 5, pinkCottonCandy);
		addBlock(world, basePos, 4, 19, 6, aquaCottonCandy);
		addBlock(world, basePos, 4, 19, 7, pinkCottonCandy);
		addBlock(world, basePos, 4, 19, 8, aquaCottonCandy);
		addBlock(world, basePos, 5, 19, 0, aquaCottonCandy);
		addBlock(world, basePos, 5, 19, 1, pinkCottonCandy);
		addBlock(world, basePos, 5, 19, 2, aquaCottonCandy);
		addBlock(world, basePos, 5, 19, 3, pinkCottonCandy);
		addBlock(world, basePos, 5, 19, 4, pinkCottonCandy);
		addBlock(world, basePos, 5, 19, 5, pinkCottonCandy);
		addBlock(world, basePos, 5, 19, 6, aquaCottonCandy);
		addBlock(world, basePos, 5, 19, 7, pinkCottonCandy);
		addBlock(world, basePos, 5, 19, 8, aquaCottonCandy);
		addBlock(world, basePos, 6, 19, 0, aquaCottonCandy);
		addBlock(world, basePos, 6, 19, 1, pinkCottonCandy);
		addBlock(world, basePos, 6, 19, 2, aquaCottonCandy);
		addBlock(world, basePos, 6, 19, 3, aquaCottonCandy);
		addBlock(world, basePos, 6, 19, 4, aquaCottonCandy);
		addBlock(world, basePos, 6, 19, 5, aquaCottonCandy);
		addBlock(world, basePos, 6, 19, 6, aquaCottonCandy);
		addBlock(world, basePos, 6, 19, 7, pinkCottonCandy);
		addBlock(world, basePos, 6, 19, 8, aquaCottonCandy);
		addBlock(world, basePos, 7, 19, 0, aquaCottonCandy);
		addBlock(world, basePos, 7, 19, 1, pinkCottonCandy);
		addBlock(world, basePos, 7, 19, 2, pinkCottonCandy);
		addBlock(world, basePos, 7, 19, 3, pinkCottonCandy);
		addBlock(world, basePos, 7, 19, 4, pinkCottonCandy);
		addBlock(world, basePos, 7, 19, 5, pinkCottonCandy);
		addBlock(world, basePos, 7, 19, 6, pinkCottonCandy);
		addBlock(world, basePos, 7, 19, 7, pinkCottonCandy);
		addBlock(world, basePos, 7, 19, 8, aquaCottonCandy);
		addBlock(world, basePos, 8, 19, 0, aquaCottonCandy);
		addBlock(world, basePos, 8, 19, 1, aquaCottonCandy);
		addBlock(world, basePos, 8, 19, 2, aquaCottonCandy);
		addBlock(world, basePos, 8, 19, 3, aquaCottonCandy);
		addBlock(world, basePos, 8, 19, 4, aquaCottonCandy);
		addBlock(world, basePos, 8, 19, 5, aquaCottonCandy);
		addBlock(world, basePos, 8, 19, 6, aquaCottonCandy);
		addBlock(world, basePos, 8, 19, 7, aquaCottonCandy);
		addBlock(world, basePos, 8, 19, 8, aquaCottonCandy);
	}
}
