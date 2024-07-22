package com.app.Weather.Controller;

import com.app.Weather.Entity.Contact;
import com.app.Weather.Service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "http://localhost:4200")
public class ContactController {

    @Autowired
    private ContactService emailService;

    @PostMapping
    public void handleContactForm(@RequestBody Contact contactForm) {
        emailService.sendSimpleMessage(contactForm);
    }
}
