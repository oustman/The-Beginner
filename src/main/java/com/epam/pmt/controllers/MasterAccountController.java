package com.epam.pmt.controllers;

import com.epam.pmt.entities.MasterAccount;
import com.epam.pmt.service.MasterAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class MasterAccountController {
    @Autowired
    private MasterAccountService masterAccountService;




    @GetMapping("signin")
    public String showSignInForm()
    {
        return "signin";
    }

    @GetMapping("signup")
    public String showSignUpForm()
    {
        return "signup";
    }

    @PostMapping("session")
    public String startNewSession(String userName, String password) {
        String result;
        if(masterAccountService.startSession(userName.toLowerCase(), password.toLowerCase()))
            result = "menu";
        else
            result = "error";
        return result;
    }

    @PostMapping("storeUserDetails")
    public String storeAccountDetails(MasterAccount masterAccount)
    {
        String result;
        if(masterAccountService.storeAccountDetails(masterAccount))
            result = "success";
        else
            result = "error";
        return result;
    }
}
