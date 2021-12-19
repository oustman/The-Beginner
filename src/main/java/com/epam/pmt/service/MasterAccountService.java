package com.epam.pmt.service;

import com.epam.pmt.entities.MasterAccount;
import com.epam.pmt.repository.MasterAccountRepository;
import com.epam.pmt.security.DataEncryptionDecryption;
import com.epam.pmt.session.ActiveUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MasterAccountService {



    @Autowired
    private DataEncryptionDecryption security;

    @Autowired
    private MasterAccountRepository masterAccountRepository;

    public boolean storeAccountDetails(MasterAccount masterAccount) {
        boolean result = false;
        masterAccount.setUserName(masterAccount.getUserName().toLowerCase());
        if (!masterAccountRepository.existsByUserName(masterAccount.getUserName())) {
            masterAccount.setPassword(security.encryptData(masterAccount.getPassword()));
            masterAccount.setGroups(new ArrayList<>());
            masterAccountRepository.save(masterAccount);
            result = true;
        }
        return result;
    }

    public boolean startSession(String userName, String password) { //testing
        boolean result = false;
        if (masterAccountRepository.existsByUserName(userName)) {
            MasterAccount masterAccount = masterAccountRepository.findByUserName(userName);
            if (password.equals(security.decryptData(masterAccount.getPassword()))) {
                ActiveUser.setActiveUser(masterAccount);
                result = true;
            }
        }
        return result;
    }
}
