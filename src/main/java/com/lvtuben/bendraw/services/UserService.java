package com.lvtuben.bendraw.services;


import com.lvtuben.bendraw.domain.User;

public interface UserService {
    public User getUser(Integer sid);

    Integer deleteUser(Integer sid);

}