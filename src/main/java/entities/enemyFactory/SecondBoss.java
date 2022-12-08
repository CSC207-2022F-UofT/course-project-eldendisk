package entities.enemyFactory;

import entities.Character;
import entities.Player;

public class SecondBoss extends BossEnemy {

    public SecondBoss(Player player) {
        super(player);
        setName("Second Boss");
    }

    @Override
    protected boolean roar(Character characterBeingAttacked) {
        characterBeingAttacked.receiveDamage(3);
        return true;
    }

    @Override
    protected boolean kick(Character characterBeingAttacked) {
        characterBeingAttacked.receiveDamage(3);
        return true;
    }

    @Override
    protected boolean punch(Character characterBeingAttacked) {
        characterBeingAttacked.receiveDamage(3);
        return true;
    }

    @Override
    protected boolean charge(Character characterBeingAttacked) {
        characterBeingAttacked.receiveDamage(11);
        return true;
    }
}
