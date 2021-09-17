
public class DefenseCombatState extends FightEnacted {

	public DefenseCombatState() {
	}

	@Override
	public Warrior fight(Warrior attacker, Warrior defender) {

		// fightEnacted = true;

		boolean condition = (attacker.calculateDefense() > defender.calculateDefense());
		return determineWinner(condition, attacker, defender);
	}

}
