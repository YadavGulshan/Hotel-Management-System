package com.mycompany.mavenproject1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
//
public class InvoiceGenerator2 {
    public static void main(String args[]) {
//created PDF document instance
        Document doc = new Document();
        try {
//generate a PDF at the specified location
            PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream("out/invoices/Motivation.pdf"));
            System.out.println("PDF created.");
//opens the PDF
            doc.open();
//adds paragraph to the PDF file
            doc.add(new Paragraph("If you're offered a seat on a rocket ship, don't ask what seat! Just get on."));
//close the PDF file
            doc.close();
//closes the writer
            writer.close();
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
