package com.example.swt.user;

import com.example.swt.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE u.email = ?1 AND u.passwordHash = ?2")
     User findByEmailAndPass(String email, String passwordHash);
}
