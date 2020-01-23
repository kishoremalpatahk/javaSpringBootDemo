package com.kishu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kishu.DAO.UserRepository;
import com.kishu.beans.User;

@Service
public class UserService {
	@Autowired UserRepository userRepository;
	public User addUser(User user) {
		return userRepository.save(user);
	}
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

}
