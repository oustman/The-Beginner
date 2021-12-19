/*package com.epam.pmt.servicetest;


import com.epam.pmt.entities.Group;
import com.epam.pmt.entities.MasterAccount;
import com.epam.pmt.entities.PasswordAccount;
import com.epam.pmt.repository.PasswordAccountRepository;
import com.epam.pmt.service.PasswordAccountService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.springframework.test.util.AssertionErrors.assertTrue;

public class MasterAccountServiceTest {
    @InjectMocks
    PasswordAccountService accountservice;
    @Mock
    PasswordAccountRepository accountrepo;
    @Mock
    MasterAccount master;
    PasswordAccount account;
    Group group;
    Account account2=null;
    @BeforeEach
    public void setUp() {
        account=new Account();
        account.setGroupname("google");
        account.setPassword("Pavi@1234");
        account.setUrl("https://googledrive.com");
    }
    @Test
    void testDeleteAccount() {

        when(accountrepo.findByUrlAndMaster("https://googledrive.com", master)).thenReturn(account);
        when((accountrepo.findByUrlAndMaster("https://epam.com",master))).thenReturn(account2);
        assertTrue(accountservice.("google","Hi"));
        assertFalse(accountservice.deletePasswordAccount("https://epam.com","Hello"));
    }
    @Test
    void testUpdateAccountPassword() {



        when(accountrepo.findByUrlAndMaster("https://googledrive.com", master)).thenReturn(account);
        when((accountrepo.findByUrlAndMaster("https://epam.com",master))).thenReturn(account2);
        assertTrue(accountservice.updateAccountPassword("https://googledrive.com","King@1234"));
        assertFalse(accountservice.updateAccountPassword("https://epam.com","King@1234"));
    }
    @Test
    void testUpdateAccountUsername() {


        when(accountrepo.findByUrlAndMaster("https://googledrive.com", master)).thenReturn(account);
        when((accountrepo.findByUrlAndMaster("https://epam.com",master))).thenReturn(account2);
        assertTrue(accountservice.updateAccountUsername("https://googledrive.com","King"));
        assertFalse(accountservice.updateAccountUsername("https://epam.com","King"));
    }


    @Test
    void testReadPassword() {

        when((accountrepo.findByUrlAndMaster("https://googledrive.com",master))).thenReturn(account);
        when((accountrepo.findByUrlAndMaster("https://epam.com",master))).thenReturn(account2);
        assertEquals("Pavi@1234",accountservice.readPassword("https://googledrive.com"));
        assertEquals("not present",accountservice.readPassword("https://epam.com"));
    }

    @Test
    void testCreateAccount() {
        when((accountrepo.findByUrlAndMasterAndGroupname("https://googledrive.com", master,"google"))).thenReturn(account2);
        when((accountrepo.findByUrlAndMasterAndGroupname("https://epam.com", master,"google"))).thenReturn(account);
        assertTrue(accountservice.createAccount("google", "https://googledrive.com", "Pavi@1234", "praveen"));
        assertFalse(accountservice.createAccount("google", "https://epam.com", "Pavi@1234", "praveen"));
    }
    @Test
    void testViewAllAccounts() {
        when(accountrepo.findAll()).thenReturn(null);
        assertEquals(null,accountservice.viewAllAccounts());

    }
}
*/