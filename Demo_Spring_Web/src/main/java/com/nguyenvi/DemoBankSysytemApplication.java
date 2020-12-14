package com.nguyenvi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nguyenvi.domain.Address;
import com.nguyenvi.domain.User;
import com.nguyenvi.service.UserService;

@SpringBootApplication
public class DemoBankSysytemApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoBankSysytemApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
			
		

		
		/*
		 * Address add1 = new Address(); add1.setAddressLine1("Lang Son");
		 * add1.setAddressLine2("Cao Bang"); add1.setCity("Ha Noi");
		 * 
		 * Address add2 = new Address(); add2.setAddressLine1("Lap Thach Vinh Phuc");
		 * add2.setAddressLine2("Da Nang"); add2.setCity("Ho Chi Minh");
		 * 
		 * 
		 * Address add3 = new Address(); add3.setAddressLine1("Nha Trang");
		 * add3.setAddressLine2("Da Nang"); add3.setCity("Nha Trang");
		 * 
		 * Address add4 = new Address(); add4.setAddressLine1("Vinh Phuc");
		 * add4.setAddressLine2("Tam Dao"); add4.setCity("Ho Chi Minh");
		 * 
		 * 
		 * User user = new User(); user.setName("Nguyen Van Vi"); user.setAge(30);
		 * user.getAddresses().add(add1); user.getAddresses().add(add2);
		 * user.getAddresses().add(add3); user.getAddresses().add(add4);
		 * 
		 * userService.saveUser(user);
		 */
		
//		
//		List<User> users =  userService.findAll(); 
//		users.forEach(System.out::println);
		
		
	}

}
