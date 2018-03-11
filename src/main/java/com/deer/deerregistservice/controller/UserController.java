package com.deer.deerregistservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.deer.deerregistservice.entity.UserEntity;
import com.deer.deerregistservice.service.UserService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/userApi")
public class UserController {
	
	@Autowired
	private UserService userService;

	
	@ApiOperation(value="all user list", notes="all user list")
	@RequestMapping(value = "/listUser", method = RequestMethod.GET)
	public List<UserEntity> listUser() {
		return userService.listUser();
	}
}
