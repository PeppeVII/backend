package com.docapp.springjwt.payload.request;

import javax.validation.constraints.NotBlank;

/**

 A class representing a login request.
 */
public class LoginRequest {
    @NotBlank
    private String username;
    /*private String email;
    public String getEmail() {
    return email;
    }
    public void setEmail(String email) {
    this.email = email;
    }*/
    @NotBlank
    private String password;
    /**
     Default constructor for LoginRequest.
     */
    public LoginRequest() {
    }
    /**
     Constructor for LoginRequest.
     @param username the username of the user trying to login
     @param password the password of the user trying to login
     */
    public LoginRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }





    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
