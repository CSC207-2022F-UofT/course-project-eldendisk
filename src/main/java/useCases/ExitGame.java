package useCases;

import entities.Game;

import java.io.IOException;

public class ExitGame {
    /**
     * The Use Case responsible for exiting the Game, i.e. Saves the Game in the GameStorage and quit the Game.
     * @param game in the User input
     * @throws IOException
     */

    public void Exit(Game game) throws IOException {
        SaveGame.save(game);
    }

}
