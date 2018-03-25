package io.urig.mikadodepartments;

import java.util.List;

public class Brand {
	private List<User> users;
	private String phone;
	private String emailAddress;
	
	public List<User> getUsers() {
		return users;
	}
	
	public void setUsers(List<User> _users) {
		this.users = _users;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
}
