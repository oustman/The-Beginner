package com.epam.pmt.service;

import com.epam.pmt.entities.Group;
import com.epam.pmt.repository.GroupRepository;
import com.epam.pmt.session.ActiveUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GroupService {

    @Autowired
    private GroupRepository groupRepository;


    public List<String> getGroupNames() {
        return groupRepository.getGroupsName(ActiveUser.getActiveUser().getId());
    }

    public List<Group> getGroups() {
        return groupRepository.findAllByMasterAccount(ActiveUser.getActiveUser());
    }

    public void renameGroup(String oldGroupName, String newGroupName) {
        groupRepository.updateGroupName(oldGroupName, newGroupName);
    }

    public void deleteGroup(String groupName) {
        groupRepository.delete(groupRepository.findByGroupName(groupName));
    }
}
