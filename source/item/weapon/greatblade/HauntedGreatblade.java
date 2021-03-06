package net.tslat.aoa3.item.weapon.greatblade;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.registries.ForgeRegistries;
import net.tslat.aoa3.util.LocaleUtil;
import net.tslat.aoa3.util.RandomUtil;
import net.tslat.aoa3.util.constant.AttackSpeed;

import javax.annotation.Nullable;
import java.util.List;

public class HauntedGreatblade extends BaseGreatblade {
	public HauntedGreatblade() {
		super(22.0f, AttackSpeed.GREATBLADE, 1370);
	}

	@Override
	public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean isSelected) {
		if (!world.isRemote && isSelected && entity instanceof PlayerEntity && RandomUtil.oneInNChance(12000)) {
			Effect effect = Effect.get(random.nextInt(ForgeRegistries.POTIONS.getValues().size()));

			while (effect == null) {
				effect = Effect.get(random.nextInt(ForgeRegistries.POTIONS.getValues().size()));
			}

			((PlayerEntity)entity).addPotionEffect(new EffectInstance(effect, 600, 0, false, true));

			TranslationTextComponent component = LocaleUtil.getLocaleMessage("item.aoa3.haunted_greatblade.message." + (1 + random.nextInt(16)), TextFormatting.DARK_PURPLE);

			component.getStyle().setItalic(true);
			entity.sendMessage(component);
		}
	}

	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(LocaleUtil.getFormattedItemDescriptionText(this, LocaleUtil.ItemDescriptionType.UNIQUE, 1));
	}
}
