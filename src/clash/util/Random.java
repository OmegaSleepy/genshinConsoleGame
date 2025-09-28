package clash.util;

import java.util.Date;

public class Random {
    int seed;
    public Random (short seed){
        this.seed = seed;
    }
    Date date = new Date();
    double secretSeed = date.getTime();

    public int getRandomCapped (int cap){
        return (int) ((seed*secretSeed)%cap);
    }
}
