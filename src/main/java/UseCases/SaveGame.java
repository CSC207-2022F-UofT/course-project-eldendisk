package UseCases;
import Entities.Game;
import Entities.GameStorage;
import java.io.IOException;

public class SaveGame {
    /**
     * The Use Case responsible for saving the Game to GameStorage.
     *
     * @param game that needs to be saved to the GameStorage
     * @return boolean indicating whether save succeeded.
     * @throws IOException
     */

    public static boolean save(Game game) throws IOException {
        GameStorage.Add(GetInfo(game));
        return true;
    }

    public static String GetInfo(Game game) {
        StringBuilder sb = new StringBuilder();
        sb.append(game.GetId() + ",");
//        sb.append()
        sb.append(game.GetLevel() + ",");
        return sb.toString();
    }

    }

