/*
*@file_Name: Employee2.java
*@Author: Shwetali
*@Date: 21-09-2016
*@purpose: POJO Employee class for StoreData2 class Hibernate test using annotations.
*/

package com.bridgelabz.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;

@Entity
@Table(name="emp2")
public class Employee2 {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	//while creating database column id in workbench select PN,NN,AI(AutoIncrement is must)
	int id;
	String firstName,lastName;
	
	//constructors
	public Employee2(){}
	public Employee2(int id,String firstName,String lastName){
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
