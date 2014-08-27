package com.ecs.core.exception;

/**
 *************************************************************** 
 * <p>
 * ManagerException.java
 * @DESCRIPTION :请描述一下文件功能
 * @AUTHOR : Toney.li
 * @DATE :2014年5月26日
 *       </p>
 **************************************************************** 
 */
public class ManagerException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1741486913049280570L;

	public ManagerException() {
		super();
	}

	public ManagerException(Throwable t) {
		super(t);
	}

	public ManagerException(String message) {
		super(message);
	}

	public ManagerException(String message, Throwable t) {
		super(message, t);
	}
	

}
