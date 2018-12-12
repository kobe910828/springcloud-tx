package com.hehe.tx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.hehe.tx.dao")
@EnableFeignClients
public class TxDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TxDemoApplication.class, args);
	}
}
