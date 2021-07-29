package org.springframework.component.config;

import org.springframework.component.Address;
import org.springframework.component.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfig {
	@Bean
	public User getUser(Address address) {

		User user = new User();
		user.setUsername("zhangsan");
		user.setAddress(address);

		return user;
	}

	@Bean
	public Address getAddress() {
		Address address = new Address();
		address.setAddressName("北京市海淀区");
		return address;
	}
}
