package com.ji.porfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SiteControllers {
    @GetMapping("/")
    public String home(){
        return "/www/site/index";
    }
}
