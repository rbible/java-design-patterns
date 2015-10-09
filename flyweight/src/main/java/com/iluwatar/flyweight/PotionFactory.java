package com.iluwatar.flyweight;

import java.util.EnumMap;
import java.util.Map;

import com.iluwatar.flyweight.enums.EPotionType;

/**
 * 
 * PotionFactory is the Flyweight in this example.
 * It minimizes memory use by sharing object instances.
 * It holds a map of potion instances and new potions
 * are created only when none of the type already exists.
 * 
 */
public class PotionFactory {

	private final Map<EPotionType, IPotion> potions;

	public PotionFactory() {
		potions = new EnumMap<>(EPotionType.class);
	}

	IPotion createPotion(EPotionType type) {
		IPotion potion = potions.get(type);
		if (potion == null) {
			switch (type) {
			case HEALING:
				potion = new HealingPotion();
				potions.put(type, potion);
				break;
			case HOLY_WATER:
				potion = new HolyWaterPotion();
				potions.put(type, potion);
				break;
			case INVISIBILITY:
				potion = new InvisibilityPotion();
				potions.put(type, potion);
				break;
			case POISON:
				potion = new PoisonPotion();
				potions.put(type, potion);
				break;
			case STRENGTH:
				potion = new StrengthPotion();
				potions.put(type, potion);
				break;
			default:
				break;
			}
		}
		return potion;
	}
}
