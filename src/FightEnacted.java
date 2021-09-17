
public abstract class FightEnacted implements CombatState {

	// protected boolean fightEnacted = false;

	/*
	 * public boolean getFightEnacted() { return fightEnacted; }
	 * 
	 * public void resetFightEnacted() { fightEnacted = false; }
	 */

	protected Warrior determineWinner(boolean condition, Warrior attacker, Warrior defender) {
		if (condition) {
			return attacker;
		} else {
			return defender;
		}
	}

}
