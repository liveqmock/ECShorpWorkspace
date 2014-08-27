package com.ecs.commons.exception;

public class SSOException extends RuntimeException {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  private String errorCode;

  public String getErrorCode() {
    return errorCode;
  }

  public SSOException(String errorCode, String message, Throwable t) {
    super(message, t);
    this.errorCode = errorCode;
  }

  public SSOException(Throwable t) {
    super(t);
  }

  public SSOException(String message) {
    super(message);
  }

  public SSOException(String message, Throwable t) {
    super(message, t);
  }

  public SSOException(String errorCode, String message) {
    super(message);
    this.errorCode = errorCode;
  }

}
