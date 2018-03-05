package com.deer.deerregistservice.service;

import java.util.List;

import com.deer.deerregistservice.entity.UserEntity;

public interface UserService {
	
	List<UserEntity> listUser();
	
	UserEntity getUserById(long id);

}
