package com.qf.demo.service.impl;

import com.qf.demo.entity.User;
import com.qf.demo.mapper.UserMapper;
import com.qf.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getById(Integer id) {
        return userMapper.getById(id);
    }

    @Override
    public List<User> getUsers() {
        return userMapper.getUsers();
    }
}
