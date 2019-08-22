package com.example.new_springboot.service;

import com.example.new_springboot.dao.OrganizationDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizationService {
    @Autowired
    private OrganizationDao dao;

    public Object getList(String sqlMapId, Object dataMap) {
        Object result = dao.getList(sqlMapId, dataMap);
        return result;
    }
}