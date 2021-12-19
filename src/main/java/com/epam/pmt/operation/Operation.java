package com.epam.pmt.operation;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

public interface Operation {
    ModelAndView execute();
}
