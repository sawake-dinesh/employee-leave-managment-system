package com.employee.leave.managment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

@SpringBootApplication
@EnableSwagger2

public class EmployeeleavemanagmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeleavemanagmentApplication.class, args);


        //final String username = "";
        //final String password = "";

        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("dinesh.sawake@perennialsys.com", "****");
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("from@gmail.com"));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse("dinesh.sawake@perennialsys.com")
            );
            message.setSubject("Testing mail 2 ");
            message.setText("Dear user This test mail.");

            Transport.send(message);
            System.out.println("mail sent");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }


}


