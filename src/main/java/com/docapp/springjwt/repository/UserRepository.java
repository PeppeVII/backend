package com.docapp.springjwt.repository;

import java.util.Optional;

import com.docapp.springjwt.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**

 The UserRepository interface extends JpaRepository interface
 and provides methods to interact with User entities in the database.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  /**
   Retrieves the User entity with the specified username.
   @param username the username of the User entity to retrieve
   @return an optional User entity with the specified username, or an empty optional if no match found
   */
  Optional<User> findByUsername(String username);
  /**
   Checks if a User entity with the specified username exists in the database.
   @param username the username to check for
   @return true if a User entity with the specified username exists, false otherwise
   */
  Boolean existsByUsername(String username);
  /**
   Checks if a User entity with the specified email address exists in the database.
   @param email the email address to check for
   @return true if a User entity with the specified email address exists, false otherwise
   */
  Boolean existsByEmail(String email);
}


