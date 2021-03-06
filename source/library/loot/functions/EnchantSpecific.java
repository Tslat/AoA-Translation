package net.tslat.aoa3.library.loot.functions;

import com.google.gson.*;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentData;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.storage.loot.LootFunction;
import net.minecraft.world.storage.loot.conditions.ILootCondition;
import net.minecraftforge.registries.ForgeRegistries;
import net.tslat.aoa3.advent.AdventOfAscension;
import net.tslat.aoa3.advent.Logging;
import org.apache.logging.log4j.Level;

import java.util.*;

public class EnchantSpecific extends LootFunction {
	private final HashMap<Enchantment, Integer> enchants;

	protected EnchantSpecific(ILootCondition[] lootConditions, List<EnchantmentData> enchantments) {
		super(lootConditions);

		this.enchants = new HashMap<Enchantment, Integer>(enchantments.size());

		for (EnchantmentData ench : enchantments) {
			this.enchants.put(ench.enchantment, ench.enchantmentLevel);
		}
	}

	@Override
	protected ItemStack doApply(ItemStack stack, LootContext context) {
		EnchantmentHelper.setEnchantments(enchants, stack);

		return stack;
	}

	public static Builder<?> builder(EnchantmentData... enchantments) {
		return builder((conditions) -> new EnchantSpecific(conditions, Arrays.asList(enchantments)));
	}

	public static class Serializer extends LootFunction.Serializer<EnchantSpecific> {
		public Serializer() {
			super(new ResourceLocation(AdventOfAscension.MOD_ID, "enchant_specific"), EnchantSpecific.class);
		}

		@Override
		public void serialize(JsonObject object, EnchantSpecific function, JsonSerializationContext context) {
			super.serialize(object, function, context);

			JsonArray enchantments = new JsonArray();

			for (Map.Entry<Enchantment, Integer> enchantEntry : function.enchants.entrySet()) {
				JsonObject enchantObject = new JsonObject();

				enchantObject.addProperty("id", enchantEntry.getKey().getRegistryName().toString());
				enchantObject.addProperty("level", enchantEntry.getValue());
				enchantments.add(enchantObject);
			}

			object.add("enchantments", enchantments);
		}

		@Override
		public EnchantSpecific deserialize(JsonObject object, JsonDeserializationContext deserializationContext, ILootCondition[] conditions) {
			List<EnchantmentData> enchants = new ArrayList<EnchantmentData>();

			if (object.has("enchantments")) {
				JsonElement enchantmentsObject = object.get("enchantments");

				if (enchantmentsObject.isJsonArray()) {
					for (JsonElement element : enchantmentsObject.getAsJsonArray()) {
						if (element.isJsonObject()) {
							JsonObject enchantObject = element.getAsJsonObject();

							if (!enchantObject.has("id") || !enchantObject.has("level"))
								continue;

							Enchantment enchant = null;
							int level = 1;

							try {
								JsonElement idElement = enchantObject.get("id");

								if (idElement.isJsonPrimitive())
									enchant = ForgeRegistries.ENCHANTMENTS.getValue(new ResourceLocation(idElement.getAsJsonPrimitive().getAsString()));

								JsonElement levelElement = enchantObject.get("level");

								if (levelElement.isJsonPrimitive())
									level = levelElement.getAsJsonPrimitive().getAsInt();

								enchants.add(new EnchantmentData(enchant, level));
							}
							catch (Exception ex) {
								Logging.logMessage(Level.ERROR, "Invalid data type for enchant in EnchantSpecific deserialization, skipping entry");
							}
						}
					}
				}
			}

			return new EnchantSpecific(conditions, enchants);
		}
	}
}
