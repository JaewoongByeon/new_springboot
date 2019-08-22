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
        Object result = new Object();
        if ("list".equals(action)) {
            viewName = viewName + action;
            result = service.getList("organization.list", paramMap);
            modelAndView.setViewName(viewName);
            modelAndView.addObject("resultList", result);
        }
        return modelAndView;
    }
}