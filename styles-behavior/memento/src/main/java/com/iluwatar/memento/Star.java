package com.iluwatar.memento;

/**
 * 
 * Star uses "mementos" to store and restore state.
 * 
 */
public class Star {

	private EStarType type;
	private int ageYears;
	private int massTons;

	public Star(EStarType startType, int startAge, int startMass) {
		this.type = startType;
		this.ageYears = startAge;
		this.massTons = startMass;
	}

	public void timePasses() {
		ageYears *= 2;
		massTons *= 8;
		switch (type) {
		case RED_GIANT:
			type = EStarType.WHITE_DWARF;
			break;
		case SUN:
			type = EStarType.RED_GIANT;
			break;
		case SUPERNOVA:
			type = EStarType.DEAD;
			break;
		case WHITE_DWARF:
			type = EStarType.SUPERNOVA;
			break;
		case DEAD:
			ageYears *= 2;
			massTons = 0;
			break;
		default:
			break;
		}
	}

	IStarMemento getMemento() {

		StarMementoInternal state = new StarMementoInternal();
		state.setAgeYears(ageYears);
		state.setMassTons(massTons);
		state.setType(type);
		return state;

	}

	void setMemento(IStarMemento memento) {

		StarMementoInternal state = (StarMementoInternal) memento;
		this.type = state.getType();
		this.ageYears = state.getAgeYears();
		this.massTons = state.getMassTons();

	}

	@Override
	public String toString() {
		return String.format("%s age: %d years mass: %d tons", type.toString(),
				ageYears, massTons);
	}
	
	/**
	 * 
	 * StarMemento implementation
	 * 
	 */
	private static class StarMementoInternal implements IStarMemento {

		private EStarType type;
		private int ageYears;
		private int massTons;

		public EStarType getType() {
			return type;
		}

		public void setType(EStarType type) {
			this.type = type;
		}

		public int getAgeYears() {
			return ageYears;
		}

		public void setAgeYears(int ageYears) {
			this.ageYears = ageYears;
		}

		public int getMassTons() {
			return massTons;
		}

		public void setMassTons(int massTons) {
			this.massTons = massTons;
		}
	}
}
