package com.github.user_mgmt_ms.service.impl;

import com.github.user_mgmt_ms.model.User;
import com.github.user_mgmt_ms.repository.UserRepository;
import com.github.user_mgmt_ms.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserServiceImpl implements UserService {
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public Mono<User> createUser(User user) {
		return userRepository.save(user)
				.doOnNext(u -> logger.info("User created: {}", u));
	}



	@Override
	public Flux<User> getAllUsers() {
		return userRepository.findAll().doOnNext(u -> {
			u.setPassword("");
			logger.info(u.toString());
		});
	}

}
