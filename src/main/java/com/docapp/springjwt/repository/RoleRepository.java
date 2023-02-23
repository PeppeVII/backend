package com.docapp.springjwt.repository;

import java.util.Optional;

import com.docapp.springjwt.models.ERole;
import com.docapp.springjwt.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**

 The RoleRepository interface extends JpaRepository interface
 and provides methods to interact with Role entities in the database.
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  /**
   Retrieves the Role entity with the specified name.
   @param name the name of the Role entity to retrieve
   @return an optional Role entity with the specified name, or an empty optional if no match found
   */
  Optional<Role> findByName(ERole name);
}