package com.example.new_springboot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.new_springboot.service.OrganizationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/organization")
public class OrganizationController {
    @Autowired
    private OrganizationService service;

    @RequestMapping(value = "/{action}", method = { RequestMethod.GET, RequestMethod.POST })
    public ModelAndView actionMethod(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
            ModelAndView modelAndView) {
        String viewName = "/organization/";
        if ("list".equals(action)) {
            viewName = viewName + action;
            modelAndView.setViewName(viewName);
            Object result01 = new Object();
            result01 = service.getList(paramMap);
            modelAndView.addObject("resultList", result01);
            Object result02 = new Object();
            result02 = service.getObject(paramMap);
            modelAndView.addObject("resultOne", result02);
        }
        return modelAndView;
    }
}