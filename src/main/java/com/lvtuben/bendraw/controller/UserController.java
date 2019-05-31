package com.lvtuben.bendraw.controller;

import com.lvtuben.bendraw.domain.User;
import com.lvtuben.bendraw.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "user/", method = RequestMethod.GET)
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("getUser/{sid}")
    @ResponseBody
    public User GetUser(@PathVariable Integer sid) {
        return userService.getUser(sid);
    }


    @GetMapping("del/{sid}")
    @ResponseBody
    public Integer deleteUser(@PathVariable Integer sid) {
        return userService.deleteUser(sid);
    }

}
