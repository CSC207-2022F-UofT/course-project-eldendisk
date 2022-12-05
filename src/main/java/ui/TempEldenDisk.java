package ui;

import entities.GameStorage;
import entities.Player;

import java.io.IOException;

public class TempEldenDisk {
    private Player player;
    private int gameLvl;
    private int game_id;

    public TempEldenDisk() throws IOException {
        this.player = (Player)PlayerCreation.CreateNewCharacter();
        this.gameLvl = 1;
        this.game_id = GameStorage.GetLatestId() + 1;
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