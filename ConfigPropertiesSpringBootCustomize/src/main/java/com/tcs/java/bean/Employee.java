package com.tcs.java.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "emp")
public class Employee {

	private int id;
	private String name;
	private boolean status;
	private double salary;
	
}
