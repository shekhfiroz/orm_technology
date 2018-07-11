package com.otm.beans;

import java.io.Serializable;

public class Flats implements Serializable {
	private static final long serialVersionUID = 1L;

	protected int flat_no;
	protected String flat_type;
	protected String description;
	protected String facing;
	protected String sqft;
	protected String floor_status;

	public int getFlat_no() {
		return flat_no;
	}

	public void setFlat_no(int flat_no) {
		this.flat_no = flat_no;
	}

	public String getFlat_type() {
		return flat_type;
	}

	public void setFlat_type(String flat_type) {
		this.flat_type = flat_type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFacing() {
		return facing;
	}

	public void setFacing(String facing) {
		this.facing = facing;
	}

	public String getSqft() {
		return sqft;
	}

	public void setSqft(String sqft) {
		this.sqft = sqft;
	}

	public String getFloor_status() {
		return floor_status;
	}

	public void setFloor_status(String floor_status) {
		this.floor_status = floor_status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((facing == null) ? 0 : facing.hashCode());
		result = prime * result + flat_no;
		result = prime * result + ((flat_type == null) ? 0 : flat_type.hashCode());
		result = prime * result + ((floor_status == null) ? 0 : floor_status.hashCode());
		result = prime * result + ((sqft == null) ? 0 : sqft.hashCode());
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
		Flats other = (Flats) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (facing == null) {
			if (other.facing != null)
				return false;
		} else if (!facing.equals(other.facing))
			return false;
		if (flat_no != other.flat_no)
			return false;
		if (flat_type == null) {
			if (other.flat_type != null)
				return false;
		} else if (!flat_type.equals(other.flat_type))
			return false;
		if (floor_status == null) {
			if (other.floor_status != null)
				return false;
		} else if (!floor_status.equals(other.floor_status))
			return false;
		if (sqft == null) {
			if (other.sqft != null)
				return false;
		} else if (!sqft.equals(other.sqft))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Flats [flat_no=" + flat_no + ", flat_type=" + flat_type + ", description=" + description + ", facing="
				+ facing + ", sqft=" + sqft + ", floor_status=" + floor_status + "]";
	}

}
