package com.ecs.commons.model;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

@SuppressWarnings("serial")
public abstract class BaseObject implements Serializable {

    /**
     * Returns a multi-line String with key=value pairs.
     * 
     * @return a String representation of this class.
     */
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
