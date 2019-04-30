package com.xiang.user.web;

import com.xiang.user.pojo.User;
import com.xiang.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class testController {
    @Autowired
    private UserService userService;
@GetMapping("{id}")
    public User queryById(@PathVariable Integer id){

        return  userService.queryById(id);
    }
}
