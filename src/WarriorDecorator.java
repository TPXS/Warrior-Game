
public abstract class WarriorDecorator extends Warrior {

	protected Warrior decoratedWarrior;

	public WarriorDecorator(Warrior warrior) {
		this.decoratedWarrior = warrior;
	}

	@Override
	int calculateAttack() {
		return decoratedWarrior.calculateAttack();
	}

	@Override
	int calculateDefense() {
		return decoratedWarrior.calculateDefense();
	}

	@Override
	double calculateBoost() {
		return decoratedWarrior.calculateBoost();
	}

}
