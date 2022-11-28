package UseCases;

import Entities.Game;
import Entities.GameStorage;

import java.io.*;


public class LoadGame implements StartGame{
    @Override
    public Game StartGame(Player player, int id) throws IOException {
        int i = 0;
        if (GameStorage.FindGame(id)!= [i]){
            String lv = GameStorage.FindGame(id)[2];
        }
        Game g = new Game(player, id, lv);
        return g;
    }
//    Reads the csv file, locates the right game with id,

}
