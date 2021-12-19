package com.epam.pmt.operation;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Component
public class StorePasswordAccountDetailsOperation implements Operation{

    @Override
    public ModelAndView execute() {
        return new ModelAndView("passwordAccountForm");
    }
}
