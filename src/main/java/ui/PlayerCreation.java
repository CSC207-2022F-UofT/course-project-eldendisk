package ui;

import entities.player.Gunslinger;
import entities.player.Mage;
import entities.player.Samurai;
import entities.player.Character;

import java.util.Scanner;

public class PlayerCreation {
    static Scanner kbd = new Scanner(System.in);

    public static Character CreateNewCharacter() {

        String classChoice = null;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println("#############################################################################" +
                        "##################################");
                System.out.printf("Choose your class:%n"
                        + "1. Samurai%n"
                        + "2. Mage%n"
                        + "3. Gunslinger%n");
                classChoice = kbd.nextLine();
                if (classChoice.equals("1") || classChoice.equals("2") || classChoice.equals("3")) {
                    validInput = true;
                    break;
                }
                System.out.println("Please enter 1, 2 or 3");
            } catch (Exception e) { //Any special cases?
            }
        }

        switch (classChoice) {
            case "1":
                return CreateSamurai();
            case "2":
                return CreateMage();
            case "3" :
                return CreateGunslinger();
        }
        //In case an error occurs, default creation of Samurai class.
        return CreateSamurai();
    }

    private static Character CreateSamurai() {return new Samurai(askForName()); }
    private static Character CreateMage() {
        return new Mage(askForName());
    }

    private static Character CreateGunslinger() { return new Gunslinger(askForName()); }

    private static String askForName() {
        // private method for getting Player's name
        // won't be called directly.
        String name;
        boolean sentinel = false;

        do {
            System.out.println("Please give us the name of your character: ");
            name = kbd.nextLine();

            if (name.matches("[A-z]*")) {
                sentinel = true;
            } else {
                System.out.println("Invalid name. Character names only can have letters.");
            }
        } while (!sentinel);
        return name;
    }

}
