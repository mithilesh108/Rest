package com.tcs.java.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "user")
public class User {

	private int id;
	private String name1;
	private boolean status;
	private double salary;
	
}
