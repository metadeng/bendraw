package com.lvtuben.bendraw.api.v1;

import com.lvtuben.bendraw.domain.User;
import com.lvtuben.bendraw.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApiV1UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/api/user/{sid}")
    public User getUser(@PathVariable Integer sid) {
        return userService.getUser(sid);
    }
}
