package com.epam.pmt.repository;

import com.epam.pmt.entities.Group;
import com.epam.pmt.entities.PasswordAccount;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface PasswordAccountRepository extends CrudRepository<PasswordAccount, Integer> {
    boolean existsByAccountNameAndGroup(String accountName, Group group);

    PasswordAccount findByAccountNameAndGroup(String accountName, Group group);

    @Query("SELECT acc.accountName FROM PasswordAccount acc WHERE acc.group.groupName = :groupName")
    List<String> getPasswordAccountsName(String groupName);

    @Modifying
    @Transactional
    @Query("UPDATE PasswordAccount passAcc SET passAcc.userName = :#{#account.userName}, passAcc.password = :#{#account.password}, passAcc.url = :#{#account.url} WHERE passAcc.accountName = :#{#account.accountName} AND passAcc.group = :#{#account.group}")
    void updateAccountDetails(PasswordAccount account);
}
