package entities.enemyFactory;

import entities.player.Character;
import entities.player.Player;

public class FirstBoss extends BossEnemy{
    String enemyName;

    public FirstBoss(Player player) {
        super(player);
        setName();
    }

    @Override
    void setName() {
        this.enemyName = "First Boss";
    }

    @Override
    int setInitialEnemyHP() {return 40;}

    @Override
    public String getName() {
        return this.enemyName;
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
