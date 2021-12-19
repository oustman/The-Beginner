/*package com.epam.pmt.servicetest;

import com.epam.pmt.entities.Group;
import com.epam.pmt.entities.MasterAccount;
import com.epam.pmt.entities.PasswordAccount;
import com.epam.pmt.repository.GroupRepository;
import com.epam.pmt.repository.PasswordAccountRepository;
import com.epam.pmt.service.GroupService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

@ExtendWith(MockitoExtension.class)
public class GroupServiceTest {

Group group;
    GroupRepository groupRepository;
    @Mock
    PasswordAccount passwordAccount;
    @Mock
    MasterAccount masterAccount;
    @Mock
PasswordAccountRepository passwordAccountRepository;
    @InjectMocks
GroupService groupService;



    List<PasswordAccount> accounts =new ArrayList<>();
    List<PasswordAccount>accounts2= new ArrayList<>();
    public void setUp() {
        PasswordAccount account =   new PasswordAccount();
        account.setAccountName("google");
        account.setUserName("Pavi@1234");
        account.setUrl("https://googledrive.com");
        accounts.add(account);
    }

    @Test
    void testViewAccounts() {
        when(passwordAccountRepository.findByAccountNameAndGroup(any(),any())).thenReturn(accounts);
        assertEquals(accounts,groupService.s("pavi"));
    }

    @Test
    void testUpdateGroupName() {
        when(passwordAccountRepository.findByAccountNameAndGroup("google",group)).thenReturn(accounts);
        when(passwordAccountRepository.findByAccountNameAndGroup("googlellc",group
        )).thenReturn(accounts2);
        assertTrue(groupService.renameGroup("google","googleapps"));
        assertFalse(groupRepository.updateGroupName("googlellc","googleapps"));
    }

    @Test
    void testDeleteByGroupAccount() {
        when(passwordAccountRepository.findByAccountNameAndGroup("google",masterAccount)).thenReturn(accounts);
        when(passwordAccountRepository.findByAccountNameAndGroup("googlellc",masterAccount)).thenReturn(accounts2);
        assertTrue(groupService.deleteGroup("google"));
        assertFalse(groupService.deleteGroup("googlellc"));
    }
}
*/