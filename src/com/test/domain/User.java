package com.test.domain;

import java.io.Serializable;

/**
 * User entity. @author MyEclipse Persistence Tools
 */
public class User implements Serializable {


	private String id;
	private String name;
	private String passwd;
	private Integer age;
	
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPasswd() {
		return this.passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", passwd=" + passwd
				+ ", age=" + age + "]";
	}

	

}
