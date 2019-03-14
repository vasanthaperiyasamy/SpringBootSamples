package com.spring.boot;
 

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan("com.spring.boot")
@SpringBootApplication(scanBasePackages="com.spring.boot")
public class SpringBootStandAloneApp {
	public static void main(String args[]) {
		SpringApplication.run(SpringBootStandAloneApp.class, args);
		
	}
	
}
