package com.mycompany.HotelReservation.template;

public class EmailBody {
    private static String name;
    private static String uid;
    private static String address;
    private static String phone;
    private static String RoomNumber;
    private static String RoomType;
    private static String CheckinDate;
    private static String amount;
    private static String  CheckOutDate;
    private static String BedType;
    public String Html;

    public EmailBody(String UserName,
                     int UserId,
                     String UserAddress,
                     String UserPhone,
                     int UserRoomNum,
                     String UserRoomType,
                     String bedType,
                     String UserCheckinDate,
                     int UserAmount,
                     String UserCheckoutDate,
                     boolean isCheckin
                     ){
        name = UserName;
        uid = String.valueOf(UserId);
        address = UserAddress;
        phone = UserPhone;
        RoomNumber = String.valueOf(UserRoomNum);
        RoomType = UserRoomType;
        CheckinDate = UserCheckinDate;
        amount = String.valueOf(UserAmount);
        CheckOutDate = UserCheckoutDate;
        BedType = bedType;

        if (isCheckin) {
           Html =  CheckInHtml();
        } else {
           Html =  CheckOutHtml();
        }

    }
//    public static final String CheckInHTML = ;
    public String CheckInHtml(){
      return   String.format("<div style=\"display: block; font-size: large; padding: 2rem;\"> Dear Customer,<br> <br> We have received your check-in request. <br> Please find the details below: <br> <div style=\"padding-top: 2rem; font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif; line-height: 2rem;\"> User id: %s <br> Name: %s <br> Address: %s <br> Phone: %s <br> Room number: %s <br> Room type: %s <br> Check in date: %s <br> Price per day: Rs. %s </div>",uid,name, address,phone, RoomNumber, RoomType, CheckinDate, amount);
    }

//    public static final String CheckOutHTML =
    String CheckOutHtml(){
        return String.format("<div style=\"display: block; font-size: large; padding: 2rem;\"> Dear Customer,<br> <br> We have received your check-out request. <br> Please find the details below: <br> <div style=\"padding-top: 2rem; font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif; line-height: 2rem;\"> User id: %s <br> Name: %s <br> Address: %s <br> Phone: %s <br> Room number: %s <br> Room type: %s <br> Check in date: %s <br> Check out date: %s <br> Total amount: Rs. %s </div> <br> We hope to see you again soon.",uid,name, address,phone, RoomNumber, RoomType, CheckinDate,CheckOutDate, amount);
    }
}
