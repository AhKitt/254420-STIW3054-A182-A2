package com.soc.stiw3054;

public class SOCList implements Runnable{

    String lines[];

    public SOCList(String lines[]){
        this.lines = lines;
    }

    //List out SOC Courses
    public void run(){
        System.out.println("List of SOC courses: ");
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
                System.out.println(Thread.currentThread().getName() + " " +lines);
                try{
                    Thread.sleep(2000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
        System.out.println();
    }
}