package com.fastech.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.fastech.entity.User;

@Mapper
public interface UserDAO {
	 
	 List<User> queryAll();
	 
	 User findUserById(@Param("id")String id);
	 
	 int updateUser(@Param("user") User user);
	
	 int deleteUserById(String id);

	 int insertUser(User user);
}
