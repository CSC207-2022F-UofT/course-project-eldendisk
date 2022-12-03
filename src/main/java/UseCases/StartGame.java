package UseCases;
import Entities.Game;
import Entities.Player;
import java.io.IOException;

public interface StartGame {
    Game StartGame(Player player, int id) throws IOException;
}
