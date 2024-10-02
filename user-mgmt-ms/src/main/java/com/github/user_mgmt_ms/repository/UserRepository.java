package com.github.user_mgmt_ms.repository;

import com.github.user_mgmt_ms.model.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface UserRepository extends ReactiveCrudRepository<User, String> {
	Mono<User> findById(String id);
}
