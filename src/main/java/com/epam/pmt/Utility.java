package com.epam.pmt;

import com.epam.pmt.service.GroupService;
import com.epam.pmt.service.PasswordAccountService;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Utility {



    @Autowired
    private GroupService groupService;

    @Autowired
    private PasswordAccountService passwordAccountService;


    public JSONObject getGroupsAndAccountsInJSONFormat() {
        List<String> groupNames = groupService.getGroupNames();
        JSONObject jsonObject = new JSONObject();
        for(String groupName : groupNames)
        {
            JSONArray jsonArray = new JSONArray();
            List<String> accountNames = passwordAccountService.getPasswordAccountsName(groupName);
            jsonArray.addAll(accountNames);
            jsonObject.put(groupName, jsonArray);
        }
        return jsonObject;
    }
}
