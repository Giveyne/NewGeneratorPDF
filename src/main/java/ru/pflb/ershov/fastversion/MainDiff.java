package ru.pflb.ershov.fastversion;

import java.io.File;

import static ru.pflb.ershov.fastversion.schemaPdf.PdfConstructorSchema2.createSchema2;
import static ru.pflb.ershov.fastversion.schemaPdf.PdfConstructorSchema3.createSchema3;

public class MainDiff {

    private static Double coefficient = 0.9;
    public static int getIntSize(int intSize, Long fileSize){
        double size =  intSize*coefficient - fileSize;
        return (int) size;
    }
    public static void main(String[] args){

        String arg1;

        try{
            for(int i = 0; i<=18; i+=2) {
             //   createSchema3(i);
                //To Ustav
                createSchema2(i);
                Thread.sleep(500);
            }


            int count=0;
            for(int longSize = 200000; longSize<=500000; longSize+=50000) {
                coefficient = coefficient-1;
                MinDiff mainDiff = new MinDiff();
                arg1 = "schema2_"+count+".pdf";
                count+=2;

                String PATH_OUT_FILE = "Устав"+longSize +".pdf";
                File file = new File(arg1);
                Long fileSize = file.length() / 1024;
                int sizeInt = getIntSize(longSize, fileSize);

                mainDiff.manipulatePdfMinDiff(arg1, sizeInt, longSize);

                File file1 = new File(PATH_OUT_FILE);

                Long fileOutSize = file1.length() / 1024;

                while (fileOutSize <= (longSize - longSize * 0.6)) {
                    System.out.println(fileOutSize + " -- " + longSize);
                    double percent = (double) (longSize - fileOutSize) / longSize;
                    System.out.println(percent);
                    coefficient = coefficient+percent;
                    System.out.println(coefficient);
                    sizeInt = getIntSize(longSize, fileSize);
                    mainDiff.manipulatePdfMinDiff(arg1, sizeInt, longSize);
                    fileOutSize = file1.length() / 1024;
                }
                Thread.sleep(500);
            }
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Wrong arguments or something went wrong");
        }
    }

}
