package com.tpc.beans;

public class CardPayment extends Payment {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String cardNos;
	protected String cardAccountNo;
	protected String expiryDate;
	protected String cardLimit;

	public String getCardNos() {
		return cardNos;
	}

	public void setCardNos(String cardNos) {
		this.cardNos = cardNos;
	}

	public String getCardAccountNo() {
		return cardAccountNo;
	}

	public void setCardAccountNo(String cardAccountNo) {
		this.cardAccountNo = cardAccountNo;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getCardLimit() {
		return cardLimit;
	}

	public void setCardLimit(String cardLimit) {
		this.cardLimit = cardLimit;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cardAccountNo == null) ? 0 : cardAccountNo.hashCode());
		result = prime * result + ((cardLimit == null) ? 0 : cardLimit.hashCode());
		result = prime * result + ((cardNos == null) ? 0 : cardNos.hashCode());
		result = prime * result + ((expiryDate == null) ? 0 : expiryDate.hashCode());
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
		CardPayment other = (CardPayment) obj;
		if (cardAccountNo == null) {
			if (other.cardAccountNo != null)
				return false;
		} else if (!cardAccountNo.equals(other.cardAccountNo))
			return false;
		if (cardLimit == null) {
			if (other.cardLimit != null)
				return false;
		} else if (!cardLimit.equals(other.cardLimit))
			return false;
		if (cardNos == null) {
			if (other.cardNos != null)
				return false;
		} else if (!cardNos.equals(other.cardNos))
			return false;
		if (expiryDate == null) {
			if (other.expiryDate != null)
				return false;
		} else if (!expiryDate.equals(other.expiryDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CardPayment [cardNos=" + cardNos + ", cardAccountNo=" + cardAccountNo + ", expiryDate=" + expiryDate
				+ ", cardLimit=" + cardLimit + ", paymentNo=" + paymentNo + ", paymentDate=" + paymentDate
				+ ", paymentType=" + paymentType + "]";
	}

}
