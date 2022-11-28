package Entities;

public class Game {
    private int level = 0;
    private int game_id;
    private Player player;


    public Game(Player player, int id){
        this.game_id = id;
        this.player = player;
    }
    public Game(Player player, int id, int lv){
        this.game_id = id;
        this.player = player;
        this.level = lv;
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


}

