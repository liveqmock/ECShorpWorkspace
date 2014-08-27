package com.ecs.commons.exception;

public class AdminException extends RuntimeException {

  /**
   * 
   */
  private static final long serialVersionUID = -7348781460735642733L;


  private String errorCode;

  public String getErrorCode() {
    return errorCode;
  }

  public AdminException(String errorCode, String message, Throwable t) {
    super(message, t);
    this.errorCode = errorCode;
  }

  public String getExceptionErrorCode() {
    return this.errorCode;
  }

  public AdminException(Throwable t) {
    super(t);
  }

  public AdminException(String message) {
    super(message);
  }

  public AdminException(String message, Throwable t) {
    super(message, t);
  }

  public AdminException(String errorCode, String message) {
    super(message);
    this.errorCode = errorCode;
  }

}
