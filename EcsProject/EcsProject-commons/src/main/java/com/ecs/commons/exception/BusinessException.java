package com.ecs.commons.exception;

/**
 *************************************************************** 
 * <p>
 * ManagerException.java
 * 
 * @DESCRIPTION :请描述一下文件功能
 * @AUTHOR : Toney.li
 * @DATE :2014年5月26日
 *       </p>
 **************************************************************** 
 */
public class BusinessException extends RuntimeException {

  /**
	 * 
	 */
  private static final long serialVersionUID = -1741486913049280570L;

  private String errorCode;

  public String getErrorCode() {
    return errorCode;
  }

  public BusinessException(String errorCode, String message, Throwable t) {
    super(message, t);
    this.errorCode = errorCode;
  }

  public BusinessException(Throwable t) {
    super(t);
  }

  public BusinessException(String message) {
    super(message);
  }

  public BusinessException(String message, Throwable t) {
    super(message, t);
  }

  public BusinessException(String errorCode, String message) {
    super(message);
    this.errorCode = errorCode;
  }


}
