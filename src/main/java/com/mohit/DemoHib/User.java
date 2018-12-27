package com.mohit.DemoHib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity(name = "User_Table") // the name parameter is used to specify name of the table
/*
 * There are 3 layers 
 * Layer 1: Class Name 
 * Layer 2: Entity Layer
 * Layer 3: Table Name
 * 
 *  Similar to @Entity, @Table(name ="User_Table") can be written
 * */
public class User {
	@Id
	private int uNum;
	
	@Column(name="UserName") /* @Column annotation is used to specify name of column in the table*/
	private String name;
	private int age;
	
	//@Transient /*@Transient annotation is used if we don't want to store a column in table*/
	public int getuNum() {
		return uNum;
	}
	public void setuNum(int uNum) {
		this.uNum = uNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
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
