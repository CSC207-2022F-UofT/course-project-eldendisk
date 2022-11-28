package UseCases;
import Entities.Game;
import Entities.GameStorage;
import java.io.IOException;

public class SaveGame implements SaveGameGateway {
//Append the game to the csv file

    public static boolean save(Game game) throws IOException {
        GameStorage.Add(Converter(game));
        return true;
    }

    @Override
    public String GetInfo(Game game) {
        StringBuilder sb = new StringBuilder();
        sb.append(game.GetId() + ",");
//        sb.append()
        sb.append(game.GetLevel() + ",");
        return sb.toString();
    }

    }
}
