package com.example.new_springboot.service;

import com.example.new_springboot.dao.OrganizationDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizationService {
    @Autowired
    private OrganizationDao dao;

    public Object getList(Object dataMap) {
        String sqlMapId = "organization.list";
        Object result = dao.getList(sqlMapId, dataMap);
        return result;
    }

    public Object getObject(Object dataMap) {
        String sqlMapId = "organization.read";
        Object result = dao.getObject(sqlMapId, dataMap);
        return result;
    }
}