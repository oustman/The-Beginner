package com.epam.pmt.controllers;

import com.epam.pmt.factory.OperationFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class OperationController {
    @Autowired
    private OperationFactory operationFactory;




    @GetMapping("menu")
    public String showMenu() {
        return "menu";
    }

    @PostMapping("operation")
    public ModelAndView performOperation(String operation)
    {
        return operationFactory.getOperationInstance(operation).execute();
    }
}
