package Entities;

public class Game {
    /**
     * The Entity Game. Stores information about the player of the Game, level which the player is at, and has an
     * identification number for the particular Game.
     */
    private int level = 0;
    private int game_id;
    private Player player;
    private boolean game_end = false;


    public Game(Player player, int id){
        this.game_id = id;
        this.player = player;
    }
    public boolean SetLevel(int lv) {
        this.level = lv;
        return true;
    }
    public int GetId () {
        return this.game_id;
    }

    public Player GetPlayer(){
        return this.player;
    }

    public int GetLevel () {
        return this.level;
    }

    public void EndGame(){
        this.game_end = true;
    }


}

