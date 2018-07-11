package com.otm.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

public class Order implements Serializable {

	protected int OrderId;
	protected String ShippingAddress;
	protected Date DeliveryDate;
	protected Map<String, Product> product;

	public int getOrderId() {
		return OrderId;
	}

	public void setOrderId(int orderId) {
		OrderId = orderId;
	}

	public String getShippingAddress() {
		return ShippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		ShippingAddress = shippingAddress;
	}

	public Date getDeliveryDate() {
		return DeliveryDate;
	}

	public void setDeliveryDate(Date date) {
		DeliveryDate = date;
	}

	public Map<String, Product> getProduct() {
		return product;
	}

	public void setProduct(Map<String, Product> product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Order [OrderId=" + OrderId + ", ShippingAddress=" + ShippingAddress + ", DeliveryDate=" + DeliveryDate
				+ ", product=" + product + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DeliveryDate == null) ? 0 : DeliveryDate.hashCode());
		result = prime * result + OrderId;
		result = prime * result + ((ShippingAddress == null) ? 0 : ShippingAddress.hashCode());
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
		Order other = (Order) obj;
		if (DeliveryDate == null) {
			if (other.DeliveryDate != null)
				return false;
		} else if (!DeliveryDate.equals(other.DeliveryDate))
			return false;
		if (OrderId != other.OrderId)
			return false;
		if (ShippingAddress == null) {
			if (other.ShippingAddress != null)
				return false;
		} else if (!ShippingAddress.equals(other.ShippingAddress))
			return false;
		return true;
	}

}
