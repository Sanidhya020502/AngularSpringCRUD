package com.CrudSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CrudSpring.model.User;
import com.CrudSpring.service.UserService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class UserController {

	@Autowired
	public  UserService userService;
	
	@PostMapping("/user")
	public User createUser(@RequestBody User user){
		return userService.createUser(user);
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<User> getUserById(@PathVariable Integer id){
		User user = userService.getUserById(id);
		if(user == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(user);
	}
	
	@PutMapping("/user/{id}")
	public ResponseEntity<User> updateUser(@RequestBody User user,@PathVariable Integer id){
		User user1 = userService. getUserById(id);
		if(user==null) {
			return ResponseEntity.notFound().build();
		}
		user1.setEmail(user.getEmail());
		user1.setName(user.getName());
		User updatedUser = userService.updateUser(user1);
		return ResponseEntity.ok(updatedUser);
		
	}
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<User> deleteUser(@PathVariable Integer id){
		User user = userService.getUserById(id);
		if(user==null) {
			return ResponseEntity.notFound().build();
		}
		userService.deleteUser(user);
		return ResponseEntity.ok().build();
	}
}
