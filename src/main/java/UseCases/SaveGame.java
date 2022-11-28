package UseCases;
import Entities.Game;
import Entities.GameStorage;
import java.io.IOException;

public class SaveGame implements SaveGameGateway {
//Append the game to the csv file

    private String Converter(Game game){
        return GetInfo(game);}

    public static boolean save(String info) throws IOException {
        GameStorage.Add();
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
