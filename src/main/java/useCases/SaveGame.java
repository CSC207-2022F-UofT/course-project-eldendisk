package useCases;
import entities.Game;
import entities.GameStorage;
import java.io.IOException;

public class SaveGame implements SaveGameGateway {
import entities.Player;

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

    @Override
    public String GetInfo(Game game) {
        StringBuilder sb = new StringBuilder();
        sb.append(game.GetId() + ",");
//        sb.append()
        sb.append(game.GetLevel() + ",");
    public static String GetInfo(Game game) {
        Player p = game.GetPlayer();
        StringBuilder sb = new StringBuilder();
        sb.append(game.GetId() + ",");
        sb.append(game.GetLevel() + ",");
        sb.append(p.player_level + p.name + p.damageMultiplier + p.HP + p.XP);
        return sb.toString();
    }

    }

