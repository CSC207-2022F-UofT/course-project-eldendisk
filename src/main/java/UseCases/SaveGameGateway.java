package UseCases;
import Entities.Game;

public interface SaveGameGateway {
    //retrieve stats from Player AND Game
    //From Player: Player stats, (all info about players, except the inventory)
    //From Game: Level, Name
    //Turn them into String..? To be added to the csv file

    String GetInfo(Game game, Player player);
}
