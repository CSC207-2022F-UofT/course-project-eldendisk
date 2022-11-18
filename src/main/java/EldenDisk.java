import EnemyFactory.Enemy;
import Player_Types.Player;
import Player_Types.Samurai;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/* In this class the key events and dialogue of the game are implemented */
public class EldenDisk {
    private Player player;
    private Enemy enemy;
    private int selection;

    public EldenDisk(Player player, Enemy enemy, int selection) {
        this.player = player;
        this.enemy = enemy;
        this.selection = selection;
    }

    public static void startFight(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------------------------------------");
        System.out.println("Welcome to Elden Disk!");
        System.out.println("-------------------------------------------------------");
        System.out.println("""
                Elden Disk is a text based single player game you have to beat a series of ten bosses to win.\s
                You will be able to chose three classes, all of which have their individual pros and cons based on what type of enemy you are facing.\s
                On your turn, you will be able to either attack the enemy, use an item that will be purchasable through an in game trader, or purchase an item itself.
                Once you use your the enemy will attack. After the battle you will receive experience and currency to be able to purchase items and level up.
                Only when you beat all the bosses, will you be declared the Elden Prince.
                """);
        System.out.println("-------------------------------------------------------");
        System.out.println("Type quit to exit at anytime.");
        System.out.println("-------------------------------------------------------");
        System.out.println("What is your name, tarnished?");
        String characterName = scanner.nextLine();
        System.out.println("-------------------------------------------------------");
        System.out.println("Chose your character, tarnished?");
        System.out.println("1. Samurai \n2. Mage \n3. Gunslinger" );
        String characterInput = scanner.nextLine();
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    public int getSelection() {
        return selection;
    }

    public void setSelection(int selection) {
        this.selection = selection;
    }
}
