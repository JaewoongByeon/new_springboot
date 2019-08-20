package com.example.new_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/board")
public class BoardController {
    @RequestMapping(value = { "/edit", "/view", "/list" }, method = { RequestMethod.GET, RequestMethod.POST })
    private void actionMethod() {
    }
}