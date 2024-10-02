package com.github.user_mgmt_ms.controller;

import com.github.user_mgmt_ms.model.User;
import com.github.user_mgmt_ms.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
public class UserController {

	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@PostMapping()
	public Mono<User> createUser(@RequestBody User user) {

		return userService.createUser(user);
	}
}
