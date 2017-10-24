package com.javacodegeeks.examples.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

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
	
	@RequestMapping(value = "/saveUser/", method = RequestMethod.POST)
	public void saveUser(@ModelAttribute User user) {
		System.out.println("user : " + user);
	}
	
	
	
	@RequestMapping(value = "/saveUser", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public ResponseEntity<String> createEmployee(@RequestBody User user)
    {
        System.out.println("user details :: " + user.getName() + " age ::" + user.getAge());
        return new ResponseEntity<String>(HttpStatus.CREATED);
    }
}
