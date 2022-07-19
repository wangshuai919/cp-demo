package com.ciccwm.cpdemo;

import com.qq.tars.spring.annotation.EnableTarsServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableTarsServer
public class CpDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CpDemoApplication.class, args);
	}

}

