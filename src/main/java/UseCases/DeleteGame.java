package UseCases;

import Entities.GameStorage;

import java.io.IOException;

public class DeleteGame {
    /**
     * The Use Case responsible for deleting a stored Game from the GameStorage.
     *
     * @param id of the Game
     * @return boolean indicating whether delete of the Game was successful.
     * @throws IOException when the process of finding the id went wrong, could be the Id does not exist.
     */
    public boolean Delete(int id) throws IOException {
        GameStorage.Remove(id);
        return true;
    }
}

