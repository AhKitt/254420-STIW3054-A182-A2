package com.soc.stiw3054;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

import java.io.File;
import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {

        //Load PDF File
        try (PDDocument document = PDDocument.load(new File("C:\\Users\\porst_fv9ali2\\Desktop\\Assignment 2\\pdfAnalyze\\src\\main\\resources\\A182 Draft Stud.pdf"))) {

            document.getClass();

            if (!document.isEncrypted()) {
			
                //Read PDF File
            	PDFTextStripperByArea stripper = new PDFTextStripperByArea();
                PDFTextStripper tStripper = new PDFTextStripper();
                stripper.setSortByPosition(true);
                String pdfFileInText = tStripper.getText(document);

                String lines[] = pdfFileInText.split("\\r?\\n");

                //Calculate Total Courses
                Thread t1 = new Thread(new CalCourse(lines), "Thread-1");
                t1.start();
                try{
                    t1.join();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }

                //Calculate Total Days
                Thread t2 = new Thread(new CalDay(), "Thread-2 ... ");
                t2.start();
                try{
                    t2.join();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                
                //Calculate SOC Courses
                Thread t4 = new Thread(new CalSOC(lines), "Thread-4 ............ ");
                t4.start();
                try{
                    t4.join();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }

                //List SOC Courses
                Thread t3 = new Thread(new SOCList(lines), "Thread-3 ......... ");
                t3.start();
                try{
                    t3.join();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }

                //Search Real-Time Course
                Thread t5 = new Thread(new SearchRT(lines), "Thread-5 ............... ");
                t5.start();
                try{
                    t5.join();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
