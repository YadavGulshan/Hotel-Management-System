package com.mycompany.HotelReservation.template;

public class EmailBody {
    private static String name;
    private static int uid;
    private static String address;
    private static long phone;
    private static int RoomNumber;
    private static String RoomType;
    private static String CheckinDate;
    private static int amount;
    private static String  CheckOutDate;

    EmailBody(String UserName, int UserId, String UserAddress, long UserPhone, int UserRoonNum, String UserRoomType, String UserCheckinDate, int UserAmount, String UserCheckoutDate){
        name = UserName;
        uid = UserId;
        address = UserAddress;
        phone = UserPhone;
        RoomNumber = UserRoonNum;
        RoomType = UserRoomType;
        CheckinDate = UserCheckinDate;
        amount = UserAmount;
        CheckOutDate = UserCheckoutDate;
    }
    public static final String CheckInHTML = String.format("""
            <body style="margin: 0%; padding: 0%; color: black; font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;">
                <div>
                    <div>
                        <div style="display: block; font-size: large; padding: 2rem;">
                            Dear Customer,<br>
                            <br> We have received your check-in request.
                            <br> Please find the details below:
                            <br>
                            <div style="padding-top: 2rem; font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif; line-height: 2rem;">
                                User id: %d
                                <br> Name: %s
                                <br> Address: %s
                                <br> Phone: %l
                                <br> Room number: %d
                                <br> Room type: %s
                                <br> Check in date: %s
                                <br> Price per day: Rs. %d
                            </div>
                        </div>
                    </div>
            </body>
            """,uid,name, address,phone, RoomNumber, RoomType, CheckinDate, amount);
    public static final String CheckOutHTML = String.format("""
            <body style="margin: 0%; padding: 0%; color: black; font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;">
                <div>
                    <div>
                        <div style="display: block; font-size: large; padding: 2rem;">
                            Dear Customer,<br>
                            <br> We have received your check-out request.
                            <br> Please find the details below:
                            <br>
                            <div style="padding-top: 2rem; font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif; line-height: 2rem;">
                                 User id: %d
                                <br> Name: %s
                                <br> Address: %s
                                <br> Phone: %l
                                <br> Room number: %d
                                <br> Room type: %s
                                <br> Check in date: %s
                                <br> Check out date: %s
                                <br> Total amount: Rs. %d
                            </div>
                            <br> We hope to see you again soon.
                        </div>
                    </div>
            </body>
            """,uid,name, address,phone, RoomNumber, RoomType, CheckinDate,CheckOutDate, amount);
}
