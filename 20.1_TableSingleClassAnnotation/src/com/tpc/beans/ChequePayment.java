package com.tpc.beans;

public class ChequePayment extends Payment {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String chequeNo;
	protected String chequeissueDate;
	protected float amount;

	public String getChequeNo() {
		return chequeNo;
	}

	public void setChequeNo(String chequeNo) {
		this.chequeNo = chequeNo;
	}

	public String getChequeissueDate() {
		return chequeissueDate;
	}

	public void setChequeissueDate(String chequeissueDate) {
		this.chequeissueDate = chequeissueDate;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(amount);
		result = prime * result + ((chequeNo == null) ? 0 : chequeNo.hashCode());
		result = prime * result + ((chequeissueDate == null) ? 0 : chequeissueDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChequePayment other = (ChequePayment) obj;
		if (Float.floatToIntBits(amount) != Float.floatToIntBits(other.amount))
			return false;
		if (chequeNo == null) {
			if (other.chequeNo != null)
				return false;
		} else if (!chequeNo.equals(other.chequeNo))
			return false;
		if (chequeissueDate == null) {
			if (other.chequeissueDate != null)
				return false;
		} else if (!chequeissueDate.equals(other.chequeissueDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ChequePayment [chequeNo=" + chequeNo + ", chequeissueDate=" + chequeissueDate + ", amount=" + amount
				+ ", paymentNo=" + paymentNo + ", paymentDate=" + paymentDate + ", paymentType=" + paymentType + "]";
	}

}
