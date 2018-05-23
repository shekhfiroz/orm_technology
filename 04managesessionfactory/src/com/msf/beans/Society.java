package com.msf.beans;

import java.io.Serializable;
import java.util.Date;

public class Society implements Serializable {

	private static final long serialVersionUID = 1L;
	protected int society_no;
	protected String society_nm;
	protected String registered_nm;
	protected Date society_reg_date;
	protected String addressLine1;
	protected String addressLine2;
	protected String city;
	protected String state;
	protected String country;
	protected String mobile_nbr;
	protected String email_address;

	public Society() {

	}

	public int getSociety_no() {
		return society_no;
	}

	public void setSociety_no(int society_no) {
		this.society_no = society_no;
	}

	public String getSociety_nm() {
		return society_nm;
	}

	public void setSociety_nm(String society_nm) {
		this.society_nm = society_nm;
	}

	public String getRegistered_nm() {
		return registered_nm;
	}

	public void setRegistered_nm(String registered_nm) {
		this.registered_nm = registered_nm;
	}

	public Date getSociety_reg_date() {
		return society_reg_date;
	}

	public void setSociety_reg_date(Date society_reg_date) {
		this.society_reg_date = society_reg_date;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getMobile_nbr() {
		return mobile_nbr;
	}

	public void setMobile_nbr(String mobile_nbr) {
		this.mobile_nbr = mobile_nbr;
	}

	public String getEmail_address() {
		return email_address;
	}

	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Society [society_no=" + society_no + ", society_nm=" + society_nm + ", registered_nm=" + registered_nm
				+ ", society_reg_date=" + society_reg_date + ", addressLine1=" + addressLine1 + ", addressLine2="
				+ addressLine2 + ", city=" + city + ", state=" + state + ", country=" + country + ", mobile_nbr="
				+ mobile_nbr + ", email_address=" + email_address + "]";
	}

}
