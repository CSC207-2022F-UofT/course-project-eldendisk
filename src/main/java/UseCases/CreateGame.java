package UseCases;

import Entities.Game;
import Entities.GameStorage;
import Entities.Player;

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
    public Game StartGame(Player player, int id) throws IOException {
        int new_id = GameStorage.GetLatestId() + 1;
        Game ret = new Game(player, new_id);
        return ret;
    }
}
