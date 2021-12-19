package com.epam.pmt.servicetest;

import com.epam.pmt.controllers.GroupController;
import com.epam.pmt.service.GroupService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;


@WebMvcTest(GroupController.class)
@ContextConfiguration(classes = {GroupController.class})
@ExtendWith(MockitoExtension.class)
public class GroupControllerTest {

    @MockBean
    GroupService groupService;

    @Mock
    MockMvc mockMvc;
     /*@Test
   void testRenameGroup() throws Exception {
        mockMvc.perform(post("/renameGroup?oldGroupName=social&newGroupName=socilamedia")).andExpect(status().isOk()).andExpect(view().name("renameGroup"));
       /* doNothing().when(groupService).renameGroup(isA(String.class),isA(String.class));
        groupService.renameGroup("social","socialmedial");
        verify(groupService,times(1)).renameGroup("social","socialmedial");*/

    /* @Test
    void testdeleteGroup() {
        doNothing().when(groupService).deleteGroup(isA(String.class));
        groupService.deleteGroup("social");
        verify(groupService, times(1)).deleteGroup("social");
    }*/
}