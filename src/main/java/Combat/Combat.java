package Combat;

import EnemyFactory.EnemyFactory;
import Player_Types.Player;
import Player_Types.Character;

import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class Combat {

    private Character player;
    private Character enemy;
    int selection;
    Random random;

    public Combat(Player player, String combatType) {
        this.player = (Character)player;
        this.enemy = (Character)EnemyFactory.createEnemy((Player)player, combatType);
    }
    public Character getPlayer() {
        return player;
    }
    public Character getEnemy() {
        return enemy;
    }
    public void startCombat() {
        // this is the actual Combat portion. When Player chose to fight, let player pick a combat type (either normal or boss).
        // Create Combat instance and call startCombat on that instance.
        Scanner scanner = new Scanner(System.in);
        System.out.println(this.getPlayer().getName() + " the " + this.getPlayer().getClassName() + " VS "
                + this.getEnemy().getName() + " the " + this.getEnemy().getClassName());
        System.out.println("-------------------------------------------------------");

        while (!this.getEnemy().isDead() && !this.getPlayer().isDead()) {
            //Ask first player what he wants to do;
            System.out.println(this.getPlayer().getName() + ", what's your move?");
            //input
            if (scanner.hasNextLine()) {
                String goodMove = scanner.nextLine();
                if (goodMove.equals("quit")) {
                    System.out.println("You quit!");
                    break;
                }
            } else {
                System.out.println("Not a valid input, you skip your turn");
            }
            System.out.println(this.getEnemy().getName() + ", what's your move?");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            selection = random.nextInt(4); // bound by number of moves in Moves

            switch (selection) { // this is about the attack moves (implement moves and attack first then come back to this)
                case 1:
                    System.out.println("punch");
                    this.getEnemy().attack("punch", this.getPlayer());
                    break;
                case 2:
                    System.out.println("insult");
                    this.getEnemy().attack("insult", this.getPlayer());
                    break;
                case 3:
                    System.out.println("kick");
                    this.getEnemy().attack("kick", this.getPlayer());
                    break;
                case 4:
                    System.out.println("headbutt");
                    this.getEnemy().attack("headbutt", this.getPlayer());
            }
        }
        if (this.getEnemy().isDead()) {
            System.out.println(this.getEnemy().getName() + " is dead!");
        }
        if (this.getPlayer().isDead()) {
            System.out.println(this.getPlayer().getName() + " is dead!");
        }
        System.out.println("Game over!"); // give player choices for proceeding to next combat or shop
        scanner.close();
    }
}


