package com.epam.pmt.testservice;


import com.epam.pmt.entities.MasterAccount;
import com.epam.pmt.repository.MasterAccountRepository;
import com.epam.pmt.service.GroupService;
import com.epam.pmt.service.MasterAccountService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@WebMvcTest(MasterAccountService.class)
@ContextConfiguration(classes = {MasterAccountService.class})
@ExtendWith(MockitoExtension.class)
public class MasterAccountServiceTests {

    @Autowired
    MockMvc mockMvc;

    MasterAccountService masterAccountService;
    @Autowired
    private MasterAccountRepository masterAccountRepository;


    /*@Test
    void testStoreAccountDetails() throws Exception {
        when(masterAccountRepository.existsByUserName("Vikrant")).thenReturn(false);
        MasterAccount masterAccount = new MasterAccount();
        masterAccount.setUserName("Vikrant");
        masterAccount.setPassword("password");
        masterAccount.setFullName("Vikrant_dwivedi");
        assertTrue(masterAccountService.storeAccountDetails(masterAccount));
    }*/
}
