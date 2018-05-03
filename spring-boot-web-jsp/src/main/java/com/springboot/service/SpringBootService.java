package com.springboot.service;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.springboot.model.User;
import com.springboot.service.impl.SpringBootServiceImpl;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

@Service
public class SpringBootService implements SpringBootServiceImpl {

	private final String url = "http://s3-ap-southeast-1.amazonaws.com/fundo/js/profiles.json";

	@Override
	public ArrayList<User> getUserList() {
		ArrayList<User> arrUser = new ArrayList<User>();
		User[] users = getDetailsFromURL();
		
		for (User user : users) {
			arrUser.add(user);
		}
		return arrUser;
	}

	@Override
	public User getUserDetails(String id) {
		User userDetails = new User();
		User[] users = getDetailsFromURL();
		for (User user : users) {
			if (user.getId().equals(id)) {
				userDetails = user;
				break;
			}
		}
		return userDetails;
	}

	private User[] getDetailsFromURL() {
		Gson gson= null;
		String result="";
		try {
			OkHttpClient client = new OkHttpClient();
			Request request = new Request.Builder().url(url).build();

			Response response = client.newCall(request).execute();
			result = response.body().string();

			GsonBuilder gsonBuilder = new GsonBuilder();
			gson = gsonBuilder.create();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return gson.fromJson(result, User[].class);
	}

}
