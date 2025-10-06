package genshin.util;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class CustomDate {
    private int day;
    private int month;
    private int year;
    CustomDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    private static final int[] daysPerMonth = {31,28,31,30,31,30,31,31,30,31,30,31};


    private void isYearLeap(){
        if(year % 4 == 0 && year % 100 != 0){
            daysPerMonth[1] = 29;
        }
    }

    public int toInt(){
        isYearLeap();

        int sum = 0;
        sum += day;

        if(month-2 < daysPerMonth.length && month-2 > -1){
            sum += daysPerMonth[month-2];
            for (int i = 0; i < month-2; i++) {
                sum+= daysPerMonth[i];
            }
        }

        sum += year*365;

        return sum;
    }

    @Override
    public String toString () {
        return (day + "." + month + "." + year);
    }

    public void changeDateBy(int shift){

        if(day + shift < 1){
            if(month - 1 < 1){
                month = 12;
                day = daysPerMonth[month-1]-1;
                year--;
            } else{
                month--;
                day = daysPerMonth[month];
            }

        } else{
            day += shift;
        }



    }


    public static void main (String[] args) {
        CustomDate customDate = new CustomDate(5,10,2025);
        System.out.println(customDate.toInt());
        customDate.changeDateBy(-365);
        System.out.println(customDate.toInt());
        System.out.println(customDate);
    }

}
