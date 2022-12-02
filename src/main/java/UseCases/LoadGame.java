package UseCases;

import Entities.Game;
import Entities.GameStorage;

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
    public Game StartGame(Player player, int id) throws IOException {
        int i = 0;
        if (Integer.parseInt(GameStorage.FindGame(id)[0])!= i){
            String lv = GameStorage.FindGame(id)[2];
            Game g = new Game(player, id);
            g.SetLevel(Integer.parseInt(lv));
            return g;
        }
        return new Game(player, id);
    }


}
