package Entities;
import UseCases.SaveGame;

import java.io.*;
import java.util.Scanner;

import WritingCSV.EditCSV;

import javax.swing.*;


public class GameStorage {
//    Entity that stores the saved games, contains the csv file.
//    The csv file should be able to be modified.
//    Specifically should be able to 1. Append 2. Remove

    private static File GameList = new File("course-project-eldendisk/src/main/java");

    public static boolean Add(String game) throws IOException {
        try{
        WritingCSV.EditCSV.Write( game, GameList.getPath());}

        catch (IOException e)
        {
            JOptionPane.showMessageDialog(null, "Failed to add game.");
        }
        return true;
    }
    public static boolean Remove(int ID) throws IOException {
        try{
            WritingCSV.EditCSV.DeleteLineById(GameList.getPath(), ID);
            }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Failed to remove game.");
        }
        return true;
    }
    public static String[] FindGame(int id) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(GameList));
        String line = br.readLine();
        while (line!= null) {
            String[] info = line.split(",");
            if (info[0] == String.valueOf(id)) {
                return info;
            }
            line = br.readLine();
        }
        br.close();
        return new String[0];
    }
    public static int GetLatestId () throws IOException {
        Scanner sc = new Scanner(GameList);
        while (sc.hasNext()){
            sc.next();
        }
        String last = sc.toString();
        sc.close();
        return (int) last.charAt(0);

    }
}

