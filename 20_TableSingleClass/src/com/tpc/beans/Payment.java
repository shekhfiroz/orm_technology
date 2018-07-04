package com.tpc.beans;

import java.io.Serializable;

public class Payment implements Serializable {

	/**
	 * we are trying to write the programme like table per class herarichy
	 * <hibernate-mapping>
	 * <subclass name="DomesticCat" extends="Cat" discriminator-value="D">
	 * <property name="name" type="string"/>  </subclass>
	 *  </hibernate-mapping>
	 */
	private static final long serialVersionUID = 1L;
	protected int paymentNo;
	protected String paymentDate;
	protected String paymentType;

	public int getPaymentNo() {
		return paymentNo;
	}

	public void setPaymentNo(int paymentNo) {
		this.paymentNo = paymentNo;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((paymentDate == null) ? 0 : paymentDate.hashCode());
		result = prime * result + paymentNo;
		result = prime * result + ((paymentType == null) ? 0 : paymentType.hashCode());
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
		Payment other = (Payment) obj;
		if (paymentDate == null) {
			if (other.paymentDate != null)
				return false;
		} else if (!paymentDate.equals(other.paymentDate))
			return false;
		if (paymentNo != other.paymentNo)
			return false;
		if (paymentType == null) {
			if (other.paymentType != null)
				return false;
		} else if (!paymentType.equals(other.paymentType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Payment [paymentNo=" + paymentNo + ", paymentDate=" + paymentDate + ", paymentType=" + paymentType
				+ "]";
	}

}
