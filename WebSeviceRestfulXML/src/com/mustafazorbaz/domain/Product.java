package com.mustafazorbaz.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="product")
public class Product {

	private int productId;
	private String productName;
	private String productDeliveryInformation;
	private double productPrice;
	private String productInformation;
	private int productStoreId;
	
	public Product()
	{
		
	}
	public Product(int productId, String productName, String productDeliveryInformation, double productPrice,
			String productInformation, int productStoreId) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDeliveryInformation = productDeliveryInformation;
		this.productPrice = productPrice;
		this.productInformation = productInformation;
		this.productStoreId = productStoreId;
	}
	 
	@XmlElement 
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	@XmlElement
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	@XmlElement
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	@XmlElement
	public String getProductInformation() {
		return productInformation;
	}
	public void setProductInformation(String productInformation) {
		this.productInformation = productInformation;
	}
	@XmlElement
	public int getProductStoreId() {
		return productStoreId;
	}
	public void setProductStoreId(int productStoreId) {
		this.productStoreId = productStoreId;
	}
	@XmlElement
	public String getProductDeliveryInformation() {
		return productDeliveryInformation;
	}
	public void setProductDeliveryInformation(String productDeliveryInformation) {
		this.productDeliveryInformation = productDeliveryInformation;
	}

}
