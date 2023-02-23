package com.docapp.springjwt.payload.request;

import java.util.Set;

import javax.validation.constraints.*;

/**

 A request object for user signup.
 */
public class SignupRequest {
  /**

   The username of the user.
   */
  @NotBlank
  @Size(min = 6, max = 16)
  private String username;
  /**

   The email of the user.
   */
  @NotBlank
  @Size(max = 40)
  @Email
  private String email;
  /**

   The roles assigned to the user.
   */
  private Set<String> role;
  /**

   The password of the user.
   */
  @NotBlank
  @Size(min = 6, max = 64)
  private String password;
  /**

   Constructs an empty SignupRequest object.
   */
  public SignupRequest() {}
  /**

   Constructs a SignupRequest object with the specified parameters.
   @param username the username of the user
   @param email the email of the user
   @param role the roles assigned to the user
   @param password the password of the user
   */
  public SignupRequest(String username, String email, Set<String> role, String password) {
    this.username = username;
    this.email = email;
    this.role = role;
    this.password = password;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Set<String> getRole() {
    return this.role;
  }

  public void setRole(Set<String> role) {
    this.role = role;
  }
}
