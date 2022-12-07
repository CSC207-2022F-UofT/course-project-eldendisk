package ui;

import controllers.CombatController;
import java.util.Scanner;

public class CombatStarts {
    private static Scanner scanner = new Scanner(System.in);
    public CombatStarts() {
    }

    public static void startCombat(CombatController combatController) {
        combatController.startCombat();
        System.out.println("This combat is Over...");
        System.out.println("Prepare for the next combat...");
    }
    public static boolean hasInput() {
        return scanner.hasNextLine();
    }

    public static String getInput() {
        return scanner.nextLine();
    }

    public static void displayMesssage(String message) {
        System.out.println(message);
    }
}
