package com.example.new_springboot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.new_springboot.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
    @Autowired
    private StudentService service;

    @RequestMapping(value = "/student/{action}", method = { RequestMethod.GET, RequestMethod.POST })
    public ModelAndView actionMethod(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
            ModelAndView modelAndView) {
        String viewName = "/student/" + action;
        if ("list".equals(action) || "search".equals(action)) {
            Object resultList = new Object();
            resultList = service.getObject(paramMap);
            modelAndView.setViewName(viewName);
            modelAndView.addObject("resultList", resultList);
        } else if ("detail".equals(action)) {
            Object resultMap = new Object();
            resultMap = service.getOne(Long.valueOf((String) paramMap.get("id")));
            modelAndView.setViewName(viewName);
            modelAndView.addObject("resultMap", resultMap);
        }
        return modelAndView;
    }
}