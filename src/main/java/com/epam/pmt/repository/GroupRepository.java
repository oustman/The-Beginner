package com.epam.pmt.repository;

import com.epam.pmt.entities.Group;
import com.epam.pmt.entities.MasterAccount;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface GroupRepository extends CrudRepository<Group, Integer> {
    boolean existsByGroupName(String groupName);

    Group findByGroupName(String groupName);

    @Query("select group.groupName from Group group where group.masterAccount.id = :accountId")
    List<String> getGroupsName(int accountId);

    List<Group> findAllByMasterAccount(MasterAccount masterAccount);

    @Modifying
    @Transactional
    @Query("UPDATE Group g SET g.groupName = :newGroupName WHERE g.groupName = :oldGroupName")
    void updateGroupName(String oldGroupName, String newGroupName);
}
