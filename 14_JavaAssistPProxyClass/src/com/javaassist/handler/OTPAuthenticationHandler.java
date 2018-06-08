package com.javaassist.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.javaassist.service.NeftfundstransferServiceImpl;

public class OTPAuthenticationHandler implements InvocationHandler {
	/* InvocationHandler class is give by hibernate to */

	public OTPAuthenticationHandler(NeftfundstransferServiceImpl neftfundstransferServiceImpl) {
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		return null;
	}
}