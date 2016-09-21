/*
*@file_Name: Employee.java
*@Author: Shwetali
*@Date: 20-09-2016
*@purpose: POJO Employee class for StoreData class Hibernate test.
*/

package com.bridgelabz.dto;

public class Employee {
	int id;
	String firstName,lastName;
	
	//constructors
	public Employee(){}
	public Employee(int id,String firstName,String lastName){
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	//getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
