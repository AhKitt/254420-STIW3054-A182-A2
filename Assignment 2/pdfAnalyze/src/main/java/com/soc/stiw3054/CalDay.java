package com.soc.stiw3054;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class CalDay implements Runnable {

    public CalDay() {
        super();
    }

    //Calculate total exam days
    public void run() {
        System.out.println("Total exam days: ");
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        //25-May-2019, Start of exam date
        LocalDate dateBefore = LocalDate.of(2019, Month.MAY, 25);
        //20-June-2019, End of exam date
        LocalDate dateAfter = LocalDate.of(2019, Month.JUNE, 20);
        long noOfDaysBetween = (ChronoUnit.DAYS.between(dateBefore, dateAfter)) - 8;
        System.out.println(Thread.currentThread().getName() + " " +noOfDaysBetween);
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println();
    }
}