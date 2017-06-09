package com.alibaba.taobao.userdemo.mapper;

import java.util.List;

import com.alibaba.taobao.userdemo.model.User;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * Created by tianda.lt on 2017/3/31.
 */
@Component("userMapper")
public interface UserMapper {

    @Select("SELECT * FROM users WHERE id = #{userId}")
    User getUser(@Param("userId") String userId);

    @Select("SELECT * FROM users")
    List<User> getAllUsers();

    @Insert("INSERT into users(NAME,age) values(#{userName},#{userAge})")
    void addUser(@Param("userName")String userName, @Param("userAge")String userAge);

    @Delete("DELETE FROM users WHERE id = #{userId}")
    void deleteUser(@Param("userId")String userId);
}
