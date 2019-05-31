package com.lvtuben.bendraw.services.imp;

import com.lvtuben.bendraw.domain.User;
import com.lvtuben.bendraw.mapper.UserMapper;
import com.lvtuben.bendraw.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(Integer sid) {
        return userMapper.getUser(sid);
    }

    @Override
    public Integer deleteUser(Integer sid) {
        return userMapper.deleteUser(sid);
    }
}
