package com.tcs.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

import com.tcs.java.bean.Employee;
import com.tcs.java.bean.User;

@SpringBootApplication
//@EnableConfigurationProperties  //not required in spring boot app , required in spring mvc app
public class ConfigPropertiesSpringBootCustomizeApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(ConfigPropertiesSpringBootCustomizeApplication.class, args);
		Employee emp = ctx.getBean(Employee.class);
		System.out.println(emp);
		User user = ctx.getBean(User.class);
		System.out.println(user);
	}

}
