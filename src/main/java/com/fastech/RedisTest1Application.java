package com.fastech;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fastech.dao")
public class RedisTest1Application {

	public static void main(String[] args) {
		SpringApplication.run(RedisTest1Application.class, args);
	}

}
