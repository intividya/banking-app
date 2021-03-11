package com.pmz.simplebankingapp.repository;

import com.pmz.simplebankingapp.domain.entity.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findUserByUsername(String username);

	Optional<User> findUserByEmail(String email);

}
