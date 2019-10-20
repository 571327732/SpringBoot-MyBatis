package com.example.springboot.mapper;

import com.example.springboot.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
/*@Mapper*/
public interface UserMapper {
    //获取所有的用户列表
    List<User>getUserList ();
}
