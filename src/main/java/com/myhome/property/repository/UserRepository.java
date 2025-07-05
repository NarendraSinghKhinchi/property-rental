package com.myhome.property.repository;

import com.myhome.property.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    /**
     * A repository in Spring is responsible for interacting with the database.
     * Spring Data JPA provides built-in interfaces like JpaRepository that give us
     * all these methods out of the box — without writing actual SQL.
     */
    Optional<User> findByEmail(String email);

    boolean existsByEmail(String email);
}
