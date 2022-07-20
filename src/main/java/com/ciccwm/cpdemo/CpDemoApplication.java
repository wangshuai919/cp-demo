package com.ciccwm.cpdemo;

import com.qq.tars.spring.annotation.EnableTarsServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableTarsServer
@SpringBootApplication
public class CpDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CpDemoApplication.class, args);
	}

}

