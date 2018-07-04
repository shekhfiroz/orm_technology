package com.oto.beans;

public class Admission {

	protected int admissionNo;  //admisisonNo
	protected String admissionDate;
	protected String amount;

	public String getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(String admissionDate) {
		this.admissionDate = admissionDate;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}


	@Override
	public String toString() {
		return "Admission [admissionNo=" + admissionNo + ", admissionDate=" + admissionDate + ", amount=" + amount
				+ "]";
	}

	public int getAdmissionNo() {
		return admissionNo;
	}

	public void setAdmissionNo(int admissionNo) {
		this.admissionNo = admissionNo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((admissionDate == null) ? 0 : admissionDate.hashCode());
		result = prime * result + admissionNo;
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
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
		Admission other = (Admission) obj;
		if (admissionDate == null) {
			if (other.admissionDate != null)
				return false;
		} else if (!admissionDate.equals(other.admissionDate))
			return false;
		if (admissionNo != other.admissionNo)
			return false;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		return true;
	}

}