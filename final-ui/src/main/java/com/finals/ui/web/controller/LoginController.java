package com.finals.ui.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    /**
     * @location 仅存的页面...
     */
    @RequestMapping("/login")
    public ModelAndView login() {
		return new ModelAndView("login");
    }
    
}