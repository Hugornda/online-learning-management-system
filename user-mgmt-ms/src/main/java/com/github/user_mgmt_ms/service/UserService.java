package com.github.user_mgmt_ms.service;

import com.github.user_mgmt_ms.model.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {
	 Mono<User> createUser(User user);
	 Flux<User> getAllUsers();
}
