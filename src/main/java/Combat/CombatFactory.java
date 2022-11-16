package Combat;

import java.util.Objects;
import Player_Types.Player;

public class CombatFactory {
    public static Combat createCombat(Player player, String combatType) {
        if (Objects.equals(combatType, "Boss")) {
            return new BossCombat(player);
        } else if (Objects.equals(combatType, "Normal")) {
            return new NormalCombat(player);
        } else { //
            return null;
    }
    };

}
