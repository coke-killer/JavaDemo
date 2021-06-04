package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @description:
 * @author: yudongyue
 * @date: Created in 2021/6/4 13:39
 */
@RestController
//@Controller
@RequestMapping("/login")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/user")
//    @ResponseBody
    public User getInformation(@RequestParam Integer id) {
        return userService.getInformation(id);
    }
}
