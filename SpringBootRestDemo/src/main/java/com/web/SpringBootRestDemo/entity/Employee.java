package com.web.SpringBootRestDemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Entity
@Table(name="emp")
public class Employee {

	
	@Id
	private int eid;
	@Column(name="ename")
	private String ename;
	private String email;
	private String phone;
	@Column//(length = 100)
	private int city;
	private String password;
	
	//private Address address;
}

