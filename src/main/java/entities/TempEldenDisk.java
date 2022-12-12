package entities;

import entities.player.Player;
import ui.PlayerCreation;

import java.io.IOException;

public class TempEldenDisk {
    /**
     * The EldenDisk Entity. Stores information about the player of the game, level which the player is at, and has an
     * identification number for the particular game.
     */

    private Player player;
    private int gameLvl;
    private int game_id;

    public TempEldenDisk() throws IOException {
        this.player = (Player) PlayerCreation.CreateNewCharacter();
        this.gameLvl = 1;
//        this.game_id = GetLastId() + 1;
    }

    public int getGameLvl() {return this.gameLvl; }

    public void increaseGameLvl() {this.gameLvl++;}

    public void SetLvl(int lv){
        this.gameLvl = lv;
    }
    public Player getPlayer() {
        return this.player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int GetId () {
        return this.game_id;
    }

    public void SetId(int id) {this.game_id = id;}

}