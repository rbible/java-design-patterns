package com.iluwatar.property;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents Character in game and his abilities (base stats).
 */
public class Character implements IPrototype {

	public enum Type {
		WARRIOR, MAGE, ROGUE
	}

	private final IPrototype prototype;
	private final Map<EStats, Integer> properties = new HashMap<>();

	private String name;
	private Type type;

	public Character() {
		this.prototype = new IPrototype() { // Null-value object
			@Override
			public Integer get(EStats stat) {
				return null;
			}

			@Override
			public boolean has(EStats stat) {
				return false;
			}

			@Override
			public void set(EStats stat, Integer val) {
			}

			@Override
			public void remove(EStats stat) {
			}
		};
	}

	public Character(Type type, IPrototype prototype) {
		this.type = type;
		this.prototype = prototype;
	}

	public Character(String name, Character prototype) {
		this.name = name;
		this.type = prototype.type;
		this.prototype = prototype;
	}

	public String name() {
		return name;
	}

	public Type type() {
		return type;
	}

	@Override
	public Integer get(EStats stat) {
		boolean containsValue = properties.containsKey(stat);
		if (containsValue) {
			return properties.get(stat);
		} else {
			return prototype.get(stat);
		}
	}

	@Override
	public boolean has(EStats stat) {
		return get(stat) != null;
	}

	@Override
	public void set(EStats stat, Integer val) {
		properties.put(stat, val);
	}

	@Override
	public void remove(EStats stat) {
		properties.put(stat, null);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		if (name != null) {
			builder.append("Player: ").append(name).append("\n");
		}

		if (type != null) {
			builder.append("Character type: ").append(type.name()).append("\n");
		}

		builder.append("Stats:\n");
		for (EStats stat : EStats.values()) {
			Integer value = this.get(stat);
			if (value == null) {
				continue;
			}
			builder.append(" - ").append(stat.name()).append(":").append(value).append("\n");
		}
		return builder.toString();
	}

}
