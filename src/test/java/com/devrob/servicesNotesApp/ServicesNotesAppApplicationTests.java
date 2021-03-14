package com.devrob.servicesNotesApp;

import com.devrob.servicesNotesApp.user.entity.User;
import com.devrob.servicesNotesApp.user.repository.UserRepository;
import com.devrob.servicesNotesApp.user.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class ServicesNotesAppApplicationTests {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private UserService userService;
	@Test
	public void createUserTest(){
		User u = new User();
		u.setUserName("roberto1234");
		u.setEmail("dev.robert2gl@gmail.com");
		u.setPassword("1234");

		User uCreated = userRepository.save(u);

		assertTrue(uCreated.getUserName().equals(u.getUserName()));

	}

	@Test
	public void createUserServiceTest(){
		User u = new User();
		u.setUserName("roberto123");
		u.setEmail("dev.robert3gl@gmail.com");
		u.setPassword("1234");

		User uCreated = userService.saveUser(u);

		assertTrue(uCreated.getUserName().equals(u.getUserName()));
	}

}
