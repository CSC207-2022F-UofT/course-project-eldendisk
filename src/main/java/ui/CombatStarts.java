package ui;

import controllers.CombatController;

import java.util.Scanner;

public class CombatStarts {
    private static Scanner scanner = new Scanner(System.in);

    public CombatStarts() {
    }

    public static void startCombat(CombatController combatController) {
        combatController.startCombat();
    }

    public static boolean hasInput() {
        return scanner.hasNextLine();
    }

    public static String getInput() {
        return scanner.nextLine();
    }

    public static void quitGame() {
        System.exit(0);
    }

    public static void displayDelay(int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void displayMessage(String message) {
        System.out.println(message);
    }
}
