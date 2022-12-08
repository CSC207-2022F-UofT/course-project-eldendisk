package useCases;

import entities.*;


import java.io.*;


public class LoadGame{
    /**
     * The Use Case that loads an old Game which the User picked to restart. If chosen game is not found, would start a
     * new game instead.
     *
     * @param id of the Game
     * @return A Game to be started.
     * @throws IOException
     */
    public TempEldenDisk ResumeGame(int id) throws IOException {
        int not_found = 0;
        String[] info = GameStorage.FindGame(id);
            if (Integer.parseInt(info[0]) != not_found){
                TempEldenDisk g = new TempEldenDisk();
                if (info[7].equals("Gunslinger")){
                    Player p = new Gunslinger(info[3]);
                    p.setHP(Integer.parseInt(info[5]));
                    p.setXP(Integer.parseInt(info[6]));
                    p.setDamageMultiplier(Integer.parseInt(info[4]));
                    g.setPlayer(p);}

                else if (info[7].equals("Mage")){
                    Player p = new Mage(info[3]);
                    p.setHP(Integer.parseInt(info[5]));
                    p.setXP(Integer.parseInt(info[6]));
                    p.setDamageMultiplier(Integer.parseInt(info[4]));
                    g.setPlayer(p);
                    }

                else{Player p = new Samurai(info[3]);
                    p.setHP(Integer.parseInt(info[5]));
                    p.setXP(Integer.parseInt(info[6]));
                    p.setDamageMultiplier(Integer.parseInt(info[4]));
                    g.setPlayer(p);
                    }

                g.SetId((Integer.parseInt(info[0])));
                g.SetLvl(Integer.parseInt(info[1]));


            return g;
        }
        return new TempEldenDisk();
    }


}
