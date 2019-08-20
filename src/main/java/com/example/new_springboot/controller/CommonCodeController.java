package com.example.new_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/commonCode")
public class CommonCodeController {
    @RequestMapping(value = "/edit", method = { RequestMethod.GET, RequestMethod.POST })
    public void edit() {
    }
}