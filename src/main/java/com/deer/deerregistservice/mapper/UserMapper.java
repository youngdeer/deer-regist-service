package com.deer.deerregistservice.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.deer.deerregistservice.entity.UserEntity;

public interface UserMapper {

	@Select("select * from user")
	List<UserEntity> selectAll();

	@Select("select * from user where id = #{id}")
	UserEntity selectById(long id);

}
