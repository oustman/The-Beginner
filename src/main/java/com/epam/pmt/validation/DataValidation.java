package com.epam.pmt.validation;

import org.apache.commons.validator.routines.UrlValidator;

public interface DataValidation {
    UrlValidator urlValidatorInstance = new UrlValidator();

    static boolean isValidUrl(String url) {
        return urlValidatorInstance.isValid(url);
    }

    static boolean isValidName(String name) {
        return name.matches("[A-Za-z]+");
    }
}
