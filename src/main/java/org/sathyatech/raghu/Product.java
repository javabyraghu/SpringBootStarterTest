package org.sathyatech.raghu;

public class Product {

	private int prodId;

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + "]";
	}
	
}
