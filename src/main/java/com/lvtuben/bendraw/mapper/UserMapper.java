package com.lvtuben.bendraw.mapper;

import com.lvtuben.bendraw.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User getUser(Integer sid);

    Integer deleteUser(Integer sid);
}
