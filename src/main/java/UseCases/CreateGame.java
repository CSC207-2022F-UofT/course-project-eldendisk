package UseCases;

import Entities.Game;

public class CreateGame {

    public Game MakeGame(Player player, Map map, String name){
        return game = new Game(player, map, name);
    }
}
