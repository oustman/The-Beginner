package com.epam.pmt.servicetest;

import com.epam.pmt.controllers.MasterAccountController;
import com.epam.pmt.service.MasterAccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.mockito.Mockito.when;



@WebMvcTest(MasterAccountController.class)
@ContextConfiguration(classes = {MasterAccountController.class})
public class MasterControllerTests {

    @Autowired
    MockMvc mockMvc;
    @MockBean
    MasterAccountService masterAccountService;

    @Test
    void testSignInMapping() throws Exception {
        mockMvc.perform(get("/signin")).andExpect(status().isOk()).andExpect(view().name("signin"));
    }

    @Test
    void testSignUpMapping() throws Exception {
        mockMvc.perform(get("/signup")).andExpect(status().isOk()).andExpect(view().name("signup"));
    }

  /*  @Test
    void testSignOutMapping() throws Exception {
        mockMvc.perform(get("/signout")).andExpect(status().isOk()).andExpect(view().name("signin"));
    }
*/
    @Test
    void testStartNewSessionForValidCredentials() throws Exception {
        when(masterAccountService.startSession("vikrant", "12345678")).thenReturn(true);
        mockMvc.perform(post("/session?userName=vikrant&password=12345678")).andExpect(status().isOk()).andExpect(view().name("menu"));
    }

    @Test
    void testStartNewSessionForInvalidCredentials() throws Exception {
        when(masterAccountService.startSession("vikrant", "pass")).thenReturn(false);
        mockMvc.perform(post("/session?userName=vikrant&password=pass")).andExpect(status().isOk()).andExpect(view().name("error"));
    }

  /*  @Test
    void testStartNewSessionForNullValues() throws Exception {
        when(masterAccountService.startSession(null, null)).thenReturn(false);
        mockMvc.perform(post("/session?")).andExpect(status().isOk()).andExpect(view().name("error"));
    }*/


}
