
public class TraditionalCombatState extends FightEnacted {

	public TraditionalCombatState() {
	}

	@Override
	public Warrior fight(Warrior attacker, Warrior defender) {

		// fightEnacted = true;

		boolean condition = (attacker.calculateAttack() > defender.calculateDefense());
		return determineWinner(condition, attacker, defender);
	}

}
