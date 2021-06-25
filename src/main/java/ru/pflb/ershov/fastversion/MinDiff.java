package ru.pflb.ershov.fastversion;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfFormField;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.TextField;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public class MinDiff{


    public void manipulatePdfMinDiff(String src, Integer integer, Integer name) throws DocumentException, IOException {
        PdfReader reader = new PdfReader(src);
        FileOutputStream stream = new FileOutputStream("Устав"+name+".pdf");
        PdfStamper stamper = new PdfStamper(reader, stream);
        TextField tf = new TextField(stamper.getWriter(), new Rectangle(0, 0, 0, 0), "text");
        PdfFormField field;
        File file = new File(src);
        int fileOutSize = (int) file.length()/1024;
        int loopIteration = loopSize(fileOutSize, integer)/10;

        // ~+15Kb
        for (int i = 0; i<loopIteration; i++) {
            tf.setBorderColor(BaseColor.WHITE);
            tf.setBorderWidth(0);
            tf.setTextColor(BaseColor.WHITE);
            tf.setFontSize(0);
            tf.setText("Text field");
            field = tf.getTextField();
            for(int j = 0; j<10; j++) {
                stamper.addAnnotation(field, 1);
/*                Random random = new Random();
                stamper.addAnnotation(field, random.nextInt(10 - 1) + 1);*/
            }
        }
        stamper.close();
        reader.close();
        stream.close();

    }

    private static int loopSize (int fileSize, int specifiedSize){
        double temp ;
        if(fileSize >=specifiedSize){
            return 0;
        }
        else if (fileSize <= specifiedSize*0.5) {
            temp = specifiedSize * 12;
        }
        else if (fileSize <= specifiedSize*0.7) {
            temp = specifiedSize * 8.5;
        }
        else if(fileSize <= specifiedSize*0.9){
            temp = specifiedSize * 5.5;
        }
        else if(fileSize <= specifiedSize*0.95){
            temp = specifiedSize * 1.9;
        }
        else if(fileSize <= specifiedSize*0.98){
            temp = specifiedSize * 1.5;
        }
        else {
            temp = specifiedSize * 1.1;
        }


            if(fileSize>5000){
                temp = temp * 1.1;
            }
            else if(fileSize>1000){
                temp = temp * 1.15;
            }
            else {
                temp = temp * 1.2;
            }

            specifiedSize = (int) temp-fileSize;
        return specifiedSize;
    }
}
