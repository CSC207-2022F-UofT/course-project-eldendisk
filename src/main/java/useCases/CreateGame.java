package useCases;

import entities.Player;
import entities.TempEldenDisk;

import java.io.IOException;



public class CreateGame{
    /**
     * The Use Case which creates a new TempEldenDisk(game) with the input Player.
     * @return A new TempEldenDisk(game) with the input Player.
     * @throws IOException when TempEldenDisk(game) is not created successfully.
     */

    public TempEldenDisk StartGame() throws IOException {
        return new TempEldenDisk();
    }
}
