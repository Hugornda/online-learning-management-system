package com.github.user_mgmt_ms.service.impl;

import com.github.user_mgmt_ms.model.User;
import com.github.user_mgmt_ms.repository.UserRepository;
import com.github.user_mgmt_ms.service.UserService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserServiceImpl implements UserService {

	UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public Mono<User> createUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public Mono<User> updateUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public Mono<User> getUser(String id) {
		return userRepository.findById(id);
	}

	@Override
	public Flux<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public Mono<Void> deleteUser(String id) {
		return null;
	}
}
