abstract public class Warrior {
	protected int level;
	protected int attack;
	protected int defense;

	public int getLevel() {
		return this.level;
	}

	public int getAttack() {
		return this.attack;
	}

	public int getDefense() {
		return this.defense;
	}

	protected double calculatePower() {
		double power = (double) this.calculateAttack() + (double) this.calculateDefense() + this.calculateBoost();
		return power;
	}

	abstract int calculateAttack();

	abstract int calculateDefense();

	abstract double calculateBoost();

	public abstract static class WarriorBuilder {

		protected Warrior warrior;

		public WarriorBuilder attack(int attack) {
			warrior.attack = attack;
			return this;
		}

		public WarriorBuilder defense(int defense) {
			warrior.defense = defense;
			return this;
		}

		private void validate(Warrior warrior) {
			String exceptionMessage = "";
			if (warrior.level <= 0) {
				exceptionMessage += "Level must be greater than 0. ";

			}
			if (warrior.attack <= 0) {
				exceptionMessage += "Attack must be greater than 0. ";
			}
			if (warrior.defense <= 0) {
				exceptionMessage += "Defense must be greater than 0. ";
			}

			if (exceptionMessage != null && exceptionMessage.length() != 0) {
				throw new IllegalStateException(exceptionMessage);
			}
		}

		public Warrior build() {
			validate(warrior);
			return warrior;
		}

	}
}
