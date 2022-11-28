package UI;

import Entities.EnemyFactory.BossEnemy;
import Entities.Player;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Scanner;

/* In this class the key events and dialogue of the game are implemented */
public class EldenDisk {
    private Player player;
    private BossEnemy enemy;
     int selection;

    public EldenDisk(Player player, BossEnemy enemy) {
        this.player = player;
        this.enemy = enemy;

    }



    public static void startFight(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------------------------------------");
        System.out.println("Welcome to Elden Disk!");
        System.out.println("-------------------------------------------------------");
        System.out.println("Elden Disk is a text based single player game you have to beat a series of ten bosses to win.\\\\s\n" +
                "                                        You will be able to chose three classes, all of which have their individual pros and cons based on what type of enemy you are facing.\\\\s\n" +
                "                                        On your turn, you will be able to either attack the enemy, use an item that will be purchasable through an in game trader, or purchase an item itself.\n" +
                "                                        Once you use your the enemy will attack. After the battle you will receive experience and currency to be able to purchase items and level up.\n" +
                "                                        Only when you beat all the bosses, will you be declared the Elden Prince. ");
        System.out.println("-------------------------------------------------------");
        System.out.println("Type quit to exit at anytime.");
        System.out.println("-------------------------------------------------------");
        System.out.println("What is your name, tarnished?");
        
        String characterName = scanner.nextLine();
        if (characterName.equals("quit")){
            System.exit(0);
        }
        
        System.out.println("-------------------------------------------------------");
        System.out.println("Chose your character, tarnished?");
        System.out.println("1. Samurai \n2. Mage \n3. Gunslinger" );
        String characterInput = scanner.nextLine();
        
        if (characterInput.equals("quit")){
            System.exit(0);
        } else {
            while (!(characterInput.equals("1") || characterInput.equals("2") || characterInput.equals("3"))) {
                System.out.println("Enter Valid Input");
                characterInput = scanner.nextLine();
            }
        }
    }

    public void bossFight1(){
        Scanner scanner = new Scanner(System.in);

        while(this.getPlayer().player_alive & this.getEnemy().enemy_alive){
            System.out.println(this.getPlayer() + ", it is your turn");
            if (scanner.hasNextLine()){
                String playerMove = scanner.nextLine();
                if (playerMove.equals("quit")){
                    System.exit(0);
                }

            }
            switch (selection){
                case 1:
                    //move 1
                case 2:
                    //move 2
                case 3:
                    //move 3
                case 4:
                    //move 4
            }
        }
        if (! this.getPlayer().player_alive){
            System.out.println("You have died!");
        }
        if (! this.getEnemy().enemy_alive){
            System.out.println(this.getEnemy().getEnemyName() + " have died. You won!");
        }

    }

    public static void EndGameDialogue(){
        System.out.println("-------------------------------------------------------");
        System.out.println("The fallen leaves tell a story\\s\n" +
                "                Of how a Tarnished became Elden Prince\\s\n" +
                "                In our home, across the fog, the Lands Between.\\s\n" +
                "                Our seed will look back upon us and recall\\s\n" +
                "                The Age of the Elden Prince");
        System.out.println("-------------------------------------------------------");
        LargeText("THE END");

    }
    public static void LargeText(String txt) {
        int width = 140;
        int height = 80;

        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        g.setFont(new Font("SansSerif", Font.BOLD, 24));

        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics.drawString(txt, 10, 30);

        for (int y = 0; y < height; y++) {
            StringBuilder sb = new StringBuilder();
            for (int x = 0; x < width; x++) {
                sb.append(image.getRGB(x, y) == -16777216 ? " " : "$");
            }
            if (sb.toString().trim().isEmpty()) {
                continue;
            }
            System.out.println(sb);
        }
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public BossEnemy getEnemy() {
        return enemy;
    }

    public void setEnemy(BossEnemy enemy) {
        this.enemy = enemy;
    }

    public int getSelection() {
        return selection;
    }

    public void setSelection(int selection) {
        this.selection = selection;
    }
}
