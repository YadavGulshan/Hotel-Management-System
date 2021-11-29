package com.mycompany.HotelReservation;

import com.itextpdf.text.Document;


public class InvoiceGenerator2 {
    int Userid;
    String Username;
    int UserPhone;
    String UserEmail;


    // Room Details var
    int RoomNumber;
    String RoomType;
    String BedType;
    int CalculatedPrice;

    // Constructor.
    InvoiceGenerator2(int id, String Name, int Phone,String Email, int Room, String Type, String Bed, int Price ){
        Userid = id;
        Username = Name;
        UserEmail = Email;
        RoomNumber = Room;
        RoomType = Type;
        BedType = Bed;
        CalculatedPrice = Price;
    }
    public static void addMetaData(Document document){

    }

}
