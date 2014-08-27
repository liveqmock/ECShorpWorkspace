package com.ecs.commons.exception;


public class ExceptionFactory {

  public static RuntimeException buildBusinessException(String errorCode, String message, Throwable t) {
    return new BusinessException(errorCode,message,t);
  }
  public static RuntimeException buildAdminException(String errorCode, String message, Throwable t) {
    return new AdminException(errorCode,message,t);
  }
  public static RuntimeException buildSSOException(String errorCode, String message, Throwable t) {
    return new SSOException(errorCode,message,t);
  }
  public static RuntimeException buildBusinessException(String errorCode, String message) {
    return new BusinessException(errorCode,message);
  }
  public static RuntimeException buildAdminException(String errorCode, String message) {
    return new AdminException(errorCode,message);
  }
  public static RuntimeException buildSSOException(String errorCode, String message) {
    return new SSOException(errorCode,message);
  }

}
