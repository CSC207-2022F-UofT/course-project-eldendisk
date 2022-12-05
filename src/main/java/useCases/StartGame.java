package useCases;
import entities.Game;

import entities.Player;
import ui.TempEldenDisk;


import java.io.IOException;

public interface StartGame {
    TempEldenDisk StartGame(Player player, int id) throws IOException;
}
