package com.soc.stiw3054;

public class CalSOC implements Runnable{

    private String lines[];
    private int count = 0;

    public CalSOC(String lines[]) {
        this.lines = lines;
    }

    //Calculate total number of SOC courses
    public void run(){
        System.out.println("Total number of SOC courses: ");
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        for(String lines : lines){
            if(lines.contains("STIA") || lines.contains("STQM") || lines.contains("STID") ||
               lines.contains("STIJ") || lines.contains("STIX") || lines.contains("STIN") ||
               lines.contains("STIK1") || lines.contains("STIW") || lines.contains("STQS") ||
               lines.contains("STIK2") || lines.contains("STIK3")){
                   count++;
            }
        }
        System.out.println(Thread.currentThread().getName() + " " +count);
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println();
    }
}