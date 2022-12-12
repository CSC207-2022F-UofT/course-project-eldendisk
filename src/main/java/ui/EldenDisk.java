package ui;

import entities.enemyfactory.BossEnemy;

import entities.player.Gunslinger;
import entities.player.Mage;
import entities.player.Player;
import entities.player.Samurai;


import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Scanner;

/* In this class the key events and dialogue of the game are implemented */
public class EldenDisk {
    private BossEnemy enemy;
    int selection;
    public String player_name;

    public EldenDisk(BossEnemy enemy) {
        this.enemy = enemy;
    }

    public Player startFight() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------------------------------------");
        System.out.println("Welcome to Elden Disk!");
        System.out.println("-------------------------------------------------------");
        System.out.println(
                "Elden Disk is a text based single player game you have to beat a series of ten bosses to win. "
                        + "You will be able to chose three classes, all of which have their individual pros and cons based on what type of enemy you are facing. "
                        + "On your turn, you will be able to either attack the enemy, use an item that will be purchasable through an in game trader, or purchase an item itself. "
                        + "Once you use your the enemy will attack. After the battle you will receive experience and currency to be able to purchase items and level up. "
                        + "Only when you beat all the bosses, will you be declared the Elden Prince.");
        System.out.println("-------------------------------------------------------");
        System.out.println("Type quit to exit at anytime.");
        System.out.println("-------------------------------------------------------");
        System.out.println("What is your name, tarnished?");

        String characterName = scanner.nextLine();
        this.player_name = characterName;
        if (characterName.equals("quit")) {
            System.exit(0);
        }

        System.out.println("-------------------------------------------------------");
        System.out.println("Chose your character, tarnished?");

        // need to assign player to this character type after the type is chosen
        System.out.println("-------------------------------------------------------");
        System.out.println("Chose your character, tarnished?");
        System.out.println("1. Samurai \n2. Mage \n3. Gunslinger");
        String characterInput = scanner.nextLine();
        if (characterInput.equals("quit")) {
            System.exit(0);
        } else {
            while (!(characterInput.equals("1") || characterInput.equals("2") || characterInput.equals("3"))) {
                System.out.println("Enter Valid Input");
                characterInput = scanner.nextLine();
            }
        }
        if (characterInput.equals("1")) {
            return new Samurai(characterName, 1, 1, 1, 1, 1, 1, 1);
        } else if (characterInput.equals("2")) {
            return new Mage(characterName, 1, 1, 1, 1, 1, 1, 1);

        } else {
            return new Gunslinger(characterName, 1, 1, 1, 1, 1, 1, 1);
        }
    }

    public void bossFight1(Player user) {
        System.out.println(
                "You wake up dazed and confused, wondering where you are "
                        + "'Oh well', you say to yourself as this is not the first time you've awakened not knowing where you are "
                        + "Especially not after those Monday night football benders you have with Xavier and the boys "
                        + "You walk towards the exit and as you leave, the wonderful view of Limegrave encapsulates you "
                        + "'Should not have ate those mushrooms they were definitely not Portabello' "
                        + "As you exit a foe stands before you O_O");
        System.out.println("A Sapling Sentinel Appears before you and he starts swinging at you (You owe him money)");
        System.out.println("IT IS TIMED TO FIGHT OH WEARY TARNISHED");
        Scanner scanner = new Scanner(System.in);

        while (user.HP > 0 & this.getEnemy().isDead()) {
            System.out.println(this.player_name + ", it is your turn");
            CharacterChoice(user);
            if (scanner.hasNextLine()) {
                String playerMove = scanner.nextLine();
                if (playerMove.equals("quit")) {
                    System.exit(0);
                } else {
                    while (!(playerMove.equals("1") || playerMove.equals("2") || playerMove.equals("3"))) {
                        System.out.println("Enter Valid Input");
                        playerMove = scanner.nextLine();
                    }
                }
            }
            switch (selection) {
                case 1:
                    //move 1
                case 2:
                    //move 2
                case 3:
                    //move 3
            }
        }
        if (user.HP > 0) {
            System.out.println("You have died!");
        }
        if (!this.getEnemy().isDead()) {
            System.out.println(this.getEnemy().getName() + " have died. You won!");
        }

    }

    public static void CharacterChoice(Player user) {
        if (user instanceof Samurai) {
            System.out.println("1. Seppuku");
            System.out.println("2. Storm Blade");
            System.out.println("3. Bloody Slash");
        }
        if (user instanceof Mage) {
            System.out.println("1. Flame of the Fell God");
            System.out.println("2. Comet Azur");
            System.out.println("3. Stars of Ruin");
        }
        if (user instanceof Gunslinger) {
            System.out.println("1. Go Go Glock!");
            System.out.println("2. Bruce Lee Gun Fu");
            System.out.println("3. 360 NoScope");
        }
    }

    public static void EndGameDialogue() {
        System.out.println("-------------------------------------------------------");
        System.out.println("The fallen leaves tell a story "
                + "Of how a Tarnished became Elden Prince "
                + "In our home, across the fog, the Lands Between. "
                + "Our seed will look back upon us and recall "
                + "The Age of the Elden Prince");
        System.out.println("-------------------------------------------------------");
        LargeText("THE END");
    }

    public static void LargeText(String txt) {
        int width = 140;
        int height = 80;

        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        g.setFont(new Font("SansSerif", Font.BOLD, 20));

        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics.drawString(txt, 10, 20);

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

