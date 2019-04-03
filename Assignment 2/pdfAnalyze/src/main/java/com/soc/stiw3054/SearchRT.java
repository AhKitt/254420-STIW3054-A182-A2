package com.soc.stiw3054;

public class SearchRT implements Runnable{

    String lines[];
    
    public SearchRT(String lines[]){
        this.lines = lines;
    }

    //Display information of STIW3054
    public void run(){
        System.out.println("Information of STIW3054: ");
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        for(String lines : lines){
            if(lines.contains("STIW3054")){
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