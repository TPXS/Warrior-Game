public class DefensiveWarrior extends Warrior {

	private DefensiveWarrior(int level) {
		this.level = level;
	}

	public static class Builder extends WarriorBuilder {

		public Builder(int level) {
			warrior = new DefensiveWarrior(level);
			warrior.attack = 2;
			warrior.defense = 3;
		}

	}

	@Override
	int calculateAttack() {
		int calculatedAttack = this.attack + this.level;
		return calculatedAttack;
	}

	@Override
	int calculateDefense() {
		int calculatedDefense = this.defense + 2 * this.level;
		return calculatedDefense;
	}

	@Override
	double calculateBoost() {
		double boost = this.defense / 2.0;
		return boost;
	}
}
