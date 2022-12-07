package useCases;

import entities.Character;

public interface CombatInterface {
    /*
    Interface for CombatUseCase (dependency inversion principle)
     */

    public Character getPlayer();
    public Character getEnemy();
    public void startCombat();
}
