package UseCases;

import Entities.Game;

public class CreateGame {

    public Game MakeGame(Player player, Map map, String name){
        return new Game(player, map, name);
    }

}
