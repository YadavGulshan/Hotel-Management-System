package com.mycompany.HotelReservation;
import com.mycompany.HotelReservation.env.env;
import com.mycompany.HotelReservation.template.EmailBody;

import  javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SmtpHandler  extends env {
    private static final String EMAIL = env.Email;

    // APP PASSWORD

    // TO Generate:
    // Ensure that 2-step verification is enabled in your google account.
    // head over to my account page
    // Enable the app password, select other as the application
    // set app name to `hotelopedia` then hit enter
    // paste the generated password here.
    private static final String PASSWORD = env.Password;

    // Vars
    private static String recipientEmail;
    private static String mailSubject;
    private static String recipientName;
    private static long recipientPhone;
    private static String recipientAddress;
    private static int recipientRoom;
    private static String recipientRoomType;
    private static String recipientBedType;
    private static int recipientBillAmount;
    private static String recipientCheckinDate;
    private static boolean recipientIsCheckin; // For knowing which template to use
    private static String recipientCheckoutDate;


    // SMTP constructor here.
    SmtpHandler(String email,
                String subject,
                String Name,
                long Phone,
                String Address,
                int Room,
                String Type,
                String Bed,
                int Price,
                String checkinDate,
                boolean isCheckin,
                // if checkIn is false then just pass an empty string here.
                String checkoutDate
                ){
        recipientEmail = email;
        mailSubject = subject;
        recipientName = Name;
        recipientPhone = Phone;
        recipientAddress = Address;
        recipientRoom = Room;
        recipientRoomType = Type;
        recipientBedType = Bed;
        recipientBillAmount = Price;
        recipientCheckinDate = checkinDate;
        recipientIsCheckin = isCheckin;
        recipientCheckoutDate = checkoutDate;
    }
    public static void sendEmail(String to, String subject, String body) throws MessagingException {
        System.out.println("Creating session!");
        Session session = createSession();

        // Creating a message.
        MimeMessage message = new MimeMessage(session);
        prepareEmailMessage(message, to, subject, body);

        // Finally, Send this email!
        Transport.send(message);
        System.out.println("Email sent!");
    }

    private static void prepareEmailMessage(MimeMessage message, String to, String subject, String body) throws MessagingException {
        message.setContent(body, "text/html; charset=utf-8");
        message.setFrom(new InternetAddress(EMAIL));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
        message.setSubject(subject);
    }

    private static Session createSession() {
        Properties props = new Properties();

        // Enabling authentication.
        props.put("mail.smtp.auth", "true");

        // Enabling tls for secure connection
        props.put("mail.smtp.starttls.enable", "true");

        // Setting the host smtp server as gmail
        props.put("mail.smtp.host", "smtp.gmail.com");

        // The port our program will hit. In order to send the email
        props.put("mail.smtp.port", "587");


        // Passing the credentials and return the response.
        return Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(EMAIL, PASSWORD);
            }
        });
    }
    // Fun!
    public static final String jobs[] = {"baking some cakes!", "cleaning my room!", "completing my assignments!","eating my favourite dish!"};

    // That's it, easy peasy!
    public static void main(String[] args) throws MessagingException {

        // Generating random ints
        int randomNum = (int) (Math.random()*(jobs.length-0+1)+0);

        // Some fun stuff!
        System.out.println("Ugh, I was " + jobs[randomNum]);
        System.out.println("Okay sending this mail, you guys won't let me live my life naa?\nI hate you!\uD83D\uDE2D\n\n");

        // Send email to whom? and what to send?
        System.out.println("Send email to "+ recipientEmail);

        // Object of Email Body class
        EmailBody eb = new EmailBody(
            recipientName,
            0,
            recipientAddress,
            recipientPhone,
            recipientRoom,
            recipientRoomType,
            recipientBedType,
            recipientCheckinDate,
            recipientBillAmount,
            recipientCheckoutDate // If checking in, then pass null.
        );
        SmtpHandler.sendEmail(recipientEmail,
                mailSubject,
                recipientIsCheckin? EmailBody.CheckInHTML:EmailBody.CheckOutHTML);
    }
}
