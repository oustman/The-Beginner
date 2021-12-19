package com.epam.pmt.servicetest;


import com.epam.pmt.controllers.OperationController;
import com.epam.pmt.factory.OperationFactory;
import com.epam.pmt.operation.Operation;
import com.epam.pmt.operation.StorePasswordAccountDetailsOperation;
import org.junit.jupiter.api.Test;
import org.mockito.Incubating;
import org.mockito.InjectMocks;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.Matchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.ModelAndView;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest(OperationController.class)
@ContextConfiguration(classes = {OperationController.class})
public class OperationControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    OperationFactory operationFactory;



@MockBean
Operation operation;



    @Test
    void testMenuMapping()  throws Exception{
        mockMvc.perform(get("/menu")).andExpect(status().isOk()).andExpect(view().name("menu"));
    }

   /* @Test
    void testPerformOperationsfroValidInput() throws Exception{
        Operation operation = Mockito.mock(Operation.class);
        when(operationFactory.getOperationInstance("OPTION1")).thenReturn(operation);
        when(operation.execute()).thenReturn(new ModelAndView("passwordAccountForm"));
        mockMvc.perform(post("/operation")).andExpect(status().isOk()).andExpect(view().name("passwordAccountForm"));
    }*/


}
