package com.epam.pmt.servicetest;


import com.epam.pmt.controllers.GroupController;
import com.epam.pmt.controllers.PasswordAccountController;
import com.epam.pmt.entities.PasswordAccount;
import com.epam.pmt.service.PasswordAccountService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest(PasswordAccountController.class)
@ContextConfiguration(classes = {PasswordAccountController.class})
@ExtendWith(MockitoExtension.class)
public class PasswordAccountControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    PasswordAccountService passwordAccountService;


    @Test
    void testReadPassword() throws Exception{

        mockMvc.perform(get("/passwordAccountForm")).andExpect(status().isOk()).andExpect(view().name("passwordAccountForm"));
    }
   /* @Test
    void testStoreAccountDetailsforValidData() {
        PasswordAccount passwordAccount = new PasswordAccount();
        passwordAccount.setAccountName("anything");
        passwordAccount.setPassword("password");
        passwordAccount.setUrl("www.cool.com");
      when(passwordAccountService.storePasswordAccountDetails(passwordAccount,"socail")).thenReturn(true);
      mockMvc.

    }*/
    @Test
    void testDisplayAccountName() throws Exception{
        when(passwordAccountService.getPasswordAccount("social","users")).thenReturn(new PasswordAccount());
                mockMvc.perform(post("/displaySpecificAccount?groupName=social&accountName=users")).andExpect(view().name("displaySpecificAccount"));

    }

    @Test
    void testDeleteAccount() throws Exception {
        mockMvc.perform(post("/deleteSpecificAccount?groupName=social&accountName=lila")).andExpect(view().name("deleteSpecificAccount"));
    }

    /*@Test
    void testUpdateAccount() throws Exception {
        mockMvc.perform(post("/updateAccount?groupName=social&accountName=facebook")).andExpect(status().isOk()).andExpect(view().name("demo"));
    }*/
}
