package in.co.codeplanet.QuickMart.service;

import in.co.codeplanet.QuickMart.bean.EmailDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

    @Service
    public class EmailService {
        @Autowired
        private JavaMailSender javaMailSender;
        public String sendMail(EmailDetails emailDetails)
        {
            try
            {
                SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
                simpleMailMessage.setFrom("ganeshbhambu93@gmail.com");
                simpleMailMessage.setTo(emailDetails.getRecipient());
                simpleMailMessage.setSubject(emailDetails.getSubject());
                simpleMailMessage.setText(emailDetails.getBody());
                javaMailSender.send(simpleMailMessage);
                return "Mail Send Seccessfully";
            }
            catch(Exception e)
            {
                return "Something went wrong...";
            }
        }
    }
