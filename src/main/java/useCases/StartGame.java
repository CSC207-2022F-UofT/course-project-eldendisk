package useCases;

import entities.Player;
import entities.TempEldenDisk;


import java.io.IOException;

public interface StartGame {
    TempEldenDisk StartGame(Player player, int id) throws IOException;
}
