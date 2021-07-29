package org.springframework.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("userController")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private User user;

	public String hello() {
		return userService.getUser();
	}

}
