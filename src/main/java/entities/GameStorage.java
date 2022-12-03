package entities;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class GameStorage {
    /**
     * Entity that stores the saved games in a csv file. Allow actions including, Add, Remove and FindGame.
     */

    private static File GameList = new File("/Users/bellehuang/IdeaProjects/course-project-eldendisk/src/main/GameStorage");

    /**
     * @param game to be added to the GameStorage
     * @throws IOException
     */
    public static void Add(String game) throws IOException {
        try{
        WritingCSV.EditCSV.Write(game, GameList.getPath());}

        catch (IOException e)
        {
            JOptionPane.showMessageDialog(null, "Failed to add game.");
        }
    }

    /**
     * @param id of the Game
     * @throws IOException
     */
    public static void Remove(int id) throws IOException {
        try{
            WritingCSV.EditCSV.DeleteLineById(GameList.getPath(), id);
            }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Failed to remove game.");
        }
    }

    /**
     * @param id of the Game
     * @return Needed info to start the game
     * @throws IOException
     */
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

    /**
     * @return id of the last saved game
     * @throws IOException
     */
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

