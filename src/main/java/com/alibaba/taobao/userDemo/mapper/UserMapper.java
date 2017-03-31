package com.alibaba.taobao.userdemo.mapper;

import com.alibaba.taobao.userdemo.model.User;

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
}
