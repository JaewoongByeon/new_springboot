package com.example.new_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ByPassController {
    @RequestMapping(value = { "/thymeleafmerge/thymeleafBase", "/layout/defaultLayout", "/fragment/commonFooter" })
    public void byPass() {
    }
}