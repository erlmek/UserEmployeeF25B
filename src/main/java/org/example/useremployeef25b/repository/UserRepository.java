package org.example.useremployeef25b.repository;

import org.example.useremployeef25b.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
