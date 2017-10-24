package com.javacodegeeks.examples.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javacodegeeks.examples.bo.Role;
import com.javacodegeeks.examples.bo.User;

@RestController
public class Controller {

	@RequestMapping("/getUsers")
	public List<User> getUsers() {

		List<User> users = new ArrayList<User>();
		users.add(new User("thulasi", 33));
		users.add(new User("nagendra", 32));
		users.add(new User("sudheer", 31));
		return users;
	}

	@RequestMapping("/getRoles")
	public List<Role> getRoles() {
		List<Role> roles = new ArrayList<Role>();
		roles.add(new Role("Manager"));
		roles.add(new Role("Lead"));
		roles.add(new Role("admin"));
		return roles;
	}

}
