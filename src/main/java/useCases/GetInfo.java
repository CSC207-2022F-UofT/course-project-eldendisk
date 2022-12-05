package useCases;

import entities.Game;
import entities.Player;

public class GetInfo {
    public static String getInfo(Game game) {

        Player p = game.GetPlayer();
        StringBuilder sb = new StringBuilder();
        sb.append(game.GetId() + ",");
        sb.append(game.GetLevel() + ",");
        sb.append(p.player_level + p.name + p.damageMultiplier + p.HP + p.XP);
        return sb.toString();

    }
}
