package UI;

import entities.Player;

import java.util.Scanner;

public class TempEldenDisk {
    private Player player;
    private int gameLvl;

    public TempEldenDisk() {
        this.player = (Player)PlayerCreation.CreateNewCharacter();
        this.gameLvl = 1;
    }

    public int getGameLvl() {return this.gameLvl; }

    public void increaseGameLvl() {this.gameLvl++;}


    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

}