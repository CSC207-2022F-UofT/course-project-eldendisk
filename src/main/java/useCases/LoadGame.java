package useCases;

import entities.GameStorage;

import entities.Player;
import entities.TempEldenDisk;


import java.io.*;


public class LoadGame implements StartGame{
    /**
     * The Use Case that loads an old Game which the User picked to start.
     *
     * @param player player in the Game
     * @param id of the Game
     * @return A Game to be started.
     * @throws IOException
     */
    @Override
    public TempEldenDisk StartGame(Player player, int id) throws IOException {
        int i = 0;
        if (Integer.parseInt(GameStorage.FindGame(id)[0])!= i){
            String lv = GameStorage.FindGame(id)[2];
            TempEldenDisk g = new TempEldenDisk();
            g.SetLvl(Integer.parseInt(lv));
            return g;
        }
        return new TempEldenDisk();
    }


}
