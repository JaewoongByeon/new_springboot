package com.example.new_springboot.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/member")
public class MemberController {
    @RequestMapping(value = { "/login", "/logout", "/signup" }, method = { RequestMethod.GET, RequestMethod.POST })
    public void actionMethod() {
    }

    @RequestMapping(value = "/view")
    public ModelAndView read(@RequestParam Map<String, Object> paramMap, ModelAndView modelAndView) {
        String viewName = "member/view";
        modelAndView.setViewName(viewName);
        modelAndView.addObject("paramMap", paramMap);
        return modelAndView;
    }
}