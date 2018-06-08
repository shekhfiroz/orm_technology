package com.javaassist.service;

public class NeftfundstransferServiceImpl implements FundTransferService {
	@Override
	public String transfer(String from, String to, float amount, String message) {
		return "NEFT Transfer is called" ;
	}}
