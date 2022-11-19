package Entities;

public class Game {
    private int level = 0;
    private int game_id;
    private Player player;
    private Map map;

    public Game(Player player, Map map, int id){
        this.game_id = id;
        this.map = map;
        this.player = player;
    }
    public boolean SetLevel(int lv) {
        this.level = lv;
        return true;
    }
    public int GetId () {
        return this.game_id;
    }
}

