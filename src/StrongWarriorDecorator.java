
public class StrongWarriorDecorator extends WarriorDecorator {

	public StrongWarriorDecorator(Warrior warrior) {
		super(warrior);
		doubleAttack();
	}

	private void doubleAttack() {
		super.attack = decoratedWarrior.attack * 2;
		decoratedWarrior.attack = decoratedWarrior.attack * 2;
	}

	@Override
	int calculateDefense() {
		return decoratedWarrior.calculateDefense();
	}

	@Override
	double calculateBoost() {
		return decoratedWarrior.calculateBoost();
	}

	@Override
	int calculateAttack() {
		return decoratedWarrior.calculateAttack();
	}

}
