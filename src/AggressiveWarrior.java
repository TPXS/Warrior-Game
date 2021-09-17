public class AggressiveWarrior extends Warrior {

	private AggressiveWarrior(int level) {
		this.level = level;
	}

	public static class Builder extends Warrior.WarriorBuilder {

		public Builder(int level) {
			warrior = new AggressiveWarrior(level);
			warrior.attack = 3;
			warrior.defense = 2;
		}

	}

	@Override
	int calculateAttack() {
		int calculatedAttack = this.attack + 2 * this.level;
		return calculatedAttack;
	}

	@Override
	int calculateDefense() {
		int calculatedDefense = this.defense + this.level;
		return calculatedDefense;
	}

	@Override
	double calculateBoost() {
		double boost = this.attack / 2.0;
		return boost;
	}
}
