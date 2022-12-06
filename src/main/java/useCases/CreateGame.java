package useCases;

import entities.Player;
import entities.TempEldenDisk;

import java.io.IOException;



public class CreateGame implements StartGame {
    /**
     * The Use Case which creates a new Game with the input Player.
     *
     * @param player in the User input.
     * @param id of the Game.
     * @return A new Game with the input Player.
     * @throws IOException when Game could not be started.
     */

    @Override
    public TempEldenDisk StartGame(Player player, int id) throws IOException {
        TempEldenDisk ret = new TempEldenDisk();
        return ret;
    }
}
