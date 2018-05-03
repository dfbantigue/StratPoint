package com.springboot.service.impl;

import java.util.ArrayList;
import com.springboot.model.User;

public interface SpringBootServiceImpl {

	public ArrayList<User> getUserList();
	public User getUserDetails(String id);
}
