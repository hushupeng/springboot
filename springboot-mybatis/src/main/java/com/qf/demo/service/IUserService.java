package com.qf.demo.service;

import com.qf.demo.entity.User;

import java.util.List;

public interface IUserService {

    User getById(Integer id);

    List<User> getUsers();
}
