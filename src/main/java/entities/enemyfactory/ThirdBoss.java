package entities.enemyfactory;

import entities.player.Character;
import entities.player.Player;

public class ThirdBoss extends BossEnemy{
    String enemyName;
    public ThirdBoss(Player player) {
    super(player);
    setName();
}
    @Override
    void setName() {
        this.enemyName = "Third Boss";
    }
    @Override
    public String getName() {
        return this.enemyName;
    }

    @Override
    int setInitialEnemyHP() {
        return 80;
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
