package entities.enemyFactory;

import entities.Character;
import entities.Player;

public class ThirdBoss extends BossEnemy{
    public ThirdBoss(Player player) {
    super(player);
    setName("First Boss");
}

    @Override
    protected boolean roar(Character characterBeingAttacked) {
        characterBeingAttacked.receiveDamage(13);
        return true;
    }

    @Override
    protected boolean kick(Character characterBeingAttacked) {
        characterBeingAttacked.receiveDamage(3);
        return true;
    }

    @Override
    protected boolean punch(Character characterBeingAttacked) {
        characterBeingAttacked.receiveDamage(9);
        return true;
    }

    @Override
    protected boolean charge(Character characterBeingAttacked) {
        characterBeingAttacked.receiveDamage(6);
        return true;
    }
}
