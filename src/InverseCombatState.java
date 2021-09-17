
public class InverseCombatState extends FightEnacted {

	public InverseCombatState() {
	}

	@Override
	public Warrior fight(Warrior attacker, Warrior defender) {

		// fightEnacted = true;

		boolean condition = (attacker.calculateDefense() >= defender.calculateAttack());
		return determineWinner(condition, attacker, defender);
	}

}
