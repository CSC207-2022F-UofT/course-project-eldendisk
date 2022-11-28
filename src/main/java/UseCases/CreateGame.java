package UseCases;

import Entities.Game;


public class CreateGame implements StartGame {

    @Override
    public Game StartGame(Player player, int id) {
        Game ret = new Game(player, id);
        return ret;
    }
}
