package com.owners.entities;

import java.io.Serializable;

public class Owners implements Serializable {

	private String owner_no;
	private String owner_first_nm;
	private String owner_last_nm;
	private String contact_no;
	private String email_address;
	private String address_line1;
	private String address_line2;
	private String city;
	private String state;
	private String zip;
	private String country;

	public String getOwner_no() {
		return owner_no;
	}

	public void setOwner_no(String owner_no) {
		this.owner_no = owner_no;
	}

	public String getOwner_first_nm() {
		return owner_first_nm;
	}

	public void setOwner_first_nm(String owner_first_nm) {
		this.owner_first_nm = owner_first_nm;
	}

	public String getOwner_last_nm() {
		return owner_last_nm;
	}

	public void setOwner_last_nm(String owner_last_nm) {
		this.owner_last_nm = owner_last_nm;
	}

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

	public String getEmail_address() {
		return email_address;
	}

	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}

	public String getAddress_line1() {
		return address_line1;
	}

	public void setAddress_line1(String address_line1) {
		this.address_line1 = address_line1;
	}

	public String getAddress_line2() {
		return address_line2;
	}

	public void setAddress_line2(String address_line2) {
		this.address_line2 = address_line2;
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

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Owners [owner_no=" + owner_no + ", owner_first_nm=" + owner_first_nm + ", owner_last_nm="
				+ owner_last_nm + ", contact_no=" + contact_no + ", email_address=" + email_address + ", address_line1="
				+ address_line1 + ", address_line2=" + address_line2 + ", city=" + city + ", state=" + state + ", zip="
				+ zip + ", country=" + country + "]";
	}

}
