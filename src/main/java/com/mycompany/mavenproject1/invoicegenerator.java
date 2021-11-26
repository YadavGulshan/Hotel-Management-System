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
        Checkout data = new Checkout();
        String filename = "out/invoices/invoice.pdf";
        String Title = "Hotelopedia";
        String Address = "Somewhere on Planet Earth";
        String Name = data.toString();

        PDDocument doc = new PDDocument();
        try {
            PDPage page = new PDPage();
            doc.addPage(page);

            PDFont font = PDType0Font.load(doc, new File("/home/Gulshan/Downloads/Roboto/Roboto-Regular.ttf"));

            PDPageContentStream contents = new PDPageContentStream(doc, page);

            AddData("Name: ", font, 10, 50, 700, contents); AddData("Gulshan Yadav", font, 10, 80, 700, contents );
            AddData(Title, font,16,50,100, contents);
            AddData(Address, font, 10, 50, 120,contents);


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
}
