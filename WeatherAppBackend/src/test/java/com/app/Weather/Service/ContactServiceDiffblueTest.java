package com.app.Weather.Service;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.app.Weather.Entity.Contact;
import com.app.Weather.Repo.ContactRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {ContactService.class})
@ExtendWith(SpringExtension.class)
class ContactServiceDiffblueTest {
    @MockBean
    private ContactRepo contactRepo;

    @Autowired
    private ContactService contactService;

    @MockBean
    private JavaMailSender javaMailSender;


    @Test
    void testSendSimpleMessage() throws MailException {
        Contact contact = new Contact();
        contact.setEmail("jane.doe@example.org");
        contact.setId(1L);
        contact.setMessage("Not all who wander are lost");
        contact.setName("Name");
        when(contactRepo.save(Mockito.<Contact>any())).thenReturn(contact);
        doNothing().when(javaMailSender).send(Mockito.<SimpleMailMessage>any());

        Contact contactForm = new Contact();
        contactForm.setEmail("jane.doe@example.org");
        contactForm.setId(1L);
        contactForm.setMessage("Not all who wander are lost");
        contactForm.setName("Name");
        contactService.sendSimpleMessage(contactForm);
        verify(contactRepo).save(Mockito.<Contact>any());
        verify(javaMailSender).send(Mockito.<SimpleMailMessage>any());
    }
}
