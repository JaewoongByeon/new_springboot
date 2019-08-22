package com.example.new_springboot.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrganizationDao {
    @Autowired
    private SqlSessionTemplate sqlSession;

    public Object getList(String sqlMapId, Object dataMap) {
        Object result = sqlSession.selectList(sqlMapId, dataMap);
        return result;
    }
}