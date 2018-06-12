package com.genid.beans;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "block")
public class Block implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "block_no")
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected int block_no;

	@Column(name = "block_name")
	protected String block_name;

	@Column(name = "description")
	protected String description;

	@Column(name = "unit")
	protected String unit;

	public int getBlock_no() {
		return block_no;
	}

	public void setBlock_no(int block_no) {
		this.block_no = block_no;
	}

	public String getBlock_name() {
		return block_name;
	}

	public void setBlock_name(String block_name) {
		this.block_name = block_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Block [block_no=" + block_no + ", block_name=" + block_name + ", description=" + description + ", unit="
				+ unit + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((block_name == null) ? 0 : block_name.hashCode());
		result = prime * result + block_no;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((unit == null) ? 0 : unit.hashCode());
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
		Block other = (Block) obj;
		if (block_name == null) {
			if (other.block_name != null)
				return false;
		} else if (!block_name.equals(other.block_name))
			return false;
		if (block_no != other.block_no)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (unit == null) {
			if (other.unit != null)
				return false;
		} else if (!unit.equals(other.unit))
			return false;
		return true;
	}

}
