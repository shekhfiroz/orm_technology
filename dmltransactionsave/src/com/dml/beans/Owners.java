package com.dml.beans;

import java.io.Serializable;

public class Owners implements Serializable {
	private Integer owner_no;
	private String owner_first_nm;
	private String owner_last_nm;
	private String contact_no;
	private String email_address;
	private String address_line1;
	private String address_line2;
	private String city;
	private String state;
	private Integer zip;
	private String country;

	public Integer getOwner_no() {
		return owner_no;
	}

	public void setOwner_no(Integer owner_no) {
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

	public Integer getZip() {
		return zip;
	}

	public void setZip(Integer zip) {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address_line1 == null) ? 0 : address_line1.hashCode());
		result = prime * result + ((address_line2 == null) ? 0 : address_line2.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((contact_no == null) ? 0 : contact_no.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((email_address == null) ? 0 : email_address.hashCode());
		result = prime * result + ((owner_first_nm == null) ? 0 : owner_first_nm.hashCode());
		result = prime * result + ((owner_last_nm == null) ? 0 : owner_last_nm.hashCode());
		result = prime * result + ((owner_no == null) ? 0 : owner_no.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((zip == null) ? 0 : zip.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Owners other = (Owners) obj;
		if (address_line1 == null) {
			if (other.address_line1 != null)
				return false;
		} else if (!address_line1.equals(other.address_line1))
			return false;
		if (address_line2 == null) {
			if (other.address_line2 != null)
				return false;
		} else if (!address_line2.equals(other.address_line2))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (contact_no == null) {
			if (other.contact_no != null)
				return false;
		} else if (!contact_no.equals(other.contact_no))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (email_address == null) {
			if (other.email_address != null)
				return false;
		} else if (!email_address.equals(other.email_address))
			return false;
		if (owner_first_nm == null) {
			if (other.owner_first_nm != null)
				return false;
		} else if (!owner_first_nm.equals(other.owner_first_nm))
			return false;
		if (owner_last_nm == null) {
			if (other.owner_last_nm != null)
				return false;
		} else if (!owner_last_nm.equals(other.owner_last_nm))
			return false;
		if (owner_no == null) {
			if (other.owner_no != null)
				return false;
		} else if (!owner_no.equals(other.owner_no))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (zip == null) {
			if (other.zip != null)
				return false;
		} else if (!zip.equals(other.zip))
			return false;
		return true;
	}
}
