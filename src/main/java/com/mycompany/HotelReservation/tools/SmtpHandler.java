package com.mycompany.HotelReservation.tools;

import com.mycompany.HotelReservation.env.env;
import com.mycompany.HotelReservation.template.EmailBody;
import com.sun.source.tree.IfTree;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.io.IOException;
import java.sql.Time;
import java.util.Properties;

public class SmtpHandler extends env {
    // Fun!
    public static final String jobs[] = {"baking some cakes!" , "cleaning my room!" , "completing my assignments!" , "eating my favourite dish!"};

    // APP PASSWORD
    private static final String EMAIL = env.Email;

    private static final String PASSWORD = env.Password;
    // Vars
    private static int    recipientId;
    private static String recipientEmail;
    private static String mailSubject;
    private static String recipientName;
    private static String recipientPhone;
    private static String recipientAddress;
    private static int recipientRoom;
    private static String recipientRoomType;
    private static String recipientBedType;
    private static int recipientBillAmount;
    private static String recipientCheckinDate;
    private static boolean recipientIsCheckin; // For knowing which template to use
    private static String recipientCheckoutDate;

    // SMTP constructor here.
    public 
    SmtpHandler(
                int id,
                String email,
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
    ) throws MessagingException {
        recipientId = id;
        recipientEmail = email;
        mailSubject = subject;
        recipientName = Name;
        recipientPhone = String.valueOf(Phone);
        recipientAddress = Address;
        recipientRoom = Room;
        recipientRoomType = Type;
        recipientBedType = Bed;
        recipientBillAmount = Price;
        recipientCheckinDate = checkinDate;
        recipientIsCheckin = isCheckin;
        recipientCheckoutDate = checkoutDate;
        main();
    }

    public static void sendEmail(String to, String subject, String body) throws MessagingException {
        System.out.println("Creating session!");
        Session session = createSession();

        // Creating a message.
        Message message = new MimeMessage(session);
        prepareEmailMessage(message, to, subject, body);



        // Setting up the email body with the passed String.
        BodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setContent(body,"text/html; charset=utf-8");


        /*
         * ┌─────────────────────────────────────────────────────────────────┐
         * │                                                                 │
         * │                                                                 │
         * │    Setting up the Multipart to add body and Multipart.          │
         * │                                                                 │
         * │                                                                 │
         * │    Why??                                                        │
         * │                                                                 │
         * │    Previously I tried using the var of type `Message`           │
         * │                                                                 │
         * │                                                                 │
         * │    So what's wrong with that?                                   │
         * │                                                                 │
         * │    It doesn't allow me to add attachment. So I had to scrap     │
         * │    it off.                                                      │
         * │                                                                 │
         * │                                                                 │
         * └─────────────────────────────────────────────────────────────────┘
         */
        Multipart multipart = new MimeMultipart();

        // Adding the content into the body of email.
        multipart.addBodyPart(messageBodyPart);

        // Setting up the attachment
        MimeBodyPart attachment = new MimeBodyPart();

        // Attaching the invoice into the email.
        try {
            String Path = "out/invoices/"+recipientId+".pdf";
            System.out.println("Looking for invoice!");
            if (new File(Path).exists()) {
                System.out.println("I found the Invoice!");
                attachment.attachFile(new File(Path));
                multipart.addBodyPart(attachment);
            } else {
                System.out.println("FILE NOT FOUND!");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Setting the content of email.
        message.setContent(multipart);


        // Finally, Send this email!
        Transport.send(message);
        System.out.println("Email sent!");
    }



    // Prepare email with the details such as from, subjects, bla, bla, bla.
    private static void prepareEmailMessage(Message message, String to, String subject, String body) throws MessagingException {
        message.setFrom(new InternetAddress(EMAIL));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
        message.setSubject(subject);
    }

    private static Session createSession() {
        Properties props = new Properties();

        // Enabling authentication.
        props.put("mail.smtp.auth" , "true");

        // Enabling tls for secure connection
        props.put("mail.smtp.starttls.enable" , "true");

        // Setting the host smtp server as gmail
        props.put("mail.smtp.host" , "smtp.gmail.com");

        // The port our program will hit. In order to send the email
        props.put("mail.smtp.port" , "587");


        // Passing the credentials and return the response.
        return Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(EMAIL, PASSWORD);
            }
        });
    }

    // That's it, easy peasy!
    public static void main() throws MessagingException {

        // Generating random ints
        int randomNum = (int) (Math.random() * (jobs.length - 0 + 1) + 0);

        // Some fun stuff!
        System.out.println("Ugh, I was " + jobs[randomNum ]);
        System.out.println("Okay sending this mail, you guys won't let me live my life naa?\nI hate you!\uD83D\uDE2D\n\n");

        // Send email to whom? and what to send?
        System.out.println("Send email to " + recipientEmail);

        // Object of Email Body class
        EmailBody eb = new EmailBody(
                recipientName,
                recipientId,
                recipientAddress,
                recipientPhone,
                recipientRoom,
                recipientRoomType,
                recipientBedType,
                recipientCheckinDate,
                recipientBillAmount,
                recipientCheckoutDate,// If checking in, then pass null.
                recipientIsCheckin
        );
        SmtpHandler.sendEmail(recipientEmail,
                mailSubject, eb.Html
        );
    }
}
