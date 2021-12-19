package com.epam.pmt.testservice;

import com.epam.pmt.controllers.GroupController;
import com.epam.pmt.entities.MasterAccount;
import com.epam.pmt.repository.GroupRepository;
import com.epam.pmt.service.GroupService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;


import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.*;


@WebMvcTest(GroupService.class)
@ContextConfiguration(classes = {GroupService.class})
@ExtendWith(MockitoExtension.class)
public class GroupServiceTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    GroupRepository groupRepository;

    @MockBean
    GroupService groupService;

    @Test
    void testRenameGroup() throws Exception {
        doNothing().when(groupService).renameGroup(isA(String.class),isA(String.class));
        groupService.renameGroup("social","socialmedial");
        verify(groupService,times(1)).renameGroup("social","socialmedial");
    }

    @Test
    void testDeleteGroup() throws Exception {
        doNothing().when(groupService).deleteGroup(isA(String.class));
        groupService.deleteGroup("social");
        verify(groupService, times(1)).deleteGroup("social");
    }
    @Test
    void testGroupsName() {
        List<String> listofNames = new ArrayList<>();
        listofNames.add("socialmedia");
        listofNames.add("shopping");
        listofNames.add("google");
        MasterAccount masterAccount = new MasterAccount();
    }
}
