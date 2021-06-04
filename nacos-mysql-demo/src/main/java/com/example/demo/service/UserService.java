package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description:
 * @author: yudongyue
 * @date: Created in 2021/6/4 13:43
 */
@Service
public class UserService {
    @Resource
    UserMapper userMapper;

    public User getInformation(int i) {
        return userMapper.getInformation(i);
    }
}
