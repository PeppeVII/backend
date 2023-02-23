package com.docapp.springjwt.security.services;


import com.docapp.springjwt.models.User;
import com.docapp.springjwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**

 This class implements the Spring Security UserDetailsService interface to load user-specific data.
 It provides an implementation for the loadUserByUsername method which retrieves a user from the UserRepository
 based on the provided username and returns a UserDetails object.
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
  /**

   Autowired instance of the UserRepository to retrieve user information.
   */
  @Autowired
  UserRepository userRepository;
  /**

   Implementation of the UserDetailsService interface's loadUserByUsername method. This method retrieves a user from
   the UserRepository based on the provided username, and returns a UserDetails object for that user.
   @param username the username of the user to be retrieved
   @return UserDetails object for the specified user
   @throws UsernameNotFoundException if a user with the specified username is not found in the UserRepository
   */
  @Override
  @Transactional
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    User user = userRepository.findByUsername(username)
            .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));
    return UserDetailsImpl.build(user);
  }
}