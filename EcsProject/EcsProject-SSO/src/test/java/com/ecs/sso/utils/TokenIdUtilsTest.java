package com.ecs.sso.utils;

import org.apache.commons.lang.RandomStringUtils;
import org.junit.Test;
import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;

public class TokenIdUtilsTest {

	private static final XLogger LOGGER = XLoggerFactory.getXLogger(TokenIdUtilsTest.class);

	@Test
	public void testGen() {
		for(int i=0;i<1000;i++){
			System.out.println(RandomStringUtils.random(10, "abcdefghijklmnoporst347129057sadfuytiywqqir[vzncv,zxn/';lp]/,.mzv,zmgu-3124618325@&!$#!$@$^@)$^^@_$_%_"));
		}

	}
}
