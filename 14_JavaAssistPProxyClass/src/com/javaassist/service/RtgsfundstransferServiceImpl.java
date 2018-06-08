package com.javaassist.service;

public class RtgsfundstransferServiceImpl implements FundTransferService {

	@Override
	public String transfer(String from, String to, float amount, String message) {
		return "RTGS fund Transfer";
	}

}
