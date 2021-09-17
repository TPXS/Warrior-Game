
public class CombatContext {
	private CombatState combatState;

	public CombatContext() {
		combatState = new TraditionalCombatState();
	}

	public void setCombatState(CombatState combatState) {
		this.combatState = combatState;
	}

	public CombatState getCombatState() {
		return this.combatState;
	}

}
