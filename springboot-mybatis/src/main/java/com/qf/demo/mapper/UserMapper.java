package com.qf.demo.mapper;

import com.qf.demo.entity.User;

import java.util.List;

public interface UserMapper {
    User getById(Integer id);

    List<User> getUsers();
}
