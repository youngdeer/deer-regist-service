package com.deer.deerregistservice.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.deer.deerregistservice.entity.UserEntity;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTests {

	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void selectAllTest() {
		List<UserEntity> list = userMapper.selectAll();
		System.out.println(list.toString());
	}
}
