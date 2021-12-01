package com.mycompany.HotelReservation;
import  javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SmtpHandler {
    private static final String EMAIL = "gulshanprojects@gmail.com";

    // APP PASSWORD

    // TO Generate:
    // Ensure that 2-step verification is enabled in your google account.
    // head over to my account page
    // Enable the app password, select other as the application
    // set app name to `hotelopedia` then hit enter
    // paste the generated password here.
    private static final String PASSWORD = "zecansstrnbblopo";

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

    // That's it, easy peasy!
    public static void main(String[] args) throws MessagingException {
        SmtpHandler.sendEmail("yadavgulshan542@gmail.com",
                "Test email",
                "<h2>Testing Emailing!</h2><p>hi there!</p>");
    }
}
