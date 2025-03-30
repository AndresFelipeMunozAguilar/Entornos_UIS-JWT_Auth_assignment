package com.uis.jwt_auth_login.repositories;

import com.uis.jwt_auth_login.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;


public interface  UserRepository extends JpaRepository<User, Long> {

     Optional<User> findByLogin(String login);
}
