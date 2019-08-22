package com.example.new_springboot.service;

import com.example.new_springboot.dao.MemberDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    @Autowired
    private MemberDao dao;

    public Object getObject(Object dataMap) {
        Object resultObject = dao.getObject(dataMap);
        return resultObject;
    }

    public Object getList(Object dataMap) {
        Object resultList = dao.getList(dataMap);
        return resultList;
    }
}