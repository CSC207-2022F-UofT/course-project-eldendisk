package useCases;

import entities.*;


import java.io.*;


public class LoadGame implements StartGame{
    /**
     * The Use Case that loads an old Game which the User picked to start.
     *
     * @param player player in the Game
     * @param id of the Game
     * @return A Game to be started.
     * @throws IOException
     */
    @Override
    public TempEldenDisk StartGame(Player player, int id) throws IOException {
        int i = 0;
        String[] info = GameStorage.FindGame(id);
            if (Integer.parseInt(info[0]) != i){
                TempEldenDisk g = new TempEldenDisk();
                if (info[7].equals("Gunslinger")){
                    Player p = new Gunslinger(info[3]);
                    g.setPlayer(p);}

                else if (info[7].equals("Mage")){
                    Player p = new Mage(info[3]);
                    g.setPlayer(p);
                    p.setHP(Integer.parseInt(info[5]));
                    p.setXP(Integer.parseInt(info[6]));
                    p.setDamageMultiplier(Integer.parseInt(info[4]));}

                else{Player p = new Samurai(info[3]);
                    g.setPlayer(p);
                    p.setHP(Integer.parseInt(info[5]));
                    p.setXP(Integer.parseInt(info[6]));
                    p.setDamageMultiplier(Integer.parseInt(info[4]));}

                g.SetId((Integer.parseInt(info[0])));
                g.SetLvl(Integer.parseInt(info[1]));


            return g;
        }
        return new TempEldenDisk();
    }


}
