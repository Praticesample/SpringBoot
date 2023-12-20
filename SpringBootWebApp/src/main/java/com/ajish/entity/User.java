package com.ajish.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="USER_TBL")
public class User {
	
	@Id
	@GeneratedValue
	private int UserId;
	private String name;
	private String email;
	private String mobile;
	private String gender;
	private int age;
	private String nationality;
	
	public User() {
		
	}
	
	public User(int userId, String name, String email, String mobile, String gender, int age, String nationality) {
		super();
		UserId = userId;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.gender = gender;
		this.age = age;
		this.nationality = nationality;
	}

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Override
	public String toString() {
		return "User [UserId=" + UserId + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", gender="
				+ gender + ", age=" + age + ", nationality=" + nationality + "]";
	}
	
	
	
	

	
	

}
