package com.github.user_mgmt_ms.controller;

import com.github.user_mgmt_ms.model.User;
import com.github.user_mgmt_ms.service.UserService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
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

	@GetMapping()
	public Flux<User> getAllUsers() {
		return userService.getAllUsers();
	}

	@PostMapping("/login")
	public Mono<String> loginUser(@RequestBody User user) {
		System.out.println(user);
		return Mono.just("jwttoken");
	}
}
