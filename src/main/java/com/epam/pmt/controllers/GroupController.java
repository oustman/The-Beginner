package com.epam.pmt.controllers;

import com.epam.pmt.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GroupController {

    @Autowired
    private GroupService groupService;



    @PostMapping("renameGroup")
    public String renameGroup(String groupName, String newGroupName) {
        groupService.renameGroup(groupName, newGroupName);
        return "demo";
    }

    @PostMapping("deleteGroup")
    public String deleteGroup(String groupName)
    {
        groupService.deleteGroup(groupName);
        return "demo";
    }
}
