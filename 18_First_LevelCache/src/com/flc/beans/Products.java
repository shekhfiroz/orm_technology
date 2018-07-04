package com.flc.beans;

import java.io.Serializable;

public class Products implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5734463959208267251L;
	protected int product_id;
	protected String name;
	protected float price;
	protected String expiry_date;
	protected String manufacture_date;

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getExpiry_date() {
		return expiry_date;
	}

	public void setExpiry_date(String expiry_date) {
		this.expiry_date = expiry_date;
	}

	public String getManufacture_date() {
		return manufacture_date;
	}

	public void setManufacture_date(String manufacture_date) {
		this.manufacture_date = manufacture_date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((expiry_date == null) ? 0 : expiry_date.hashCode());
		result = prime * result + ((manufacture_date == null) ? 0 : manufacture_date.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(price);
		result = prime * result + product_id;
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
		Products other = (Products) obj;
		if (expiry_date == null) {
			if (other.expiry_date != null)
				return false;
		} else if (!expiry_date.equals(other.expiry_date))
			return false;
		if (manufacture_date == null) {
			if (other.manufacture_date != null)
				return false;
		} else if (!manufacture_date.equals(other.manufacture_date))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		if (product_id != other.product_id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Products [product_id=" + product_id + ", name=" + name + ", price=" + price + ", expiry_date="
				+ expiry_date + ", manufacture_date=" + manufacture_date + "]";
	}

}
