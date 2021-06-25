package ru.pflb.ershov.fastversion.schemaPdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfCopy;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;

public class PdfOriginalSchema {
    public static void main(String[] args) throws DocumentException, IOException{
        PdfReader reader = new PdfReader("10.письмо.pdf");
        Document document = new Document(PageSize.A4, 55, 50, 55, 50);
        FileOutputStream stream = new FileOutputStream("schema2_" + 1 + ".pdf");
        // PdfWriter writer = PdfWriter.getInstance(document, stream);
        PdfCopy pdfCopy = new PdfCopy(document, stream);
        document.open();
        for(int i = 0; i<10; i++) {
            pdfCopy.addDocument(reader);
            pdfCopy.freeReader(reader);
        }
        document.close();
        reader.close();
        pdfCopy.close();


    }
   // public void createOriginal() throws DocumentException, IOException {}



}
