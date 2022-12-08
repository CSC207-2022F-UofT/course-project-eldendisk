package useCases;

import entities.Player;
import entities.TempEldenDisk;

import java.io.IOException;



public class CreateGame{
    /**
     * The Use Case which creates a new Game with the input Player.
     * @return A new Game with the input Player.
     * @throws IOException when Game could not be started.
     */

    public TempEldenDisk StartGame() throws IOException {
        return new TempEldenDisk();
    }
}
