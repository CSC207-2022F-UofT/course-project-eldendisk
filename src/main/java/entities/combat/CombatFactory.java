package entities.combat;

import entities.player.Player;
//import Player_Types.Player;

import java.util.Objects;

public class CombatFactory {
    // CombatFactory calls createCombat method and return Combat instance.
    // createCombat takes Player player, String combatType and int gameLevel.
    // combatType is either "Boss" for Boss Combat or "Normal" for Normal Combat.
    public static Combat createCombat(Player player, String combatType, int gameLevel) {
        // Create Combat according to the combatType.
        if (Objects.equals(combatType, "Boss")) {
            return new BossCombat(player, gameLevel);

        } else {
            return new NormalCombat(player, gameLevel);

    }
    }

}
