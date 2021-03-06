package net.tslat.aoa3.entity.misc;

import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;
import net.tslat.aoa3.common.registration.AoAEntities;

public class OccultBlockEntity extends Entity {
	private final BlockState highlightingBlock;

	public OccultBlockEntity(EntityType<? extends Entity> entityType, World world) {
		super(entityType, world);

		this.highlightingBlock = world.getBlockState(getPosition());
	}

	public OccultBlockEntity(World world, BlockPos pos) {
		super(AoAEntities.Misc.OCCULT_BLOCK.get(), world);

		setPosition(pos.getX(), pos.getY(), pos.getZ());

		this.highlightingBlock = world.getBlockState(getPosition());
	}

	@Override
	public void tick() {
		super.tick();
		ticksExisted++;

		if (ticksExisted > 150 || highlightingBlock == null || highlightingBlock.getBlock() != world.getBlockState(getPosition()).getBlock()) {
			remove();
			setPositionAndUpdate(0, 0, 0);
		}
	}

	public BlockState getMarkedBlock() {
		return this.highlightingBlock;
	}

	@Override
	public boolean isGlowing() {
		return true;
	}

	@Override
	public IPacket<?> createSpawnPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerData() {}

	@Override
	protected void readAdditional(CompoundNBT compound) {}

	@Override
	protected void writeAdditional(CompoundNBT compound) {}
}
