package UI;

import entities.Gunslinger;
import entities.Mage;
import entities.Samurai;
import entities.Character;

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
                }
            } catch (Exception e) { //if invalid input repeat the above template
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
        //In case the user doesn't choose a valid option it creates a Samurai character.
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
