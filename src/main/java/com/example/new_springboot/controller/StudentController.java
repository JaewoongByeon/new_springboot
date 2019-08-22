package com.example.new_springboot.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.new_springboot.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
    @Autowired
    private StudentRepository repository;

    @RequestMapping(value = "/student/{action}", method = { RequestMethod.GET, RequestMethod.POST })
    public ModelAndView actionMethod(@PathVariable String action, ModelAndView modelAndView) {
        String viewName = "/student/" + action;
        List<Object> resultList = new ArrayList<Object>();
        resultList = (List) repository.findAll();
        modelAndView.setViewName(viewName);
        modelAndView.addObject("resultList", resultList);
        return modelAndView;
    }
}