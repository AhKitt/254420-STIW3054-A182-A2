package com.soc.stiw3054;

public class CalCourse implements Runnable{

    private String lines[];
    private int count = 0;

    public CalCourse(String lines[]){
        this.lines = lines;
    }

    //Calculate total number of courses
    public void run(){
        System.out.println("Total number of courses: ");
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        for(String lines : lines){
            if(lines.contains("5/2019") || lines.contains("6/2019")){
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