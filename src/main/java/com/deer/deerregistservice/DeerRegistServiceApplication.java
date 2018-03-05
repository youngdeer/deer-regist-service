package com.deer.deerregistservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@MapperScan("com.deer.deerregistservice.mapper")
public class DeerRegistServiceApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(DeerRegistServiceApplication.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DeerRegistServiceApplication.class);
    }
	
	@RequestMapping("/info")
	public String info() {
		return "this service is for user regist!";
	}
}
