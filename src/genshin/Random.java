package genshin;

import java.util.Calendar;
import java.util.Date;

public class Random {
    int seed;
    Random(short seed){
        this.seed = seed;
    }
    Date date = new Date();
    double secretSeed = date.getTime();

    int getRandomCapped(int cap){
        return (int) ((seed*secretSeed)%cap);
    }
}
