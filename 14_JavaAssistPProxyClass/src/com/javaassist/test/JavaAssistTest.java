package com.javaassist.test;

import java.lang.reflect.Proxy;
import com.javaassist.handler.OTPAuthenticationHandler;
import com.javaassist.service.FundTransferService;
import com.javaassist.service.NeftfundstransferServiceImpl;

public class JavaAssistTest {

	public static void main(String[] args) {
		FundTransferService fcs = (FundTransferService) Proxy.newProxyInstance(
				JavaAssistTest.class.getClass().getClassLoader(), new Class[] { FundTransferService.class },
				new OTPAuthenticationHandler(new NeftfundstransferServiceImpl()));
		fcs.transfer("SBI_IN", "HDFC_GKP", (float) 2002.0, "for food");
	}

}
