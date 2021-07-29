package org.springframework.component;


import org.springframework.beans.factory.annotation.Autowired;

public class User implements Height, Width{

	private String username;

	private int age;

	@Autowired
	private Address address;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public int getHeight() {
		return 100;
	}

	@Override
	public int getWidth() {
		return 20;
	}
}
