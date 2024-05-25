package org.backendada.springpostgress.user.repository;

import org.backendada.springpostgress.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
