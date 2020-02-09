package com;
import java.io.Serializable;

public class User implements Serializable{
	private static final long serialVersionUID = -8224583530000882248L;
	String Name,Email,Password;
	public User(String Name,String Email,String Password) {
		this.Email = Email;
		this.Name = Name;
		this.Password = Password;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	// Generating Getters and setters 
	
	
}