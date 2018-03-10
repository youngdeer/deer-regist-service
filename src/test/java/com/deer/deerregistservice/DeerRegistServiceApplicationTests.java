package com.deer.deerregistservice;

import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DeerRegistServiceApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Autowired
	private  StringEncryptor stringEncryptor;

	
	@Test
	public void createDatabasePwd() {
		//database pwd encrypt,the pwd is q*******(7 numbers)
		String pwd = stringEncryptor.encrypt("bugaosuni");
		System.out.println(pwd);
	}

}
