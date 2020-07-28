package com.my.demo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class StudentDetails {

	@NotNull(message="Is Required")
	@Size(min=1, message="Is Required")
	String firstName;
	String lastName;
	String gender;
	String country;
	String language[];
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String[] getLanguage() {
		return language;
	}
	public void setLanguage(String[] language) {
		this.language = language;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
