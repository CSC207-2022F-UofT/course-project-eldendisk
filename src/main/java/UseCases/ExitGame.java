package UseCases;

import Entities.Game;

import java.io.IOException;

public class ExitGame {

    public void Exit(Game game) throws IOException {
        SaveGame.save(game);
    }

}
