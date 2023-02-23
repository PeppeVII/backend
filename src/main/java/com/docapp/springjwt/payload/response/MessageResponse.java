package com.docapp.springjwt.payload.response;

/**

 A response object representing a message returned by the server.
 */
public class MessageResponse {
  /**
   * The message string.
   */
  private String message;

  /**
   * Constructs a new {@code MessageResponse} object with the specified message.
   *
   * @param message the message string.
   */
  public MessageResponse(String message) {
    this.message = message;
  }

  /**
   * Returns the message string of this {@code MessageResponse} object.
   *
   * @return the message string.
   */
  public String getMessage() {
    return message;
  }

  /**
   * Sets the message string of this {@code MessageResponse} object.
   *
   * @param message the new message string.
   */
  public void setMessage(String message) {
    this.message = message;
  }
}
