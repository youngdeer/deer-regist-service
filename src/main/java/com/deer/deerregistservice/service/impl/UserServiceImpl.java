package com.deer.deerregistservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deer.deerregistservice.entity.UserEntity;
import com.deer.deerregistservice.mapper.UserMapper;
import com.deer.deerregistservice.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<UserEntity> listUser() {
		return userMapper.selectAll();
	}

	@Override
	public UserEntity getUserById(long id) {
		return userMapper.selectById(id);
	}

}
