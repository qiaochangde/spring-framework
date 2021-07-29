package org.springframework.component;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public String getUser() {
		return "This is test";
	}
}
