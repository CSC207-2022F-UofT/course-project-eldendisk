package UseCases;

import Entities.Game;

public class CreateGame {

    public Game MakeGame(Player player, Map map, int id){
        return new Game(player, map, id);
    }

}
