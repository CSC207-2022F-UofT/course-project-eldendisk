package entities.enemyFactory;

import entities.player.Character;
import entities.player.Player;

public class SecondBoss extends BossEnemy {
    String enemyName;

    public SecondBoss(Player player) {
        super(player);
        setName();
    }

    @Override
    void setName() {
        this.enemyName = "Second Boss";
    }
    @Override
    public String getName() {
        return this.enemyName;
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
