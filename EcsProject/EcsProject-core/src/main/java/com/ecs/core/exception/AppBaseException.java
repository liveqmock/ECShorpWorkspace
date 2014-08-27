package com.ecs.core.exception;

/**
 *************************************************************** 
 * <p>
 * AppBaseException.java
 * @DESCRIPTION :应用全局Exception
 * @AUTHOR : Toney.li
 * @DATE :下午3:33:32
 *       </p>
 **************************************************************** 
 */
public class AppBaseException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1741486913049280570L;

	public AppBaseException() {
		super();
	}

	public AppBaseException(Throwable t) {
		super(t);
	}

	public AppBaseException(String message) {
		super(message);
	}

	public AppBaseException(String message, Throwable t) {
		super(message, t);
	}
	
	public String getMessageWithSupportCode(){
		
		return "";
	}

}
