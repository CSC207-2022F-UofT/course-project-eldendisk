package EnemyFactory;

import Combat.Moves;
import Player_Types.Character;
import Player_Types.Player;

public abstract class Enemy implements Character {
    private String enemyName;
    private String className; // either Boss or Normal
    private Player player;
    //enemy stats
    private int HP;
    private int attackDamage;
    private double damageMultiplier;
    //moves
    private Moves enemyMoves;

    public Enemy(Player player, String enemyType) {
        this.enemyName = setEnemyName();
        this.className = enemyType;
        this.player = player;

        this.HP = setInitialEnemyHP();
        this.attackDamage = setEnemyAttackDmg();
        this.damageMultiplier = setEnemydamageMultiplier();

        this.enemyMoves = setEnemyMoves();

    }
    abstract String setEnemyName();
    abstract int setInitialEnemyHP();
    abstract int setEnemyAttackDmg();
    abstract  double setEnemydamageMultiplier();
    abstract Moves setEnemyMoves();

    //abstract methods from Character interface

    @Override
    public String getName() {
        return this.enemyName;
    }
    @Override
    public String getClassName() {
        return this.className;
    }

    @Override
    public int getHP() {
        return HP;
    }

    @Override
    public void changeHP(int change) {
        this.HP = this.getHP() - change;
    }
    @Override
    public void receiveDamage(String attack) {
        changeHP(3); //value should be damage of attack * dmg mult
    }

    @Override
    public boolean isDead() {
        // enemy dead when enemy's healthPoint less than or equal to 0.
        return this.HP <= 0;
    }

     public abstract boolean attack(String move, Character characterBeingAttacked);
//    		if (this.isScared()) {
//        System.out.println("\n" + this.getName() + " is still scared! can't move!");
//        this.scared = false;
//        return true;
//    }
//		switch (move) {
//        case "kick":
//            return kick(characterBeingAttacked);
//        case "punch":
//            return punch(characterBeingAttacked);
//        case "headbutt":
//            return headbutt(characterBeingAttacked);
//        case "roar":
//            return roar(characterBeingAttacked);
//        case "insult":
//            return insult(characterBeingAttacked);
//        default:
//            System.out.println("\n" + move + " is not a valid move you skip your turn doofus! \n");
//            return true;
//    }
//}
}


