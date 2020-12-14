package com.nguyenvi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nguyenvi.domain.User;
import com.nguyenvi.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;

	public User saveUser(User user) {
		return userRepo.save(user);
	}

	public User findUserById(Long id) {

		Optional<User> optional = userRepo.findById(id);
		if (optional.isPresent()) {
			return (User) optional.get();

		} else {
			return null;
		}

	}

	public List<User> findAll() {

		List<User> users = (List<User>) userRepo.findAll();
		return users;

	}
	
	public void deleteUserById(Long id)
	{
		userRepo.deleteById(id);
	}

	public User replaceUser(User newUser, Long id) {

		return userRepo.findById(id).map(user -> {
			user.setName(newUser.getName());
			user.setAge(newUser.getAge());
			return userRepo.save(user);
		}).orElseGet(() -> {
			newUser.setUserId(id);
			return userRepo.save(newUser);
		});

	}

}
