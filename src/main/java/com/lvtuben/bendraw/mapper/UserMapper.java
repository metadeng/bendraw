package com.lvtuben.bendraw.mapper;

import com.lvtuben.bendraw.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    User getUser(Integer sid);

    Integer deleteUser(Integer sid);


    int insert(@Param("pojo") User pojo);

    int insertList(@Param("pojos") List< User> pojo);

    List<User> select(@Param("pojo") User pojo);

    int update(@Param("pojo") User pojo);

}
