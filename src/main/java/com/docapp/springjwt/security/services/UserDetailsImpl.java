package com.docapp.springjwt.security.services;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.docapp.springjwt.models.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;
/**

 This class implements the Spring Security UserDetails interface to represent a user's details.
 It contains information such as the user's ID, username, email, password, and granted authorities.
 */

public class UserDetailsImpl implements UserDetails {
  private static final long serialVersionUID = 1L;

  private Long id;

  private String username;

  private String email;

  @JsonIgnore
  private String password;

  private Collection<? extends GrantedAuthority> authorities;

  /**

   Constructs a new UserDetailsImpl object with the specified username, email, password, and granted authorities.
   @param username the username of the user
   @param email the email address of the user
   @param password the password of the user (will be stored as a hash)
   @param authorities the collection of granted authorities for the user
   */

  public UserDetailsImpl(String username, String email, String password,
      Collection<? extends GrantedAuthority> authorities) {
    this.username = username;
    this.email = email;
    this.password = password;
    this.authorities = authorities;
  }

  /**

   Builds a new UserDetailsImpl object based on the specified User object. Retrieves the user's granted authorities
   from the roles associated with the user.
   @param user the User object to be used to construct the UserDetailsImpl object
   @return a new UserDetailsImpl object constructed from the specified User object
   */

  public static UserDetailsImpl build(User user) {
    List<GrantedAuthority> authorities = user.getRoles().stream()
        .map(role -> new SimpleGrantedAuthority(role.getName().name()))
        .collect(Collectors.toList());

    return new UserDetailsImpl(
        user.getUsername(), 
        user.getEmail(),
        user.getPassword(), 
        authorities);
  }
  /**

   Returns the authorities granted to the user.
   @return the collection of granted authorities for the user
   */

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return authorities;
  }

  public String getEmail() {
    return email;
  }

  @Override
  public String getPassword() {
    return password;
  }

  @Override
  public String getUsername() {
    return username;
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    UserDetailsImpl user = (UserDetailsImpl) o;
    return Objects.equals(id, user.id);
  }
}
