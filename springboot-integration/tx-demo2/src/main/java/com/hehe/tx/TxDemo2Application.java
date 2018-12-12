package com.hehe.tx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.hehe.tx.dao")
public class TxDemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(TxDemo2Application.class, args);
	}
}
