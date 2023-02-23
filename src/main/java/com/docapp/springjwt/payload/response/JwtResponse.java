package com.docapp.springjwt.payload.response;

import java.util.List;
/**

 A class that represents the JSON response containing a JWT token and related user details.
 */

public class JwtResponse {


  private String token; // The JWT token string
  private String type = "Bearer"; // The type of token, in this case "Bearer"
  private String username; // The username of the authenticated user
  private String email; // The email of the authenticated user
  private List<String> roles; // A list of roles assigned to the authenticated user

  /**

   Constructs a new JwtResponse object with the given JWT token, username, email, and roles.
   @param accessToken the JWT token string
   @param username the username of the authenticated user
   @param email the email of the authenticated user
   @param roles a list of roles assigned to the authenticated user
   */

  public JwtResponse(String accessToken, String username, String email, List<String> roles) {
    this.token = accessToken;
    this.username = username;
    this.email = email;
    this.roles = roles;
  }

  public String getAccessToken() {
    return token;
  }

  public void setAccessToken(String accessToken) {
    this.token = accessToken;
  }

  public String getTokenType() {
    return type;
  }

  public void setTokenType(String tokenType) {
    this.type = tokenType;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public List<String> getRoles() {
    return roles;
  }
}
