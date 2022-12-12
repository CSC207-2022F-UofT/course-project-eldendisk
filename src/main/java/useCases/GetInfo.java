package useCases;

import entities.player.Gunslinger;
import entities.player.Mage;
import entities.player.Player;
import entities.TempEldenDisk;

public class GetInfo {
    public static String getInfo(TempEldenDisk game) {

        Player p = game.getPlayer();
        StringBuilder sb = new StringBuilder();
        sb.append(game.GetId() + ",");
        sb.append(game.getGameLvl() + ",");
        sb.append(p.player_level + "," + p.name + "," + p.damageMultiplier + "," + p.HP + "," + p.XP + ",");
        if (p instanceof Gunslinger){sb.append("Gunslinger,");}
        else if (p instanceof Mage){sb.append("Mage,");}
        else {sb.append("Samurai,");}

        return sb.toString();

    }
}
