package com.web.SpringBootRestDemo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee {

	
	
	private int eid;
	private String ename;
	private String email;
	private String phone;
	
	private String password;
	
	//private Address address;
}

