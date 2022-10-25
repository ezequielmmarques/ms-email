package com.ms.mail.services;

import com.ms.mail.enums.StatusEmail;
import com.ms.mail.models.EmailModel;
import com.ms.mail.repositories.EmailRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Slf4j
public class EmailService {

    @Autowired
    EmailRepository emailRepository;

    @Autowired
    private JavaMailSender javaMailSender;

    public EmailModel sendEmail(EmailModel emailModel) {

        emailModel.setSenDateEmail(LocalDateTime.now());
        try {
            var message = new SimpleMailMessage();
            message.setFrom(emailModel.getEmailFrom());
            message.setTo(emailModel.getEmailTo());
            message.setSubject(emailModel.getSubject());
            message.setText(emailModel.getText());
            javaMailSender.send(message);

            emailModel.setStatusEmail(StatusEmail.SENT);
        } catch ( MailException e ) {
            emailModel.setStatusEmail(StatusEmail.ERROR);
            log.error( e.getMessage() );
        } finally {
            return emailRepository.save(emailModel);
        }
    }
}
