package com.otm.beans;

import java.util.List;

public class Blocks {
	protected int block_no;
	protected String block_nm;
	protected String description;
	protected String units;
	protected List<Flats> flats;

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

	public List<Flats> getFlats() {
		return flats;
	}

	public void setFlats(List<Flats> flats) {
		this.flats = flats;
	}

	@Override
	public String toString() {
		return "Blocks [block_no=" + block_no + ", block_nm=" + block_nm + ", description=" + description + ", units="
				+ units + ", flats=" + flats + "]";
	}

}
