package com.epam.pmt.controllers;

import com.epam.pmt.entities.PasswordAccount;
import com.epam.pmt.service.PasswordAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PasswordAccountController {
    @Autowired
    PasswordAccountService passwordAccountService;



    @PostMapping("storeAccountDetails")
    public String storeAccountDetails(PasswordAccount passwordAccount, String groupName) {
        String result;
        if (passwordAccountService.storePasswordAccountDetails(passwordAccount, groupName.toLowerCase()))
            result = "demo";
        else
            result = "error";
        return result;
    }

    @GetMapping("passwordAccountForm")
    public String showPasswordAccountForm() {
        return "passwordAccountForm";
    }

    @PostMapping("displaySpecificAccount")
    public ModelAndView displayAccountLoginCredentials(String groupName, String accountName) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("displaySpecificAccount");
        PasswordAccount account = passwordAccountService.getPasswordAccount(groupName.toLowerCase(), accountName.toLowerCase());
        modelAndView.addObject("account", account);
        return modelAndView;
    }

    @PostMapping("deleteSpecificAccount")
    public ModelAndView deleteSpecificAccount(String groupName, String accountName) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("deleteSpecificAccount");
        passwordAccountService.deletePasswordAccount(groupName, accountName);
        return modelAndView;
    }

    @PostMapping("updateAccountDetails")
    public ModelAndView updateAccountDetails(String groupName, PasswordAccount passwordAccount) {
        passwordAccountService.updateAccountDetails(groupName, passwordAccount);
        return new ModelAndView("demo");
    }
}
