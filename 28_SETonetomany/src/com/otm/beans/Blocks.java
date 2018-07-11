package com.otm.beans;

import java.util.Set;

public class Blocks {
	protected int block_no;
	protected String block_nm;
	protected String description;
	protected String units;
	protected Set<Flats> flats;

	public int getBlock_no() {
		return block_no;
	}

	public void setBlock_no(int block_no) {
		this.block_no = block_no;
	}

	public String getBlock_nm() {
		return block_nm;
	}

	public void setBlock_nm(String block_nm) {
		this.block_nm = block_nm;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public Set<Flats> getFlats() {
		return flats;
	}

	public void setFlats(Set<Flats> flats) {
		this.flats = flats;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((block_nm == null) ? 0 : block_nm.hashCode());
		result = prime * result + block_no;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((flats == null) ? 0 : flats.hashCode());
		result = prime * result + ((units == null) ? 0 : units.hashCode());
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
		Blocks other = (Blocks) obj;
		if (block_nm == null) {
			if (other.block_nm != null)
				return false;
		} else if (!block_nm.equals(other.block_nm))
			return false;
		if (block_no != other.block_no)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (flats == null) {
			if (other.flats != null)
				return false;
		} else if (!flats.equals(other.flats))
			return false;
		if (units == null) {
			if (other.units != null)
				return false;
		} else if (!units.equals(other.units))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Blocks [block_no=" + block_no + ", block_nm=" + block_nm + ", description=" + description + ", units="
				+ units + ", flats=" + flats + "]";
	}

}
