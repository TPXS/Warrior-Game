
public class PowerCombatState extends FightEnacted {

	public PowerCombatState() {
	}

	@Override
	public Warrior fight(Warrior attacker, Warrior defender) {

		// fightEnacted = true;

		boolean condition = (attacker.calculatePower() > defender.calculatePower());
		return determineWinner(condition, attacker, defender);
	}

}
