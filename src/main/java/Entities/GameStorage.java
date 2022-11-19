package Entities;
import UseCases.SaveGame;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import WritingCSV.EditCSV;

import javax.swing.*;


public class GameStorage {
//    Entity that stores the saved games, contains the csv file.
//    The csv file should be able to be modified.
//    Specifically should be able to 1. Append 2. Remove

    private static File GameList = new File("course-project-eldendisk/src/main/java");

    public boolean Add(String game) throws IOException {
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
}

