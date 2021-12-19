package com.epam.pmt.service;

import com.epam.pmt.entities.Group;
import com.epam.pmt.entities.MasterAccount;
import com.epam.pmt.entities.PasswordAccount;
import com.epam.pmt.repository.GroupRepository;
import com.epam.pmt.repository.MasterAccountRepository;
import com.epam.pmt.repository.PasswordAccountRepository;
import com.epam.pmt.security.DataEncryptionDecryption;
import com.epam.pmt.session.ActiveUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Service
public class PasswordAccountService {

    @Autowired
    private PasswordAccountRepository passwordAccountRepository;
    @Autowired
    private GroupRepository groupRepository;
    @Autowired
    private DataEncryptionDecryption security;
    @Autowired
    private EntityManager entityManager;
    @Autowired
    private MasterAccountRepository masterAccountRepository;



    public boolean storePasswordAccountDetails(PasswordAccount passwordAccount, String groupName) {
        boolean result = false;
        passwordAccount.setAccountName(passwordAccount.getAccountName().toLowerCase());
        passwordAccount.setPassword(security.encryptData(passwordAccount.getPassword()));
        System.out.println("MasterAccount persisted: " + entityManager.contains(ActiveUser.getActiveUser()));
        MasterAccount masterAccount = masterAccountRepository.findById(ActiveUser.getActiveUser().getId()).get();
        if (!groupRepository.existsByGroupName(groupName)) {
            Group group = new Group();
            group.setGroupName(groupName);
            group.setPasswordAccounts(new ArrayList<>());

            group.setMasterAccount(masterAccount);
            groupRepository.save(group);
            passwordAccount.setGroup(group);
            passwordAccountRepository.save(passwordAccount);
            result = true;
        } else {
            Group group = groupRepository.findByGroupName(groupName);
            if (!passwordAccountRepository.existsByAccountNameAndGroup(passwordAccount.getAccountName(), group)) {
                passwordAccount.setGroup(group);
                passwordAccountRepository.save(passwordAccount);
                result = true;
            }
        }
        return result;
    }

    public PasswordAccount getPasswordAccount(String groupName, String accountName) {
        return passwordAccountRepository.findByAccountNameAndGroup(accountName, groupRepository.findByGroupName(groupName));
    }

    public List<String> getPasswordAccountsName(String groupName) {
        return passwordAccountRepository.getPasswordAccountsName(groupName);
    }

    public void deletePasswordAccount(String groupName, String accountName) {
        passwordAccountRepository.delete(getPasswordAccount(groupName, accountName));
    }

    public void updateAccountDetails(String groupName, PasswordAccount passAcc) {
        passAcc.setPassword(security.encryptData(passAcc.getPassword()));
        passAcc.setGroup(groupRepository.findByGroupName(groupName));
        passwordAccountRepository.updateAccountDetails(passAcc);
    }
}