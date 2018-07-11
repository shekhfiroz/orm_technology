package com.otm.beans;

import java.io.Serializable;

public class Product implements Serializable {
	
	protected int ProductId;
	protected String ProductName;
	protected String ProductType;
	protected String Price;

	public int getProductId() {
		return ProductId;
	}

	public void setProductId(int productId) {
		ProductId = productId;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public String getProductType() {
		return ProductType;
	}

	public void setProductType(String productType) {
		ProductType = productType;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String price) {
		Price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Price == null) ? 0 : Price.hashCode());
		result = prime * result + ProductId;
		result = prime * result + ((ProductName == null) ? 0 : ProductName.hashCode());
		result = prime * result + ((ProductType == null) ? 0 : ProductType.hashCode());
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
		Product other = (Product) obj;
		if (Price == null) {
			if (other.Price != null)
				return false;
		} else if (!Price.equals(other.Price))
			return false;
		if (ProductId != other.ProductId)
			return false;
		if (ProductName == null) {
			if (other.ProductName != null)
				return false;
		} else if (!ProductName.equals(other.ProductName))
			return false;
		if (ProductType == null) {
			if (other.ProductType != null)
				return false;
		} else if (!ProductType.equals(other.ProductType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Product [ProductId=" + ProductId + ", ProductName=" + ProductName + ", ProductType=" + ProductType
				+ ", Price=" + Price + "]";
	}

}
