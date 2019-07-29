package com.fastech.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fastech.base.Return;
import com.fastech.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/getUserById")
	public Return getUserById(@Param(value = "id") String id) {

		return userService.findUserById(id);
	}

}