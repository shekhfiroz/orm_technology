package com.idgen.beans;

import java.io.Serializable;

public class Store implements Serializable {
	private static final long serialVersionUID = 1L;
	protected String store_location;
	protected String store_id;
	protected String franchise_name;
	protected float total_sale;
	protected int employee;

	public String getStore_location() {
		return store_location;
	}

	public void setStore_location(String store_location) {
		this.store_location = store_location;
	}

	public String getStore_id() {
		return store_id;
	}

	public void setStore_id(String store_id) {
		this.store_id = store_id;
	}

	public String getFranchise_name() {
		return franchise_name;
	}

	public void setFranchise_name(String franchise_name) {
		this.franchise_name = franchise_name;
	}

	public float getTotal_sale() {
		return total_sale;
	}

	public void setTotal_sale(float total_sale) {
		this.total_sale = total_sale;
	}

	public int getEmployee() {
		return employee;
	}

	public void setEmployee(int employee) {
		this.employee = employee;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employee;
		result = prime * result + ((franchise_name == null) ? 0 : franchise_name.hashCode());
		result = prime * result + ((store_id == null) ? 0 : store_id.hashCode());
		result = prime * result + ((store_location == null) ? 0 : store_location.hashCode());
		result = prime * result + Float.floatToIntBits(total_sale);
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
		Store other = (Store) obj;
		if (employee != other.employee)
			return false;
		if (franchise_name == null) {
			if (other.franchise_name != null)
				return false;
		} else if (!franchise_name.equals(other.franchise_name))
			return false;
		if (store_id == null) {
			if (other.store_id != null)
				return false;
		} else if (!store_id.equals(other.store_id))
			return false;
		if (store_location == null) {
			if (other.store_location != null)
				return false;
		} else if (!store_location.equals(other.store_location))
			return false;
		if (Float.floatToIntBits(total_sale) != Float.floatToIntBits(other.total_sale))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Store [store_location=" + store_location + ", store_id=" + store_id + ", franchise_name="
				+ franchise_name + ", total_sale=" + total_sale + ", employee=" + employee + "]";
	}

}
