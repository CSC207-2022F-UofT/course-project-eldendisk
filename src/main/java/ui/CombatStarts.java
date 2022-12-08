package ui;

import java.util.Random;
import java.util.Scanner;
import Combat.Combat;
import Combat.Move;
import entities.Character;

public class CombatStarts {
    private Character player;
    private Character enemy;
    static int selection;
    static Random random;

    public CombatStarts() {
    }

    public Character getPlayer() {
        return player;
    }
    public Character getEnemy() {
        return enemy;
    }
    public static void startCombat(Combat combat) {
        // this is the actual Combat portion. When Player chose to fight, let player pick a combat type (either normal or boss).
        // Create Combat instance and call startCombat on that instance.
        Scanner scanner = new Scanner(System.in);
        System.out.println(combat.getPlayer().getName() +" VS "
                + combat.getEnemy().getName());
        System.out.println("-------------------------------------------------------");


        while (!combat.getEnemy().isDead() && !combat.getPlayer().isDead() ) {
            //Ask first player what he wants to do;
            System.out.println(combat.getPlayer().getName() + ", it is your turn.");
            System.out.println("-------------------------------------------------------");
            combat.getPlayer().printMoves();
            //input
            if (scanner.hasNextLine()) {
                String playerMove = scanner.nextLine();


                if (playerMove.equals("quit")) {
                    System.out.println("You quit!");
                    break;
                } else if (playerMove.equals("1") || playerMove.equals("2") || playerMove.equals("3")||playerMove.equals("4"))

                    combat.getPlayer().attack(combat.getPlayer().pickMove(playerMove), combat.getEnemy());
                } else {
                    System.out.println("Not a valid input, you skip your turn");
                }

            if (combat.getEnemy().isDead()) {
                break;
            }

            System.out.println("Now " + combat.getEnemy().getName() + " moves..." );
            System.out.println("-------------------------------------------------------");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            selection = 1; //new Random().nextInt(4) + 1; // bound by number of moves in Moves

            // remove switch, implement pick corresponding move method and enemy use attack method to attack.
            switch (selection) { // this is about the attack moves (implement moves and attack first then come back to this)
                case 1:
                    String selectedMove = combat.getEnemy().pickMove(Integer.toString(selection));
                    System.out.println("Enemy's " + selectedMove);
                    combat.getEnemy().attack(selectedMove, combat.getPlayer());
                    break;
                case 2:
                    System.out.println("Enemy's move2");
                    combat.getEnemy().attack(combat.getEnemy().pickMove(Integer.toString(selection)), combat.getPlayer());
                    break;
                case 3:
                    System.out.println("Enemy's move3");
                    combat.getEnemy().attack(combat.getEnemy().pickMove(Integer.toString(selection)), combat.getPlayer());
                    break;
                case 4:
                    System.out.println("Enemy's move4");
                    combat.getEnemy().attack(combat.getEnemy().pickMove(Integer.toString(selection)), combat.getPlayer());
            }
            if (combat.getPlayer().isDead()) {
                break;
            }

        }

        if (combat.getEnemy().isDead()) {
            System.out.println(combat.getEnemy().getName() + " has died! You won!");
        }

        if (combat.getPlayer().isDead()) {
            System.out.println(combat.getPlayer().getName() + " have died!");
        }

        System.out.println("This combat is Over...");
        System.out.println("Prepare for the next combat...");
    }
}
