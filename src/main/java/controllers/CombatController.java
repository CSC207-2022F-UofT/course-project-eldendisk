package controllers;

import useCases.CombatUseCase;

public class CombatController {
    /*
    Connects the CombatStarts UI to the CombatUseCase use case.
     */
    private CombatUseCase combatUseCase;

    public CombatController(CombatUseCase combatUseCase) {
        this.combatUseCase = combatUseCase;
    }

    public void startCombat() {
        this.combatUseCase.startCombat();
    }
}
