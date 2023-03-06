package com.dev.bong.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainContoller {

    @RequestMapping(value="/main", method= RequestMethod.GET)
    public String main(){

        return "index";
    }
}
