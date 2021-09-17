
public class Combat {
	private CombatContext combatContext;
	private int numberOfStates = 5;

	public Combat(CombatContext combatContext) {
		this.combatContext = combatContext;
	}

	public Warrior duel(Warrior attacker, Warrior defender) {
		int attackerVictories = 0;
		int defenderVictories = 0;
		int numberOfBattles = 0;
		while (numberOfBattles < numberOfStates) {
			if (combatContext.getCombatState().fight(attacker, defender) == attacker) {
				attackerVictories += 1;
			} else {
				defenderVictories += 1;
			}

			numberOfBattles = defenderVictories + attackerVictories;
			nextState();
		}

		if (attackerVictories >= defenderVictories) {
			return attacker;
		} else {
			return defender;
		}
	}

	private void nextState() {
		if (combatContext.getCombatState() instanceof AttackCombatState) {
			combatContext.setCombatState(new DefenseCombatState());
		} else if (combatContext.getCombatState() instanceof DefenseCombatState) {
			combatContext.setCombatState(new InverseCombatState());
		} else if (combatContext.getCombatState() instanceof InverseCombatState) {
			combatContext.setCombatState(new PowerCombatState());
		} else if (combatContext.getCombatState() instanceof PowerCombatState) {
			combatContext.setCombatState(new TraditionalCombatState());
		} else if (combatContext.getCombatState() instanceof TraditionalCombatState) {
			combatContext.setCombatState(new AttackCombatState());
		}
	}

}
