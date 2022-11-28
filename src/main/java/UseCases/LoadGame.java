package UseCases;

import Entities.Game;
import Entities.GameStorage;

import java.io.*;


public class LoadGame implements StartGame{
    @Override
    public Game StartGame(Player player, int id) throws IOException {
        int i = 0;
        if (Integer.parseInt(GameStorage.FindGame(id)[0])!= i){
            String lv = GameStorage.FindGame(id)[2];
            return new Game(player, id, Integer.parseInt(lv));
        }
        return new Game(player, id);
    }


}
