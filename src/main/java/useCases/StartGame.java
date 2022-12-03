package useCases;
import entities.Game;

import java.io.IOException;

public interface StartGame {
    Game StartGame(Player player, int id) throws IOException;
}
