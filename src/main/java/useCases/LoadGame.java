package useCases;

import entities.GameStorage;

import entities.Player;
import entities.TempEldenDisk;


import java.io.*;


public class LoadGame {
    /**
     * The Use Case that loads an old Game which the User picked to start.
     *
     * @param player player in the Game
     * @param id of the Game
     * @return A Game to be started.
     * @throws IOException
     */

    public TempEldenDisk ResumeGame(int id) throws IOException {
        int i = 0;
        String[] info = GameStorage.FindGame(id);
        if (Integer.parseInt(info[0]) != i){
            TempEldenDisk g = new TempEldenDisk();
            Player p = Player()
            return g;
        }
        return new TempEldenDisk();
    }


}
