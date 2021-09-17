
public class AttackCombatState extends FightEnacted {

	public AttackCombatState() {
	}

	@Override
	public Warrior fight(Warrior attacker, Warrior defender) {

		// fightEnacted = true;

		boolean condition = (attacker.calculateAttack() > defender.calculateAttack());
		return determineWinner(condition, attacker, defender);
	}

}
