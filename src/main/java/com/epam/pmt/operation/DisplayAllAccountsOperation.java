package com.epam.pmt.operation;

import com.epam.pmt.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Component
public class DisplayAllAccountsOperation implements Operation{
    @Autowired
    private GroupService groupService;



    @Override
    public ModelAndView execute() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("displayAllAccounts");
        modelAndView.addObject("groups", groupService.getGroups());
        return modelAndView;
    }
}
