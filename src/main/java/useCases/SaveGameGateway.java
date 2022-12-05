package useCases;
import entities.Game;

public interface SaveGameGateway {
    /**
     *
     * @param game
     * @return
     */
    //retrieve stats from Player AND Game
    //From Player: Player stats, (all info about players, except the inventory)
    //From Game: Level, Name
    //Turn them into String..? To be added to the csv file

    String GetInfo(Game game);
}
