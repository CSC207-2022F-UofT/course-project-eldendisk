package useCases;

import entities.Player;
import entities.TempEldenDisk;

public class GetInfo {
    public static String getInfo(TempEldenDisk game) {

        Player p = game.getPlayer();
        StringBuilder sb = new StringBuilder();
        sb.append(game.GetId() + ",");
        sb.append(game.getGameLvl() + ",");
        sb.append(p.player_level + "," + p.name + "," + p.damageMultiplier + "," + p.HP + "," + p.XP);
        return sb.toString();

    }
}
