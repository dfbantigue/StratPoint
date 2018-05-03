package com.springboot.model;

public class User {
	private String picture;

	private String id;

	private String balance;

	private String phone;

	private String address;

	private String email;

	private Name name;

	private String age;

	private String active;

	private String blocked;

	private String date_registered;

	private String profile;

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getBlocked() {
		return blocked;
	}

	public void setBlocked(String blocked) {
		this.blocked = blocked;
	}

	public String getDate_registered() {
		return date_registered;
	}

	public void setDate_registered(String date_registered) {
		this.date_registered = date_registered;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "User [picture = " + picture + ", id = " + id + ", balance = " + balance + ", phone = " + phone
				+ ", address = " + address + ", email = " + email + ", name = " + name + ", age = " + age
				+ ", active = " + active + ", blocked = " + blocked + ", date_registered = " + date_registered
				+ ", profile = " + profile + "]";
	}
}
