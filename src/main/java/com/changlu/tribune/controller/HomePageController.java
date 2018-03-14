package com.changlu.tribune.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomePageController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String homePage(){
        return "/index.html";
    }

    @RequestMapping(value = "/administrator",method = RequestMethod.GET)
    public String admin(){
        return "/admin.html";
    }

    @RequestMapping(value = "/buyer",method = RequestMethod.GET)
    public String buyer(){
        return "/buyer_admin.html";
    }
}
