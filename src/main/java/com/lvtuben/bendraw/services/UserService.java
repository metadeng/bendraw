package com.lvtuben.bendraw.services;


import com.lvtuben.bendraw.domain.User;

import java.util.List;

public interface UserService {
    List<User>  getUser(User user);

    Integer deleteUser(Integer sid);

}
