package com.epam.pmt.operation;

import com.epam.pmt.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Component
public class DisplaySpecificAccountOperation implements Operation{
    @Autowired
    private Utility utility;
    @Override
    public ModelAndView execute() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("selectGroupAndAccount");
        modelAndView.addObject("groupsAndAccounts", utility.getGroupsAndAccountsInJSONFormat());
        modelAndView.addObject("view", "displaySpecificAccount");
        return modelAndView;
    }
}
