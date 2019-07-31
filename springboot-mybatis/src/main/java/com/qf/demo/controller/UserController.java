package com.qf.demo.controller;

import com.qf.demo.entity.User;
import com.qf.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService userService;


    @GetMapping("getById/{id}")
    public User getById(@PathVariable("id") Integer id){
        return userService.getById(id);
    }
}
