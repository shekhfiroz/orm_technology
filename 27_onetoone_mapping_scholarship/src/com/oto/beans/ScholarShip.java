package com.oto.beans;

import java.io.Serializable;

public class ScholarShip implements Serializable {

	protected int admissionNo;
	protected String scholarshipType;
	protected String schoarshipName;
	protected int amount;
	protected Admission admission;

	public int getAdmissionNo() {
		return admissionNo;
	}

	public void setAdmissionNo(int admissionNo) {
		this.admissionNo = admissionNo;
	}

	public String getScholarshipType() {
		return scholarshipType;
	}

	public void setScholarshipType(String scholarshipType) {
		this.scholarshipType = scholarshipType;
	}

	public String getSchoarshipName() {
		return schoarshipName;
	}

	public void setSchoarshipName(String schoarshipName) {
		this.schoarshipName = schoarshipName;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Admission getAdmission() {
		return admission;
	}

	public void setAdmission(Admission admission) {
		this.admission = admission;
	}

	@Override
	public String toString() {
		return "ScholarShip [admissionNo=" + admissionNo + ", scholarshipType=" + scholarshipType + ", schoarshipName="
				+ schoarshipName + ", amount=" + amount + ", admission=" + admission + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((admission == null) ? 0 : admission.hashCode());
		result = prime * result + admissionNo;
		result = prime * result + amount;
		result = prime * result + ((schoarshipName == null) ? 0 : schoarshipName.hashCode());
		result = prime * result + ((scholarshipType == null) ? 0 : scholarshipType.hashCode());
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
		ScholarShip other = (ScholarShip) obj;
		if (admission == null) {
			if (other.admission != null)
				return false;
		} else if (!admission.equals(other.admission))
			return false;
		if (admissionNo != other.admissionNo)
			return false;
		if (amount != other.amount)
			return false;
		if (schoarshipName == null) {
			if (other.schoarshipName != null)
				return false;
		} else if (!schoarshipName.equals(other.schoarshipName))
			return false;
		if (scholarshipType == null) {
			if (other.scholarshipType != null)
				return false;
		} else if (!scholarshipType.equals(other.scholarshipType))
			return false;
		return true;
	}

}