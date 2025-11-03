package genshin.util;

import java.util.Date;

public class Random {
    private short seed;
    public Random (short seed){
        this.seed = seed;
    }
    Date date = new Date();
    double secretSeed = date.getTime();

    public void changeSeed(short newSeed){
        seed = newSeed;
    }

    public int getRandomCapped (int cap){
        return (int) ((seed*secretSeed)%cap);
    }
}
