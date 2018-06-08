package com.javaassist.service;

public interface FundTransferService {
	String transfer(String from,String to,float amount,String message);
}