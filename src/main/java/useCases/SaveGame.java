package useCases;
import entities.Game;
import entities.GameStorage;
import java.io.IOException;
import entities.Player;
import ui.TempEldenDisk;

public class SaveGame {


    /**
     * The Use Case responsible for saving the Game to GameStorage.
     *
     * @param game that needs to be saved to the GameStorage
     * @return boolean indicating whether save succeeded.
     * @throws IOException
     */

    public static boolean save(TempEldenDisk game) throws IOException {
        GameStorage.Add(GetInfo.getInfo(game));
        return true;
    }


    }
