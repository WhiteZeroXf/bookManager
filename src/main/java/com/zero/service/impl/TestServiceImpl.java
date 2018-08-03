package com.zero.service.impl;

import com.zero.dao.TestMapper;
import com.zero.pojo.Test;
import com.zero.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public boolean save(Test test) {
        System.out.println("TestService : " + testMapper);
        return testMapper.save(new Test());
    }
}
