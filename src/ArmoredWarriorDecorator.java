
public class ArmoredWarriorDecorator extends WarriorDecorator {

	public ArmoredWarriorDecorator(Warrior decoratedWarrior) {
		super(decoratedWarrior);
		doubleDefense();
	}

	private void doubleDefense() {
		super.defense = decoratedWarrior.defense * 2;
		decoratedWarrior.defense = decoratedWarrior.defense * 2;
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
