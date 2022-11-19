package UseCases;

import Entities.GameStorage;

import java.io.IOException;

public class DeleteGame {
    public boolean Delete(int id) throws IOException {
        GameStorage.Remove(id);
        return true;
    }
}

