package com.app.Weather.Service;

import com.app.Weather.Entity.Contact;
import com.app.Weather.Repo.ContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class ContactService {

    @Autowired
    private JavaMailSender emailSender;

    @Autowired
    private ContactRepo contactFormRepository;

    @Value("${spring.mail.username}")
    private String toEmail;

    public void sendSimpleMessage(Contact contactForm) {
        // Save contact form in the database
        contactFormRepository.save(contactForm);

        // Send email
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(toEmail);
        message.setSubject("Contact Form Submission");
        message.setText("Name: " + contactForm.getName() + "\nEmail: " + contactForm.getEmail() +
                "\nDescription: " + contactForm.getMessage());
        emailSender.send(message);
    }
}
