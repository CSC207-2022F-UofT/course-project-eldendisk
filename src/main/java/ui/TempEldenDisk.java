package ui;

import entities.Player;

public class TempEldenDisk {
    private Player player;
    private int gameLvl;

    private int game_id;

    public TempEldenDisk() {
        this.player = (Player)PlayerCreation.CreateNewCharacter();
        this.gameLvl = 1;
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

}