package com.mycompany.mavenproject1;

import java.io.File;
import java.io.IOException;
import java.time.ZoneOffset;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType0Font;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class invoicegenerator {
    public static void main(String[] args) throws IOException {
//        Checkout data = new Checkout();
        String filename = "out/invoices/invoice.pdf";
        String Title = "Hotelopedia";
        String Address = "Somewhere on Planet Earth";
//        String Name = data.toString();

        PDDocument doc = new PDDocument();
        try {
            PDPage page = new PDPage();
            doc.addPage(page);

            PDFont font = PDType0Font.load(doc, new File("/home/Gulshan/Downloads/Roboto/Roboto-Regular.ttf"));

            PDPageContentStream contents = new PDPageContentStream(doc, page);

            form("Name: ", "Gulshan Yadav", 700, font, contents);
            form("Address: ", "A.P. SHAH INSTITUTE OF TECHNOLOGY, KASARVADAVLI, THANE WEST", 680, font, contents);
            form("Phone: ", "7977421559", 660, font, contents);
            form("CheckIn Details: ", "Timestamp", 640, font, contents);
            form("Checkout Details: ", "Timestamp", 620, font, contents);
            form("Invoice Id: ", "#KJDNCD5", 720, font, contents);
            form("Total Amount: ", "₹10000000", 600, font, contents);
            AddData(Title, font, 20, 50, 100, contents);
            AddData(Address, font, 10, 50, 120, contents);


            contents.close();

            doc.save(filename);
        } finally {
            doc.close();
        }
    }

    private static void AddData(String Title, PDFont font, int fontsize, int tx, int ty, PDPageContentStream contents) throws IOException {
        contents.beginText();
        contents.setFont(font, fontsize);
        contents.newLineAtOffset(tx, ty);
        contents.showText(Title);
        contents.endText();
    }

    private static void form(String Key, String value, int ty, PDFont font, PDPageContentStream contents) throws IOException {
        AddData(Key, font, 16, 50, ty, contents);
        AddData(value, font, 12, 180, ty, contents);

    }
}
