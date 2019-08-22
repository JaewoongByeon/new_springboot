package com.example.new_springboot.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class MemberDao {
    public Object getObject(Object dataMap) {
        Map<String, Object> resultObject = new HashMap<String, Object>();
        resultObject.put("MEMBER_ID", "293029301202");
        resultObject.put("NAME", "name 02");
        return resultObject;
    }

    public List<Object> getList(Object dataMap) {
        List<Object> resultList = new ArrayList<Object>();
        Map<String, Object> data01 = new HashMap<String, Object>();
        data01.put("MEMBER_ID", "293029301202");
        data01.put("NAME", "name 02");
        resultList.add(data01);
        Map<String, Object> data02 = new HashMap<String, Object>();
        data02.put("MEMBER_ID", "127015894358");
        data02.put("NAME", "name 01");
        resultList.add(data02);
        return resultList;
    }
}