package com.mohit.DemoHib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;


/*
 * There are 3 layers 
 * Layer 1: Class Name 
 * Layer 2: Entity Layer
 * Layer 3: Table Name
 * 
 *  Similar to @Entity, @Table(name ="User_Table") can be written
 * */

@Entity// @Entity(name = "UserTable") the name parameter is used to specify name of the table
public class User {
	@Id // @Id annotation is used to specify Primary Key
	private int uNum;
	
	// @Column(name="UserName") annotation is used to specify name of column in the table
	// @Transient annotation is used if we don't want to store a column in table
	private UserName name;
	private int age;
	
	public int getuNum() {
		return uNum;
	}
	public void setuNum(int uNum) {
		this.uNum = uNum;
	}
	public UserName getName() {
		return name;
	}
	public void setName(UserName name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [uNum=" + uNum + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
