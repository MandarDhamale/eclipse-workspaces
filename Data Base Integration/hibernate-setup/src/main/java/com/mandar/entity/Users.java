package com.mandar.entity;

import javax.persistence.Column;
import javax.persistence.Id;

@javax.persistence.Entity(name = "users")
@javax.persistence.Table(name = "users")
public class Users {

	@Id
	@Column(name = "user_id")
	int user_id;
	
	@Column(name = "username")
	String username;

	@Column(name = "password")
	String password;

	@Column(name = "firstname")
	String firstname;

	@Column(name = "lastname")
	String lastname;
	
	public Users() {
		super();
	}

	public Users(String username, String password, String firstname, String lastname) {
		super();
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Users [user_id=" + user_id + ", username=" + username + ", password=" + password + ", firstname="
				+ firstname + ", lastname=" + lastname + "]";
	}
	
	
	
}
