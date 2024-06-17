package com.CrudSpring.service;



import java.util.List;

import com.CrudSpring.model.User;


public interface UserService {

	public User createUser(User user);
	public User getUserById(Integer id);
	public User updateUser(User user);
	public List<User> getAllUsers();
	public void deleteUser(User user);
}
