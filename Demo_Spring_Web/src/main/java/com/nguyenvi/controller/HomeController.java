package com.nguyenvi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nguyenvi.domain.User;
import com.nguyenvi.repository.UserRepo;
import com.nguyenvi.service.UserService;

@RestController
//@Controller
@RequestMapping(value = "/user")
public class HomeController {

	@Autowired
	private UserService userService;

	// Find All
	// Allow localhost server to access data can use global configuration
	@CrossOrigin(origins = "http://127.0.0.1:5501")
	@GetMapping(value = "/")
	public List<User> read() {

		return userService.findAll();

	}

	@CrossOrigin(origins = "http://127.0.0.1:5501")
	@GetMapping("/create")
	public String userForm(Model model) {
		model.addAttribute("user", new User());
		return "add";
	}

	@CrossOrigin(origins = "http://127.0.0.1:5501")
	@PostMapping("/create")
	public String userSubmit(@ModelAttribute User user, Model model) {

		System.out.println(user);
		return "redirect:/user/create";
	}

	@CrossOrigin(origins = "http://127.0.0.1:5501")
	@GetMapping("/users")
	List<User> all() {
		return userService.findAll();
	}

	@CrossOrigin(origins = "http://127.0.0.1:5501")
	@PostMapping("/employees")
	User newUser(@RequestBody User newUser) {
		return userService.saveUser(newUser);
	}

	// Single item
	@CrossOrigin(origins = "http://127.0.0.1:5501")
	@GetMapping("/user/{id}")
	User one(@PathVariable Long id) {

		return userService.findUserById(id);

	}

	@CrossOrigin(origins = "http://127.0.0.1:5501")
	@PutMapping("/employees/{id}")
	User replaceUser(@RequestBody User user, @PathVariable Long id) {

		return userService.replaceUser(user, id);

	}

	@CrossOrigin(origins = "http://127.0.0.1:5501")
	@DeleteMapping("/employees/{id}")
	void deleteUser(@PathVariable Long id) {

		userService.deleteUserById(id);

	}
	/*
	 * 
	 * // Get Add From Filed
	 * 
	 * @RequestMapping(value = "/add", method = RequestMethod.GET) public String
	 * addUser() { return "add"; }
	 * 
	 * // Save To Object
	 * 
	 * @RequestMapping(value = "/add", method = RequestMethod.POST) public String
	 * saveUser(@RequestParam String name, @RequestParam String age) {
	 * System.out.println(name + " " + age);
	 * 
	 * return "redirect:/app/add"; }
	 * 
	 * @RequestMapping(value = "/login")
	 * 
	 * @ResponseBody public String login() { return "Login Page"; }
	 * 
	 * @RequestMapping(value = "/signup")
	 * 
	 * @ResponseBody public String signUp() { return "Sigup Page"; }
	 */

}
