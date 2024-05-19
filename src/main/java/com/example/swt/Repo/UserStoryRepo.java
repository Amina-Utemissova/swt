package com.example.swt.Repo;


import com.example.swt.Entity.User;
import com.example.swt.Entity.UserStory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface UserStoryRepo extends JpaRepository<UserStory, Long>{


    @Query("SELECT u FROM UserStory u WHERE u.id = ?1")
    Optional<UserStory> findById(Long id);
}
