package com.epam.pmt.security;

import org.springframework.stereotype.Component;

import java.util.Base64;

@Component
public class DataEncryptionDecryption {

    public String encryptData(String data) {
        return Base64.getEncoder().encodeToString(data.getBytes());
    }

    public String decryptData(String data) {
        return new String(Base64.getDecoder().decode(data));
    }
}