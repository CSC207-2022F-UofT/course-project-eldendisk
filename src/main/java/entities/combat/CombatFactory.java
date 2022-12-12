package entities.combat;

import entities.player.Player;
//import Player_Types.Player;

import java.util.Objects;

public class CombatFactory {
    public static Combat createCombat(Player player, String combatType, int gameLevel) {
        if (Objects.equals(combatType, "Boss")) {
            return new BossCombat(player, gameLevel);

        } else {
            return new NormalCombat(player, gameLevel);

    }
    };

}
