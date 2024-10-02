package com.github.user_mgmt_ms.service;

import com.github.user_mgmt_ms.model.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {

	public Mono<User> createUser(User user);
	public Mono<User> updateUser(User user);
	public Mono<User> getUser(String id);
	public Flux<User> getAllUsers();
	public Mono<Void> deleteUser(String id);
}
