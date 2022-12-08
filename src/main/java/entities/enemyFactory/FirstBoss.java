package entities.enemyFactory;

import entities.Character;
import entities.Player;

public class FirstBoss extends BossEnemy{

    public FirstBoss(Player player) {
        super(player);
        setName("First Boss");
    }

    @Override
    protected boolean roar(Character characterBeingAttacked) {
        characterBeingAttacked.receiveDamage(2);
        return true;
    }

    @Override
    protected boolean kick(Character characterBeingAttacked) {
        characterBeingAttacked.receiveDamage(4);
        return true;
    }

    @Override
    protected boolean punch(Character characterBeingAttacked) {
        characterBeingAttacked.receiveDamage(6);
        return true;
    }

    @Override
    protected boolean charge(Character characterBeingAttacked) {
        characterBeingAttacked.receiveDamage(8);
        return true;
    }
}
