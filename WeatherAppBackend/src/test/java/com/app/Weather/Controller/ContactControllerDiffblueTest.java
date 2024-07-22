package com.app.Weather.Controller;

import com.app.Weather.Entity.Contact;
import com.app.Weather.Service.ContactService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {ContactController.class})
@ExtendWith(SpringExtension.class)
class ContactControllerDiffblueTest {
    @Autowired
    private ContactController contactController;

    @MockBean
    private ContactService contactService;


    @Test
    void testHandleContactForm() throws Exception {
        Contact contact = new Contact();
        contact.setEmail("jane.doe@example.org");
        contact.setId(1L);
        contact.setMessage("Not all who wander are lost");
        contact.setName("Name");
        String content = (new ObjectMapper()).writeValueAsString(contact);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/contact")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(contactController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().is(405));
    }
}
