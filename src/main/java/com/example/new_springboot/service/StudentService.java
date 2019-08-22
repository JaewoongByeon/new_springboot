package com.example.new_springboot.service;

import java.util.Map;

import com.example.new_springboot.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public Object getObject(Map<String, Object> dataMap) {
        Object resultObject = repository.findAll();
        return resultObject;
    }

    public Object getOne(Long data) {
        Object resultObject = repository.getOne(data);
        return resultObject;
    }
}